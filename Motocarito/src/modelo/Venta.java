package Modelo;

public class Venta {
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Venta(Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
