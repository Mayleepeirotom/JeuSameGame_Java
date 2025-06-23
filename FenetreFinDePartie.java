import javax.swing.*;

/**
 * La classe <code>FenetreFinDePartie</code> représente la fenêtre affichée
 * à la fin d'une partie, montrant le score final et proposant des actions
 * pour rejouer ou quitter via une superposition.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class FenetreFinDePartie extends FenetreDeBase {

    /**
     * Construit et affiche la fenêtre de fin de partie.
     *
     * @param scoreFinal le score final obtenu par le joueur
     */
    public FenetreFinDePartie(int scoreFinal) {
        super("Fin de Partie - Score : " + scoreFinal, "images/backgroundfin.jpg", 800, 600);
        SuperpositionFinDePartie overlay = new SuperpositionFinDePartie("images/background.png", this, scoreFinal);
        addCenterComponent(overlay);
        showFrame();
    }
}

