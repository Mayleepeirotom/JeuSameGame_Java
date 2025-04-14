/**
 * La classe <code>DeplacerBloc</code> fournit une méthode pour déplacer un bloc d'une position source 
 * à une position destination dans la grille.
 * 
 * @version 1.0
 */
public class DeplacerBloc {
    
    /**
     * Déplace un bloc de la position (ligneOrigine, colonneOrigine) vers (ligneDestination, colonneDestination).
     *
     * @param grille la grille de jeu
     * @param ligneOrigine la ligne d'origine du bloc
     * @param colonneOrigine la colonne d'origine du bloc
     * @param ligneDestination la ligne de destination
     * @param colonneDestination la colonne de destination
     */
    public static void deplacer(Grille grille, int ligneOrigine, int colonneOrigine, int ligneDestination, int colonneDestination) {
        int valeur = grille.getBloc(ligneOrigine, colonneOrigine);
        SetBloc.set(grille, ligneDestination, colonneDestination, valeur);
        SetBloc.set(grille, ligneOrigine, colonneOrigine, 0);
    }
}
