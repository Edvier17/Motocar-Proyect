package Controlador;

import Modelo.Cliente;
import java.util.ArrayList;

public class ClienteControlador {
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void agregarCliente(Cliente c) {
        listaClientes.add(c);
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    public static Cliente buscarPorDocumento(String doc) {
    for (Cliente c : listaClientes) {
        if (c.getDocumento().equalsIgnoreCase(doc)) {
            return c;
        }
    }
    return null;
}

}
