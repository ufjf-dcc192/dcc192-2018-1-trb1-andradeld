<%-- 
    Document   : listar-mesas
    Created on : 23/04/2018, 16:15:10
    Author     : Anderson Andrade
--%>

<%@page import="Classes.Mesa"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Mesa> mesas = (List<Mesa>) request.getAttribute("mesas"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        for (int i=0; i<mesas.size(); i++){
            
        
        
        %>
        <p><%= mesas.get(i).getCod_mesa() %>
        <%= mesas.get(i).isDisponivel_mesa() %></p>
        <%}%>
    </body>
</html>
