
package test;

import dominio.FiguraGeometrica;
import dominio.Rectangulo;


public class TestClasesAbstractas {
    public static void main(String[] args) {
        //no se pueden crear objetos de clases abstractas}
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        //concepto polimorfismo UPCASTING
        figura.dibujar();
    }
}
