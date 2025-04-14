import javax.swing.*;

/**
 * La classe <code>FenetreFinDePartie</code> représente la fenêtre de fin de partie.
 * Elle affiche le score final ainsi que des options pour rejouer ou quitter.
 *
 * @version 1.0
 */
public class FenetreFinDePartie extends FenetreDeBase {

    /**
     * Constructeur qui crée la fenêtre de fin de partie avec le score final.
     *
     * @param scoreFinal le score final du joueur
     */
    public FenetreFinDePartie(int scoreFinal) {
        super("Fin de Partie - Score : " + scoreFinal, "images/backgroundfin.jpg", 800, 600);
        SuperpositionFinDePartie overlay = new SuperpositionFinDePartie("images/background.png", this, scoreFinal);
        addCenterComponent(overlay);
        showFrame();
    }
}

