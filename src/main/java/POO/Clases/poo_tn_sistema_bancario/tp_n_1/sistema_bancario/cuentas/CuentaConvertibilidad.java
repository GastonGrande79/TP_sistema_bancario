package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoDolares;

    // Forzamos desde el parámetro que el cliente sea únicamente un ClienteEmpresa
    public CuentaConvertibilidad(int numeroCuenta, ClienteEmpresa clienteAsociado, double saldo, double descubiertoAutorizado, double saldoDolares) {
        // Usamos el getter heredado de Cliente para obtener el número de cliente que pide tu superclase
        super(numeroCuenta, clienteAsociado.getNumeroCliente(), saldo, descubiertoAutorizado);
        this.saldoDolares = saldoDolares;
    }

    public void depositarDolares(double monto) {
        if (monto > 0) {
            this.saldoDolares += monto;
        }
    }

    public void extraerDolares(double monto) {
        if (monto <= 0) return;
        
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
