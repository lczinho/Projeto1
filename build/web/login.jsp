<%
    if(session.getAttribute("userNewSession") != null) {
        response.sendRedirect("index.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/sytle.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="fds">
    <div class="container-login">
        <div class="left-login">
            <img src="img/imagem login.jpg" alt="imagem body">
        </div>

        <div class="right-login">
            
            <form action="LoginController" method="post">
            
            <div class="itens-login">
                <h1 id="login-login">Login</h1>
                <label class="username" for="user">
                Username
                <br>
                <input class="texto-login" type="text" id="nome" name="nome">
                <br>
                <label for="pass">
                    Password
                    <br>
                    <input class="texto-login" type="password" id="senha" name="senha">
                    <br>
                    <a id="esqueceu-login" href="#"> <strong class="visible">ffffffffffffffffffffffffffffffffffffff</strong>  Esqueceu sua senha?</a>   
                    <br>                                      
                    <input id="bottom" type="submit" value="Entrar">
                    <h3>Não tem uma conta? <a id="inscrever-login" href="cadastro.jsp">Increver-se</a></h3>
                </div>
                
            </form>
                
        </div>
    </div>
</body>
</html>
