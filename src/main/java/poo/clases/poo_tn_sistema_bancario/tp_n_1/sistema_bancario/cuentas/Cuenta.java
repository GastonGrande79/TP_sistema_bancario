package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString 
public abstract class Cuenta {
    private int numeroCuenta;
    private int clienteAsociado;
    private double saldo;

    public Cuenta(int numeroCuenta, int clienteAsociado) {
        this.numeroCuenta = numeroCuenta;
        this.clienteAsociado = clienteAsociado;
        this.saldo = 0.0; 
    }
    
    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo(double monto);

    protected void actualizarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
}

