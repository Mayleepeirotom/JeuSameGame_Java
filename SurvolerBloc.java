import javax.swing.*;

/**
 * La classe <code>SurvolerBloc</code> gère l’effet de survol d’une cellule
 * dans la grille de SameGame. Elle met à jour un tableau de booleans pour indiquer
 * quelles cellules font partie du groupe connecté de même couleur que la cellule
 * survolée, à condition que ce groupe contienne au moins deux blocs.
 *
 * @version 1.0
 * @author Sarah et Maylee
 */
public class SurvolerBloc {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private boolean[][] survole;
    private Grille grille;
    
    /**
     * Initialise l’outil de survol pour la grille et le tableau de marquage.
     *
     * @param grille  la grille de jeu sur laquelle se fait le survol
     * @param survole matrice [LIGNES][COLONNES] qui sera mise à jour pour indiquer
     *                les cellules survolées
     */
    public SurvolerBloc(Grille grille, boolean[][] survole) {
        this.grille = grille;
        this.survole = survole;
    }
    
    /**
     * Met à jour le tableau de survol à partir de la cellule (ligne, colonne).
     * Toutes les cellules sont d’abord réinitialisées à false.
     * Si la cellule contient un bloc (couleur non nulle), on effectue un parcours
     * récursif via <code>SurvolerGroupe</code> pour marquer les cellules du même
     * groupe de couleur. Si ce groupe compte moins de deux blocs, le survol est annulé.
     *
     * @param ligne   indice de la ligne de la cellule à survoler (0 ≤ ligne < LIGNES)
     * @param colonne indice de la colonne de la cellule à survoler (0 ≤ colonne < COLONNES)
     */
    public void survolerBloc(int ligne, int colonne) {
        // Réinitialisation
        for (int i = 0; i < LIGNES; i++)
            for (int j = 0; j < COLONNES; j++)
                survole[i][j] = false;
        
        int couleur = grille.getBloc(ligne, colonne);
        if (couleur == 0) {
            return;
        }
        
        boolean[][] visite = new boolean[LIGNES][COLONNES];
        new SurvolerGroupe(grille, survole)
            .survolerGroupe(ligne, colonne, couleur, visite);
        
        int compteur = 0;
        for (int i = 0; i < LIGNES; i++)
            for (int j = 0; j < COLONNES; j++)
                if (survole[i][j])
                    compteur++;
        
        if (compteur < 2) {
            for (int i = 0; i < LIGNES; i++)
                for (int j = 0; j < COLONNES; j++)
                    survole[i][j] = false;
        }
    }
}

