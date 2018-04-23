package Classes;

public class Produto{
    
    private int cod_prod;
    private String nome_item;
    private double preco_item;

    public Produto(int cod_prod, String nome_item, double preco_item) {
        this.cod_prod = cod_prod;
        this.nome_item = nome_item;
        this.preco_item = preco_item;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNome_item() {
        return nome_item;
    }

    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        this.preco_item = preco_item;
    }

    
    
}


