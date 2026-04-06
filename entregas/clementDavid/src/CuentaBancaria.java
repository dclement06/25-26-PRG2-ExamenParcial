public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String iban;
    private TipoCuenta tipo;
}
private CuentaBancaria(String titular, double saldo, String iban, TipoCuenta tipo) {
    assert titular != null;
    assert saldo >= 0;
    assert iban != null;
    this.titular = titular;
    this.saldo = saldo;
    this.iban = iban;
    this.tipo = tipo;
}
public CuentaBancaria(String titular, double saldoInicial) {
    this(titular, saldoInicial, "ES-PENDIENTE", TipoCuenta.ESTANDAR);    
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