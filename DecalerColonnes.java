/**
 * La classe <code>DecalerColonnes</code> permet de décaler les colonnes de la grille
 * vers la gauche afin de combler les colonnes vides après suppression des blocs.
 * 
 * @version 1.0
 */
public class DecalerColonnes {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille de jeu.
     *
     * @param grille la grille dont les colonnes doivent être décalées
     */
    public DecalerColonnes(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Décale les colonnes de la grille afin de supprimer les espaces vides.
     * Les colonnes non vides sont décalées vers la gauche et les colonnes restantes sont vidées.
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
