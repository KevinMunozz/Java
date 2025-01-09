
package datos;

import dominio.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;




public class PersonaDAO {
   private static final String SQL_SELECT = "SELECT * FROM persona";
   private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
   private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
   private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?";
   public List<Persona> seleccionar(){
       Connection conn = null;
       PreparedStatement smtm= null;
       ResultSet rs=null;
       Persona persona = null;
       List<Persona> personas = new ArrayList<>();
       try {
           conn = Conexion.getConnection();
           smtm=conn.prepareStatement(SQL_SELECT);
           rs = smtm.executeQuery();
           
           while(rs.next()){
               //getInt para recuperar los datos del set que son de nuestra bd
               persona = new Persona(rs.getInt("id_persona"),rs.getString("nombre"), rs.getString("apellido"),rs.getString("email"),
               rs.getString("telefono"));
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
   public int insertar(Persona persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros = 0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_INSERT);
           stmt.setString(1, persona.getNombre());
           stmt.setString(2, persona.getApellido());
           stmt.setString(3, persona.getEmail());
           stmt.setString(4, persona.getTelefono());
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
   public int eliminar(Persona persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros =0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1,persona.getIdPersona());
            registros = stmt.executeUpdate();
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }
       
       return registros;
   }
   public int actulizar(Persona persona){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros =0;
       try {
           conn = Conexion.getConnection();
           stmt = conn.prepareStatement(SQL_UPDATE);
           stmt.setString(1, persona.getNombre());
           stmt.setString(2, persona.getApellido());
           stmt.setString(3, persona.getEmail());
           stmt.setString(4, persona.getTelefono());
           stmt.setInt(5, persona.getIdPersona());
           registros = stmt.executeUpdate();
            
       } catch (SQLException ex) {
           ex.printStackTrace(System.out);
       }
       
       return registros;
   } 
}
