package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    
    private int num_ped = 1;
    private static int cont_ped = 0;
    private double valotTotal = 0;
    private Date data_abertura_ped;
    private Date data_fechamento_ped;
    private boolean aberto_ped;
    private int num_mesa;
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

    public int getCont_ped() {
        return cont_ped;
    }

    public static void setCont_ped(int cont_ped) {
        Pedido.cont_ped = cont_ped;
    }

    public double getValotTotal() {
        return valotTotal;
    }

    public void setValotTotal(double valotTotal) {
        this.valotTotal = valotTotal + this.valotTotal;
    }

    public Date getData_abertura_ped() {
        return data_abertura_ped;
    }

    public void setData_abertura_ped(Date data_abertura_ped) {
        this.data_abertura_ped = data_abertura_ped;
    }

    public Date getData_fechamento_ped() {
        return data_fechamento_ped;
    }

    public void setData_fechamento_ped(Date data_fechamento_ped) {
        this.data_fechamento_ped = data_fechamento_ped;
    }

    public boolean isAberto_ped() {
        return aberto_ped;
    }

    public void setAberto_ped(boolean aberto_ped) {
        this.aberto_ped = aberto_ped;
    }

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    
}
