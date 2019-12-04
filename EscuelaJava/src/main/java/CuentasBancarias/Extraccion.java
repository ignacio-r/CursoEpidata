package CuentasBancarias;

public class Extraccion extends Movimiento {

    Extraccion(Double monto, Cuenta cuentaOrigen) {
        super(monto, cuentaOrigen);
    }

    @Override
    public Boolean credito() {
        return false;
    }

}
