public class Main {
    public static void main(String[] args) {
        Banco central = new Banco("Banco Central");


        CuentaBancaria cuentaAna = new CuentaBancaria("Ana García", 5000.0);
        CuentaBancaria cuentaJuan = new CuentaBancaria("Juan Pérez", 3000.0);

        central.registrarCuenta(cuentaAna);
        central.registrarCuenta(cuentaJuan);

        cuentaAna.depositar(1000.0);
        assert cuentaAna.consultarSaldo() == 6000.0 : "Error: El saldo debería ser 6000";
        System.out.println("Test Ingreso: PASADO");

        cuentaAna.retirar(2000.0);
        assert cuentaAna.consultarSaldo() == 4000.0 : "Error: El saldo debería ser 4000";
        System.out.println("Test Retirada: PASADO");

        central.transferir(cuentaAna, cuentaJuan, 500.0);

        assert cuentaAna.consultarSaldo() == 3500.0 : "Error en origen tras transferencia";
        assert cuentaJuan.consultarSaldo() == 3500.0 : "Error en destino tras transferencia";
        System.out.println("Test Transferencia: PASADO");

        System.out.println(cuentaAna.toString());
        System.out.println(cuentaJuan.toString());
    }
}