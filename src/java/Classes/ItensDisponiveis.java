package Classes;

import java.util.ArrayList;
import javax.mail.FetchProfile.Item;
import java.util.List;



public class ItensDisponiveis {
 
    private static List<Produto> disponiveis;
    
    public static List<Produto> getInstance() {
        if (disponiveis == null) {
            disponiveis = new ArrayList<>();
            disponiveis.add(new Produto(1, "Pao", 10.00));
            disponiveis.add(new Produto(2, "Bife", 20.80));
        }
        return disponiveis;
    }
   
    }
