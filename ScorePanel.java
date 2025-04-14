/**
 * La classe <code>ScorePanel</code> gère l'affichage et la mise à jour du score du joueur.
 * Elle hérite de BaseScorePanel pour bénéficier de son style prédéfini.
 *
 * @version 1.0
 */
public class ScorePanel extends BaseScorePanel {

    /**
     * Constructeur qui initialise le panneau de score.
     */
    public ScorePanel() {
        super();
    }

    /**
     * Ajoute des points au score actuel et met à jour l'affichage.
     *
     * @param points le nombre de points à ajouter
     */
    public void addPoints(int points) {
        score = score + points;
        updateScore();
    }

    /**
     * Renvoie le score courant.
     *
     * @return le score actuel
     */
    public int getScore() {
        return score;
    }
}
