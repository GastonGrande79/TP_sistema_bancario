package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaPago;

    public boolean estaListoParaCobrar() {
    LocalDate hoy = LocalDate.now();
    return this.fechaPago.isBefore(hoy) || this.fechaPago.isEqual(hoy);
    }
}
