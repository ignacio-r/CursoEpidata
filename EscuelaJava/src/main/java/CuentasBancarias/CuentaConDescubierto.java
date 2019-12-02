package CuentasBancarias;

public class CuentaConDescubierto extends Cuenta {

    private Double limiteDescubierto;

    public CuentaConDescubierto(Double limiteDescubierto, Double saldo) {
        super(saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    protected Boolean tieneSaldoSuficiente(double montoEnPesos) {
        return saldo + limiteDescubierto > montoEnPesos;
    }


}
