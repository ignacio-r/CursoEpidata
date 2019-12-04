package CuentasBancarias;

public class TransferenciaOriginada extends Transferencia {

    private Cuenta destino;

    public TransferenciaOriginada(Double monto, Cuenta cuenta, Integer periodicidad) {
        super(monto, periodicidad);
        this.destino = cuenta;
    }

    @Override
    public Boolean credito() {
        return false;
    }
}
