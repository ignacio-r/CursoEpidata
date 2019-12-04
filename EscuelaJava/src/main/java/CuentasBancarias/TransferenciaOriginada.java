package CuentasBancarias;

public class TransferenciaOriginada extends Transferencia {

    private Cuenta destino;

    public TransferenciaOriginada(Double monto, Cuenta cuenta) {
        super(monto);
        this.destino = cuenta;
    }

}
