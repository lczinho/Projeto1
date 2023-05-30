package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.SQLException;
import model.Usuario;

@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    //Atributos
    private String nome;
    private String email;
    private String senha;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        this.nome = request.getParameter("nome");
        this.senha = request.getParameter("senha");
        
        Usuario newUsuario = new Usuario(this.nome, this.senha);
        
        try {
            
            if (newUsuario.isLogged()) {
                HttpSession session = request.getSession();
                session.setAttribute("userSession", newUsuario);
                //request.setAttribute("userRequest", newUsuario);
                request.getRequestDispatcher("index.jsp")
                        .forward(request, response);
            } else {
                
                try (PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>GLDev</title>");                    
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<script>");
                    out.println("alert('Acesso negado!');");
                    out.println("window.location.replace('index.jsp');");
                    out.println("</script>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }
        } catch (SQLException | ClassNotFoundException erro) {
            PrintWriter out = response.getWriter();
            out.print("Ocorreu algum erro:(");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
