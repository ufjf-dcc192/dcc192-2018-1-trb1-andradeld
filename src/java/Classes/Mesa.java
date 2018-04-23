
package Classes;

import java.util.ArrayList;
import java.util.List;


public class Mesa {

    
    private int cod_mesa;
    private boolean disponivel_mesa;
    private Pedido pedido;

    public Mesa(int cod_mesa) {
        this.cod_mesa = cod_mesa;
        disponivel_mesa = true;
        pedido = null;
        
    }

    public int getCod_mesa() {
        return cod_mesa;
    }

    public void setCod_mesa(int cod_mesa) {
        this.cod_mesa = cod_mesa;
    }

    public boolean isDisponivel_mesa() {
        return disponivel_mesa;
    }

    public void setDisponivel_mesa(boolean disponivel_mesa) {
        this.disponivel_mesa = disponivel_mesa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    
    
}


