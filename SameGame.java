import javax.swing.*;

/**
 * La classe <code>SameGame</code> représente la fenêtre principale du jeu.
 * Elle permet de démarrer une nouvelle partie avec une grille vide ou préchargée.
 *
 * @version 1.0
 */
public class SameGame extends JFrame {
    
    /**
     * Constructeur par défaut qui crée une nouvelle grille vide et démarre la partie.
     */
    public SameGame() {
        Grille grille = new Grille(); 
        new InitGame(grille); 
    }

    /**
     * Constructeur qui démarre une partie avec la grille spécifiée.
     *
     * @param grille la grille de jeu à utiliser
     */
    public SameGame(Grille grille) {
        new InitGame(grille); 
    }

    /**
     * Renvoie le nombre de lignes de la grille.
     *
     * @return le nombre de lignes (10)
     */
    public static int getLignes() {
        return 10;
    }

    /**
     * Renvoie le nombre de colonnes de la grille.
     *
     * @return le nombre de colonnes (15)
     */
    public static int getColonnes() {
        return 15;
    }
}
