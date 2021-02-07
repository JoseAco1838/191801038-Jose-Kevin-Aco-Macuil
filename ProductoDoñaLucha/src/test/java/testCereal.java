
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class testCereal {
    public static void main(String[] args) {
       var scan = new Scanner (System.in);
       System.out.println("Hola amante del cereal y que no sabe que preparar para comer introduce los siguientes datos del cereal ");
       System.out.println("Nombre del cereal:  ");
       String nombreCereal = scan.nextLine();
       System.out.println("Sabor del cereal:  ");
       String saborCereal = scan.nextLine();
       System.out.println("Marca del cereal:  ");
       String marcaCereal = scan.nextLine();
       System.out.println("Tamaño del cereal:  ");
       String tamanioCereal = scan.nextLine();
       System.out.println("Gramos del cereal:  ");
       int gramos = scan.nextInt();
       System.out.println("Precio del cereal $  ");
       double precio = scan.nextDouble();
       
       
       
       
        ProductoCereal cereal1 = new ProductoCereal("Zucaritas", "Azucaradas", "Kelloggs", "Grande", 960, 180);
        ProductoCereal cereal2 = new ProductoCereal("Froot Loops", "Tutifrutti", "Kellogs", "Mediano", 410, 150);
        ProductoCereal cereal3 = new ProductoCereal("Nesquik", "Chocolate", "Nestle", "Chico", 32, 12);
        ProductoCereal cereales = new ProductoCereal(nombreCereal, saborCereal, marcaCereal, tamanioCereal, gramos, precio);
       
       System.out.println(cereal1+"\n"+cereal2+"\n"+cereal3+"\n"+cereales);
        
        
    }
    
}
