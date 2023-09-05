package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hotel_alura"; 
    private static final String DB_USER = "root"; 
    private static final String DB_PASSWORD = "salchicha666"; 
    public static Connection getConnection() throws SQLException {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            return connection;
        } catch (ClassNotFoundException e) {
            throw new SQLException("Error al cargar el controlador JDBC", e);
        }
    }
}
