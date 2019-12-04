package CuentasBancarias;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Transferencia extends Movimiento implements Recurrente {

    private final Long PLAZO_ACREDITACION = 6l;
    private Long plazoAcreditacionEnDias;
    protected Integer periodicidad;

    Transferencia(Double monto, Integer periodicidad) {
        super(monto);
        this.plazoAcreditacionEnDias = PLAZO_ACREDITACION;
        this.periodicidad = periodicidad;
    }

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

    public Integer periodicidad() {
        return periodicidad;
    }

    public LocalDateTime proxima() {
        return this.fechaYHorario.plusDays(periodicidad);
    }

    public Long getPlazoAcreditacionEnDias() {
        return plazoAcreditacionEnDias;
    }
}
