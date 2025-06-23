/**
 * La classe <code>SupprimerGroupe</code> supprime tous les blocs connectés
 * de même couleur dans une grille SameGame en partant d’une cellule donnée.
 * Elle réalise un parcours récursif pour effacer chaque bloc du groupe.
 *
 * @version 1.0
 * @author Sarah et Maylee
 */
public class SupprimerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Prépare l’outil de suppression de groupe pour la grille spécifiée.
     *
     * @param grille la grille de jeu sur laquelle la suppression sera effectuée
     */
    public SupprimerGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Supprime récursivement tous les blocs adjacents de la même couleur à partir
     * de la position (ligne, colonne), en les remplaçant par des cellules vides (0).
     * Les cellules déjà traitées sont marquées dans <code>visite</code> pour éviter
     * les boucles infinies.
     *
     * @param ligne   indice de la ligne de départ (0 ≤ ligne < LIGNES)
     * @param colonne indice de la colonne de départ (0 ≤ colonne < COLONNES)
     * @param couleur valeur de la couleur des blocs à supprimer
     * @param visite  matrice [LIGNES][COLONNES] indiquant les cellules déjà supprimées
     */
    public void supprimerGroupe(int ligne, int colonne, int couleur, boolean[][] visite) {
        if (ligne < 0 || ligne >= LIGNES || colonne < 0 || colonne >= COLONNES || visite[ligne][colonne]) {
            return;
        }
        
        if (grille.getBloc(ligne, colonne) == couleur) {
            SetBloc.set(grille, ligne, colonne, 0);
            visite[ligne][colonne] = true;  
            supprimerGroupe(ligne - 1, colonne, couleur, visite);
            supprimerGroupe(ligne + 1, colonne, couleur, visite);
            supprimerGroupe(ligne, colonne - 1, couleur, visite);
            supprimerGroupe(ligne, colonne + 1, couleur, visite);
        }
    }
}
