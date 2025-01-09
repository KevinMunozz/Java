
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;


public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado= division(10, 0);
            //primero la excepcion de menor jeraquia luego la de mayor jerarquia
        }catch (OperacionExcepcion e) {
                    System.out.println("OCURRIO ERROR DE TIPO OPERACION EXCEPCION:");
                    System.out.println(e.getMessage());
        }catch (Exception e){
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            //simpre se ejecuta sea o no una excepcion
            //se utiliza para cerrar recursos
            System.out.println("se reviso la division entre 0");
        }
            
        System.out.println("resultado = " + resultado);
    }
}
