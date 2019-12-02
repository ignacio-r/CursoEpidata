package CuentasBancarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Movimiento {

    private Double monto;
    private LocalDateTime fechaYHorario;
    private Cuenta origen;

    Movimiento(Double monto, Cuenta cuentaOrigen) {
        this.fechaYHorario = LocalDateTime.now();
        this.monto = monto;
        this.origen = cuentaOrigen;
    }

    LocalDate fecha() {
        return fechaYHorario.toLocalDate();
    }

    LocalTime horario() {
        return fechaYHorario.toLocalTime();
    }

    public Double getMonto() {
        return monto;
    }

    public Cuenta getOrigen() {
        return origen;
    }

    public Boolean estaConfirmado() {
        return true;
    }
}
