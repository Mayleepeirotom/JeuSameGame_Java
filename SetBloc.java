/**
 * La classe <code>SetBloc</code> fournit une méthode utilitaire
 * pour modifier la valeur d'un bloc dans la grille de jeu.
 *
 * @version 1.0
 * @author Sarah et Maylee
 */
public class SetBloc {

    /**
     * Définit la valeur d'un bloc à la position spécifiée dans la grille.
     *
     * @param grille  la grille de jeu dans laquelle modifier le bloc
     * @param ligne   l'indice de la ligne du bloc à modifier
     * @param colonne l'indice de la colonne du bloc à modifier
     * @param valeur  la nouvelle valeur du bloc (0 pour vide, 1/2/3 pour différentes couleurs)
     */
    public static void set(Grille grille, int ligne, int colonne, int valeur) {
        grille.blocs[ligne][colonne] = valeur;
    }
}
