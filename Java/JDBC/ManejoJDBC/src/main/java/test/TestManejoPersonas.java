
package test;

import datos.PersonaDAO;
import dominio.Persona;
import java.util.List;


public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        
        //insertando un  objeto de tipo persona
        //Persona personaNueva = new Persona("Carlos", "Gonzalez", "cgonzalez@gmail.com", "888796");
        //personaDAO.insertar(personaNueva);
        
        //Persona personaEliminar = new Persona(1);
        //personaDAO.eliminar(personaEliminar);
        
        Persona personaActulizar = new Persona(3, "Julieta", "Ramos", "jramos@gmail.com", "123456");
        personaDAO.actulizar(personaActulizar);
        
        List<Persona> personas = personaDAO.seleccionar();
        for (Persona persona:personas){
            System.out.println("persona = " + persona);
        }
    }
  
}
