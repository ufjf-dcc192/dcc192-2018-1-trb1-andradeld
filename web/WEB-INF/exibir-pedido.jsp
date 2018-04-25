<%@page import="Classes.Pedido"%>
<%@page import="Classes.Produto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <%
            List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");
            int cod_ped = (Integer) request.getAttribute("cod_ped");
        %> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taiyo Sushi Bar</title>
        
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <h1>Pedido <%=cod_ped+1%></h1>
        <p>Data abertura: <%=pedidos.get(0).getData_abertura_ped()%></p>
        <p>Itens:</p>
        <%if(pedidos.get(cod_ped).getProdutos().size() == 0 ) {%>Nenhum produto adicionado ate o momento.<%}%>
        <%for (int i = 0; i < pedidos.get(cod_ped).getProdutos().size(); i++) {%>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getCod_prod()%></p>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getNome_item()%></p>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getPreco_item()%></p>
        <%}%>
        <p>Valor total: <%=pedidos.get(cod_ped).getValotTotal()%></p><br>
        <a href ="add_produto_pedido.html?cod_ped=<%=cod_ped+1%>">Adicionar itens ao pedido</a>
    </body>
</html>
