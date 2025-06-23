/**
 * La classe <code>FinDePartie</code> vérifie si la partie est terminée en
 * recherchant l'absence de tout groupe de blocs de même couleur d'au moins
 * deux éléments dans la grille.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class FinDePartie {
    private boolean partieTerminee = false;
    
    /**
     * Indique si la partie a été détectée comme terminée.
     *
     * @return true si la partie est terminée, false sinon
     */
    public boolean estTerminee() {
        return partieTerminee;
    }
    
    /**
     * Analyse la grille pour déterminer si aucun groupe valide n'existe.
     * Met à jour l'état interne et renvoie le résultat.
     *
     * @param grille la grille de jeu à vérifier
     * @return true si la partie est terminée (aucun groupe), false sinon
     */
    public boolean verifierFinDePartie(Grille grille) {
        if (!existeGroupe(grille)) {
            partieTerminee = true;
        }
        return partieTerminee;
    }
    
    /**
     * Parcourt la grille pour rechercher un groupe de blocs connectés
     * de même couleur d'au moins deux cases.
     *
     * @param grille la grille à inspecter
     * @return true si un tel groupe est trouvé, false sinon
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
     * Calcule la taille d'un groupe de blocs connectés de même couleur
     * à partir d'une position donnée.
     *
     * @param i      la ligne de départ
     * @param j      la colonne de départ
     * @param bloc   la valeur de bloc à rechercher
     * @param visite matrice marquant les cellules déjà visitées
     * @param grille la grille de jeu
     * @return le nombre de blocs connectés trouvés
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
