package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa clienteAsociado, double descubiertoAutorizado) {
        super(numeroCuenta, clienteAsociado.getNumeroCliente(), descubiertoAutorizado);
        this.saldoDolares = 0.0; // Garantizamos que el saldo en dólares también inicie en cero
    }

    public void depositarDolares(double monto) {
        if (monto > 0) {
            this.saldoDolares += monto;
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public void extraerDolares(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a extraer debe ser mayor a cero.");
            return;
        }
        
        if (this.saldoDolares >= monto) {
            this.saldoDolares -= monto;
        } else {
            System.err.println("Saldo en dólares insuficiente.");
        }
    }

    public void convertirPesosADolares(double montoPesos, double tasaCambio) {
        if (montoPesos <= 0 || tasaCambio <= 0) return;
        
        if (getSaldo() + getDescubiertoAutorizado() >= montoPesos) {
            extraerEfectivo(montoPesos); 
            this.saldoDolares += (montoPesos / tasaCambio); 
        } else {
            System.err.println("Saldo en pesos insuficiente para la conversión.");
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double tasaCambio) {
        if (montoDolares <= 0 || tasaCambio <= 0) return;

        if (this.saldoDolares >= montoDolares) {
            this.saldoDolares -= montoDolares; 
            depositarEfectivo(montoDolares * tasaCambio); 
        } else {
            System.err.println("Dólares insuficientes para la conversión.");
        }
    }
}
