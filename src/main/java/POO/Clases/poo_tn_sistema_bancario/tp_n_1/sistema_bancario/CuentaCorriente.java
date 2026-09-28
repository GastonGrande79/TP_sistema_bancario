package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString (callSuper = true)
public class CuentaCorriente extends Cuenta  {
    private double descubiertoAutorizado;

 public CuentaCorriente(int numeroCuenta, double saldo, double descubiertoAutorizado) {
  super(numeroCuenta, saldo);
  this.descubiertoAutorizado = descubiertoAutorizado;
 }

 @Override
 public void depositarEfectivo(double monto) {
  setSaldo(getSaldo() + monto);
 }

 @Override
 public void extraerEfectivo(double monto) {
  if (getSaldo() + descubiertoAutorizado >= monto) {
   setSaldo(getSaldo() - monto);
  } else {
   System.out.println("No se puede realizar la operacion. Saldo insuficiente.");
  }
 }

 public void depositarCheque(Cheque cheque) {
  setSaldo(getSaldo() + cheque.getMonto());
 }

}
