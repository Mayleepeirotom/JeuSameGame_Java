import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccueilSameGame extends FenetreDeBase {

    public AccueilSameGame() {
        super("Accueil du SameGame", "images/backgroundacc.jpg", 700, 525);

        JPanel boutonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        boutonPanel.setOpaque(false);

        BoutonSamegame boutonAleatoire = new BoutonSamegame("images/aleatoire.png");
        boutonAleatoire.addMouseListener(new BoutonAleatoire(this));

        BoutonSamegame boutonCharger = new BoutonSamegame("images/definie.png");
        boutonCharger.addMouseListener(new BoutonChoix(this));

        // Si vous souhaitez ajouter un bouton pour quitter, par exemple :
        // BoutonSamegame boutonQuitter = new BoutonSamegame("images/quitter.png");
        // boutonQuitter.addMouseListener(new BoutonQuitter());

        boutonPanel.add(boutonAleatoire);
        boutonPanel.add(boutonCharger);
        // boutonPanel.add(boutonQuitter); // à ajouter si nécessaire

        background.add(boutonPanel, BorderLayout.SOUTH);
        showFrame();
    }
}
