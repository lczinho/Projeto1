<%
    if(session.getAttribute("userSession") == null) {
        response.sendRedirect(request.getContextPath());
    }
%>