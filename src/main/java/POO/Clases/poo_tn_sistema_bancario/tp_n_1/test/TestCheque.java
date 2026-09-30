package POO.Clases.poo_tn_sistema_bancario.tp_n_1.test;

import java.time.LocalDate;

import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.Cheque;

public class TestCheque {
    public static void main(String[] args) {
        

        
        Cheque miCheque = new Cheque();
        
        miCheque.setMonto(152500.75);
        miCheque.setBancoEmisor("Banco Nacion");
        
        miCheque.setFechaPago(LocalDate.of(2026, 10, 15));
        
        System.out.println(miCheque);
        
        if (miCheque.getFechaPago().isBefore(LocalDate.now()) || miCheque.getFechaPago().isEqual(LocalDate.now())) {
            System.out.println("El cheque está listo para el cobro.");
        } else {
            System.out.println("El cheque es de pago diferido (aún no se puede cobrar).");
        }
    }


}


