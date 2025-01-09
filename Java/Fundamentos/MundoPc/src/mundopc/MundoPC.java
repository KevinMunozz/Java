
package mundopc;

import com.gm.muncdopc.*;


public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("bluetooth","HP");
        Raton ratonHP =new Raton("USB","HP");
        Computadora compuradoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        
        Monitor monitor = new Monitor("Gamer",13);
        Teclado teclado = new Teclado("bluetooth","HP");
        Raton raton =new Raton("USB","HP");
        Computadora compuradoraAsus = new Computadora("Computadora Asus",monitor,teclado,ratonHP);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuradoraHP);
        orden1.agregarComputadora(compuradoraAsus);
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuradoraHP);
        orden2.mostrarOrden();
    }
}
