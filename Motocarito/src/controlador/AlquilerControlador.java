package Controlador;

import Modelo.Alquiler;
import java.util.ArrayList;

public class AlquilerControlador {
    public static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();

    public static void registrarAlquiler(Alquiler a) {
        listaAlquileres.add(a);
    }

    public static ArrayList<Alquiler> getListaAlquileres() {
        return listaAlquileres;
    }
    public static Alquiler buscarPorPlaca(String placa) {
    for (Alquiler a : listaAlquileres) {
        if (a.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
            return a;
        }
    }
    return null;
}
public static boolean cancelarAlquilerPorPlaca(String placa) {
    Alquiler a = buscarPorPlaca(placa);
    if (a != null) {
        listaAlquileres.remove(a);
        return true;
    }
    return false;
}

}
