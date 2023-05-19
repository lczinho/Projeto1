<%@include file="model.Usuario" %>
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
            <input type="text" name="cod" value="<%= e.getNome() %>" readonly>
            <br><br>
            
            <input type="text" name="exame" value="<%= e.getEmail()%>"  required>
            <br><br>
            
            <input type="text" name="valor" value="<%= e.getSenha()%>" required >
            <br><br>
    <div class="cadastro">
        
        <h1 class="titulo-login">Cadastrar</h1>
        <label class="name-login" for="nome">Nome</label>
        <br>
        <input class="nome-login" type="text" name="nome" placeholder="Username">
        <br>
        <label class="gmail-login" for="email">Email</label>
        <br>
        <input class="email-login" type="text" name="email" placeholder="Email">
        <br>
        <label class="pass-login" for="senha">Senha</label>
        <br>
        <input class="senha-login" type="password" name="senha" placeholder="Password">
        <br><br>
        
    </div>
            <br><br>
            <input type="submit" value="Atualizar">
        </form>
        <hr>
        <a href="home.jsp">Página inicial</a>
    </body>
</html>