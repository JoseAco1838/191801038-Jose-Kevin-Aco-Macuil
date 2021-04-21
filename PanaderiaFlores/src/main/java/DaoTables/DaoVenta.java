package DaoTables;
import ConexionRM.Connect;
import Tablas.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoVenta{
    
    private static String sql;
    
    public static List<Venta> ventasLista() throws SQLException{
        
        List<Venta> listaVentas = new ArrayList<>();
        Connection conexion = Connect.getConnection2();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM ventas";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()){
            Venta ventas = new Venta(resultado.getString("nombre_cliente"),resultado.getString("Nombre del pan"),resultado.getInt("id"),resultado.getInt("total de pan vendido "),resultado.getDouble("Total a Pagar"));
            listaVentas.add(ventas);
        }
        Connect.close(conexion, declaracion, resultado);

        return listaVentas;
    }
    
    public static void insertar(Venta ventas) throws SQLException{
        Connection conexion = Connect.getConnection2();
        
        sql = "INSERT INTO ventas(nombre_cliente,descuento,total_venta) VALUES (?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        
        declaracion.setString(1,ventas.getNombreUsuario());
        declaracion.setString(2,ventas.getNombrePan());
        declaracion.setDouble(3,ventas.getId());
        declaracion.setDouble(4,ventas.getTotalDePan());
        declaracion.setDouble(5,ventas.getTotalPagar());       
        declaracion.executeUpdate();        
        Connect.close(conexion,declaracion);
    
    }
    
    public static void modificar(Venta ventas) throws SQLException{
        
        Connection conexion = Connect.getConnection2();
        sql = "UPDATE ventas SET nombre_cliente =? ,descuento =?,total_venta =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(sql);    
        declaracion.setString(1,ventas.getNombreUsuario());
        declaracion.setString(2,ventas.getNombrePan());
        declaracion.setDouble(3,ventas.getId());
        declaracion.setDouble(4,ventas.getTotalDePan());
        declaracion.setDouble(5,ventas.getTotalPagar());
        declaracion.executeUpdate();
        Connect.close(conexion,declaracion);
    }
    public static void eliminar(Venta ventas) throws SQLException{
    
        Connection conexion = Connect.getConnection2();
        sql = "DELETE FROM ventas WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1,ventas.getId());
        declaracion.executeUpdate();
        Connect.close(conexion, declaracion);
    
    }
}
