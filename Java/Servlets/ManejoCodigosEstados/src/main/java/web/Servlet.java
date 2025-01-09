
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Simulando los valores correctos
        String usuarioOk="Juan";
        String passwordOk="123";
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("<br/> Usuario: " + usuario);
            out.print("<br/> Password: " + password);
            out.print("</h1>");
        }else{
            //forma de lanzar un codigo de estado
            response.sendError(response.SC_UNAUTHORIZED,"Las credenciales son incorrectas");
        }
        out.close();
           
        //response.setContentType(""); Por default es text/html
    }
}
