/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import DaoTables.DaoVenta;
import Tablas.Venta;
import java.util.Scanner;
import Tablas.Venta;
import java.sql.SQLException;
/**
 *
 * @author kevin09
 */
public class insertarVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre de cliente: ");
        String nombreCliente = scan.nextLine();
        System.out.println("Inserte el total de venta: ");
        double totalVenta = scan.nextDouble();
        System.out.println("Inserte el descuento realizado: ");
        double descuento = scan.nextDouble();
        
       
        
        Venta ventas = new Venta(nombreCliente, totalVenta, descuento);
        DaoVenta.insertar(ventas);
    }
    
}
