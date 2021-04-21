/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import Tablas.Pedidos;
import DaoTables.DaoPedidos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin09
 */
public class conexionPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        List<Pedidos> ListaPedidos= new ArrayList<>();
        ListaPedidos = DaoPedidos.productosLista();
        Iterable<Pedidos> ListaProductos = null;
        for(Pedidos productos:ListaProductos){
        System.out.println(productos);
        }     
     }  
}

