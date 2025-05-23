package Modelo;


public class Cliente {
    public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}
public void setDireccion(String direccion) {
    this.direccion = direccion;
}
public void setCorreo(String correo) {
    this.correo = correo;
}

    private String nombre;
    private String documento;
    private String telefono;
    private String direccion;
    private String correo;

    public Cliente(String nombre, String documento, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public String getCorreo() { return correo; }
}

