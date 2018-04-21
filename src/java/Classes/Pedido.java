package Classes;

import java.util.Date;

public class Pedido {
    private int cod_ped;
    private int cod_prod; //Vai associar um(ns) iten(s) a um pedido
    private Date data_abertura_ped;
    private Date data_fechamento_ped;
    private boolean aberto_ped;
    private int cod_mesa; //Vai associar uma mesa a um pedido

    public Pedido(int cod_ped) {
        this.cod_ped = cod_ped;
    }

    public int getCod_ped() {
        return cod_ped;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public Date getData_abertura_ped() {
        return data_abertura_ped;
    }

    public Date getData_fechamento_ped() {
        return data_fechamento_ped;
    }

    public boolean isAberto_ped() {
        return aberto_ped;
    }

    public int getCod_mesa() {
        return cod_mesa;
    }

    public void setCod_ped(int cod_ped) {
        this.cod_ped = cod_ped;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public void setData_abertura_ped(Date data_abertura_ped) {
        this.data_abertura_ped = data_abertura_ped;
    }

    public void setData_fechamento_ped(Date data_fechamento_ped) {
        this.data_fechamento_ped = data_fechamento_ped;
    }

    public void setAberto_ped(boolean aberto_ped) {
        this.aberto_ped = aberto_ped;
    }

    public void setCod_mesa(int cod_mesa) {
        this.cod_mesa = cod_mesa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cod_ped=" + cod_ped + ", cod_prod=" + cod_prod + ", data_abertura_ped=" + data_abertura_ped + ", data_fechamento_ped=" + data_fechamento_ped + ", aberto_ped=" + aberto_ped + ", cod_mesa=" + cod_mesa + '}';
    }
    
    
}
