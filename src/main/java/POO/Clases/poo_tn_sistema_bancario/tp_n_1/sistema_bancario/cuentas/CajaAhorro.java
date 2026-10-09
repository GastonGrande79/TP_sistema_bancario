package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString(callSuper = true)
public class CajaAhorro extends Cuenta {
    private double tasaInteres;

    public CajaAhorro(int numeroCuenta, int clienteAsociado, double saldo, double tasaInteres) {
        super(numeroCuenta, clienteAsociado, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositarEfectivo(double monto) {
        if (monto > 0) {
            actualizarSaldo(getSaldo() + monto);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto > 0 && monto <= getSaldo()) {
            actualizarSaldo(getSaldo() - monto);
        } else if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor a cero.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void cobrarInteres() {
        double interes = getSaldo() * (tasaInteres / 100);
        actualizarSaldo(getSaldo() + interes);
    }
}
