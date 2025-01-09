
package datos;

import dominio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT * FROM usuario";
   private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
   private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
   private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
   public List<Usuario> seleccionar(){
       Connection conn = null;
       PreparedStatement smtm= null;
       ResultSet rs=null;
       Usuario persona = null;
       List<Usuario> personas = new ArrayList<>();
       try {
           conn = Conexion.getConnection();
           smtm=conn.prepareStatement(SQL_SELECT);
           rs = smtm.executeQuery();
           
           while(rs.next()){
               //getInt para recuperar los datos del set que son de nuestra bd
               persona = new Usuario(rs.getInt("id_usuario"),rs.getString("usuario"), rs.getString("password"));
               personas.add(persona); 
           }
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }finally{
           try {
               Conexion.close(rs);
               Conexion.close(smtm);
               Conexion.close(conn);
           } catch (SQLException ex) {
               ex.printStackTrace(System.out);
           }
       }
       return personas;
   }
   public int insertar(Usuario persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros = 0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_INSERT);
           stmt.setString(1, persona.getUsuario());
           stmt.setString(2, persona.getPassword());
           registros = stmt.executeUpdate();// la funcion se usa porque modifica la bd(se utiliza en insert, update, delete)
           //devuelve tambien los resgitros afectados
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }finally{
           try {
               Conexion.close(stmt);
               Conexion.close(conn);
           } catch (SQLException ex) {
               ex.printStackTrace(System.out);
           }
       }
       return registros;
   }
   public int eliminar(Usuario persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros =0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,persona.getIdUsuario());
            registros = stmt.executeUpdate();
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }
       
       return registros;
   }
   public int actulizar(Usuario persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros =0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_UPDATE);
           stmt.setString(1, persona.getUsuario());
           stmt.setString(2, persona.getPassword());;
           stmt.setInt(3, persona.getIdUsuario());
           registros = stmt.executeUpdate();
            
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }
       
       return registros;
   } 
}
