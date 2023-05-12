

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/sytle.css"/>
        <title>GL Dev / Login</title>
    </head>
   <body class="corpo">
<form action="UsuarioController" method="post">
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
        <input class="botao" type="submit" name="cadastrar" value="Cadastrar">
    </div>
  </form>
</body>
</html>
