import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>InitGame</code> initialise et affiche la fenêtre principale du jeu SameGame.
 * Elle instancie la grille, le panneau de score et la zone centrale de jeu.
 *
 * @version 1.0
 */
public class InitGame extends FenetreDeBase {
    private Grille grille;
    private ScorePanel scorePanel;

    /**
     * Constructeur qui crée la fenêtre principale du jeu avec la grille spécifiée.
     *
     * @param grille la grille de jeu à utiliser
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
     * Renvoie le panneau de score associé à la fenêtre.
     *
     * @return le ScorePanel utilisé dans la fenêtre de jeu
     */
    public ScorePanel getScorePanel() {
        return scorePanel;
    }
}
