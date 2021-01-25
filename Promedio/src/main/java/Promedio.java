import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano dame el numero de tu calificacion: ");
         double numeroUno=scanner.nextDouble();
         System.out.println("Humano dame el segundo numero de tu calificacion: ");
         scanner.nextLine();
         double numeroDos=scanner.nextDouble();
         System.out.println("Humano dame el tercer numero de tu calificacion: ");
         scanner.nextLine();
         double numeroTres=scanner.nextDouble();
         System.out.println("A ver tu promedio es: "+((numeroUno +numeroDos+numeroTres)/3));
    }
    
}
