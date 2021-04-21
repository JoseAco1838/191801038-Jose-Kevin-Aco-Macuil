/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import DaoTables.DaoPedidos;
import java.util.Scanner;
import Tablas.Pedidos;
import java.sql.*;
/**
 *
 * @author kevin09
 */
public class insertarPedidos {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserte nombre de usuario: ");
        String nombreUsuario = scan.nextLine();
        System.out.println("Inserte fecha de entrega: ");
        String fechaEntrega = scan.nextLine();
        System.out.println("Inserte el pan que escogio el cliente: ");
        String panEscoger= scan.nextLine();
        System.out.println("Inserte hora entrega: ");
        String horaEntrega = scan.nextLine();
        
       
        
        Pedidos product = new Pedidos(nombreUsuario,fechaEntrega,panEscoger,horaEntrega);
        DaoPedidos.insertar(product);
    }
    
}
