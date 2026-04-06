public class Main {
    public static void main(String[] args) {
        Banco central = new Banco("Banco Central");
        Cliente ana = new Cliente("Ana García", "12345678A", "Calle Albert Einstein 16");
        Cliente juan = new Cliente("Juan Pérez", "87654321B", "Avenida Principal 62");
    }
}
CuentaBancaria c1 = new CuentaBancaria("Ana García", 5000);
CuentaBancaria c2 = new CuentaBancaria("Juan Pérez", 3000);
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaAna = new CuentaBancaria("Ana García", 5000.0);
        cuentaAna.depositar(1000.0);
        assert cuentaAna.consultarSaldo() == 6000.0 : "Error: El saldo debería ser 6000";
        System.out.println("Test Ingreso: PASADO");
    }
}
        cuentaAna.retirar(2000.0);
        assert cuentaAna.consultarSaldo() == 4000.0 : "Error: El saldo debería ser 4000";
        System.out.println("Test Retirada: PASADO");

        CuentaBancaria cuentaJuan = new CuentaBancaria("Juan Pérez", 3000.0);
        Banco miBanco = new Banco("Banco Central");

        miBanco.transferir(cuentaAna, cuentaJuan, 500.0);

        assert cuentaAna.consultarSaldo() == 3500.0 : "Error en origen tras transferencia";
        assert cuentaJuan.consultarSaldo() == 3500.0 : "Error en destino tras transferencia";
        
        System.out.println("Test Transferencia: PASADO");        