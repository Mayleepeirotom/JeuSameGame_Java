/**
 * La classe <code>SurvolerGroupe</code> est utilisée pour marquer les cellules d'un groupe de blocs
 * connectés de même couleur lors du survol.
 *
 * @version 1.0
 */
public class SurvolerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private boolean[][] survole;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille et le tableau de survol.
     *
     * @param grille la grille de jeu
     * @param survole le tableau indiquant les cellules survolées
     */
    public SurvolerGroupe(Grille grille, boolean[][] survole) {
        this.grille = grille;
        this.survole = survole;
    }
    
    /**
     * Marque récursivement les cellules connectées de la même couleur à partir de la position donnée.
     *
     * @param ligne la ligne de départ
     * @param colonne la colonne de départ
     * @param couleur la couleur à rechercher
     * @param visite le tableau qui marque les cellules déjà visitées
     */
    public void survolerGroupe(int ligne, int colonne, int couleur, boolean[][] visite) {
        if (ligne < 0 || ligne >= LIGNES || colonne < 0 || colonne >= COLONNES || visite[ligne][colonne])
            return;
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
