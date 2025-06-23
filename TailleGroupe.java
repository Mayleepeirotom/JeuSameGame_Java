/**
 * La classe <code>TailleGroupe</code> calcule la taille d'un groupe de blocs
 * connectes de meme couleur en effectuant un parcours recursif de type flood-fill (parcours en profondeur). Le parcours s'effectue cellule par cellule et marque chaque case vide sans le tableau visite, pour eviter les cycles.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class TailleGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise l'outil de calcul de groupe pour la grille donnee.
     *
     * @param grille la grille de jeu sur laquelle le calcul sera effectue
     */
    public TailleGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Calcule recursivement la taille d'un groupe de blocs connectes de meme couleur
     * a partir de la position specifiee, en marquant les cellules deja visitees.
     *
     * @param ligne   l'indice de la ligne de depart
     * @param colonne l'indice de la colonne de depart
     * @param couleur la couleur des blocs a compter
     * @param visite  matrice indiquant les cellules deja visitees
     * @return le nombre total de blocs connectes du meme groupe
     */
    public int calculerTaille(int ligne, int colonne, int couleur, boolean[][] visite) {
        if (ligne < 0 || ligne >= LIGNES || colonne < 0 || colonne >= COLONNES || visite[ligne][colonne]) {
            return 0;
        }
        if (grille.getBloc(ligne, colonne) != couleur) {
            return 0;
        }
        visite[ligne][colonne] = true;
        return 1 
             + calculerTaille(ligne - 1, colonne, couleur, visite)
             + calculerTaille(ligne + 1, colonne, couleur, visite)
             + calculerTaille(ligne, colonne - 1, couleur, visite)
             + calculerTaille(ligne, colonne + 1, couleur, visite);
    }
}

