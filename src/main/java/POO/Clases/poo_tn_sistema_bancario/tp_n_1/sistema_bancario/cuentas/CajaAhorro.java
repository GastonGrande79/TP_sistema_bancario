package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.cuentas;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString (callSuper = true)

public class CajaAhorro extends Cuenta {
    private double tasaInteres;

 public CajaAhorro(int numeroCuenta,  double saldo, double tasaInteres) {
  super(numeroCuenta, saldo);
  this.tasaInteres = tasaInteres;
 }

 @Override
 public void depositarEfectivo(double monto) {
    if (monto > 0) {
    setSaldo(getSaldo() + monto);
    } else{
        System.out.println("El monto a depositar de ser mayor a cero. ");
    }
  
 }

 @Override
 public void extraerEfectivo(double monto) {
  if (monto <= getSaldo()) {
   setSaldo(getSaldo() - monto);
  } else {
   System.out.println("Saldo insuficiente");
  }
 }

 public void cobrarInteres() {
  double interes = getSaldo() * (tasaInteres / 100);
  setSaldo(getSaldo() + interes);
 }


}
