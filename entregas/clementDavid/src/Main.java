public class Main {
    public static void main(String[] args) {
        Banco central = new Banco("Banco Central");
        Cliente ana = new Cliente("Ana García", "12345678A", "Calle Albert Einstein 16");
        Cliente juan = new Cliente("Juan Pérez", "87654321B", "Avenida Principal 62");
    }
}
CuentaBancaria c1 = new CuentaBancaria("Ana García", 5000);
CuentaBancaria c2 = new CuentaBancaria("Juan Pérez", 3000);