/**
 * La classe <code>FaireTomberLesBlocs</code> fait tomber les blocs dans la grille après la suppression
 * d'un groupe de blocs. Elle permet ainsi de remplir les espaces vides.
 *
 * @version 1.0
 */
public class FaireTomberLesBlocs {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille de jeu.
     *
     * @param grille la grille dont les blocs doivent tomber
     */
    public FaireTomberLesBlocs(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Fait tomber les blocs en décalant chaque bloc vers le bas si une case vide est détectée.
     */
    public void faireTomberLesBlocs() {
        for (int j = 0; j < COLONNES; j++) {
            for (int i = LIGNES - 1; i >= 0; i--) {
                if (grille.getBloc(i, j) == 0) {
                    int k = i - 1;
                    while (k >= 0 && grille.getBloc(k, j) == 0) {
                        k--;
                    }
                    if (k >= 0) {
                        DeplacerBloc.deplacer(grille, k, j, i, j);
                    }
                }
            }
        }
    }
}
