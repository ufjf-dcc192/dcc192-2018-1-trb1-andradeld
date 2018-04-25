package Classes;

public class Mesa {

    
    private static int cod_mesa;
    private boolean disponivel_mesa;

    public Mesa(int num) {
        disponivel_mesa = true;
        cod_mesa = num;
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


