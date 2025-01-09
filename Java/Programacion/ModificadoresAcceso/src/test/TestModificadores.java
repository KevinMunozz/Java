
package test;

import paquete1.Clase1;
import paquete2.ClaseHija;
//acceso sin restricciones

public class TestModificadores {
    public static void main(String[] args) {
      //Public
        //Clase1 clase1 = new Clase1("Publico"); 
        
        //System.out.println("clase1 = " + clase1.atributoPublico); 
        //clase1.metodoPublico;
      //Protected no nivel clase 
      
      ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
    }
}
