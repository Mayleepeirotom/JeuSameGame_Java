import javax.swing.*;

public class BoutonSamegame extends JButton {

    public BoutonSamegame(String cheminIcone) {
        super(new ImageIcon(cheminIcone));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
    }
}
