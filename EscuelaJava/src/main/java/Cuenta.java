import java.util.Scanner;

public class Cuenta {

    private Double saldo = 0.0;

    public static void main(String[] args) {
        char operacion;
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        System.out.print("Ingresar una letra: Extraccion e, Depositar d, Saldo s");
        operacion = scanner.next().charAt(0);
        switch (operacion) {
            case 'e':
                System.out.print("Monto a extraer: ");
                break;
            case 'd':
                System.out.print("Monto a depositar: ");
                double montoEnPesos = scanner.nextDouble();
                cuenta.depositar(montoEnPesos);
                System.out.print("Monto: " + montoEnPesos);
                break;
            case 's':
                System.out.print("Saldo: " + cuenta.saldo);
                break;
            default:
                System.out.println("Operacion invalida");
                break;
        }
    }

    public void depositar(double montoEnPesos) {
        saldo += montoEnPesos;
    }

    public Double saldo() {
        return saldo;
    }

    public void extraer(double montoEnPesos) {
        assertTieneSaldoSuficiente(montoEnPesos);
        saldo -= montoEnPesos;
    }

    private void assertTieneSaldoSuficiente(double montoEnPesos) {
        if (saldo - montoEnPesos < 0) {
            throw new RuntimeException("Saldo insuficiente!");
        }
    }

    public void transferir(double monto, Cuenta cuenta) {
        extraer(monto);
        cuenta.depositar(monto);
    }
}
