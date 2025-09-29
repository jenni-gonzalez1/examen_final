package modulo;

import javax.swing.JOptionPane;

public class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Mostrar mensaje al terminar la partida
    public void mostrarResultado() {
        JOptionPane.showMessageDialog(
            null,
            "¡Felicidades " + nombre + "! Has terminado la partida.",
            "Juego terminado",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
