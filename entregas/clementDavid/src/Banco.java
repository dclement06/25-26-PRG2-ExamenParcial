import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final String nombre;
    private final List<CuentaBancaria> cuentas;

    public Banco(String nombre) {
        assert nombre != null;
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void registrarCuenta(CuentaBancaria cuenta) {
        assert cuenta != null;
        this.cuentas.add(cuenta);
    }

    public void transferir(CuentaBancaria origen, CuentaBancaria destino, double monto) {
        assert monto > 0;
        origen.retirar(monto);
        destino.depositar(monto);
    }

    public String getNombre() {
        return nombre;
    }
}