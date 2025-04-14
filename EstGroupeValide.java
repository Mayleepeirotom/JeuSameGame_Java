/**
 * La classe <code>EstGroupeValide</code> vérifie si le groupe de blocs à partir d'une cellule
 * est valide. Un groupe est valide s'il contient au moins deux blocs connectés de même couleur.
 *
 * @version 1.0
 */
public class EstGroupeValide {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la vérification avec la grille de jeu.
     *
     * @param grille la grille sur laquelle effectuer la vérification
     */
    public EstGroupeValide(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Vérifie si le groupe de blocs à partir de la position (ligne, colonne) est valide.
     * Affiche la taille du groupe dans la console pour le débogage.
     *
     * @param ligne la ligne de départ
     * @param colonne la colonne de départ
     * @return true si le groupe contient plus d'un bloc, false sinon
     */
    public boolean estGroupeValide(int ligne, int colonne) {
        int couleur = grille.getBloc(ligne, colonne);
        boolean[][] visite = new boolean[LIGNES][COLONNES];
        TailleGroupe tg = new TailleGroupe(grille);
        int taille = tg.calculerTaille(ligne, colonne, couleur, visite);
        System.out.println(taille);
        return taille > 1;
    }
}
