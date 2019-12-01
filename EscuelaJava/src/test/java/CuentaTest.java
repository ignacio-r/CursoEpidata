import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void unaNuevaCuentaIniciaConCeroPesosYPuedeDepositarYExtraer() {
        Cuenta cuenta = new Cuenta();

        cuenta.depositar(100.0);
        cuenta.extraer(50.0);

        Assertions.assertEquals(50.0, cuenta.saldo());
    }

    @Test
    public void noSePuedeExtraerDineroSinSaldoSuficiente() {
        final Cuenta cuenta = new Cuenta();

        cuenta.depositar(100.0);

        RuntimeException runtimeException =
                Assertions.assertThrows(RuntimeException.class, () -> {
                    cuenta.extraer(200.0);
                });
        Assertions.assertEquals("Saldo insuficiente!", runtimeException.getMessage());
    }

    @Test
    public void transfiereDineroAOtraCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(200.0);
        Cuenta cuenta1 = new Cuenta();
        cuenta.transferir(100.0, cuenta1);

        Assertions.assertEquals(100.0, cuenta1.saldo());
    }
}
