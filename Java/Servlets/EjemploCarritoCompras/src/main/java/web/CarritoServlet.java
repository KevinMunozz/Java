package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {
    //solo va estar 30 minutos los valores ya que la session dura 30 min por default
    //esto de puede cambiar para que la sesion dure mas
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //creamos o recuperamos el obejto http session
        HttpSession sesion = request.getSession();

        //curperamos la lista de articulo previos si existen
        //cast ya que esto nos devuelve un objet
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        //verificamos si la lista de articulos existe
        if (articulos == null) {
            //inicializamos la lista de articulos
            articulos = new ArrayList<>();
            //agregar la lista a la sesion
            sesion.setAttribute("articulos", articulos);
        }
        //PROCESAMOS EL NUEVO ARTICULO
        String articuloNuevo = request.getParameter("articulo");

        //revisamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }
        try (
            //imprimimos la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("</br>");
            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //*agregamos un link para regelesar al inicio
            out.print("</br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        }

    }
}
