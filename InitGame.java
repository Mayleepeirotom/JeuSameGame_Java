import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>InitGame</code> initialise et affiche la fenêtre principale du jeu SameGame.
 * Elle crée la grille, le panneau de score et le panneau de jeu central.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class InitGame extends FenetreDeBase {
    private Grille grille;
    private ScorePanel scorePanel;

    /**
     * Construit la fenêtre de jeu avec la grille spécifiée.
     *
     * @param grille la grille de jeu à utiliser pour démarrer la partie
     */
    public InitGame(Grille grille) {
        super("SameGame", "images/backgroundacc.jpg", 800, 600);
        this.grille = grille;

        scorePanel = new ScorePanel();
        addNorthComponent(scorePanel);

        InitGrille initGrillePanel = new InitGrille(grille, scorePanel);
        initGrillePanel.setPreferredSize(new Dimension(750, 500));
        addCenterComponent(initGrillePanel);

        showFrame();
    }

    /**
     * Renvoie le panneau de score associé à cette fenêtre de jeu.
     *
     * @return le ScorePanel utilisé dans la partie
     */
    public ScorePanel getScorePanel() {
        return scorePanel;
    }
}
