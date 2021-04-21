package DaoTables;
import ConexionRM.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Tablas.Pedidos;
import Tablas.Venta;
import java.sql.PreparedStatement;



public class DaoPedidos {
    
    private static String sql;
    
    public static List<Pedidos> productosLista() throws SQLException{
        
        List<Pedidos> listaProductos = new ArrayList<>();
        Connection conexion = Connect.getConnection2();
        Statement declaracion = conexion.createStatement();
        sql = "SELECT * FROM productos";
        ResultSet resultado = declaracion.executeQuery(sql);
        while(resultado.next()){
            
            Pedidos productos = new Pedidos(resultado.getString("nombre"),resultado.getString("Fecha de entrega"),resultado.getString("Pan que escogio"),resultado.getString("Hora de entrega"),resultado.getInt("id"));
            listaProductos.add(productos);
        }
        Connect.close(conexion, declaracion, resultado);

        return listaProductos;
    }
    
    public static void insertar(Pedidos pedidos) throws SQLException{
        Connection conexion = Connect.getConnection2();
        
        sql = "INSERT INTO pedidos(nombre_usuario,fecha_entregar,pan_escoger,hora_entrega) VALUES (?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        
        declaracion.setString(1,pedidos.getNombreUsuario());
        declaracion.setString(2,pedidos.getFechaEntrega()); 
        declaracion.setString(3,pedidos.getPanEscoger());
        declaracion.setString(4,pedidos.getHoraEntrega());
                   
        declaracion.executeUpdate();       
        Connect.close(conexion,declaracion);
    
    }
    
    public static void eliminar(Pedidos pedidos) throws SQLException{
    
        Connection conexion = Connect.getConnection2();
        sql = "DELETE FROM productos WHERE id =?";
        PreparedStatement declaracion = conexion.prepareStatement(sql);
        declaracion.setInt(1,pedidos.getId());
        declaracion.executeUpdate();
        Connect.close(conexion, declaracion);
    
    }
    
    public static void modificar(Pedidos pedidos) throws SQLException{
        
        Connection conexion = Connect.getConnection2();
        sql = "UPDATE productos SET nombre =? ,proveedor =?,precio =? WHERE id =? ";
        PreparedStatement declaracion = conexion.prepareStatement(sql);    
        declaracion.setString(1,pedidos.getNombreUsuario());
        declaracion.setString(2,pedidos.getFechaEntrega()); 
        declaracion.setString(3,pedidos.getPanEscoger());
        declaracion.setString(4,pedidos.getHoraEntrega());
        declaracion.setInt(5,pedidos.getId());
         declaracion.executeUpdate();
        Connect.close(conexion,declaracion);
    }

    
}
