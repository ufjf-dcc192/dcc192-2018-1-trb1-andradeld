<%@page import="Classes.Produto"%>
<%@page import="Classes.Pedido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            List<Produto> produtos = (List<Produto>) request.getAttribute("produtos");
            int cod_ped = (Integer) request.getAttribute("cod_ped");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taiyo Sushi Bar</title>
    </head>
    <body>        
        <h1>Adicionar Produto</h1>
        <form method="POST">
            <label>Codigo Pedido</label>
            <input type="text" value="<%=cod_ped%>" name="cod_ped" readonly>
            <label>Codigo Produto</label>
            <input type="text" name="cod_prod">
            <label>Quantidade Produto</label>
            <input type="text" name="quantidade">
            <input type="submit">
        </form>
        <h2>Produtos disponíveis</h2>
        <table border="3">
            <tr>
                <td>Código Produto</td>                
                <td>Nome do Produto</td>
                <td>Preço do Produto</td>
            </tr>
        <%for (int i = 0; i < produtos.size(); i++) {%>
            <tr>
                <td><%=produtos.get(i).getCod_prod() %></td>
                <td><%=produtos.get(i).getNome_item() %></td>
                <td><%=produtos.get(i).getPreco_item() %> </td>           
            </tr>   
        <%}%>  
        </table> 
    </body>
</html>
