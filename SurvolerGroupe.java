/**
 * La classe <code>SurvolerGroupe</code> marque dans une matrice les cellules
 * formant un groupe de blocs connectés de même couleur, à partir d’une cellule donnée.
 * Elle réalise un parcours récursif pour explorer les voisins et identifie
 * tous les blocs appartenant au même groupe.
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class SurvolerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private boolean[][] survole;
    private Grille grille;
    
    /**
     * Initialise l’outil de survol de groupe pour la grille spécifiée
     * et le tableau de marquage des cellules survolées.
     *
     * @param grille la grille de jeu sur laquelle le survol est effectué
     * @param survole matrice [LIGNES][COLONNES] indiquant les cellules à surligner
     */
    public SurvolerGroupe(Grille grille, boolean[][] survole) {
        this.grille = grille;
        this.survole = survole;
    }
    
    /**
     * Marque récursivement les cellules connectées de la même couleur
     * que la cellule de départ (ligne, colonne). Chaque cellule visitée
     * est enregistrée dans <code>visite</code> pour éviter les boucles infinies.
     *
     * @param ligne   indice de la ligne de départ (0 ≤ ligne < LIGNES)
     * @param colonne indice de la colonne de départ (0 ≤ colonne < COLONNES)
     * @param couleur valeur de la couleur des blocs à survoler
     * @param visite  matrice [LIGNES][COLONNES] marquant les cellules déjà visitées
     */
    public void survolerGroupe(int ligne, int colonne, int couleur, boolean[][] visite) {
        if (ligne < 0 || ligne >= LIGNES || colonne < 0 || colonne >= COLONNES || visite[ligne][colonne]) {
            return;
        }
        if (grille.getBloc(ligne, colonne) == couleur) {
            survole[ligne][colonne] = true;
            visite[ligne][colonne] = true;
            survolerGroupe(ligne - 1, colonne, couleur, visite);
            survolerGroupe(ligne + 1, colonne, couleur, visite);
            survolerGroupe(ligne, colonne - 1, couleur, visite);
            survolerGroupe(ligne, colonne + 1, couleur, visite);
        }
    }
}
