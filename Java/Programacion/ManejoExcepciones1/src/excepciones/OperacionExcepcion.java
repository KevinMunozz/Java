
package excepciones;

//Runtime no se reporta la excepcion en la clase que puede lanzar la excepcion
//tampoco el compilador no obligara a poner el bloque try catch
public class OperacionExcepcion extends RuntimeException{
    protected OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
