
package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.UsuarioDAO;
import dominio.Persona;
import dominio.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);
            //insertando un  objeto de tipo usuario
            Usuario personaNueva = new Usuario("Carlos", "c258");
            usuarioDAO.insertar(personaNueva);
            Usuario personaActulizar = new Usuario(1, "perlag1111111111111111111111111111111111111111","per123");
            usuarioDAO.actualizar(personaActulizar);
            
            conexion.commit();
            System.out.println("Se ha hecho un commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Se ha hecho un rollback de la transaccion");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
     
        

        
    
    }
}
