/**
 * La classe <code>SupprimerBloc</code> fournit une méthode pour supprimer un bloc
 * en définissant sa valeur à 0 dans la grille.
 *
 * @version 1.0
 */
public class SupprimerBloc {
    
    /**
     * Supprime le bloc à la position spécifiée dans la grille.
     *
     * @param grille la grille de jeu
     * @param ligne la ligne du bloc à supprimer
     * @param colonne la colonne du bloc à supprimer
     */
    public static void supprimer(Grille grille, int ligne, int colonne) {
        SetBloc.set(grille, ligne, colonne, 0);
    }
}
