/**
 * La classe <code>Grille</code> représente la grille de jeu pour SameGame.
 * La grille est constituée d'un tableau 2D d'entiers où chaque valeur représente un bloc.
 *
 * @version 1.0
 */
public class Grille {
    /** Nombre de lignes de la grille. */
    public static final int LIGNES = 10;
    /** Nombre de colonnes de la grille. */
    public static final int COLONNES = 15;
    
    /**
     * Tableau représentant les blocs de la grille.
     * Une valeur de 0 indique une cellule vide.
     */
    int[][] blocs; 

    /**
     * Constructeur qui initialise la grille avec des blocs vides.
     */
    public Grille() {
        blocs = new int[LIGNES][COLONNES];
    }
    
    /**
     * Retourne la valeur du bloc à la position spécifiée.
     *
     * @param ligne la ligne du bloc
     * @param colonne la colonne du bloc
     * @return la valeur du bloc à la position (ligne, colonne)
     */
    public int getBloc(int ligne, int colonne) {
        return blocs[ligne][colonne];
    }
}
