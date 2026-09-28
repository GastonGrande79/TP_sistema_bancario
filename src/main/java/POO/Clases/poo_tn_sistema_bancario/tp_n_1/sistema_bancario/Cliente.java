package POO.Clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@ToString 

public class Cliente {
    private int id;

    public Cliente(int id) {
        super();
        this.id = id;
    }
}
