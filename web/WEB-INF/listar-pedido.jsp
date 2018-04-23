<%-- 
    Document   : listar-pedido
    Created on : 23/04/2018, 15:35:14
    Author     : Anderson Andrade
--%>

<%@page import="java.util.List"%>
<%@page import="Classes.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Produto> pedidos = (List<Produto>) request.getAttribute("pedidos"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        for (int i=0; i<pedidos.size(); i++){
         %>
        <p><%=pedidos.get(i) %></p>
        
        <%}%>
    </body>
</html>
