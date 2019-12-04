package CuentasBancarias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {

    public static final String SALDO_INSUFICIENTE = "Saldo insuficiente!";
    private final LocalDate fechaApertura;
    protected Double saldo;
    private ArrayList<Movimiento> movimientos = new ArrayList<>();

    public Cuenta(Double saldo) {
        this.saldo = saldo;
        this.fechaApertura = LocalDate.now();
    }

    public static void main(String[] args) {
        char operacion;
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(0.0);
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
        movimientos.add(new Deposito(montoEnPesos, this));
    }

    public Double saldo() {
        return saldo;
    }

    public void extraer(double montoEnPesos) {
        assertTieneSaldoSuficiente(montoEnPesos);
        movimientos.add(new Extraccion(montoEnPesos, this));
        saldo -= montoEnPesos;
    }

    private void assertTieneSaldoSuficiente(double montoEnPesos) {
        if (tieneSaldoSuficiente(montoEnPesos)) {
            throw new RuntimeException("Saldo insuficiente!");
        }
    }

    protected Boolean tieneSaldoSuficiente(double montoEnPesos) {
        return saldo - montoEnPesos < 0;
    }

    public void transferir(double monto, Cuenta cuenta) {
        transferir(monto, monto, cuenta);
        Transferencia transferencia = new TransferenciaOriginada(monto, cuenta, 5);
        TransferenciaRecibida transferenciaRecibida = new TransferenciaRecibida(monto, cuenta, 5);
        movimientos.add(transferencia);
        cuenta.agregarMovimiento(transferenciaRecibida);
    }

    protected void transferir(double debito, double credito, Cuenta cuenta) {
        extraer(debito);
        cuenta.depositar(credito);
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void agregarMovimiento(Movimiento movimiento) {
        movimientos.add(movimiento);
    }

/*    public List<Movimiento> depositos(){
        return movimientos.stream().filter((e) -> e instanceof Deposito).collect(Collectors.toList());
    }

    public Double montoTotalDepositos(){
        return depositos().stream()
                .mapToDouble(Movimiento::getMonto)
                .sum();
    }

    public List<Movimiento> extracciones(){
        return movimientos.stream().filter((e) -> e instanceof Extraccion).collect(Collectors.toList());
    }

    public Double montoTotalExtracciones(){
        return depositos().stream()
                .mapToDouble(Movimiento::getMonto)
                .sum();
    }*/

}
