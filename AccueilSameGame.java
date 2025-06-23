import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * La classe <code>AccueilSameGame</code> affiche l'écran d'accueil du SameGame,
 * proposant de lancer une partie aléatoire ou de charger une grille depuis un fichier.
 * Elle hérite de FenetreDeBase pour bénéficier de la gestion du fond et du layout.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class AccueilSameGame extends FenetreDeBase {

    /**
     * Construit et affiche la fenêtre d'accueil du jeu avec deux boutons :
     * - « Grille Aléatoire » pour démarrer une partie sur une grille générée aléatoirement ;
     * - « Grille Définie» pour sélectionner un fichier de configuration.
     */
    public AccueilSameGame() {
        super("Accueil du SameGame", "images/backgroundacc.jpg", 700, 525);

        JPanel boutonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        boutonPanel.setOpaque(false);

        BoutonSamegame boutonAleatoire = new BoutonSamegame("images/aleatoire.png");
        boutonAleatoire.addMouseListener(new BoutonAleatoire(this));

        BoutonSamegame boutonCharger = new BoutonSamegame("images/definie.png");
        boutonCharger.addMouseListener(new BoutonChoix(this));

        boutonPanel.add(boutonAleatoire);
        boutonPanel.add(boutonCharger);

        background.add(boutonPanel, BorderLayout.SOUTH);
        showFrame();
    }
}
