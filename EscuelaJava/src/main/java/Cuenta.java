import java.util.Scanner;

public class Cuenta {

    static final String SALDO_INSUFICIENTE = "Saldo insuficiente!";
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
                double monto = scanner.nextDouble();
                cuenta.extraer(monto);
                System.out.print("Extraccion exitosa: " + monto);
                break;
            case 'd':
                System.out.print("Monto a depositar: ");
                double montoEnPesos = scanner.nextDouble();
                cuenta.depositar(montoEnPesos);
                System.out.print("Deposito exitoso: " + montoEnPesos);
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
        if (tieneSaldoSuficiente(montoEnPesos)) {
            throw new RuntimeException("Saldo insuficiente!");
        }
    }

    private Boolean tieneSaldoSuficiente(double montoEnPesos) {
        return saldo - montoEnPesos < 0;
    }

    public void transferir(double monto, Cuenta cuenta) {
        extraer(monto);
        cuenta.depositar(monto);
    }
}
