
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        //regresa la sesion actual asociada a esta peticion
        //Pero si la peticion no tiene asociada una sesion, entonces crea un nuevo objeto
        HttpSession sesion = request.getSession();
        String titulo = null;
        //pedir el atributo contador visitas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        //su es nulo es la primera ves que accedemos a la aplicacion
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        }else{
            contadorVisitas++;
            titulo= "Bienvenido nuevamemnte";
        }
        //agregamos el  nuevo valor a la session
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        //mandamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("</br>");
        out.print("Nro accesos al recurso: " + contadorVisitas);
        out.print("</br>");
        //Este identificador unico lo asigna de manera automatica el 
        //contenedor (el servidor de aplicacion )
        out.print("ID de la sesion: " + sesion.getId());
       
      
        
    }
}
