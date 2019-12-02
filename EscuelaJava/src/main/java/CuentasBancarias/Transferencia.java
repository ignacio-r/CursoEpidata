package CuentasBancarias;

public class Transferencia extends Movimiento {

    private Cuenta destino;
    private Boolean confirmado;
    private Integer plazoAcreditacionEnDias;

    Transferencia(Double monto, Cuenta origen, Cuenta destino) {
        super(monto, origen);
        this.destino = destino;
    }

    public Cuenta getDestino() {
        return destino;
    }

    public Boolean esConfirmado() {
        return confirmado;
    }

    public Integer getPlazoAcreditacionEnDias() {
        return plazoAcreditacionEnDias;
    }
}
