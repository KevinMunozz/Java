
package test;

import datos.Conexion;
import datos.PersonaDaoJDBC;
import datos.UsuarioDao;
import datos.UsuarioDaoJDBC;
import dominio.PersonaDTO;
import dominio.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;



public class TestManejoUsuarios {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }
            UsuarioDao usuarioDAO = new UsuarioDaoJDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDAO.seleccionar();
            
            for(UsuarioDTO usuario : usuarios){
                System.out.println("Usurio DTO: " + usuario);
            }
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
