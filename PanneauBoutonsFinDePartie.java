import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>PanneauBoutonsFinDePartie</code> cree un panneau transparent
 * contenant les boutons Rejouer et Quitter a afficher en fin de partie.
 * Chaque bouton utilise son listener pour effectuer l action correspondante.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class PanneauBoutonsFinDePartie extends JPanel {

    /**
     * Construit le panneau de fin de partie avec deux boutons centres horizontalement.
     *
     * @param parent la fenetre parent sur laquelle agir lorsque l utilisateur clique
     * sur Rejouer ou Quitter
     */
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

