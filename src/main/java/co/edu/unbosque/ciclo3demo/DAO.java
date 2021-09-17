package co.edu.unbosque.ciclo3demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ClassCastException;


public class DAO {
    // Atributos de Conexion
	private Connection conexion;
	private Statement sentencia;
	private ResultSet resultados;
	private PreparedStatement pS;
	private Conexion con;

	public DAO(String jdbcURL, String jdbcUserName, String jdbcPassword) throws SQLException {
		con = new Conexion (jdbcURL, jdbcUserName, jdbcPassword);
		// conexion.connection();
		System.out.println(con.getJdbcConnection());
		//sentencia = conexion.createStatement();
		conexion= con.getJdbcConnection();
		System.out.println("dato de la ruta " + conexion);
	}

    
    public DAO() {
		// TODO Auto-generated constructor stub
	}


	// Metodos
//    public void crear () {
//    try {
//    	conexion.iniciarConector();  }
//    catch (NullPointerException e) {
//        }
//    
//    
//    }
//    
    public void adicionar() {

        try {

            String consulta = String.format("INSERT INTO usuario VALUES('%s','%s','%s','%s',%s)", "pao", "carlos", "es", "ss", 3);
            //conexion=con
            pS = conexion.prepareStatement(consulta);
            pS.executeUpdate(consulta);

        } catch (SQLException ex) {

            System.out.println("Error al adicionar");

            ex.printStackTrace();
        }


        }
}
  