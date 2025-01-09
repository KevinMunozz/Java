
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    // Procesando elementos del formulario del lado del servidor
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
    String tecnologias[] = request.getParameterValues("tecnologia");
    String genero = request.getParameter("genero");
    String ocupacion = request.getParameter("ocupacion");
    String musicas[] = request.getParameterValues("musica");
    String comentarios = request.getParameter("comentarios");

    // Respuesta hacia el cliente
    out.print("<html>");
    out.print("<head>");
    out.print("<title>Resultado del Servlet</title>");
    out.print("</head>");
    out.print("<body>");
    out.print("<h1>Parametros procesados por el Servlet:</h1>");
    out.print("<table border='1'>");

    out.print("<tr>");
    out.print("<td>Usuario</td>");
    out.print("<td>" + usuario + "</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Password</td>");
    out.print("<td>" + password + "</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Tecnologias</td>");
    out.print("<td>");
    if (tecnologias != null) {
        for (String tecnologia : tecnologias) {
            out.print(tecnologia + "/");
        }
    } else {
        out.print("No se seleccionaron tecnologías.");
    }
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Genero</td>");
    out.print("<td>" + genero + "</td>");
    out.print("</tr>");
    
    out.print("<tr>");
    out.print("<td>Ocupacion</td>");
    out.print("<td>" + ocupacion + "</td>");
    out.print("</tr>");
    
    out.print("<tr>");
    out.print("<td>Musica</td>");
    out.print("<td>");
    if (musicas != null) {
        for (String musica : musicas) {
            out.print(musica + "/");
        }
    } else {
        out.print("No se seleccionaron generos musicales.");
    }
    out.print("</td>");
    out.print("</tr>");
    
    out.print("<tr>");
    out.print("<td>Comentario</td>");
    
    out.print("<td>" + comentarios + "</td>");
    out.print("</tr>");
    
    out.print("</table>");
    out.print("</body>");
    out.print("</html>");
}

}
