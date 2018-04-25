package Classes;

import java.util.ArrayList;
import java.util.List;

public class ItensDisponiveis {
 
    private static List<Produto> disponiveis;
    
    public static List<Produto> getInstance() {
        if (disponiveis == null) {
            disponiveis = new ArrayList<>();
            disponiveis.add(new Produto(1, "Combinado 1", 1.00, 0));
            disponiveis.add(new Produto(2, "Combinado 2", 12.00, 0));
            disponiveis.add(new Produto(3, "Combinado 3", 4.00, 0));
            disponiveis.add(new Produto(4, "Combinado 4", 7.00, 0));
            disponiveis.add(new Produto(5, "Combinado 5", 5.00, 0));
            disponiveis.add(new Produto(6, "Combinado 6", 9.00, 0));
            disponiveis.add(new Produto(7, "Combinado 7", 11.00, 0));
            disponiveis.add(new Produto(8, "Combinado 8", 20.00, 0));
        }
        return disponiveis;
    }
   
    }
