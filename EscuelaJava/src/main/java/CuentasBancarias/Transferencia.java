package CuentasBancarias;

import java.time.LocalDate;

public class Transferencia extends Movimiento {

    private final Long PLAZO_ACREDITACION = 6l;
    private Cuenta destino;
    private Long plazoAcreditacionEnDias;

    Transferencia(Double monto, Cuenta origen, Cuenta destino) {
        super(monto, origen);
        this.destino = destino;
        this.plazoAcreditacionEnDias = PLAZO_ACREDITACION;
    }

    public Cuenta getDestino() {
        return destino;
    }

    @Override
    public Boolean estaConfirmado() {
        return fecha().plusDays(PLAZO_ACREDITACION).isBefore(LocalDate.now());
    }

    public Long getPlazoAcreditacionEnDias() {
        return plazoAcreditacionEnDias;
    }
}
