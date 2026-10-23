
package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoDolares;

    public CuentaConvertibilidad(
            int numeroCuenta,
            ClienteEmpresa clienteAsociado,
            double descubiertoAutorizado) {

        super(numeroCuenta, clienteAsociado, descubiertoAutorizado);
    }

    public void depositarDolares(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        } else {
            saldoDolares += monto;
            System.out.println("Depósito en dólares exitoso.");
        }
    }

    public void extraerDolares(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor a cero.");
        } else if (saldoDolares >= monto) { // Verifica que haya dólares suficientes para realizar la extracción.
            saldoDolares -= monto; // Descuenta el monto del saldo en dólares
            System.out.println("Extracción en dólares exitosa.");
        } else {
            System.out.println("Saldo en dólares insuficiente.");
        }
    }

    public void convertirPesosADolares(double montoPesos, double tasaCambio) {
        if (montoPesos <= 0 || tasaCambio <= 0) {
            System.out.println("El monto y la tasa de cambio deben ser mayores a cero.");
        } else if (getSaldo() + getDescubiertoAutorizado() >= montoPesos) { // Verifica si el saldo más el descubierto autorizado alcanzan.
            extraerEfectivo(montoPesos);
            saldoDolares += montoPesos / tasaCambio; // Convierte los pesos a dólares y acredita los dólares.
            System.out.println("Conversión de pesos a dólares exitosa.");
        } else {
            System.out.println("Saldo en pesos insuficiente para la conversión.");
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double tasaCambio) {
        if (montoDolares <= 0 || tasaCambio <= 0) {
            System.out.println("El monto y la tasa de cambio deben ser mayores a cero.");
        } else if (saldoDolares >= montoDolares) {
            saldoDolares -= montoDolares; // Descuenta los dólares que se van a convertir.
            depositarEfectivo(montoDolares * tasaCambio);// Convierte los dólares a pesos y deposita el resultado en la cuenta.
            System.out.println("Conversión de dólares a pesos exitosa.");
        } else {
            System.out.println("Dólares insuficientes para la conversión.");
        }
    }
}
