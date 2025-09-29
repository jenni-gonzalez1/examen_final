package view;

import control.MenuController;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class VentanaMenu extends JFrame {

    private MenuController menuController;

    public VentanaMenu() {
        setTitle("Menú Principal");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Controlador
        menuController = new MenuController();

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Juego de Memoria", SwingConstants.CENTER);
        titulo.setFont(new Font("Serif", Font.BOLD, 40));
        add(titulo, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridBagLayout());
        panelCentral.setBackground(Color.LIGHT_GRAY);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.X_AXIS));
        panelBotones.setBackground(Color.LIGHT_GRAY);

        JButton btnJugar = crearBoton("Jugar", new Color(76, 175, 80));
        JButton btnPuntajes = crearBoton("Puntajes", new Color(33, 150, 243));
        JButton btnSalir = crearBoton("Salir", new Color(244, 67, 54));

        panelBotones.add(btnJugar);
        panelBotones.add(Box.createHorizontalStrut(100));
        panelBotones.add(btnPuntajes);
        panelBotones.add(Box.createHorizontalStrut(100));
        panelBotones.add(btnSalir);

        panelCentral.add(panelBotones);
        add(panelCentral, BorderLayout.CENTER);

        // Acciones
        btnJugar.addActionListener(e -> {
            dispose(); // Cierra el menú
            menuController.iniciarJuego(); // Llama al controlador
        });

        btnPuntajes.addActionListener(e -> {
            dispose(); // Cierra el menú
            // Datos de ejemplo de puntajes
            ArrayList<String> nombres = new ArrayList<>();
            ArrayList<Integer> puntajes = new ArrayList<>();


            // Abrir ventana de puntajes
            new ventanaPuntajes(nombres, puntajes);
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }

    private JButton crearBoton(String texto, Color color) {
        JButton boton = new JButton(texto);
        boton.setPreferredSize(new Dimension(100, 60));
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Serif", Font.BOLD, 20));
        boton.setFocusPainted(false);
        return boton;
    }
}
