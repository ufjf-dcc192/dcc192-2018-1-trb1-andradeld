<%@page import="java.util.List"%>
<%@page import="Classes.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Produto> produtos = (List<Produto>) request.getAttribute("produtos"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taiyo Sushi Bar</title>
    </head>
    <body>
        <a href="index.html">Início</a><br>
        <%
            for (int i = 0; i < produtos.size(); i++) {
        %>
        <p>
            <%=produtos.get(i).getCod_prod()%>
            <%=produtos.get(i).getNome_item()%>
            <%=produtos.get(i).getPreco_item()%>
        </p>
        <%}%>
    </body>
</html>
