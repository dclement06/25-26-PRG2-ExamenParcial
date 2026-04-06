public class Cliente {
    private final String nombre;
    private final String dni;
    private final String direccion;

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }

    public Cliente(String nombre, String dni, String direccion) {
        assert nombre != null;
        assert dni != null;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }
}