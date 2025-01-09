
package test;

import dominio.*;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Empleado("Juan",5000);
        empleado = new Escritor("Pedro",6000,TipoEscritura.CLASICO);
       // System.out.println("empleado = " + empleado);
        
        //System.out.println( empleado.obtenerDetalle());
        //doWncasting
        Escritor escritor = (Escritor) empleado;//un tipo padre a una clase hija 
        ((Escritor)empleado).getTipoEscritura();
        //upcasting
        Empleado empleado2 = escritor;
        //un tipo de la clase padre hacia un tipo de la clase hija
        System.out.println(empleado2.obtenerDetalle());
        
        
    }
}
