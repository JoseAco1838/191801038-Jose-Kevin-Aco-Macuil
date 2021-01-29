import java.util.Scanner;
public class Opciones {
public static void main(String[] args) {
    int Suma,opcion = 0;
         Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano dame un numero: ");
         int NumeroUno=scanner.nextInt();
        System.out.println("Hola humano dame otro numero: ");
         int NumeroDos=scanner.nextInt();
         Suma=NumeroUno+NumeroDos;
         switch(opcion){
             case 1:
                 System.out.println(NumeroUno+NumeroDos);
                 break;
                 case 2:
                 System.out.println(NumeroUno-NumeroDos);
                 break;
                 default:
                 System.out.println("No existe esta opcion");
                 break;
    }
   }
 }
