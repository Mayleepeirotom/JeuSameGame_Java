import javax.swing.*;
import java.awt.*;

public class SuperpositionFinDePartie extends ComposantFond {

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
