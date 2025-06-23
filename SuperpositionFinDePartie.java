import javax.swing.*;
import java.awt.*;

/**
 * La classe <code>SuperpositionFinDePartie</code> affiche une superposition de page
 * à la fin de la partie qui montre le score final et propose des actions pour rejouer
 * ou quitter.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class SuperpositionFinDePartie extends ComposantFond {

    /**
     * Construit la superposition de fin de partie.
     *
     * @param cheminImage chemin vers l'image de fond à afficher
     * @param parent      fenêtre parent sur laquelle la superposition est appliquée
     * @param scoreFinal  score final obtenu par le joueur
     */
    public SuperpositionFinDePartie(String cheminImage, final JFrame parent, int scoreFinal) {
        super(cheminImage);
        setLayout(new BorderLayout());

        JLabel labelScore = new JLabel("Score final : " + scoreFinal, SwingConstants.CENTER);
        labelScore.setFont(new Font("Arial", Font.BOLD, 24));
        labelScore.setForeground(Color.WHITE);
        add(labelScore, BorderLayout.NORTH);

        // Ici, on ajoute le panneau qui gère les boutons finaux.
        add(new PanneauBoutonsFinDePartie(parent), BorderLayout.CENTER);
    }
}
