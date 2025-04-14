import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>BaseScorePanel</code> définit le style et la logique de base pour l'affichage d'un score.
 * Elle utilise un JLabel pour afficher le score dans un style prédéfini (police Arial, gras, taille 24, couleur blanche).
 * 
 * @version 1.0
 */
public class BaseScorePanel extends JPanel {
    /**
     * Label pour afficher le score.
     */
    protected JLabel scoreLabel;
    
    /**
     * Le score actuel.
     */
    protected int score;

    /**
     * Constructeur qui initialise le score à 0 et configure le label selon le style commun.
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
     * Met à jour le texte du label en fonction du score courant.
     */
    protected void updateScore() {
        scoreLabel.setText("Score : " + score);
    }
}
