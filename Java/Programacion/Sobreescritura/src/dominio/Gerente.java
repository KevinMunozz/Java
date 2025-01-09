
package dominio;


public class Gerente extends Empleado{
    
    private String departamento;//como ya no tiene clase hijas se utiliza private
    
    public Gerente(String nombre, double sueldo, String departamento ){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", departamento: " + this.departamento;
    }
}
