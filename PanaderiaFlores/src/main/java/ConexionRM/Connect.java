/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionRM;
import java.sql.*;
/**
 *
 * @author kevin09
 */
public class Connect {
    private static final String URL ="jdbc:mysql://localhost:3306/empresapanaderia?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    
public static Connection getConnection2()throws SQLException {
        
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
        
    }

    public Connect() {
    }
    
    public static void close(Connection conexion, Statement declaracion) throws SQLException{
        conexion.close();
        declaracion.close();
    }
    public static void close(Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
    
    }
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado)throws SQLException{
        conexion.close();
        resultado.close();
        declaracion.close();
    
    }
}