package CuentasBancarias;

import java.time.LocalDateTime;

public interface Recurrente {

    Integer periodicidad(); //dias

    LocalDateTime proxima();

}
