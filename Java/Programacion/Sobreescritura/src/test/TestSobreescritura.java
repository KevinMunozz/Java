
package test;

import dominio.Empleado;
import dominio.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado "+empleado.obtenerDetalle());
        imprimir(empleado);
        
        //Gerente gerente = new Gerente("Karla",10000,"contabilidad");
        empleado = new Gerente("Karla",10000,"contabilidad"); 
        //empleado puede almacenar refencias de la clase padre o de la clase hija
        //System.out.println("gerente: " + gerente.obtenerDetalle());
        imprimir(empleado);
        
        
    }
    public static void imprimir(Empleado empleado){
        System.out.println("empleado:" + empleado.obtenerDetalle() );
    }
}
