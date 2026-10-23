package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaPago;

    public boolean esValido() {
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(fechaPago)) { // Verifica si llegó a la fecha de pago.
            System.out.println("El cheque aún no puede cobrarse. Fecha de pago: " + fechaPago);
            return false;
        }
        if (hoy.isAfter(fechaPago.plusDays(30))) { // Verifica si pasaron más de 30 días desde la fecha de pago.
            System.out.println("El cheque está vencido (más de 30 días desde la fecha de pago).");
            return false;
        }
        return true;
    }
}




