public class CuentaCostoTransferencia extends Cuenta {


    @Override
    public void transferir(double monto, Cuenta cuenta) {
        transferir(monto * costoDeTransferencia(), monto, cuenta);
    }

    private double costoDeTransferencia() {
        return 1.01;
    }

}
