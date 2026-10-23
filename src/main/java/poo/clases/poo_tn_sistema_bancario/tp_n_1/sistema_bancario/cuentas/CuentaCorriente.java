package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;
import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.Cliente;

@Getter 
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta {
    private double descubiertoAutorizado;

    public CuentaCorriente(int numeroCuenta, Cliente clienteAsociado, double descubiertoAutorizado) {
        super(numeroCuenta, clienteAsociado);
        this.descubiertoAutorizado = descubiertoAutorizado;
    }

    
    @Override
    public void depositarEfectivo(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        } else {
            actualizarSaldo(getSaldo() + monto);
            System.out.println("Depósito exitoso.");
        }
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor a cero.");
        } else if (getSaldo() + descubiertoAutorizado >= monto) {
            actualizarSaldo(getSaldo() - monto);
            System.out.println("Extracción exitosa.");
        } else {
            System.out.println("No se puede realizar la operación. Saldo insuficiente.");
        }
    }

    public void depositarCheque(Cheque cheque) {
        if (cheque == null) {
            System.out.println("El cheque no puede ser nulo.");
        } else if (cheque.getMonto() <= 0) {
            System.out.println("El monto del cheque debe ser mayor a cero.");
        } else if (cheque.esValido()) {
            depositarEfectivo(cheque.getMonto());
            System.out.println("Depósito exitoso: Se acreditaron $" + cheque.getMonto() + " del banco " + cheque.getBancoEmisor());
                       
        } else {
            System.out.println("Depósito rechazado: El cheque no es válido para su cobro.");
        }
    }

}