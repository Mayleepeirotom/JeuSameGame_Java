import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * La classe <code>LireGrilleDepuisFichier</code> lit une grille de jeu depuis un fichier texte.
 * Chaque caractere du fichier represente un bloc R ou r pour rouge, V ou v pour vert,
 * B ou b pour bleu. Les valeurs numeriques 1, 2, 3 sont affectees respectivement,
 * et les autres caracteres sont consideres comme des cases vides (0).
 * 
 * @version 1.0
 * @author Sarah et Maylee
 */
public class LireGrilleDepuisFichier {

    /**
     * Lit et retourne une grille de jeu basee sur le contenu du fichier specifie.
     * Le fichier est lu ligne par ligne ; chaque caractere de chaque ligne
     * correspond à un bloc dans la grille.
     *
     * @param filePath le chemin du fichier contenant la representation textuelle de la grille
     * @return une instance de Grille remplie selon le fichier
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
