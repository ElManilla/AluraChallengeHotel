package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDatabaseConnection {
    public static void main(String[] args) throws SQLException {
    	Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_alura?useTimezone=true&serverTimezone=UTC", "root", "salchicha666");
    System.out.println("probando conexion");
    conexion.close();
    }
    
}