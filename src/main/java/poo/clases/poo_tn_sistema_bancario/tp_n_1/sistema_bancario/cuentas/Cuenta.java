package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.Cliente;

@Getter 
@ToString 
public abstract class Cuenta {
    private int numeroCuenta;
    private Cliente clienteAsociado;
    private double saldo;

    public Cuenta(int numeroCuenta, Cliente clienteAsociado) {
        this.numeroCuenta = numeroCuenta;
        this.clienteAsociado = clienteAsociado;
        
    }
    
    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo(double monto);

    protected void actualizarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
}

