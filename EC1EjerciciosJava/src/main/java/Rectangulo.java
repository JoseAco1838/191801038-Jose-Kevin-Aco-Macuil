import java.util.Scanner;
public class Rectangulo {
public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in) ;
         System.out.println("Humano dame un numero entero");
         int numeroUno=scanner.nextInt();
         System.out.println("Humano dame un numero flotante");
         scanner.nextLine();
         double numeroDos=scanner.nextDouble();
         System.out.println("El resultado es: "+(numeroUno +numeroDos));
         System.out.println("Humano dame tu nombre completo");
         String nombre=scanner.nextLine();
         System.out.println("Tu nombre es: "+nombre); 
            
        }
    }