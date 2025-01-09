
package dominio;


public class Gerente extends Empleado{
    
    private String departamento;//como ya no tiene clase hijas se utiliza private
    
    public Gerente(String nombre, double sueldo, String departamento ){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + ", departamento: " + this.departamento;
    }
}
