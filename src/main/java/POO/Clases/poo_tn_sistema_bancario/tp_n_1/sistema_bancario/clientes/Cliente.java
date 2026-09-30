package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 

public abstract class Cliente {
    private int numeroCliente;

    public Cliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroCliente() { return numeroCliente; }
    
}
    
