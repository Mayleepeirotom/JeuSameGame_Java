import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La classe <code>LireGrilleDepuisFichier</code> lit une grille de jeu depuis un fichier texte.
 * Le fichier doit contenir des caractères représentant les blocs ('R' pour rouge, 'V' pour vert, 'B' pour bleu).
 *
 * @version 1.0
 */
public class LireGrilleDepuisFichier {
    
    /**
     * Lit et retourne une grille de jeu basée sur le contenu du fichier spécifié.
     *
     * @param filePath le chemin du fichier contenant la grille
     * @return une instance de Grille remplie selon le fichier ou null en cas d'erreur
     */
    public static Grille lireGrilleDepuisFichier(String filePath) {
        Grille grille = new Grille();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String ligne;
            int ligneIndex = 0;
            while ((ligne = br.readLine()) != null) {
                for (int colonneIndex = 0; colonneIndex < ligne.length(); colonneIndex++) {
                    char c = ligne.charAt(colonneIndex);
                    int valeur = 0;
                    if (c == 'R' || c == 'r') {
                        valeur = 1;
                    } else if (c == 'V' || c == 'v') {
                        valeur = 2;
                    } else if (c == 'B' || c == 'b') {
                        valeur = 3;
                    }
                    SetBloc.set(grille, ligneIndex, colonneIndex, valeur);
                }
                ligneIndex++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return grille;
    }
}
