import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;


public class GrilleBoutonController implements MouseListener, MouseMotionListener {

    private Grille grille;
    private ScorePanel scorePanel;
    private JButton[][] boutons;
    private boolean[][] survole;
    private int ligne;
    private int colonne;
    
    public GrilleBoutonController(Grille grille, ScorePanel scorePanel, JButton[][] boutons, boolean[][] survole, int ligne, int colonne) {
        this.grille = grille;
        this.scorePanel = scorePanel;
        this.boutons = boutons;
        this.survole = survole;
        this.ligne = ligne;
        this.colonne = colonne;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        // Traitement du clic sur une cellule de la grille
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

    @Override
    public void mouseMoved(MouseEvent e) {
        // Traitement pour le survol de la cellule
        new SurvolerBloc(grille, survole).survolerBloc(ligne, colonne);
        new RaffraichirGrille().rafraichir(boutons, survole, grille);
    }
    
    // Les autres méthodes de l'interface sont vides ou peuvent être complétées si nécessaire
    @Override public void mousePressed(MouseEvent e) {

    }
    @Override public void mouseReleased(MouseEvent e) {

    }
    @Override public void mouseEntered(MouseEvent e) {

    }
    @Override public void mouseExited(MouseEvent e) {

    }
    @Override public void mouseDragged(MouseEvent e) {
        
    }
}
