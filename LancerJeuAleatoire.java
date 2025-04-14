/**
 * La classe <code>LancerJeuAleatoire</code> lance une nouvelle partie avec une grille générée aléatoirement.
 *
 * @version 1.0
 */
public class LancerJeuAleatoire {
    
    /**
     * Crée une grille aléatoire, démarre une nouvelle partie et ferme la fenêtre d'accueil.
     *
     * @param parent l'instance d'AccueilSameGame à fermer
     */
    public static void lancerJeuAleatoire(AccueilSameGame parent) {
        Grille grille = GenererGrilleAleatoire.creerGrilleAleatoire();
        new SameGame(grille); 
        parent.dispose();
    }
}
