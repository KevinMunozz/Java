
package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {//trows posiblemente arrojara una excepcion
   
    public static int division(int numerador, int denominador) 
           throws OperacionExcepcion {
        //cuando es runtimeExcepcion no hace falta reportar(throws OperacionExcepcion)
       if(denominador == 0){
           //throw significa lanzar
           throw new OperacionExcepcion("Division entre cero");
           
       }
       return numerador/denominador;
   }
}
