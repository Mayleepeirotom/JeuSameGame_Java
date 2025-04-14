/**
 * La classe <code>SetBloc</code> fournit une méthode utilitaire pour modifier la valeur d'un bloc
 * dans la grille.
 *
 * @version 1.0
 */
public class SetBloc {
    
    /**
     * Définit la valeur d'un bloc à la position spécifiée dans la grille.
     *
     * @param grille la grille de jeu
     * @param ligne la ligne du bloc à modifier
     * @param colonne la colonne du bloc à modifier
     * @param valeur la nouvelle valeur du bloc
     */
    public static void set(Grille grille, int ligne, int colonne, int valeur) {
        grille.blocs[ligne][colonne] = valeur;
    }
}
