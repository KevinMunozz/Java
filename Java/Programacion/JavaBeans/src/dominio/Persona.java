
package dominio;

import java.io.Serializable;
//implementar Serializable
public class Persona  implements Serializable{
    //atributos private
    private String nombre;
    private String apellido;
    //obligatorio un constructor vacio
    public Persona(){
        
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //debe tebner metodos get y set para cada atributo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
