<%-- 
    Document   : fazer-pedido
    Created on : 23/04/2018, 21:13:14
    Author     : Anderson Andrade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <h1>Adicionar Produto</h1>
        <form method="POST">
            Codigo Pedido<input type="text" name="cod_ped">
            Codigo Produto<input type="text" name="cod_prod">
            Quantidade Produto<input type="text" name="quantidade">
            <input type="submit">
        </form>
    </body>
</html>
