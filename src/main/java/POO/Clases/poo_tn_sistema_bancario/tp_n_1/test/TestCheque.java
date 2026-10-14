package poo.clases.poo_tn_sistema_bancario.tp_n_1.test;

import java.time.LocalDate;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.Cheque;

public class TestCheque {
    public static void main(String[] args) {
        // Se ingresan los datos directamente a través del constructor.
        // Simulamos un cheque con fecha de pago diferida (15 de Octubre de 2026)
        Cheque miCheque = new Cheque(152500.75, "Banco Nacion", LocalDate.of(2026, 10, 15));
        
        System.out.println("Banco Emisor: " + miCheque.getBancoEmisor());
        System.out.println("Monto: $" + miCheque.getMonto());
        System.out.println("Fecha de Pago: " + miCheque.getFechaPago());
        
        System.out.println("\n--- Verificando validez del cheque ---");
        
        if (miCheque.esValido()) {
            System.out.println("Resultado: El cheque está listo para el cobro.");
        } else {
            System.out.println("Resultado: El cheque no se puede cobrar actualmente.");
        }
    }
}


