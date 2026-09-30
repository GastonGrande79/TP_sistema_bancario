package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@AllArgsConstructor 
@ToString 
public abstract class Cuenta {
private int numeroCuenta;
private double saldo;

public abstract void depositarEfectivo(double monto);
    


public abstract void extraerEfectivo(double monto);
  
}
