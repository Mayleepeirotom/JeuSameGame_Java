import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFileChooser;

public class BoutonAleatoire implements MouseListener {
    private AccueilSameGame accueil;

    public BoutonAleatoire(AccueilSameGame accueil) {
        this.accueil = accueil;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        LancerJeuAleatoire.lancerJeuAleatoire(accueil);
    }

    @Override public void mousePressed(MouseEvent e) { }
    @Override public void mouseReleased(MouseEvent e) { }
    @Override public void mouseEntered(MouseEvent e) { }
    @Override public void mouseExited(MouseEvent e) { }
}
