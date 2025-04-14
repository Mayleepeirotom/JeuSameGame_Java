import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * La classe <code>InitGrille</code> initialise la grille de jeu en créant un tableau de boutons interactifs.
 * Chaque cellule est représentée par un JButton qui gère ses propres événements de clic et de survol.
 *
 * @version 1.0
 */
public class InitGrille extends JPanel {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private JButton[][] boutons;
    private Grille grille;
    private boolean[][] survole;
    private ScorePanel scorePanel;

    /**
     * Constructeur qui initialise la grille avec la grille de jeu et le panneau de score.
     *
     * @param grille la grille de jeu
     * @param scorePanel le panneau de score à mettre à jour
     */
    public InitGrille(Grille grille, ScorePanel scorePanel) {
        this.grille = grille;
        this.scorePanel = scorePanel;
        boutons = new JButton[LIGNES][COLONNES];
        survole = new boolean[LIGNES][COLONNES];

        setLayout(new GridLayout(LIGNES, COLONNES));
        setPreferredSize(new Dimension(750, 500)); 
        initGrille();
    }

    /**
     * Initialise la grille en créant et configurant chaque JButton correspondant à une cellule de la grille.
     * Ajoute des écouteurs pour gérer les clics et les mouvements de la souris.
     */
    public void initGrille() {
        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                boutons[i][j] = new JButton();
                boutons[i][j].setIcon(null);
    
                // Création et association du contrôleur de la cellule
                GrilleBoutonController controller = new GrilleBoutonController(grille, scorePanel, boutons, survole, i, j);
                boutons[i][j].addMouseListener(controller);
                boutons[i][j].addMouseMotionListener(controller);
    
                add(boutons[i][j]);
            }
        }
        new RaffraichirGrille().rafraichir(boutons, survole, grille);
    }
    
    
}
