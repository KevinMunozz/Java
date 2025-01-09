
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet")//mismo nombre que el url del html
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //leer losmparametros del formulario html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        System.out.println("Usuario: " + usuario);
        System.out.println("Password: " + password);
        
        // nos regresa un objeto de tipo PrintWriter
        // nos sirve para escribir informacion hacia el navegador()cliente
        PrintWriter out = response.getWriter();
        //html desde un servlets - debe ser en html para mostrar
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro ususario: " + usuario);
        out.print("<br/>");
        out.print("El parametro de password: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
