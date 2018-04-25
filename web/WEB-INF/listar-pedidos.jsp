<%@page import="Classes.Pedido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

    <head>
        <%            List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos"); %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taiyo Sushi Bar</title>
    </head>
    
        <h1>Pedidos abertos:</h1>
        <%if (pedidos.size() == 0){%>
        Nenhum pedido aberto até o momento.
        <%}%>
        <%int cont1 = 0;%>
        
        
        <%            for (int i = 0; i < pedidos.size(); i++) {%>
        <%if (pedidos.get(i).isAberto_ped() == false ){%>
        <%cont1 = cont1 +1;%>
        <%}%>
        <h3>Pedido número:<%=pedidos.get(i).getNum_ped()%></h3>    
        <p>Mesa associada:<%=pedidos.get(i).getNum_mesa()%></p>
        <p> Data e hora da abertura: <%=pedidos.get(i).getData_abertura_ped()%> </p> 
        <h4>Detalhes do pedido</h4>
        <p>
            <%            for (int j = 0; j < pedidos.get(i).getProdutos().size(); j++) {%>
            Código produto:<%= pedidos.get(i).getProdutos().get(j).getCod_prod()%>
            Nome produto:<%= pedidos.get(i).getProdutos().get(j).getNome_item()%>
            Preço produto:<%= pedidos.get(i).getProdutos().get(j).getPreco_item()%>
        </p>
        <%}%>
        <p>Valor total: <%=pedidos.get(0).getValotTotal()%></p>
        <br>
        
        <%if (cont1 == pedidos.size()){%>
        Nenhum pedido aberto até o momento.
        <%}%>
        
        <%}%>

        <h1>Pedidos Encerrados:</h1>
        <%int cont3 = -1;%>
        <%            for (int k = 0; k < pedidos.size(); k++) {%>
        
        <%if (pedidos.get(k).isAberto_ped() == false ){%>
        <p>Pedido número:<%=pedidos.get(k).getNum_ped()%></p>
        <p>Data e hora do fechamento<%=pedidos.get(k).getData_fechamento_ped()%></p>
        <p>Valor total: <%=pedidos.get(0).getValotTotal()%></p>
        <br>
        <%}%>
        
        
        <%if (pedidos.get(k).isAberto_ped() == true ){%>
        <%cont3 = cont3 +1;%>
        <%}%>
        <%if (cont3 == pedidos.size()-1){%>
        Nenhum pedidos encerrados ate o momento.
        <%}%>
        
        
        <%}%>
        <%if (cont3 == -1){%>
        Nenhum pedido encerrado ate o momento.
        <%}%>
    </body>
</html>
        
    

