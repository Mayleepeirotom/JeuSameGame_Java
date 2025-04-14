import javax.swing.*;
import java.awt.event.*;

public class AfficherFinDePartie {

    public void afficherFinDePartie(final JFrame parent, final int scoreFinal) {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SuperpositionFinDePartie overlay = new SuperpositionFinDePartie("images/backgroundfin.jpg", parent, scoreFinal);
                parent.setGlassPane(overlay);
                overlay.setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}
