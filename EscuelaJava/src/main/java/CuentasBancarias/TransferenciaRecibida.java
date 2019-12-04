package CuentasBancarias;

public class TransferenciaRecibida extends Transferencia {

    private Cuenta origen;

    public TransferenciaRecibida(Double monto, Cuenta cuentaOrigen) {
        super(monto);
        this.origen = cuentaOrigen;
    }
}
