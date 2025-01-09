
package datos;

import dominio.PersonaDTO;
import java.sql.SQLException;
import java.util.List;


public interface PersonaDao {
   public int insertar(PersonaDTO persona) throws SQLException;
   public int eliminar(PersonaDTO persona) throws SQLException;
   public int actulizar(PersonaDTO persona) throws SQLException;
   public List<PersonaDTO> seleccionar() throws SQLException;
}
