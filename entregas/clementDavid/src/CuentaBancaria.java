public class CuentaBancaria {
    private final String titular;
    private double saldo;
    private final String iban;

    private CuentaBancaria(String titular, double saldo, String iban) {
        assert titular != null;
        assert saldo >= 0;
        assert iban != null;
        this.titular = titular;
        this.saldo = saldo;
        this.iban = iban;
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this(titular, saldoInicial, "ES-PENDIENTE");
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public String consultarTitular() {
        return this.titular;
    }

    private void modificarSaldo(double cantidad) {
        this.saldo += cantidad;
    }

    public void depositar(double cantidad) {
        assert cantidad > 0;
        this.modificarSaldo(cantidad);
    }

    public void retirar(double cantidad) {
        assert cantidad > 0;
        assert cantidad <= this.saldo;
        this.modificarSaldo(-cantidad);
    }

    @Override
    public String toString() {
        return "Titular: " + titular + " | IBAN: " + iban + " | Saldo: " + saldo + "€";
    }
}