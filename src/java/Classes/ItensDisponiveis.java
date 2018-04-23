package Classes;

import java.util.ArrayList;
import javax.mail.FetchProfile.Item;
import java.util.List;



public class ItensDisponiveis {
 
    private static List<Produto> disponiveis;
    
    public static List<Produto> getInstance() {
        if (disponiveis == null) {
            disponiveis = new ArrayList<>();
            disponiveis.add(new Produto("Pao", 10.00));
            disponiveis.add(new Produto("Bife", 20));
        }
        return disponiveis;
    }
   
    }
