<%@page import="Classes.Pedido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <%List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taiyo Sushi Bar</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <a href="novo_pedido.html">+ Novo pedido</a><br>
        <h1>Pedidos abertos:</h1>
        <%if (pedidos.size() == 0){%>Nenhum pedido aberto até o momento.<%}%>
            <table>
            <%for (int i = 0; i < pedidos.size(); i++) {%>
                <td>
                    <%if (pedidos.get(i).isAberto_ped() == true ){%>
                        <h3>Pedido número: <%=pedidos.get(i).getNum_ped()%></h3>    
                        <p>Mesa associada: <%=pedidos.get(i).getNum_mesa()%></p>
                        <p> Data e hora da abertura: <%=pedidos.get(i).getData_abertura_ped()%> </p> 
                        <h4>Detalhes do pedido</h4>
                        <table>
                        <%for (int j = 0; j < pedidos.get(i).getProdutos().size(); j++) {%>
                            <p><%= pedidos.get(i).getProdutos().get(j).getQuant()%>
                            <%= pedidos.get(i).getProdutos().get(j).getNome_item()%>
                            R$<%= pedidos.get(i).getProdutos().get(j).getPreco_item()%> cada</p>
                        <%}%>
                        </table>
                        <p>Valor total: <%=pedidos.get(i).getValotTotal()%></p>
                        <a href ="add_produto_pedido.html?cod_ped=<%=i+1%>">Adicionar itens ao pedido</a><br>
                        <a href ="fechar_pedido.html?cod_ped=<%=pedidos.get(i).getNum_ped()-1%>">Fechar Pedido</a>
                </td>
                    <%}%>
            <%}%>
            </table>
            <hr/>
        
            <!--PEDIDOS ENCERRADOS-->
            <h1>Pedidos Encerrados:</h1>
        <%for (int k = 0; k < pedidos.size(); k++) {%>
            <%if (pedidos.get(k).isAberto_ped() == false ){%>
            <p>Pedido número:<%=pedidos.get(k).getNum_ped()%>
            - Data e hora do fechamento <%=pedidos.get(k).getData_fechamento_ped()%>
            - Valor total: <%=pedidos.get(k).getValotTotal()%></p>
            <%}%>
        <%}%>
 
    </body>
</html>