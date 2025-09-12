package view;

import java.awt.*;
import javax.swing.*;

public class VentanaMenu extends JFrame {

    public VentanaMenu() {
        setTitle("Menú Principal");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Usamos BorderLayout en el JFrame
        setLayout(new BorderLayout());

        // Título arriba
        JLabel titulo = new JLabel("Juego de Memoria", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 40));
        add(titulo, BorderLayout.NORTH);

        // Panel contenedor para centrar vertical y horizontalmente
        JPanel panelCentral = new JPanel(new GridBagLayout());
        panelCentral.setBackground(Color.WHITE);

        // Panel donde van los botones, con BoxLayout horizontal
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.setBackground(Color.WHITE);

        // Crear botones
        JButton btnJugar = crearBoton("Jugar", new Color(76, 175, 80));
        JButton btnPuntajes = crearBoton("Puntajes", new Color(33, 150, 243));
        JButton btnSalir = crearBoton("Salir", new Color(244, 67, 54));

        // Espacios entre botones
        panelBotones.add(btnJugar);
        panelBotones.add(Box.createHorizontalStrut(20));
        panelBotones.add(btnPuntajes);
        panelBotones.add(Box.createHorizontalStrut(20));
        panelBotones.add(btnSalir);

        // Agregamos el panelBotones al centro del panelCentral
        panelCentral.add(panelBotones);

        // Agregamos panelCentral al centro de la ventana
        add(panelCentral, BorderLayout.CENTER);

        // Acciones
        btnJugar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Iniciando el juego..."));
        btnPuntajes.addActionListener(e -> JOptionPane.showMessageDialog(this, "Mostrando puntajes..."));
        btnSalir.addActionListener(e -> System.exit(0));
    }

    private JButton crearBoton(String texto, Color color) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(120, 40));
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Arial", Font.BOLD, 18));
        boton.setFocusPainted(false);
        return boton;
    }
}
