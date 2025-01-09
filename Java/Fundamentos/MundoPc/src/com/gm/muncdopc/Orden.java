
package com.gm.muncdopc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAXCOMPUTADORA = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAXCOMPUTADORA];
    }
    public void agregarComputadora (Computadora computadora){
        if (this.contadorComputadoras < Orden.MAXCOMPUTADORA) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("No puedes agregar mas de " + Orden.MAXCOMPUTADORA + "computadoras");
        }
    }
    public void mostrarOrden (){
        System.out.println("numero de orden: "+this.idOrden);
        System.out.println("Lista de computadoras");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
