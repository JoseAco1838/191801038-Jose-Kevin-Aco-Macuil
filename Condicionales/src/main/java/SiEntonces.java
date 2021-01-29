import java.util.Scanner;
public class SiEntonces {
public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano dame un numero y te dire si es positivo o negativo: ");
         int Numero=scanner.nextInt();
         if(Numero<0)
             System.out.println("Humano tu numero es negativo tanto como tu");
         else
             System.out.println("Humano tu numero es positivo como Dios");
    }    
}
