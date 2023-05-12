


<%@page import="model.User"%>
<% 
 User userSession = (User)session.getAttribute("userNewSession");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href=css/sytle.css>
    <title>GL Dev</title>
</head>
<body class="body">
    
    <div class="header" id="header">
        <div class="logo_header">
            <img src="./img/logod.png" alt="">
        </div>
        <div class="aplications">
            <a href="lista.jsp" class="home">PARA EMPRESAS</a>
            <a href="login.jsp" class="home">ENTRAR</a>
            <a href="cadastro.jsp" class="home">INSCREVA-SE</a>
        </div>
        
    <div>
    <hr class="linha">
    </div>


    <div class="container">
        <div class="left">
            <h2 id="texto">DO ZERO AO AVANÇADO</h2>
            <br>
            <h1 id="texto2">Aqui você se tornará um <br> programador confiante e <br> com conhecimento  suficiente  <br> para iniciar no mercado de trabalho</h1>
            <ul class="list">
                <li>Auxilio nas atividades enviadas</li>
                <br>
                <li>Plano de estudos organizado</li>
                <br>
                <li>Encaminhamento para empregos</li> 
            </ul>
            <a href="cadastro.html"><input id="botao" type="button" value="Quero fazer o curso"></a>
            
        </div>

        <div class="right">
            <img class="imagembody" src="img/imagem corpo.jpg" alt="imagem center">
        </div>
    </div>


</body>
</html>