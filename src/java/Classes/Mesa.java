
package Classes;


public class Mesa {
    
    private int cod_mesa;
    private boolean disponivel_mesa = true;
    private int cod_pedido;

    public Mesa(int cod_mesa) {
        this.cod_mesa = cod_mesa;
    }

    public Mesa(int i, boolean b, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCod_mesa() {
        return cod_mesa;
    }

    public boolean isDisponivel_mesa() {
        return disponivel_mesa;
    }

    public int getCod_pedido() {
        return cod_pedido;
    }

    public void setCod_mesa(int cod_mesa) {
        this.cod_mesa = cod_mesa;
    }

    public void setDisponivel_mesa(boolean disponivel_mesa) {
        this.disponivel_mesa = disponivel_mesa;
    }

    public void setCod_pedido(int cod_pedido) {
        this.cod_pedido = cod_pedido;
    }

    @Override
    public String toString() {
        return "Mesa{" + "cod_mesa=" + cod_mesa + ", disponivel_mesa=" + disponivel_mesa + ", cod_pedido=" + cod_pedido + '}';
    }
  
    
}


