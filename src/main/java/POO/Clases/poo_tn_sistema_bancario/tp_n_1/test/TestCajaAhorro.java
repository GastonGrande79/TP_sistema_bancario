package poo.clases.poo_tn_sistema_bancario.tp_n_1.test;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteIndividual;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.CajaAhorro;

public class TestCajaAhorro {
    public static void main(String[] args) {
        ClienteIndividual cliente1 = new ClienteIndividual(1, "Roberto", "Sanchez", "90345678");
        
        System.out.println("Cliente: " + cliente1.getNumeroCliente() + " - " + cliente1.getNombre() + " " + cliente1.getApellido() + " (DNI: " + cliente1.getDni() + ")");
                                 
        // CORRECCIÓN: Se agregaron los 4 parámetros requeridos por el constructor
        // Parámetros: numeroCuenta (10), clienteAsociado (cliente1.getNumeroCliente()), saldo inicial (15000.0), tasaInteres (12.0)
        CajaAhorro caja1 = new CajaAhorro(10, cliente1.getNumeroCliente(), 15000.0, 12.0);
        
        System.out.println("Saldo inicial: $" + caja1.getSaldo());

        System.out.println("\n--- Deposito de $8000.0 ---");
        caja1.depositarEfectivo(8000);
        System.out.println("Saldo actual: $" + caja1.getSaldo());

        System.out.println("\n--- Extraccion de $2000.0 ---");
        caja1.extraerEfectivo(2000);
        System.out.println("Saldo actual: $" + caja1.getSaldo());

        System.out.println("\n--- Extraccion de $25000.0 ---");
        caja1.extraerEfectivo(25000);
        System.out.println("Saldo actual: $" + caja1.getSaldo());

        System.out.println("\n--- Cobro de Intereses ---");
        caja1.cobrarInteres();
        System.out.println("Saldo + intereses: $" + caja1.getSaldo());
    }
}
