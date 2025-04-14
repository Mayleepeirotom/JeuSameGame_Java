/**
 * La classe <code>DetecterEtSupprimerGroupe</code> détecte et supprime un groupe de blocs de même couleur
 * à partir d'une position donnée. Après suppression, elle fait tomber les blocs et décale les colonnes.
 * 
 * @version 1.0
 */
public class DetecterEtSupprimerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Constructeur qui initialise la classe avec la grille de jeu.
     *
     * @param grille la grille à traiter
     */
    public DetecterEtSupprimerGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Détecte et supprime le groupe de blocs connectés de même couleur à partir de la position donnée.
     * Met ensuite à jour la grille en faisant tomber les blocs et en décalant les colonnes.
     *
     * @param ligne la ligne de départ du groupe
     * @param colonne la colonne de départ du groupe
     */
    public void detecterEtSupprimerGroupe(int ligne, int colonne) {
        int couleur = grille.getBloc(ligne, colonne);
        boolean[][] visite = new boolean[LIGNES][COLONNES];
        
        SupprimerGroupe sup = new SupprimerGroupe(grille);
        sup.supprimerGroupe(ligne, colonne, couleur, visite);
        
        new FaireTomberLesBlocs(grille).faireTomberLesBlocs();
        new DecalerColonnes(grille).decalerColonnes();
    }
}
