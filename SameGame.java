import javax.swing.*;

/**
 * La classe <code>SameGame</code> constitue la fenêtre principale du jeu.
 * Elle étend <code>JFrame</code> et crée l’interface de jeu via la classe <code>InitGame</code>.
 *
 * Le constructeur sans argument initialise une grille vide (10 lignes × 15 colonnes)
 * et lance la partie.
 *
 * Le constructeur avec argument permet de démarrer la partie avec une grille fournie.
 *
 * La méthode <code>getLignes()</code> renvoie le nombre de lignes de la grille (10).
 *
 * La méthode <code>getColonnes()</code> renvoie le nombre de colonnes de la grille (15).
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class SameGame extends JFrame {
    
    /**
     * Crée une grille vide et lance l’interface de jeu.
     */
    public SameGame() {
        Grille grille = new Grille();
        new InitGame(grille);
    }

    /**
     * Démarre l’interface de jeu avec la grille spécifiée.
     *
     * @param grille la grille de jeu à utiliser
     */
    public SameGame(Grille grille) {
        new InitGame(grille);
    }

    /**
     * Renvoie le nombre de lignes de la grille de jeu.
     *
     * @return 10
     */
    public static int getLignes() {
        return 10;
    }

    /**
     * Renvoie le nombre de colonnes de la grille de jeu.
     *
     * @return 15
     */
    public static int getColonnes() {
        return 15;
    }
}

