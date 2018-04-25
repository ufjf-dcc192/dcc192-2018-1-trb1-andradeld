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
    </head>
    <body>
        <h1>Pedido <%=cod_ped+1%></h1>
        <p>Status: <%=pedidos.get(cod_ped).isAberto_ped()%></p>
        <p>Data abertura: <%=pedidos.get(0).getData_abertura_ped()%></p>
        <p>Itens:</p>
        <%for (int i = 0; i < pedidos.get(cod_ped).getProdutos().size(); i++) {%>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getCod_prod()%></p>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getNome_item()%></p>
            <p><%=pedidos.get(cod_ped).getProdutos().get(i).getPreco_item()%></p>
        <%}%>
        <p>Valor total: <%=pedidos.get(0).getValotTotal()%></p>
        <a href ="add_produto_pedido.html?cod_ped=<%=cod_ped+1%>">Adicionar itens ao pedido</a><br>
        <a href ="fechar_pedido.html?cod_ped=<%=cod_ped%>">Fechar pedido</a><br><br>
        <a href="listar_pedidos.html">Todos pedidos</a><br>
    </body>
</html>
