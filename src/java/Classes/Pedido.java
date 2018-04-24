package Classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private int num_ped = 0;
    private static int cont_ped = 0;
    double valotTotal = 0;
    private String data_abertura_ped;
    private String data_fechamento_ped;
    private boolean aberto_ped;
    private  List<Produto> produtos = new ArrayList<>();

    
    
    public Pedido() {
        this.num_ped = this.cont_ped+ this.num_ped;
        this.cont_ped++;
    }

    public int getNum_ped() {
        return num_ped;
    }

    public void setNum_ped(int num_ped) {
        this.num_ped = num_ped;
    }

    public String getData_abertura_ped() {
        return data_abertura_ped;
    }

    public void setData_abertura_ped(String data_abertura_ped) {
        this.data_abertura_ped = data_abertura_ped;
    }

    public String getData_fechamento_ped() {
        return data_fechamento_ped;
    }

    public void setData_fechamento_ped(String data_fechamento_ped) {
        this.data_fechamento_ped = data_fechamento_ped;
    }

    public boolean isAberto_ped() {
        return aberto_ped;
    }

    public void setAberto_ped(boolean aberto_ped) {
        this.aberto_ped = aberto_ped;
    }

    public  List<Produto> getProdutos() {
        return produtos;
    }
    
}
