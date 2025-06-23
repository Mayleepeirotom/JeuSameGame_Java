import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * La classe <code>BoutonAleatoire</code> implemente MouseListener
 * pour gerer l action du bouton Grille Aleatoire dans l ecran d accueil.
 * Elle genere une grille aleatoire et demarre une partie lorsqu on clique dessus.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class BoutonAleatoire implements MouseListener {

    /** Fenêtre d accueil depuis laquelle la partie est lancee. */
    private final AccueilSameGame accueil;

    /**
     * Construit le listener pour le bouton Partie alatoire.
     *
     * @param accueil la fenêtre d accueil appelante
     */
    public BoutonAleatoire(AccueilSameGame accueil) {
        this.accueil = accueil;
    }

    /**
     * Au clic, genere une nouvelle grille aleatoire, lance le jeu et ferme l ecran d accueil.
     *
     * @param e l evenement de souris declenche
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        LancerJeuAleatoire.lancerJeuAleatoire(accueil);
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
