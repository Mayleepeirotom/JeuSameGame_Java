import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * La classe <code>BoutonQuitterFin</code> implemente MouseListener
 * pour gerer l'action de quitter l application quand on clique sur Quitter
 * en fin de partie.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class BoutonQuitterFin implements MouseListener {

    /**
     * Au clic, termine immediatement l application.
     *
     * @param e l evenement de souris ayant declenche l action
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
    }

    /** Methode non utilisee pour ce listener. */
    @Override public void mousePressed(MouseEvent e) {

     }

    /** Methode non utilisée pour ce listener. */
    @Override public void mouseReleased(MouseEvent e) { 

    }

    /** Methode non utilisée pour ce listener. */
    @Override public void mouseEntered(MouseEvent e) { 

    }

    /** Methode non utilisée pour ce listener. */
    @Override public void mouseExited(MouseEvent e) { 
        
    }
}
