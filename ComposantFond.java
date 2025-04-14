import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * La classe <code>ComposantFond</code> est un composant graphique permettant d'afficher une image
 * de fond redimensionnée pour occuper toute la surface du composant.
 * 
 * @version 1.0
 */
public class ComposantFond extends JComponent {
    /**
     * L'image de fond à afficher.
     */
    private Image imageDeFond;

    /**
     * Constructeur qui charge l'image de fond à partir du chemin spécifié.
     *
     * @param cheminImage le chemin de l'image de fond
     */
    public ComposantFond(String cheminImage) {
        imageDeFond = new ImageIcon(cheminImage).getImage();
    }

    /**
     * Surcharge de la méthode <code>paintComponent</code> pour dessiner l'image de fond redimensionnée.
     *
     * @param g le contexte graphique
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageDeFond, 0, 0, getWidth(), getHeight(), this);
    }
}
