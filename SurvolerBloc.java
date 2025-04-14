/**
 * La classe <code>SurvolerBloc</code> gère le survol d'une cellule dans la grille.
 * Elle met à jour un tableau de booléens pour indiquer les cellules du groupe survolé.
 *
 * @version 1.0
 */
public class SurvolerBloc {
    private static final int LIGNES = Grille.LIGNES;
    private static final int COLONNES = Grille.COLONNES;
    private boolean[][] survole;
    private Grille grille;
    
    /**
     * Constructeur qui initialise le survol avec la grille et le tableau de survol.
     *
     * @param grille la grille de jeu
     * @param survole le tableau indiquant si une cellule est survolée
     */
    public SurvolerBloc(Grille grille, boolean[][] survole) {
        this.grille = grille;
        this.survole = survole;
    }
    
    /**
     * Met à jour le tableau de survol en marquant les cellules du groupe correspondant.
     * Si le groupe a une taille inférieure à 2, le survol est annulé.
     *
     * @param ligne la ligne à survoler
     * @param colonne la colonne à survoler
     */
    public void survolerBloc(int ligne, int colonne) {
        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                survole[i][j] = false;
            }
        }
        int couleur = grille.getBloc(ligne, colonne);
        if (couleur != 0) {
            boolean[][] visite = new boolean[LIGNES][COLONNES];
            SurvolerGroupe survolerGroupe = new SurvolerGroupe(grille, survole);
            survolerGroupe.survolerGroupe(ligne, colonne, couleur, visite);
            
            int compteur = 0;
            for (int i = 0; i < LIGNES; i++) {
                for (int j = 0; j < COLONNES; j++) {
                    if (survole[i][j]) {
                        compteur++;
                    }
                }
            }
            
            if (compteur < 2) {
                for (int i = 0; i < LIGNES; i++) {
                    for (int j = 0; j < COLONNES; j++) {
                        survole[i][j] = false;
                    }
                }
            }
        }
    }
}
