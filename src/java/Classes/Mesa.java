package Classes;

public class Mesa {

    
    private int cod_mesa;
    private boolean disponivel_mesa = true;

    public Mesa(int cod_mesa1) {
        this.cod_mesa = cod_mesa1;
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
}


