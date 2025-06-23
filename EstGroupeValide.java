/**
 * La classe <code>EstGroupeValide</code> vérifie si le groupe de blocs
 * à partir d'une cellule donnée est valide, c'est-à-dire s'il contient
 * au moins deux blocs connectés de même couleur.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class EstGroupeValide {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Construit un vérificateur de groupe valide pour la grille spécifiée.
     *
     * @param grille la grille de jeu sur laquelle effectuer la vérification
     */
    public EstGroupeValide(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Détermine si le groupe de blocs connecté de même couleur,
     * commençant à la position (ligne, colonne), contient plus d'un bloc.
     *
     * @param ligne   la ligne de départ du groupe
     * @param colonne la colonne de départ du groupe
     * @return true si le groupe contient au moins deux blocs, false sinon
     */
    public boolean estGroupeValide(int ligne, int colonne) {
        int couleur = grille.getBloc(ligne, colonne);
        boolean[][] visite = new boolean[LIGNES][COLONNES];
        TailleGroupe tg = new TailleGroupe(grille);
        int taille = tg.calculerTaille(ligne, colonne, couleur, visite);
        return taille > 1;
    }
}
