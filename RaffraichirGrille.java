import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class RaffraichirGrille {
    
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
