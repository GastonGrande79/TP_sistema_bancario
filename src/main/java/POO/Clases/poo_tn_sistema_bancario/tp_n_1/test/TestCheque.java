package POO.Clases.poo_tn_sistema_bancario.tp_n_1.test;

import java.time.LocalDate;
import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.Cheque;

public class TestCheque {
    public static void main(String[] args) {
        

        
        Cheque miCheque = new Cheque();
        
        miCheque.setMonto(152500.75);
        miCheque.setBancoEmisor("Banco Nacion");
        
        // Asignar fecha usando LocalDate (Año, Mes, Día)
        miCheque.setFechaPago(LocalDate.of(2026, 10, 15));
        
        System.out.println(miCheque);
        
        // Validar si el cheque ya se puede cobrar 
        if (miCheque.getFechaPago().isBefore(LocalDate.now()) || miCheque.getFechaPago().isEqual(LocalDate.now())) {
            System.out.println("El cheque está listo para el cobro.");
        } else {
            System.out.println("El cheque es de pago diferido (aún no se puede cobrar).");
        }
    }


}


