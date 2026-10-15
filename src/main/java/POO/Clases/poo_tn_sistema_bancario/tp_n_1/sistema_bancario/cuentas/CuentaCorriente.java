package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta {
    private double descubiertoAutorizado;

    public CuentaCorriente(int numeroCuenta, int clienteAsociado, double descubiertoAutorizado) {
        super(numeroCuenta, clienteAsociado);
        this.descubiertoAutorizado = descubiertoAutorizado;
    }

    @Override
    public void depositarEfectivo(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
            return;
        }
        actualizarSaldo(getSaldo() + monto);
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor a cero.");
            return;
        }
        if (getSaldo() + descubiertoAutorizado >= monto) {
            actualizarSaldo(getSaldo() - monto);
        } else {
            System.out.println("No se puede realizar la operacion. Saldo insuficiente.");
        }
    }

    public void depositarCheque(Cheque cheque) {
        if (cheque == null) {
            System.out.println("El cheque no puede ser nulo.");
            return;
        }

        if (cheque.esValido()) {
            depositarEfectivo(cheque.getMonto());
            System.out.println("Depósito exitoso: Se acreditaron $" + cheque.getMonto() + " del banco " + cheque.getBancoEmisor());
        } else {
            System.out.println("Depósito rechazado: El cheque no es válido para su cobro.");
        }
    }
}
