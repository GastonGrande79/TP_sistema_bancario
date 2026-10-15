package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import java.time.LocalDate;

// SACAMOS LOMBOK, PERO ESCRIBIMOS LO MISMO QUE HACÍA LOMBOK
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaPago;

    // El mismo constructor que hacía @AllArgsConstructor
    public Cheque(double monto, String bancoEmisor, LocalDate fechaPago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaPago = fechaPago;
    }

    // Los mismos getters que hacía @Getter (así no se rompe el resto del proyecto)
    public double getMonto() { return monto; }
    public String getBancoEmisor() { return bancoEmisor; }
    public LocalDate getFechaPago() { return fechaPago; }

    // El mismo toString que hacía @ToString
    @Override
    public String toString() {
        return "Cheque(monto=" + monto + ", bancoEmisor=" + bancoEmisor + ", fechaPago=" + fechaPago + ")";
    }

    public boolean esValido() {
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(fechaPago)) {
            System.out.println("El cheque aún no puede cobrarse. Fecha de pago: " + fechaPago);
            return false;
        }
        if (hoy.isAfter(fechaPago.plusDays(30))) {
            System.out.println("El cheque está vencido (más de 30 días desde la fecha de pago).");
            return false;
        }
        return true;
    }
}



