
package test;

import datos.PersonaDAO;
import datos.UsuarioDAO;
import dominio.Persona;
import dominio.Usuario;
import java.util.List;


public class TestManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //insertando un  objeto de tipo usuario
        //Usuario personaNueva = new Usuario("Carlos", "c258");
        //usuarioDAO.insertar(personaNueva);
        
        //Usuario personaEliminar = new Usuario(3);
        //usuarioDAO.eliminar(personaEliminar);
        
        Usuario personaActulizar = new Usuario(2, "julieta", "2907");
        usuarioDAO.actulizar(personaActulizar);
        
        List<Usuario> personas = usuarioDAO.seleccionar();
        for (Usuario persona:personas){
            System.out.println("persona = " + persona);
        }
    }
}
