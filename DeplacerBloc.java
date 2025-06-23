/**
 * La classe <code>DeplacerBloc</code> fournit une méthode utilitaire
 * pour déplacer un bloc d'une position à une autre dans la grille de jeu.
 *
 * @version 1.0
 * @author Sarah et Maylee
 */
public class DeplacerBloc {

    /**
     * Déplace un bloc de la position source vers la position destination
     * dans la grille. La valeur à l'origine est mise à zéro après déplacement.
     *
     * @param grille            la grille de jeu qui contient les blocs
     * @param ligneOrigine      indice de la ligne d'origine du bloc
     * @param colonneOrigine    indice de la colonne d'origine du bloc
     * @param ligneDestination  indice de la ligne de destination du bloc
     * @param colonneDestination indice de la colonne de destination du bloc
     */
    public static void deplacer(Grille grille, int ligneOrigine, int colonneOrigine, int ligneDestination, int colonneDestination) {
        int valeur = grille.getBloc(ligneOrigine, colonneOrigine);
        SetBloc.set(grille, ligneDestination, colonneDestination, valeur);
        SetBloc.set(grille, ligneOrigine, colonneOrigine, 0);
    }
}
