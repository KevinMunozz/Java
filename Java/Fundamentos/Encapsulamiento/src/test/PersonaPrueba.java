
package test;

import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",5000.00,false);
            System.out.println("persona1: " + persona1);
            /*println print llaman automaticame al metodo toString()*/ 
        persona1.setNombre("Juan Carlos");
//        System.out.println("Nombre = " + persona1.getNombre());
//        System.out.println("Sueldo = " + persona1.getSueldo());
//        System.out.println("Eliminado ="+persona1.isEliminado);
    System.out.println("persona1: " + persona1.toString());
    }
 
}
