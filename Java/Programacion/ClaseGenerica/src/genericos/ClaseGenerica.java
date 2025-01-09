
package genericos;


public class ClaseGenerica <T>{
    private T objeto;
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo de la clase es: " + objeto.getClass().getSimpleName());
    }
}
