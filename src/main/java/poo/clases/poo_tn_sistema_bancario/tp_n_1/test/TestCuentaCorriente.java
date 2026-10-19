package poo.clases.poo_tn_sistema_bancario.tp_n_1.test;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.CuentaCorriente;

public class TestCuentaCorriente {
    public static void main(String[] args) {
        ClienteEmpresa empresa = new ClienteEmpresa(1, " El Gallo S.A.", "303456729");
        System.out.println("Cliente: " + empresa); 

        CuentaCorriente cuenta2 = new CuentaCorriente(2235, empresa.getNumeroCliente(), 10000.0);
        
        System.out.println("Saldo de apertura (Garantizado en cero): " + cuenta2.getSaldo());

        System.out.println("\n--- Carga Inicial de Fondos: $20000.0 ---");
        cuenta2.depositarEfectivo(20000.0);
        System.out.println("Saldo inicial operativo: " + cuenta2.getSaldo());

        System.out.println("\n--- Extraccion de $25000 (Usa $5000 de descubierto) ---");
        cuenta2.extraerEfectivo(25000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo()); // Debería quedar en -5000.0

        System.out.println("\n--- Extraccion de $16000 (Supera el limite de descubierto) ---");
        cuenta2.extraerEfectivo(16000); // Muestra el mensaje de "Saldo insuficiente" porque -5000 + 10000 = 5000, menor a 16000
        System.out.println("Saldo actual: " + cuenta2.getSaldo());

        System.out.println("\n--- Deposito de $16000 ---");
        cuenta2.depositarEfectivo(16000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo());
    }
}


    


