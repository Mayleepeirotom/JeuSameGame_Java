import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

/**
 * La classe <code>BoutonRejouerFin</code> gère l'action du bouton "Rejouer"
 * affiché à la fin d'une partie, fermant la fenêtre courante et
 * retournant à l'écran d'accueil.
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class BoutonRejouerFin implements MouseListener {

    /** Fenêtre parent sur laquelle l'action s'applique */
    private final JFrame parent;

    /**
     * Constructeur liant le listener à la fenêtre parent.
     *
     * @param parent la fenêtre à fermer pour revenir à l'accueil du jeu
     */
    public BoutonRejouerFin(JFrame parent) {
        this.parent = parent;
    }

    /**
     * Au clic, ferme la fenêtre actuelle et rouvre l'écran d'accueil.
     *
     * @param e événement de souris déclenché
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        // Ferme la fenêtre actuelle et lance l'écran d'accueil pour recommencer une partie
        parent.dispose();
        new AccueilSameGame();
    }

    /** Aucun traitement requis à la pression du bouton. */
    @Override public void mousePressed(MouseEvent e) { 

    }

    /** Aucun traitement requis au relâchement du bouton. */
    @Override public void mouseReleased(MouseEvent e) {

     }

    /** Aucun traitement requis à l'entrée du curseur. */
    @Override public void mouseEntered(MouseEvent e) {

     }

    /** Aucun traitement requis à la sortie du curseur. */
    @Override public void mouseExited(MouseEvent e) {
        
     }
}
