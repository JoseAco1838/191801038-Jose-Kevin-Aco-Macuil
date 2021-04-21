/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import DaoTables.DaoVenta;
import Tablas.Venta;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author kevin09
 */
public class eliminarVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
         Scanner scan = new Scanner(System.in);
        System.out.println("Inserte id de tupla a eliminar: ");
        int id = scan.nextInt();
        
        Venta product = new Venta(id);
        DaoVenta.eliminar(product);
    }
    
}
