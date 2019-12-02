package CuentasBancarias;

public class CuentaCostoTransferencia extends Cuenta {


    public CuentaCostoTransferencia(Double saldo) {
        super(saldo);
    }

    @Override
    public void transferir(double monto, Cuenta cuenta) {
        transferir(monto * costoDeTransferencia(), monto, cuenta);
    }

    private double costoDeTransferencia() {
        return 1.01;
    }

}
