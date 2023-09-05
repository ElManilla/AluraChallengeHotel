package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
	 public Connection creaConexion() throws SQLException{
		 Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_alura?useTimezone=true&serverTimezone=UTC", "root", "salchicha666");
		 System.out.println("probando conexion");
		 return conexion;
	 }
}
