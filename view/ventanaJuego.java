package view;

import control.JuegoController;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import modulo.Jugador;

public class ventanaJuego extends JFrame {

    private final String cartaBocaAbajo = "❓"; 
    private final JuegoController controlador = new JuegoController();
    private Jugador jugador;

    public ventanaJuego(String nombreJugador) {
        this.jugador = new Jugador(nombreJugador);

        setTitle("Juego de Memoria - " + nombreJugador); 
        setSize(600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Panel del tablero
        JPanel panel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] emojis = {"🍎", "🍌", "🍇", "🍉", "🍓", "🍒", "🥑", "🍍"};

        ArrayList<String> cartas = new ArrayList<>();
        for (String emoji : emojis) {
            cartas.add(emoji);
        }

        
        ArrayList<String> todas = new ArrayList<>();
        todas.addAll(cartas);
        todas.addAll(cartas);

        java.util.Collections.shuffle(todas);

        for (String carta : todas) {
            JButton boton = new JButton(cartaBocaAbajo);
            boton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 40));

            boton.addActionListener(e -> {
                controlador.manejarClick(boton, carta);

                // cuando termina el juego aparece un mensaje
                if (todasDestapadas(panel)) {
                    jugador.mostrarResultado();
                }
            });

            panel.add(boton);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

        // Verifica si ya no quedan cartas boca abajo
        private boolean todasDestapadas(JPanel panel) {
            for (Component c : panel.getComponents()) {
                if (c instanceof JButton) {
                    JButton btn = (JButton) c;
                    if (btn.isEnabled()) { 
                        return false;
                    }
                }
            }
            return true;
        }
    }
