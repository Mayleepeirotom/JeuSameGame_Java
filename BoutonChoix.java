import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFileChooser;

/**
 * La classe <code>BoutonChoix</code> implemente MouseListener
 * pour gerer l action du bouton Charger une grille dans l ecran d accueil
 * Elle ouvre un JFileChooser permettant de selectionner un fichier
 * et lance une partie avec la grille lue si le chargement reussit.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class BoutonChoix implements MouseListener {

    /** Fenêtre d accueil depuis laquelle on lance la nouvelle partie. */
    private final AccueilSameGame accueil;

    /**
     * Construit le listener pour le bouton de chargement de grille.
     *
     * @param accueil la fenêtre d accueil appelante
     */
    public BoutonChoix(AccueilSameGame accueil) {
        this.accueil = accueil;
    }

    /**
     * Au clic, affiche un JFileChooser pour selectionner un fichier,
     * puis charge la grille et demarre une partie
     *
     * @param e l evenement de souris declenche
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        ChargerGrilleDepuisFichier.chargerGrilleDepuisFichier(accueil, new JFileChooser());
    }

    /** Methode non utilisee pour ce listener. */
    @Override public void mousePressed(MouseEvent e) { 

    }

    /** Methode non utilisee pour ce listener. */
    @Override public void mouseReleased(MouseEvent e) {

     }

    /** Methode non utilisee pour ce listener. */
    @Override public void mouseEntered(MouseEvent e) { 

    }

    /** Methode non utilisee pour ce listener. */
    @Override public void mouseExited(MouseEvent e) { 
        
    }
}
