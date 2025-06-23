/**
 * La classe <code>SupprimerBloc</code> offre une méthode utilitaire
 * pour supprimer un bloc dans la grille de SameGame en le remplaçant
 * par une cellule vide (valeur 0).
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class SupprimerBloc {
    
    /**
     * Remplace le bloc à la position donnée par la valeur 0,
     * effaçant ainsi le bloc de la grille.
     *
     * @param grille  la grille de jeu à modifier
     * @param ligne   l’indice de la ligne du bloc à supprimer (0 ≤ ligne < LIGNES)
     * @param colonne l’indice de la colonne du bloc à supprimer (0 ≤ colonne < COLONNES)
     */
    public static void supprimer(Grille grille, int ligne, int colonne) {
        SetBloc.set(grille, ligne, colonne, 0);
    }
}
