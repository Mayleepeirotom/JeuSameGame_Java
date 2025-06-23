/**
 * La classe <code>ScorePanel</code> affiche et met à jour le score du joueur.
 * Elle hérite de <code>BaseScorePanel</code> pour bénéficier d’un style prédéfini
 * et fournit des méthodes pour ajouter des points au score et récupérer le score actuel.
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class ScorePanel extends BaseScorePanel {

    /**
     * Initialise le panneau de score avec une valeur de zéro.
     */
    public ScorePanel() {
        super();
    }

    /**
     * Ajoute un nombre de points au score existant et rafraîchit l’affichage.
     *
     * @param points nombre de points à ajouter
     */
    public void addPoints(int points) {
        score = score + points;
        updateScore();
    }

    /**
     * Renvoie la valeur actuelle du score.
     *
     * @return le score courant
     */
    public int getScore() {
        return score;
    }
}
