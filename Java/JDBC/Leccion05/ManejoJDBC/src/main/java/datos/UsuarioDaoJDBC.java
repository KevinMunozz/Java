package datos;

import dominio.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoJDBC implements UsuarioDao{

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ? ,password = ? WHERE id_usuario = ?";

    public UsuarioDaoJDBC() {

    }

    public UsuarioDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<UsuarioDTO> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement smtm = null;
        ResultSet rs = null;
        UsuarioDTO persona = null;
        List<UsuarioDTO> personas = new ArrayList<>();
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            smtm = conn.prepareStatement(SQL_SELECT);
            rs = smtm.executeQuery();

            while (rs.next()) {
                //getInt para recuperar los datos del set que son de nuestra bd
                persona = new UsuarioDTO(rs.getInt("id_usuario"), rs.getString("usuario"), rs.getString("password"));
                personas.add(persona);
            }
        } finally {

            Conexion.close(rs);
            Conexion.close(smtm);

            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        return personas;
    }

    public int insertar(UsuarioDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getUsuario());
            stmt.setString(2, persona.getPassword());
            registros = stmt.executeUpdate();// la funcion se usa porque modifica la bd(se utiliza en insert, update, delete)
            //devuelve tambien los resgitros afectados
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }

        }
        return registros;
    }

    public int eliminar(UsuarioDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }

            return registros;
        }
    }

    



    public int actualizar(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;

        try {
            // Usa una conexión transaccional si está disponible, de lo contrario, obtiene una nueva conexión
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();

            // Prepara la sentencia SQL con parámetros
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());

            // Ejecuta la actualización y devuelve el número de registros afectados
            registros = stmt.executeUpdate();
        } finally {
            // Cierra el PreparedStatement
            Conexion.close(stmt);

            // Si no se está utilizando una conexión transaccional, cierra la conexión
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return registros;
    }
}
