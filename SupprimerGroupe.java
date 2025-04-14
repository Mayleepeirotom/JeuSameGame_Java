/**
 * La classe <code>SupprimerGroupe</code> supprime récursivement un groupe de blocs
 * connectés de même couleur à partir d'une position donnée.
 *
 * @version 1.0
 */
public class SupprimerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille de jeu.
     *
     * @param grille la grille sur laquelle supprimer le groupe
     */
    public SupprimerGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Supprime récursivement le groupe de blocs de même couleur à partir de la position (ligne, colonne).
     *
     * @param ligne la ligne de départ
     * @param colonne la colonne de départ
     * @param couleur la couleur à supprimer
     * @param visite un tableau pour marquer les cellules déjà visitées
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
