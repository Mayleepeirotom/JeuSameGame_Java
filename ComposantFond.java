import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * La classe <code>ComposantFond</code> est un composant Swing personnalise
 * capable d afficher une image de fond redimensionnee pour couvrir entierement
 * sa zone d affichage.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class ComposantFond extends JComponent {

    /** Image de fond. */
    private Image imageDeFond;

    /**
     * Construit un composant avec l image de fond specifiee.
     *
     * @param cheminImage chemin vers le fichier image a utiliser comme fond
     */
    public ComposantFond(String cheminImage) {
        imageDeFond = new ImageIcon(cheminImage).getImage();
    }

    /**
     * Surcharge de la methode paintComponent pour dessiner l image
     * de fond redimensionnee a la taille actuelle du composant.
     *
     * @param g le contexte graphique utilise pour le rendu
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imageDeFond, 0, 0, getWidth(), getHeight(), this);
    }
}
