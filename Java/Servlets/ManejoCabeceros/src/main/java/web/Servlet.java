
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // se indoca el tipo de respuesta
        response.setContentType("text/html;charset= UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1><br/>");
        //todos los cabeceros disponibles
        out.print("Metodo Http: " + metodoHttp);
        
        out.print("</br>");
        String uri = request.getRequestURI();
        out.print("URI solicitada: " + uri);
        out.print("</br>");
        out.print("</br>");
        //forma de procesar un header
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements() ){
         //para saber si tenemos mas elementos que iterar
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + ": " + "</b>");
            out.print(request.getHeader(nombreCabecero));
            out.print("</br>");
        }
        
        
        
        out.print("</body>");
        out.print("</html>");
        out.close();
    }   
}
