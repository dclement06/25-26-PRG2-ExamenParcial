public class Cliente {
    private String nombre;
    private String dni;
    private String direccion;
}
public Cliente(String nombre, String dni, String direccion) {
    assert nombre != null;
    assert dni != null;
    this.nombre = nombre;
    this.dni = dni;
    this.direccion = direccion;
}