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
        <title>Taiyo Sushi Bar</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <table>
        <%for (int i = 0; i < mesas.size(); i++) {%>
            <tr>
                <td>
                <p><%= mesas.get(i).getCod_mesa()%></p>
                </td>
                <td>
                <%if(mesas.get(i).isDisponivel_mesa() == true){%>
                     <p style="color:blue">Disponível</p>
                <%}%>
                <%if(mesas.get(i).isDisponivel_mesa() == false){%>
                     <p style="color:red">Ocupada</p>
                <%}%>
                </td>
            </tr>
        <%}%>
        </table>
    </body>
</html>
