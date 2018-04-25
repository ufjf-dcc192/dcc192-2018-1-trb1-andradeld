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
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <a href="index.html">Início</a><br>
        <h1>Adicionar Produto</h1>
        <form method="POST">
            <label>Código Pedido</label>
            <input type="text" value="<%=cod_ped%>" name="cod_ped" size="1" readonly>
            <label>Código Produto</label>
            <select name="cod_prod">
                <%for (int i = 0; i < produtos.size(); i++) {%>
                    <option value="<%=produtos.get(i).getCod_prod()%>"><%=produtos.get(i).getCod_prod() %> - <%=produtos.get(i).getNome_item() %></option>
                <%}%>  
            </select>
            <label>Quantidade</label>
            <input type="number" name="quantidade" min="1" max="99" value="1">
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
