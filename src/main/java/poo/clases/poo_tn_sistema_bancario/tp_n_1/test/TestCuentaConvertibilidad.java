package poo.clases.poo_tn_sistema_bancario.tp_n_1.test;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.CuentaConvertibilidad;

public class TestCuentaConvertibilidad {
    public static void main(String[] args) {
        
        ClienteEmpresa empresa = new ClienteEmpresa(1, "El Gallo S.A.", "303456729");

        
        // Ambos saldos (pesos y dólares) arrancan automáticamente en 0.0 de forma segura.
        CuentaConvertibilidad cuenta1 = new CuentaConvertibilidad(2235, empresa, 5000.0);

        
        System.out.println("--- Carga inicial de fondos operativos ---");
        cuenta1.depositarEfectivo(1000.0); // Carga inicial en pesos
        cuenta1.depositarDolares(1000.0);  // Carga inicial en dólares
        System.out.println("Saldo de apertura - Pesos: $" + cuenta1.getSaldo() + " | Dólares: U$S " + cuenta1.getSaldoDolares());

        System.out.println("\n--- Depósito de U$S 5000 ---");
        cuenta1.depositarDolares(5000);
        System.out.println("Saldo actual en dólares: " + cuenta1.getSaldoDolares());

        System.out.println("\n--- Extracción de U$S 500 ---");
        cuenta1.extraerDolares(500);
        System.out.println("Saldo actual en dólares: " + cuenta1.getSaldoDolares());
        System.out.println("\n--- Conversión: $5000 Pesos a Dólares (Cotización: 1530) ---");
    
        cuenta1.convertirPesosADolares(5000, 1530);
        System.out.println("Saldo en dólares: " + cuenta1.getSaldoDolares());
        System.out.println("Saldo remanente en pesos: " + cuenta1.getSaldo());

        System.out.println("\n--- Conversión: U$S 200 a Pesos (Cotización: 1450) ---");
        cuenta1.convertirDolaresAPesos(200, 1450);
        System.out.println("Saldo en dólares: " + cuenta1.getSaldoDolares());
        System.out.println("Saldo en pesos: " + cuenta1.getSaldo());
    }
}

