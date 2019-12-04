package CuentasBancarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Movimiento {

    private Double monto;
    protected LocalDateTime fechaYHorario;

    Movimiento(Double monto, Cuenta cuentaOrigen) {
        this(monto);
    }

    Movimiento(Double monto) {
        this.fechaYHorario = LocalDateTime.now();
        this.monto = monto;
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

    public Boolean estaConfirmado() {
        return true;
    }

    public Boolean esDebito() {
        return this instanceof Extraccion;
    }

    public abstract Boolean credito();

    public Boolean debito() {
        return !credito();
    }

    public Boolean esCredito() {
        return this instanceof Deposito;
    }
}
