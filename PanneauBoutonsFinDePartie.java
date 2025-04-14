import javax.swing.*;
import java.awt.*;

public class PanneauBoutonsFinDePartie extends JPanel {
    public PanneauBoutonsFinDePartie(final JFrame parent) {
        setOpaque(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        BoutonSamegame boutonRejouer = new BoutonSamegame("images/rejouer.png");
        // Utilisation du contrôleur dédié pour le bouton "rejouer"
        boutonRejouer.addMouseListener(new BoutonRejouerFin(parent));
        
        BoutonSamegame boutonQuitter = new BoutonSamegame("images/quitter.png");
        // Utilisation du contrôleur dédié pour le bouton "quitter"
        boutonQuitter.addMouseListener(new BoutonQuitterFin());
        
        add(boutonRejouer);
        add(boutonQuitter);
    }
}
