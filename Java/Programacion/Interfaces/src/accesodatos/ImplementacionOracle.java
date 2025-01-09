
package accesodatos;


public class ImplementacionOracle implements IAccesoDatos{
    //tenemos que immplentar todos los metodos
    //o marcar las clases como abstractas
    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actulizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
    
}
