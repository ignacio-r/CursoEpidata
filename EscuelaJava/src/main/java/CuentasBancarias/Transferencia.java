package CuentasBancarias;

import java.time.LocalDate;

public class Transferencia extends Movimiento {

    private final Long PLAZO_ACREDITACION = 6l;
    private Long plazoAcreditacionEnDias;

    Transferencia(Double monto) {
        super(monto);
        this.plazoAcreditacionEnDias = PLAZO_ACREDITACION;
    }

    //TODO destino y origen

    @Override
    public Boolean estaConfirmado() {
        return fecha().plusDays(PLAZO_ACREDITACION).isBefore(LocalDate.now());
    }

    @Override
    public Boolean esDebito() {
        return this instanceof TransferenciaOriginada;
    }

    @Override
    public Boolean esCredito() {
        return this instanceof TransferenciaRecibida;
    }

    public Long getPlazoAcreditacionEnDias() {
        return plazoAcreditacionEnDias;
    }
}
