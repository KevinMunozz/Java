
package test;

import dominio.*;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        Empleado empleado1 = new Empleado("Juan",5000.0);
        Empleado empleado2 = new Empleado("Juan",5000.0);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);
        Cliente cliente1 = new Cliente(fechaActual, true, "Juan",'M',28,"Asuncion");
        System.out.println("cliente1 = " + cliente1);
    }
    
   
}
