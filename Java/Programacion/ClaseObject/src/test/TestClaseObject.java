
package test;

import dominio.Empleado;


public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",5000);
        Empleado empleado2 = new Empleado("Juan",5000);
        
        if(empleado1 == empleado2){
            System.out.println("tiene la misma referencia en memoria");
        }else{
            System.out.println("tienen distinta referencia en memoria");
        }
        
        if (empleado1.equals(empleado2)){
            System.out.println("los objetos son iguales en contenido");
        }else{
            System.out.println("los objetos son distintos en contenido");
        }
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hashCode es igual");
        }else{
            System.out.println("el valor hashCode no es igual");
        }
        
        
        
        /*
        si agregamos equals tambien debemos agregar hashCode(), ambos resultado
        deben ser iguales
        DEFINIR SIEMPRE PARA QUE LAS COMPRACUONES SEAN MAS RAPIDAS
        PORQUE LAS FUNCIONES LAS UTILIZAN LOS SPRING
        */
    }
}
