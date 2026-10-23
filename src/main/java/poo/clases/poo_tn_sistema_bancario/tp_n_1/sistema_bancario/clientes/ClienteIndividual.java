package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString(callSuper = true)
public class ClienteIndividual extends Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(int numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    

    
}

