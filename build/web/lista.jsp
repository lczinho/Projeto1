
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
              UserDAO e = new UserDao();
              for(Usuario item : e.listUsuario())
              %>
                <tr>
                    <td>%= item.getidUsuario() %></td>
                    <td>%= item.getnome() %></td>
                    <td>%= item.getsenha() %></td>
                    <td>%= item.getemail() %></td>
                    <td>
                        <a href="#editar">😈</a>
                    </td>
                    <td>
                        <a href="#deletar">❌</a>
                    </td>
                    
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
