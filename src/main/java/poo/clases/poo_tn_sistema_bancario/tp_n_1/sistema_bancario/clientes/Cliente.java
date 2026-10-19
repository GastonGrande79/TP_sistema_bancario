package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes;

import lombok.Getter;
import lombok.ToString;

@Getter  
@ToString 
public abstract class Cliente {
    private int numeroCliente;

    public Cliente(int numeroCliente) {
        super(); 
        this.numeroCliente = numeroCliente;
    }
}


    
