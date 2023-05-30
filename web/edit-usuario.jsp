<%@page import="model.Usuario" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario e = (Usuario)request.getAttribute("usuario");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edição</h1>
        <hr>
        <form action="UsuarioController" method="post">
            <input type="text" name="cod" value="<%= e.getCodUsuario() %>" readonly>
            <br><br>
            
            <input type="text" name="nome" value="<%= e.getNome() %>" required>
            <br><br>
            
            <input type="text" name="email" value="<%= e.getEmail()%>"  required>
            <br><br>
            
            <input type="text" name="senha" value="<%= e.getSenha()%>" required >
            <br><br>
    
            
            <input type="submit" value="Atualizar">
        </form>
        <hr>
        <a href="index.jsp">Página inicial</a>
    </body>
</html>