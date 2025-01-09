
package test;

import datos.Conexion;
import datos.PersonaDAO;
import dominio.Persona;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class TestManejoPersonas {
    public static void main(String[] args) {
      Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit() == true){
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            Persona personaActualizar = new Persona(3, "Pedro", "Romero", "promero@gmail.com", "123456");
            personaDAO.actulizar(personaActualizar);
            
            
            Persona personaNueva = new Persona();
            personaNueva.setNombre("Juan");
            personaNueva.setApellido("Ramirez");
            personaDAO.insertar(personaNueva);
            
            
            conexion.commit();
            System.out.println("Se a hecho commit de la transaccion");
        } catch (SQLException ex) {
          try {
              ex.printStackTrace(System.out);
              System.out.println("Entramos al rollback");
              conexion.rollback();
          } catch (SQLException ex1) {
              ex.printStackTrace(System.out);
          }
            
        }
    }
  
}
