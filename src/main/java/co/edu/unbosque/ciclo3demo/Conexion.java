package co.edu.unbosque.ciclo3demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassCastException;
import java.lang.NullPointerException;

public class Conexion {
	private String jdbcURL;
	private String jdbcUserName;
	private String jdbcPassword;
	private Connection jdbcConnection = null;
	DAO miDAO 						  = new DAO ();


	public Conexion(String jdbcURL, String jdbcUserName, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUserName = jdbcUserName;
		this.jdbcPassword = jdbcPassword;
	}

	public void connection() throws SQLException, Exception {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendagenerica");
                   // + "useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=root");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				throw new SQLException(e);
			}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (NullPointerException e) {
	            System.out.print("Caught the NullPointerException");
	        }
			
			
			
			//jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
			//jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendagenerica?"
                    //+ "useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&user=root&password=root");
		}
	}

	// Adiciona nuevo usuario al DAO
    public void adicionar () {
        System.out.println ("Se esta adicionando usuario ");
        miDAO.adicionar (); 
        System.out.println ("Se agregó el usuario ");              
    }
	
	public void discconect() throws SQLException {
		if (jdbcConnection!=null&& !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	public Connection getJdbcConnection() {
		return jdbcConnection;
	}
	

}
