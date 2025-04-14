import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class BoutonRejouerFin implements MouseListener {

    private JFrame parent;

    public BoutonRejouerFin(JFrame parent) {
        this.parent = parent;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Ferme la fenêtre actuelle et lance l'écran d'accueil pour recommencer une partie
        parent.dispose();
        new AccueilSameGame(); 
    }

    @Override public void mousePressed(MouseEvent e) { }
    @Override public void mouseReleased(MouseEvent e) { }
    @Override public void mouseEntered(MouseEvent e) { }
    @Override public void mouseExited(MouseEvent e) { }
}
