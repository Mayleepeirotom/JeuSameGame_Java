import javax.swing.*;

/**
 * La classe <code>ChargerGrilleDepuisFichier</code> permet de charger une grille de jeu à partir d'un fichier.
 * Elle ouvre un JFileChooser pour que l'utilisateur sélectionne le fichier contenant la grille,
 * lit son contenu et, si la grille est correctement lue, démarre une nouvelle partie.
 * 
 * @version 1.0
 */
public class ChargerGrilleDepuisFichier {
    
    /**
     * Charge la grille depuis le fichier sélectionné et démarre une nouvelle instance de SameGame.
     *
     * @param parent la fenêtre parente appelante
     * @param fileChooser le sélecteur de fichier utilisé pour choisir la grille
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
