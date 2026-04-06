import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        assert nombre != null;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }
}