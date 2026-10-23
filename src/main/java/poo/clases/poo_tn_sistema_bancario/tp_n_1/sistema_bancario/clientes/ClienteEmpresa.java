package poo.clases.poo_tn_sistema_bancario.tp_n_1.sistema_bancario.clientes;

import lombok.Getter;
import lombok.ToString;

@Getter 
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int numeroCliente, String nombreFantasia, String cuit) {
        super(numeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

}  

