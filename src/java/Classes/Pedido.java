package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private String data_abertura_ped;
    private String data_fechamento_ped;
    private boolean aberto_ped;
    private static List<Produto> produtos = new ArrayList<>();

    public Pedido() {
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

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<Produto> produtos) {
        Pedido.produtos = produtos;
    }

    
}
