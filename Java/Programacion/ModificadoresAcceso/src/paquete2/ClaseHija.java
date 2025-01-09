
package paquete2;

import paquete1.Clase1;


public class ClaseHija extends Clase1 {
    public ClaseHija(){
        super();//constructor protegido
        this.atributoProtected="Modificando atributo Protected";
        System.out.println("Atributo protegido = " + this.atributoProtected );
        this.metodoProtected();
    }
}
