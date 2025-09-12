import javax.swing.SwingUtilities;
import view.VentanaMenu;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaMenu ventana = new VentanaMenu();
            ventana.setVisible(true);
        });
    }
}