<%@page import="model.UserDAO"%>
<%@page import="model.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuários</title>
    </head>
    <body>
        <h1>Lista</h1>
        <table>
            <thead>
            <th>Nome</th>
            <th>Email</th>
            <th>Senha</th>
            <th></th>
            <th></th>
            </thead>
            <tbody>
              <%
                UserDAO e = new UserDAO();
                for(Usuario item : e.listUsuario()) {
              %>
                <tr>
                    <td><%= item.getCodUsuario() %></td>
                    <td><%= item.getNome() %></td>
                    <td><%= item.getEmail() %></td>
                    <td><%= item.getSenha() %></td>
                    <td>
                        <a href="UpdateUsuario?cod=<%= item.getCodUsuario() %>">😈</a>
                    </td>
                    <td>
                        <a onclick="confirmDelete(<%= item.getCodUsuario()%>);">❌</a>
                    </td>
                    
                    
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
            <script>
                function confirmDelete(cod){
                    if(confirm("Deseja realmente excluir?")){
                        window.location.replace("DeleteExame?cod=" + cod);
                    } else{
                        alert("Exclusão cancelada");
                    }
                }
            </script>
               <a href="index.jsp">Página inicial</a>
    </body>
</html>
