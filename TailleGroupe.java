/**
 * La classe <code>TailleGroupe</code> calcule la taille d'un groupe de blocs connectés de même couleur.
 *
 * @version 1.0
 */
public class TailleGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille de jeu.
     *
     * @param grille la grille sur laquelle le calcul sera effectué
     */
    public TailleGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Calcule récursivement la taille d'un groupe de blocs connectés de même couleur à partir de la position donnée.
     *
     * @param ligne la ligne de départ
     * @param colonne la colonne de départ
     * @param couleur la couleur des blocs à compter
     * @param visite le tableau des cellules déjà visitées
     * @return le nombre de blocs connectés dans le groupe
     */
    public int calculerTaille(int ligne, int colonne, int couleur, boolean[][] visite) {
        if (ligne < 0 || ligne >= LIGNES || colonne < 0 || colonne >= COLONNES || visite[ligne][colonne])
            return 0;
        if (grille.getBloc(ligne, colonne) != couleur)
            return 0;
        visite[ligne][colonne] = true;
        return 1 
             + calculerTaille(ligne - 1, colonne, couleur, visite)
             + calculerTaille(ligne + 1, colonne, couleur, visite)
             + calculerTaille(ligne, colonne - 1, couleur, visite)
             + calculerTaille(ligne, colonne + 1, couleur, visite);
    }
}
