package Modelo;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Alquiler(Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() { return cliente; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
