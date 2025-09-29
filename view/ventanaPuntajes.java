package view;

import java.awt.*;
import java.util.List;
import javax.swing.*;

public class ventanaPuntajes extends JFrame {

    public ventanaPuntajes(List<String> nombres, List<Integer> puntajes) {
        setTitle("Puntajes de los Jugadores");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Puntajes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        add(titulo, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 5, 5)); // una fila por jugador

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            int puntaje = puntajes.get(i);
            JLabel lbl = new JLabel(nombre + " : " + puntaje + " puntos", SwingConstants.CENTER);
            lbl.setFont(new Font("Arial", Font.PLAIN, 18));
            panel.add(lbl);
        }

        JScrollPane scroll = new JScrollPane(panel);
        add(scroll, BorderLayout.CENTER);

        setVisible(true);
    }
}
