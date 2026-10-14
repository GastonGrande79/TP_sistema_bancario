package poo.clases.poo_tn_sistema_bancario.tp_n_1.test;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.CuentaCorriente;

public class TestCuentaCorriente {
    public static void main(String[] args) {
        ClienteEmpresa empresa = new ClienteEmpresa(1, " El Gallo S.A.", "303456729");
        System.out.println("Cliente: " + empresa); 

        // Agregamos el número de cliente asociado (empresa.getNumeroCliente())
        // Parámetros: numeroCuenta (2235), clienteAsociado (1), saldo inicial (20000.0), descubiertoAutorizado (10000.0)
        CuentaCorriente cuenta2 = new CuentaCorriente(2235, empresa.getNumeroCliente(), 20000.0, 10000.0);
        
        System.out.println("Saldo inicial: " + cuenta2.getSaldo());

        System.out.println("\n--- Extraccion de $25000 (Usa $5000 de descubierto) ---");
        cuenta2.extraerEfectivo(25000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo()); // Debería quedar en -5000.0

        System.out.println("\n--- Extraccion de $16000 (Supera el limite de descubierto) ---");
        cuenta2.extraerEfectivo(16000); // Debería lanzar "Saldo insuficiente"
        System.out.println("Saldo actual: " + cuenta2.getSaldo());

        System.out.println("\n--- Deposito de $16000 ---");
        cuenta2.depositarEfectivo(16000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo()); // Debería quedar en 11000.0
    }
}

    


