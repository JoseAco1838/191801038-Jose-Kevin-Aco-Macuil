import java.util.Scanner;
public class Taqueria {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano ¿cuantos tacos te comiste ?: ");
         int Tacos=scanner.nextInt();
         System.out.println("Humano ¿Cuantos refrescos te tomaste para bajarte el picante del chile?: ");
         scanner.nextLine();
         int Refresco=scanner.nextInt();
         int precioTacos=17;
        int precioRefresco=10; 
         int totalTacos=Tacos*precioTacos;
         int totalRefresco=Refresco*precioRefresco;
         int Total=totalRefresco+totalTacos;
         System.out.println("A ver para que corras , vas a pagar $ "+Total);
    }
    }
