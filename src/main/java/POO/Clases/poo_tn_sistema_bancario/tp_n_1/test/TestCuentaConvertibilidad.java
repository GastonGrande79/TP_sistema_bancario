package POO.Clases.poo_tn_sistema_bancario.tp_n_1.test;

import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.Cliente;
import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas.CuentaConvertibilidad;


public class TestCuentaConvertibilidad {
    public static void main(String[] args) {
        
        Cliente empresa = new ClienteEmpresa(1, "El Gallo S.A.", "303456729");

       CuentaConvertibilidad cuenta1 = new CuentaConvertibilidad(2235, empresa, 1000.0, 5000.0, 1000.0);

       cuenta1.depositarDolares(5000);
       System.out.println("Saldo actual en dólares: " + cuenta1.getSaldoDolares());

       cuenta1.extraerDolares(500);
       System.out.println("Saldo actual en dólares: " + cuenta1.getSaldoDolares());

       cuenta1.convertirPesoADolares(5000, 1530);
       System.out.println("Saldo en dólares: " + cuenta1.getSaldoDolares());

       cuenta1.convertirDolaresAPesos(200, 1450);
       System.out.println("Saldo en pesos: " + cuenta1.getSaldo());

    }


}
