//cuenta las visitas de cada cliente
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //declaramos la variable contador
        int contador = 0;
        
        //Revisamos si ya existe la cookie llamada contadorVisitas
        Cookie[] cookies = request.getCookies();
        
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equals("contadorVisitas")){
                    //recordar que todas la cookie almacena solo strong por eso la conversion
                    contador = Integer.parseInt(c.getValue()); 
                }
            }
        }
        contador++;
        //agregamos la respuesta al navegador
        //convertir el contador a string
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        //la cookie se almacenara en el cliente por 1 hora = 3600 seg
        c.setMaxAge(3600);
        //si la existe la cookie sobreescribe con el nuevo valor
        response.addCookie(c);
        
        //mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: "+contador);
    }
}
