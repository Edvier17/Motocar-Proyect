package controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;

public class VehiculoControlador {
    public static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    public static void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    public static Vehiculo buscarPorPlaca(String placa) {
    for (Vehiculo v : listaVehiculos) {
        if (v.getPlaca().equalsIgnoreCase(placa)) {
            return v;
        }
        
    }
    return null;
}public static boolean eliminarPorPlaca(String placa) {
    for (Vehiculo v : listaVehiculos) {
        if (v.getPlaca().equalsIgnoreCase(placa)) {
            listaVehiculos.remove(v);
            return true;
        }
    }
    return false;
}

    

}
