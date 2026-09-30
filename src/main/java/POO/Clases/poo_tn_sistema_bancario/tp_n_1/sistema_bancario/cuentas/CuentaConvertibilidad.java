package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.Cliente;
import POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;
    private ClienteEmpresa clienteEmpresa;

    public double getSaldoDolares() {
        return saldoDolares;
    }

    public CuentaConvertibilidad(int numeroCuenta, Cliente cliente, double saldo, double descubiertoAutorizado, double saldoDolares) {
           
        super(numeroCuenta, saldo, descubiertoAutorizado);
        this.saldoDolares = saldoDolares;
    }
  
    public void depositarDolares(double monto) {
        this.saldoDolares += monto;
    }
   
    public void extraerDolares(double monto) {
        this.saldoDolares -= monto;
    }

    public void convertirPesoADolares(double monto , double tasaCambio) {
        if (monto <= getSaldo()) {
            double montoDolares = monto * tasaCambio;
            extraerDolares(monto);
            depositarDolares(montoDolares);
        } else {
            System.out.println("Saldo insuficiente en pesos para su conversion a dolares.");
        }
    }

        public void convertirDolaresAPesos(double monto , double tasaCambio) {
        if (monto <= getSaldoDolares()) {
            double montoPesos = monto * tasaCambio;
            extraerDolares(monto);
            depositarEfectivo(montoPesos);
        } else {
            System.out.println(" Saldo insuficiente en dólares para su conversion a pesos.");
        }
    }


}
