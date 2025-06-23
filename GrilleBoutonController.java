import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;

/**
 * La classe <code>GrilleBoutonController</code> gere les interactions de l utilisateur
 * avec la grille de jeu via des evenements de souris, pour cliquer et survoler une case.
 * Elle met a jour le score, supprime les groupes, effectue la chute des blocs,
 * decale les colonnes et affiche l ecran de fin de partie si necessaire.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class GrilleBoutonController implements MouseListener, MouseMotionListener {

    private Grille grille;
    private ScorePanel scorePanel;
    private JButton[][] boutons;
    private boolean[][] survole;
    private int ligne;
    private int colonne;
    
    /**
     * Construit un contrôleur pour une cellule precise de la grille.
     *
     * @param grille     la grille de jeu
     * @param scorePanel le panneau Swing qui affiche le score
     * @param boutons    matrice de boutons qui represente les cases
     * @param survole    matrice de booleens indiquant l etat de survol des cases
     * @param ligne      indice de la ligne de la cellule contrôlee
     * @param colonne    indice de la colonne de la cellule contrôlee
     */
    public GrilleBoutonController(Grille grille, ScorePanel scorePanel, JButton[][] boutons, boolean[][] survole, int ligne, int colonne) {
        this.grille = grille;
        this.scorePanel = scorePanel;
        this.boutons = boutons;
        this.survole = survole;
        this.ligne = ligne;
        this.colonne = colonne;
    }
    
    /**
     * Traite le clic sur la cellule contrôlee :
     * - calcule la taille du groupe selectionne,
     * - met a jour le score,
     * - supprime le groupe,
     * - fait tomber les blocs et decale les colonnes,
     * - rafraîchit l affichage,
     * - verifie la fin de partie et affiche l ecran de fin si necessaire.
     *
     * @param e l evenement de souris correspondant au clic
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        if (grille.getBloc(ligne, colonne) != 0) {
            EstGroupeValide ev = new EstGroupeValide(grille);
            if (ev.estGroupeValide(ligne, colonne)) {
                boolean[][] visite = new boolean[Grille.LIGNES][Grille.COLONNES];
                TailleGroupe tg = new TailleGroupe(grille);
                int tailleGroupe = tg.calculerTaille(ligne, colonne, grille.getBloc(ligne, colonne), visite);

                int points = (tailleGroupe - 2) * (tailleGroupe - 2);
                scorePanel.addPoints(points);

                new DetecterEtSupprimerGroupe(grille).detecterEtSupprimerGroupe(ligne, colonne);
                new FaireTomberLesBlocs(grille).faireTomberLesBlocs();
                new DecalerColonnes(grille).decalerColonnes();
                new RaffraichirGrille().rafraichir(boutons, survole, grille);

                FinDePartie fdp = new FinDePartie();
                if (fdp.verifierFinDePartie(grille)) {
                    // Récupère le JFrame parent
                    JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                    new AfficherFinDePartie().afficherFinDePartie(parentFrame, scorePanel.getScore());
                }
            }
        }
    }

    /**
     * Traite le survol de la case contrôlee :
     * - marque le groupe sous la souris,
     * - rafraîchit l affichage pour afficher la bordure de survol.
     *
     * @param e l evenement de mouvement de souris
     */
    @Override
    public void mouseMoved(MouseEvent e) {
        new SurvolerBloc(grille, survole).survolerBloc(ligne, colonne);
        new RaffraichirGrille().rafraichir(boutons, survole, grille);
    }
    
    /** Pas utilise. */
    @Override public void mousePressed(MouseEvent e) { 

    }

    /** pas utilise. */
    @Override public void mouseReleased(MouseEvent e) {

     }

    /** pas utilise. */
    @Override public void mouseEntered(MouseEvent e) { 

    }

    /** pas utilise. */
    @Override public void mouseExited(MouseEvent e) {
        
    }

    /** pas utilise. */
    @Override public void mouseDragged(MouseEvent e) { 
        
    }
}
