/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class testCoche {
    public  static  void  main ( String [] args ) {
     cliente cliente1=new cliente(1801, 222845796, 72820, "Juan", "Sentra", "Lopez", "Puebla", "Nissan", "Masculino", "juanlopez19@uppuebla.edu.mx");
     Coche coches= new Coche("Jetta", "Azul", "Si", "Si", 129900, 1.8, 19845, 16, cliente1);
     
    System.out.println(coches);
    System.out.println(cliente1);
}
    }
