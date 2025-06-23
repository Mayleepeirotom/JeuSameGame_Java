import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * La classe <code>InitGrille</code> initialise la grille de jeu en créant un
 * tableau de boutons interactifs pour chaque cellule. Elle gère également
 * les listeners pour le clic et le survol des cellules.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class InitGrille extends JPanel {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private JButton[][] boutons;
    private Grille grille;
    private boolean[][] survole;
    private ScorePanel scorePanel;

    /**
     * Construit le panneau de grille avec la grille de jeu et le panneau de score.
     * Initialise le layout en grille (GridLayout) et la taille préférée.
     *
     * @param grille      la grille de jeu à afficher
     * @param scorePanel  le panneau de score à mettre à jour lors des actions
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
     * Crée chaque JButton pour représenter une cellule de la grille,
     * associe un GrilleBoutonController pour gérer
     * les événements de souris, puis rafraîchit l'affichage initial.
     */
    public void initGrille() {
        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                boutons[i][j] = new JButton();
                boutons[i][j].setIcon(null);

                // Création et association du contrôleur de la cellule
                GrilleBoutonController controller = new GrilleBoutonController(
                    grille, scorePanel, boutons, survole, i, j
                );
                boutons[i][j].addMouseListener(controller);
                boutons[i][j].addMouseMotionListener(controller);

                add(boutons[i][j]);
            }
        }
        new RaffraichirGrille().rafraichir(boutons, survole, grille);
    }
}

