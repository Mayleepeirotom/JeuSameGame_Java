import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>FenetreDeBase</code> est une fenêtre de base pour l'interface utilisateur.
 * Elle hérite de JFrame et configure une fenêtre avec une image de fond personnalisée.
 *
 * @version 1.0
 */
public class FenetreDeBase extends JFrame {
    /**
     * Composant utilisé pour afficher l'image de fond.
     */
    protected ComposantFond background;

    /**
     * Constructeur qui initialise la fenêtre avec un titre, un fond et des dimensions précis.
     *
     * @param title le titre de la fenêtre
     * @param imagePath le chemin de l'image de fond
     * @param width la largeur de la fenêtre
     * @param height la hauteur de la fenêtre
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
     * Ajoute un composant dans la région NORTH de la fenêtre.
     *
     * @param comp le composant à ajouter
     */
    public void addNorthComponent(JComponent comp) {
        background.add(comp, BorderLayout.NORTH);
    }
    
    /**
     * Ajoute un composant dans la région CENTER de la fenêtre.
     *
     * @param comp le composant à ajouter
     */
    public void addCenterComponent(JComponent comp) {
        background.add(comp, BorderLayout.CENTER);
    }
    
    /**
     * Affiche la fenêtre.
     */
    public void showFrame() {
        setVisible(true);
    }
}
