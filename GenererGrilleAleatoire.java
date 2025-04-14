import java.util.Random;

/**
 * La classe <code>GenererGrilleAleatoire</code> génère une grille de jeu remplie de blocs de manière aléatoire.
 *
 * @version 1.0
 */
public class GenererGrilleAleatoire {
    
    /**
     * Remplit la grille avec des valeurs aléatoires correspondant à différents types de blocs.
     *
     * @param grille la grille de jeu à remplir
     */
    public static void generer(Grille grille) {
        Random random = new Random();
        int[] types = {1, 2, 3};  // 1 = rouge, 2 = vert, 3 = bleu
        
        for (int i = 0; i < Grille.LIGNES; i++) {
            for (int j = 0; j < Grille.COLONNES; j++) {
                SetBloc.set(grille, i, j, types[random.nextInt(types.length)]);
            }
        }
    }
    
    /**
     * Crée une nouvelle grille de jeu remplie aléatoirement.
     *
     * @return une instance de Grille initialisée de façon aléatoire
     */
    public static Grille creerGrilleAleatoire() {
        Grille grille = new Grille();
        generer(grille);
        return grille;
    }
}
