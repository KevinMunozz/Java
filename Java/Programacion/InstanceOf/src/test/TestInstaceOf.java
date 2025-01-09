
package test;

import dominio.Empleado;
import dominio.Gerente;

public class TestInstaceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        
     
       empleado = new Gerente("Karla",10000,"contabilidad"); 
       
         determinarTipo(empleado);
    }
    public static void determinarTipo(Empleado empleado){
       //preguntar por las clases hijas primero. Ultimo clases padres
        if(empleado instanceof Gerente ){
            //lo que se pregunta es si esta apuntado en memoria es de tipo gerente
            System.out.println("Es de tipo gerente");
            System.out.println("departamento: " + ((Gerente) empleado).getDepartamento());
        }else if (empleado instanceof Empleado){
            System.out.println("es de tipo Empleado");
            
        }else if (empleado instanceof Object){
            System.out.println("Es de tipo object");
        }
    }
}
