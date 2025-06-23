// RaffraichirGrille.java

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 * La classe <code>RaffraichirGrille</code> met a jour l affichage Swing des boutons
 * representant la grille de jeu en fonction de la valeur des cases et du survol.
 * 
 * @version 1.0
 * @author Maylee et Sarah
 */
public class RaffraichirGrille {

    /**
     * Parcourt tous les boutons de la grille et :
     * - enleve l icône et la bordure si la case est vide (bloc=0) ;
     * - sinon, applique une bordure de survol si necessaire et l icône
     *   correspondant a la couleur du bloc.
     *
     * @param boutons tableau de JButton representant la grille
     * @param survole tableau de booleens indiquant les cellules actuellement survolees
     * @param grille  instance de Grille qui contient les valeurs des blocs
     */
    public void rafraichir(JButton[][] boutons, boolean[][] survole, Grille grille) {
        for (int i = 0; i < Grille.LIGNES; i++) {
            for (int j = 0; j < Grille.COLONNES; j++) {
                int bloc = grille.getBloc(i, j);
                if (bloc == 0) {
                    boutons[i][j].setIcon(null);
                    boutons[i][j].setBorder(null);
                } else {
                    if (survole[i][j]) {
                        boutons[i][j].setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));
                    } else {
                        boutons[i][j].setBorder(null);
                    }
                    boutons[i][j].setIcon(GetCouleur.getCouleur(bloc));
                }
            }
        }
    }
}

