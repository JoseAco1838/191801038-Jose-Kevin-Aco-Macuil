/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import DaoTables.DaoPedidos;
import Tablas.Pedidos;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author kevin09
 */
public class modificarPedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese id de tupla a modificar");
        int id = scan.nextInt();
        scan = new Scanner(System.in);
        System.out.println("Inserte nombre de producto: ");
        String nombrePto = scan.nextLine();
        System.out.println("Inserte nombre de proveedor: ");
        String nombrePdor = scan.nextLine();
        System.out.println("Inserte precio de producto: ");
        double precio = scan.nextDouble();
        
        //Pedidos product = new Pedidos(nombrePto, nombrePdor, id, precio);
        //DaoPedidos.modificar(product);
    }
    
}
