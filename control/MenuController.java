package control;

import javax.swing.JOptionPane;
import view.ventanaJuego;

public class MenuController {

    public void iniciarJuego() {
        String nombreJugador = JOptionPane.showInputDialog(
                null,
                "Ingrese su nombre:",
                "Jugador",
                JOptionPane.QUESTION_MESSAGE
        );

        if (nombreJugador == null || nombreJugador.trim().isEmpty()) {
            nombreJugador = "anonimo";
        }

        ventanaJuego juego = new ventanaJuego(nombreJugador);
        juego.setSize(1000, 800);
        juego.setLocationRelativeTo(null);
        juego.setVisible(true);
    }
}
