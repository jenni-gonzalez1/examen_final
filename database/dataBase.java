package database;

import java.util.ArrayList;
import java.util.List;

public class dataBase {

    // Listas para guardar nombres y puntajes
    private static List<String> nombres = new ArrayList<>();

    // Agregar un nuevo jugador con su puntaje
    public static void agregarJugador(String nombre) {
        nombres.add(nombre);
        
    }

    // Obtener lista de nombres
    public static List<String> getNombres() {
        return new ArrayList<>(nombres);
    }
}
