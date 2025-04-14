/**
 * La classe <code>FinDePartie</code> vérifie les conditions de fin de partie 
 * en s'assurant qu'aucun groupe de blocs connectés n'est disponible dans la grille.
 *
 * @version 1.0
 */
public class FinDePartie {
    private boolean partieTerminee = false;
    
    /**
     * Indique si la partie est terminée.
     *
     * @return true si la partie est terminée, false sinon
     */
    public boolean estTerminee() {
        return partieTerminee;
    }
    
    /**
     * Vérifie la fin de partie en testant l'existence de groupes de blocs dans la grille.
     *
     * @param grille la grille de jeu
     * @return true si la partie est terminée (aucun groupe n'existe), false sinon
     */
    public boolean verifierFinDePartie(Grille grille) {
        if (!existeGroupe(grille)) {
            partieTerminee = true;
        }
        return partieTerminee;
    }
    
    /**
     * Vérifie s'il existe un groupe de blocs connectés dans la grille.
     *
     * @param grille la grille de jeu
     * @return true si un groupe est trouvé, false sinon
     */
    private boolean existeGroupe(Grille grille) {
        int LIGNES = Grille.LIGNES;
        int COLONNES = Grille.COLONNES;
        boolean[][] visite = new boolean[LIGNES][COLONNES];
        
        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                int bloc = grille.getBloc(i, j);
                if (bloc != 0 && !visite[i][j]) {
                    if (tailleGroupe(i, j, bloc, visite, grille) > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * Calcule la taille d'un groupe de blocs connectés de même couleur à partir de la position donnée.
     *
     * @param i la ligne de départ
     * @param j la colonne de départ
     * @param bloc la valeur du bloc à rechercher
     * @param visite tableau indiquant les cellules déjà visitées
     * @param grille la grille de jeu
     * @return le nombre de blocs connectés dans le groupe
     */
    private int tailleGroupe(int i, int j, int bloc, boolean[][] visite, Grille grille) {
        int LIGNES = Grille.LIGNES;
        int COLONNES = Grille.COLONNES;
        if (i < 0 || i >= LIGNES || j < 0 || j >= COLONNES) return 0;
        if (visite[i][j] || grille.getBloc(i, j) != bloc) return 0;
        
        visite[i][j] = true;
        return 1 
               + tailleGroupe(i - 1, j, bloc, visite, grille)
               + tailleGroupe(i + 1, j, bloc, visite, grille)
               + tailleGroupe(i, j - 1, bloc, visite, grille)
               + tailleGroupe(i, j + 1, bloc, visite, grille);
    }
}
