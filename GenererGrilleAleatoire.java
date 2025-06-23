import java.util.Random;

/**
 * La classe <code>GenererGrilleAleatoire</code> remplit la grille de blocs
 * de manière aléatoire ou crée une nouvelle grille initialisée aléatoirement.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class GenererGrilleAleatoire {
    
    /**
     * Remplit la grille avec des valeurs aléatoires (1 = rouge, 2 = vert, 3 = bleu).
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
     * Crée une nouvelle instance de Grille remplie de blocs aléatoires.
     *
     * @return une nouvelle grille initialisée aléatoirement
     */
    public static Grille creerGrilleAleatoire() {
        Grille grille = new Grille();
        generer(grille);
        return grille;
    }
}
