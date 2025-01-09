
package dominio;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //solo se puede inicializar variables static
        //solo se ejecuta una ves
    }
    
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;
        //se ejecuta cada ves que instanciamos
    }
    public Persona(){
        System.out.println("Ejecucion del construnctor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
