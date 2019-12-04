package CuentasBancarias;

public class Deposito extends Movimiento {


    Deposito(Double monto, Cuenta cuentaOrigen) {
        super(monto, cuentaOrigen);
    }

    @Override
    public Boolean credito() {
        return true;
    }


}
