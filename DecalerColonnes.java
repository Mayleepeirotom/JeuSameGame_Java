/**
 * La classe <code>DecalerColonnes</code> gère le réalignement horizontal des blocs
 * dans la grille de SameGame. Elle déplace toutes les colonnes non vides vers la gauche
 * pour combler les espaces, puis vide les colonnes restantes à droite.
 *
 * @version 1.0
 * @author Sarah et Maylee
 */
public class DecalerColonnes {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Initialise l’outil de décalage de colonnes avec la grille donnée.
     *
     * @param grille la grille de jeu dont les colonnes seront réalignées
     */
    public DecalerColonnes(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Parcourt les colonnes de gauche à droite :
     * - si une colonne contient au moins un bloc non vide, elle est déplacée
     *   vers la première position libre à gauche ;
     * - après avoir traité toutes les colonnes non vides, les colonnes restantes
     *   à droite sont vidées (valeur 0).
     */
    public void decalerColonnes() {
        int destination = 0;
        for (int j = 0; j < COLONNES; j++) {
            boolean colonneVide = true;
            for (int i = 0; i < LIGNES; i++) {
                if (grille.getBloc(i, j) != 0) {
                    colonneVide = false;
                    break;
                }
            }
            if (!colonneVide) {
                if (j != destination) {
                    for (int i = 0; i < LIGNES; i++) {
                        DeplacerBloc.deplacer(grille, i, j, i, destination);
                    }
                }
                destination++;
            }
        }
        for (int j = destination; j < COLONNES; j++) {
            for (int i = 0; i < LIGNES; i++) {
                SupprimerBloc.supprimer(grille, i, j);
            }
        }
    }
}
