import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * La classe <code>GetCouleur</code> fournit une méthode pour obtenir une icône redimensionnée 
 * correspondant à une couleur de bloc, en fonction de sa valeur (1, 2 ou 3).
 *
 * @version 1.0
 */
public class GetCouleur {
    /** Largeur d'une cellule. */
    private static final int CELL_WIDTH = 50;
    /** Hauteur d'une cellule. */
    private static final int CELL_HEIGHT = 50;
    /** Chemin de l'image pour le bloc rouge. */
    private static final String IMAGE_ROUGE = "images/coquillage.png";
    /** Chemin de l'image pour le bloc vert. */
    private static final String IMAGE_VERT  = "images/etoile.png";
    /** Chemin de l'image pour le bloc bleu. */
    private static final String IMAGE_BLEU  = "images/hibiscus.png";

    /**
     * Retourne une icône redimensionnée correspondant à la valeur du bloc.
     *
     * @param c la valeur du bloc (1 = rouge, 2 = vert, 3 = bleu)
     * @return une ImageIcon redimensionnée ou null si la valeur n'est pas reconnue
     */
    public static ImageIcon getCouleur(int c) {
        String chemin = null;
        switch(c) {
            case 1:
                chemin = IMAGE_ROUGE;
                break;
            case 2:
                chemin = IMAGE_VERT;
                break;
            case 3:
                chemin = IMAGE_BLEU;
                break;
            default:
                return null; // Bloc vide ou valeur non reconnue
        }
        ImageIcon icon = new ImageIcon(chemin);
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(CELL_WIDTH, CELL_HEIGHT, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}
