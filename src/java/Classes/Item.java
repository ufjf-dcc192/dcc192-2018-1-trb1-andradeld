package Classes;

public class Item {
    
    private int cod_item;
    private char nome_item;
    private float preco_item;

    public Item(int cod_item) {
        this.cod_item = cod_item;
    }

    public int getCod_item() {
        return cod_item;
    }

    public char getNome_item() {
        return nome_item;
    }

    public float getPreco_item() {
        return preco_item;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public void setNome_item(char nome_item) {
        this.nome_item = nome_item;
    }

    public void setPreco_item(float preco_item) {
        this.preco_item = preco_item;
    }
  
    
}


