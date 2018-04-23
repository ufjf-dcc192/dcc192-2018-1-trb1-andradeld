package Classes;

import java.util.ArrayList;
import java.util.List;

public class PedidosAbertos {
    private static List<Pedido> aberto;
    
    public static List<Pedido> getInstance() {
            aberto = new ArrayList<>();
            aberto.add(new Pedido());
        return aberto;
    }
    
}
