import javax.swing.*;

/**
 * La classe <code>ChargerGrilleDepuisFichier</code> permet de sélectionner et charger
 * une grille de jeu depuis un fichier choisi par l'utilisateur via un JFileChooser.
 * Si la lecture est réussie, elle démarre une nouvelle partie de SameGame avec cette grille.
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class ChargerGrilleDepuisFichier {
    
    /**
     * Ouvre la boîte de dialogue pour choisir un fichier de grille, lit son contenu
     * pour créer une instance de Grille et, si tout se passe bien,
     * lance une nouvelle partie et ferme la fenêtre d'accueil.
     *
     * @param parent      la fenêtre d'accueil appelante
     * @param fileChooser l'instance de JFileChooser utilisée pour la sélection du fichier
     */
    public static void chargerGrilleDepuisFichier(AccueilSameGame parent, JFileChooser fileChooser) {
        int retour = fileChooser.showOpenDialog(parent);
        if (retour == JFileChooser.APPROVE_OPTION) {
            String chemin = fileChooser.getSelectedFile().getPath();
            Grille grille = LireGrilleDepuisFichier.lireGrilleDepuisFichier(chemin);
            if (grille != null) {
                new SameGame(grille);
                parent.dispose();
            }
        }
    }
}
