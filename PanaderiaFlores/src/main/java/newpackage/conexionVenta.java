/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import DaoTables.DaoVenta;
import Tablas.Venta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kevin09
 */
public class conexionVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        List<Venta> ListaVentas = new ArrayList<>();
        ListaVentas = DaoVenta.ventasLista();
        for(Venta ventas:ListaVentas){
            System.out.println(ventas);
    }
  }  
}
