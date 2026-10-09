package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import java.time.LocalDate;

@Getter
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaPago;

    public Cheque(double monto, String bancoEmisor, LocalDate fechaPago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaPago = fechaPago;
    }

    /**
     * Valida si el cheque es apto para el cobro en la fecha actual.
     * Un cheque no se puede cobrar antes de su fecha de pago, 
     * ni después de 30 días de la misma.
     */
    public boolean esValido() {
        LocalDate hoy = LocalDate.now();
        
        // No se puede cobrar antes de la fecha de pago
        if (hoy.isBefore(fechaPago)) {
            System.out.println("El cheque aún no puede cobrarse. Fecha de pago: " + fechaPago);
            return false;
        }
        
        // No se puede cobrar si pasaron más de 30 días (vencido)
        if (hoy.isAfter(fechaPago.plusDays(30))) {
            System.out.println("El cheque está vencido (más de 30 días desde la fecha de pago).");
            return false;
        }

        return true;
    }
}
