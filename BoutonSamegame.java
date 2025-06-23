import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * La classe <code>BoutonSamegame</code> fournit un <code>JButton</code> 
 * personnalisable n’affichant qu’une icône, sans bordure ni arrière‑plan,
 * pour s’intégrer harmonieusement à l’interface du jeu.
 *
 * @version 1.0
 * @author Maylee et Sarah
 */
public class BoutonSamegame extends JButton {

    /**
     * Construit un bouton qui affiche uniquement l’icône située au chemin donné.
     * Le bouton n’a ni bordure, ni fond, ni indication de focus.
     *
     * @param cheminIcone le chemin du fichier image à utiliser comme icône
     */
    public BoutonSamegame(String cheminIcone) {
        super(new ImageIcon(cheminIcone));
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
    }
}
