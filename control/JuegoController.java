package control;

import java.awt.event.*;
import javax.swing.*;

public class JuegoController {

    private JButton primeraSeleccion = null;
    private String primeraCarta = null;
    private final String cartaBocaAbajo = "❓";

    // Método que se asocia a cada botón en ventanaJuego
    public void manejarClick(JButton boton, String carta) {
    
        if (!boton.getText().equals(cartaBocaAbajo)) {
            return;
        }

        boton.setText(carta); // mostrar carta

        if (primeraSeleccion == null) {
            // Primera carta seleccionada
            primeraSeleccion = boton;
            primeraCarta = carta;
            boton.setEnabled(false);
        } else {
            // Segunda carta seleccionada
            if (primeraCarta.equals(carta)) {
                //si son iguales quedan con el dibujo 
                boton.setEnabled(false);
                primeraSeleccion = null;
                primeraCarta = null;
            } else {
                // no son iguales se voltean
                JButton temp = primeraSeleccion;
                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.setText(cartaBocaAbajo);
                        temp.setEnabled(true);
                        boton.setText(cartaBocaAbajo);
                    }
                });
                timer.setRepeats(false);
                timer.start();

                primeraSeleccion = null;
                primeraCarta = null;
            }
        }
    }
}
