
package test;

import datos.Conexion;
import datos.PersonaDao;
import datos.PersonaDaoJDBC;
import dominio.PersonaDTO;
import java.sql.*;
import java.util.List;
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
            //implementacion = clase que implementa (POLIMORFISMO)
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas = personaDao.seleccionar();
            
            for(PersonaDTO persona : personas){
                System.out.println("Persona DTO" + persona);
            }
            
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
