
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //obtenemos el arreglo de cookies (del lado del cliente)
        //
        Cookie [] cookies = request.getCookies();
        
        //buscamos si ya existe una cookie creada con ateoridad
        //llamada visitanteRecurrente
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                    nuevoUsuario= false;
                    break;
                }
            }
        }
        String mensaje = null;
        if(nuevoUsuario){
            Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }else{
            mensaje="Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //solo mostramos, no hacemos todo el html
        out.print("Mensaje: " + mensaje);
            
    }
}
