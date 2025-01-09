
package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //indicamos el tipo de respuesta
        response.setContentType("application/vnd.ms-excel");
        //indica al navegador que cuando demos click el link se va a descargar 
        //informacion de tipo excel y el nombre del archivo: excelEjemplo.xls
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //para un uso mas profesional de excel usar la libreria poi.apache.org
        
        //indicamos al navegador que no guarde informacion previa
        // que no guarde cache el navegador
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);// la informacion expire de la manera inmediata
        //desplegamos informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");//primera celda (\para movernos en la siguiente columna)
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");//funcion de excel
        out.close();
        
    }
}
