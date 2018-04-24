package Classes;

import java.util.ArrayList;
import java.util.List;

public class ItensDisponiveis {
 
    private static List<Produto> disponiveis;
    
    public static List<Produto> getInstance() {
        if (disponiveis == null) {
            disponiveis = new ArrayList<>();
            disponiveis.add(new Produto(1, "Combinado 1", 10.00));
            disponiveis.add(new Produto(2, "Combinado 2", 20.80));
            disponiveis.add(new Produto(3, "Combinado 3", 10.00));
            disponiveis.add(new Produto(4, "Combinado 4", 20.80));
            disponiveis.add(new Produto(5, "Combinado 5", 10.00));
            disponiveis.add(new Produto(6, "Combinado 6", 20.80));
            disponiveis.add(new Produto(7, "Combinado 7", 10.00));
            disponiveis.add(new Produto(8, "Combinado 8", 20.80));
        }
        return disponiveis;
    }
   
    }
