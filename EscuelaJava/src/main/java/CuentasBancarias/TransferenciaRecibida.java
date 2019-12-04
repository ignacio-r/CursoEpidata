package CuentasBancarias;

public class TransferenciaRecibida extends Transferencia {

    private Cuenta origen;

    public TransferenciaRecibida(Double monto, Cuenta cuentaOrigen, Integer periodicidad) {
        super(monto, periodicidad);
        this.origen = cuentaOrigen;
    }

    @Override
    public Boolean credito() {
        return true;
    }
}
