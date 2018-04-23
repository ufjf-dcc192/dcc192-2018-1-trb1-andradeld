package Classes;

import java.util.ArrayList;
import javax.mail.FetchProfile.Item;
import java.util.List;



public class MesasDisponiveis {
 
    private static List<Mesa> disponiveis;
    
    public static List<Mesa> getInstance() {
        if (disponiveis == null) {
            disponiveis = new ArrayList<>();
            disponiveis.add(new Mesa(1));
            disponiveis.add(new Mesa(2));
            disponiveis.add(new Mesa(3));
            disponiveis.add(new Mesa(4));
            disponiveis.add(new Mesa(5));
        }
        return disponiveis;
    }
   
    }