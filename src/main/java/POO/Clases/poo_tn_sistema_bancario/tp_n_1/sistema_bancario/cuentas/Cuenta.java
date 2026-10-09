package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter 
@AllArgsConstructor 
@ToString 
public abstract class Cuenta {
    private int numeroCuenta;
    private int clienteAsociado;
    private double saldo;

    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo(double monto);

    //Permite a las subclases actualizar el saldo de forma controlada
    protected void actualizarSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
}
