package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString (callSuper = true)

public class ClienteIndividual extends Cliente{
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(int id, String nombre, String apellido, String dni) {
    super(id);
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
 }

}
