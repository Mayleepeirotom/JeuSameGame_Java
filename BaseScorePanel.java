import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>BaseScorePanel</code> définit le style et la logique de base
 * pour l'affichage du score du joueur dans le jeu SameGame.
 * Elle utilise un JLabel configuré (police Arial, gras, taille 24, couleur blanche).
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class BaseScorePanel extends JPanel {
    /**
     * JLabel affichant le texte du score.
     */
    protected JLabel scoreLabel;
    
    /**
     * Valeur entière représentant le score actuel.
     */
    protected int score;

    /**
     * Construit un panneau de score initialisé à zéro et configure le label
     * selon le style graphique défini pour le jeu.
     */
    public BaseScorePanel() {
        score = 0;
        scoreLabel = new JLabel("Score : " + score, SwingConstants.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 24));
        scoreLabel.setForeground(Color.WHITE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(scoreLabel);
        setOpaque(false);
        updateScore();
    }

    /**
     * Met à jour l'affichage du label pour refléter la valeur actuelle du score.
     */
    protected void updateScore() {
        scoreLabel.setText("Score : " + score);
    }
}
