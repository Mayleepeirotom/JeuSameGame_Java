import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>FenetreDeBase</code> est une fenêtre Swing personnalisee
 * avec une image de fond redimensionnee et des methodes utilitaires
 * pour ajouter des composants aux regions NORTH et CENTER.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class FenetreDeBase extends JFrame {
    /** Composant affichant l image de fond de la fenêtre. */
    protected ComposantFond background;

    /**
     * Construit une fenêtre avec un titre, une image de fond et des dimensions specifiques.
     *
     * @param title     le titre affiche dans la barre de la fenêtre
     * @param imagePath chemin vers l image de fond
     * @param width     largeur de la fenêtre en pixels
     * @param height    hauteur de la fenêtre en pixels
     */
    public FenetreDeBase(String title, String imagePath, int width, int height) {
        super(title);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        background = new ComposantFond(imagePath);
        background.setLayout(new BorderLayout());
        setContentPane(background);
    }
    
    /**
     * Ajoute un composant dans la region NORTH de la fenêtre.
     *
     * @param comp le composant Swing a ajouter en haut de la fenêtre
     */
    public void addNorthComponent(JComponent comp) {
        background.add(comp, BorderLayout.NORTH);
    }
    
    /**
     * Ajoute un composant dans la region CENTER de la fenêtre.
     *
     * @param comp le composant Swing a ajouter au centre de la fenêtre
     */
    public void addCenterComponent(JComponent comp) {
        background.add(comp, BorderLayout.CENTER);
    }
    
    /**
     * Rend la fenêtre visible à l ecran.
     */
    public void showFrame() {
        setVisible(true);
    }
}
