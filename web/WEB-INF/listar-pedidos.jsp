<%@page import="Classes.Pedido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <%
            List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos"); %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            for (int i = 0; i < pedidos.size(); i++) {
        %>
        <p>
            <%=pedidos.get(i)%>
        </p>
        <%}%>
    </body>
</html>
