package Controlador;

import Modelo.Venta;
import java.util.ArrayList;
import java.util.List;

public class VentaControlador {

    private static List<Venta> listaVentas = new ArrayList<>();

    public static void registrarVenta(Venta venta) {
        listaVentas.add(venta);
    }

    public static List<Venta> getListaVentas() {
        return listaVentas;
    }

    public static Venta buscarVenta(String documento, String placa) {
        for (Venta v : listaVentas) {
            if (v.getCliente().getDocumento().equalsIgnoreCase(documento)
                && v.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    public static boolean cancelarVenta(String documento, String placa) {
        Venta v = buscarVenta(documento, placa);
        if (v != null) {
            listaVentas.remove(v);
            return true;
        }
        return false;
    } public static boolean cancelarVentaPorPlaca(String placa) {
    for (Venta v : listaVentas) {
        if (v.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
            listaVentas.remove(v);
            return true;
        }
    }
    return false;
}
}


