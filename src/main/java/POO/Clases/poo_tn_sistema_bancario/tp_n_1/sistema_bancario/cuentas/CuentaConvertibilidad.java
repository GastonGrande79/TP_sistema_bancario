package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, int clienteAsociado, double saldo, double descubiertoAutorizado, double saldoDolares) {
        super(numeroCuenta, clienteAsociado, saldo, descubiertoAutorizado);
        this.saldoDolares = saldoDolares;
    }

    public void depositarDolares(double monto) {
        if (monto <= 0) return;
        this.saldoDolares += monto;
    }

    public void extraerDolares(double monto) {
        if (monto <= 0) return;
        if (this.saldoDolares >= monto) {
            this.saldoDolares -= monto;
        } else {
            System.out.println("Error: Saldo en dólares insuficiente.");
        }
    }

    public void convertirPesosADolares(double montoPesos, double tasaCambio) {
        if (montoPesos <= 0 || tasaCambio <= 0) return;
        
        if (getSaldo() + getDescubiertoAutorizado() >= montoPesos) {
            extraerEfectivo(montoPesos); // Reutiliza lógica y validación de extracción
            this.saldoDolares += (montoPesos / tasaCambio); 
        } else {
            System.out.println("Error: Saldo insuficiente para la conversión.");
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double tasaCambio) {
        if (montoDolares <= 0 || tasaCambio <= 0) return;

        if (this.saldoDolares >= montoDolares) {
            this.saldoDolares -= montoDolares; 
            depositarEfectivo(montoDolares * tasaCambio); // 🌟 Reutiliza la lógica heredada de depósito
        } else {
            System.out.println("Error: Dólares insuficientes para la conversión.");
        }
    }
}
