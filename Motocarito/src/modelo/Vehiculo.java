package Modelo;

public class Vehiculo {
    private String tipo;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private String estado;

    public Vehiculo(String tipo, String placa, String marca, String modelo, String color, double precio, String estado) {
        this.tipo = tipo;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.estado = estado;
    }public void setMarca(String marca) {
    this.marca = marca;
}

public void setModelo(String modelo) {
    this.modelo = modelo;
}

public void setColor(String color) {
    this.color = color;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public void setEstado(String estado) {
    this.estado = estado;
}


    public String getTipo() { return tipo; }
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public double getPrecio() { return precio; }
    public String getEstado() { return estado; }
}
