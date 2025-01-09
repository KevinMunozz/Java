
package accesodatos;


public interface IAccesoDatos {
    //todas tiene que ser constantes
    int MAX_REGISTRO = 10;
    
    //TODOS LOS METODOS PUBLIC Y ABSTRACT
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void  eliminar();
    
}
