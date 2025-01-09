
package caja;


public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        Caja caja2= new Caja(2,2,2);
        caja1.alto = 3;
        caja1.ancho = 3;
        caja1.profundo = 3;
        int resultado = caja1.calcularVolumen();
        System.out.println("Volumen con constructor vacio: " + resultado);
        resultado = caja2.calcularVolumen();
        System.out.println("Volumen con constructor : " + resultado);
    }
}
