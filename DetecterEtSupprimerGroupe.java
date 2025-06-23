/**
 * La classe <code>DetecterEtSupprimerGroupe</code> détecte et supprime un groupe
 * de blocs connectés de même couleur à partir d'une position donnée, puis
 * réorganise la grille en faisant tomber les blocs et en décalant les colonnes.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class DetecterEtSupprimerGroupe {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private Grille grille;
    
    /**
     * Construit l'outil de détection/suppression pour la grille spécifiée.
     *
     * @param grille la grille de jeu à traiter
     */
    public DetecterEtSupprimerGroupe(Grille grille) {
        this.grille = grille;
    }
    
    /**
     * Détecte le groupe de blocs connectés de même couleur à partir de la cellule
     * (ligne, colonne), le supprime, puis fait tomber les blocs et décale les colonnes.
     *
     * @param ligne   la ligne de la cellule de départ
     * @param colonne la colonne de la cellule de départ
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
