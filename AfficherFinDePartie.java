import javax.swing.*;

/**
 * La classe <code>AfficherFinDePartie</code> s'occupe d'afficher
 * la superposition de fin de partie avec le score et les options
 * pour rejouer ou quitter.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class AfficherFinDePartie {

    /**
     * Affiche la superposition de fin de partie en tant que glass pane
     * sur la fenêtre parent, et affiche le score final du joueur.
     *
     * @param parent     la fenêtre sur laquelle appliquer la superposition
     * @param scoreFinal le score obtenu par le joueur
     */
    public void afficherFinDePartie(final JFrame parent, final int scoreFinal) {
        SuperpositionFinDePartie overlay = new SuperpositionFinDePartie("images/backgroundfin.jpg", parent, scoreFinal);
        parent.setGlassPane(overlay);
        overlay.setVisible(true);
    }
}
