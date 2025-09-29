import javax.swing.SwingUtilities;
import view.VentanaMenu;

public class Main {
    public static void main(String[] args) {

        //Es un metodo de interfaz grafica
        SwingUtilities.invokeLater(() -> { //invokeLater hace que el codigo se ejecute de forma segura 
            VentanaMenu ventana = new VentanaMenu();
            ventana.setVisible(true);
            
        });
    }
}