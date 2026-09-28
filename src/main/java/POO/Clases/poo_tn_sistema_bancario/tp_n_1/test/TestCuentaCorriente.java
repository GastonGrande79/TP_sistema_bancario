package POO.Clases.poo_tn_sistema_bancario.tp_n_1.test;

import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.ClienteEmpresa;
import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.CuentaCorriente;

public class TestCuentaCorriente {
    public static void main(String[] args) {
        ClienteEmpresa empresa = new ClienteEmpresa(1, " El Gallo S.A.", "303456729");
        System.out.println("Cliente: " + empresa); 

        CuentaCorriente cuenta2 = new CuentaCorriente(2235,  20000.0, 10000.0);
        
        System.out.println("Saldo inicial: " + cuenta2.getSaldo());

        cuenta2.extraerEfectivo(25000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo());

        cuenta2.extraerEfectivo(16000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo());

        cuenta2.depositarEfectivo(16000);
        System.out.println("Saldo actual: " + cuenta2.getSaldo());
    }

}
    


