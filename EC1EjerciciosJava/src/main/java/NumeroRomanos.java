import java.util.Scanner;
public class NumeroRomanos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano piensa en tu ex jaja no te creas...Escribe un numero del 1 al 10 : ");
         int Numero=scanner.nextInt();
         switch(Numero){
             case 1:
                 System.out.println("Listo tu numero romano es : I ");
                 break;
             case 2:
                 System.out.println("Listo tu numero romano es : II ");
                 break;
                      case 3:
                 System.out.println("Listo tu numero romano es : III ");
                 break;
             case 4:
                 System.out.println("Listo tu numero romano es : IV ");
                 break;
                    case 5:
                 System.out.println("Listo tu numero romano es : V ");
                 break;
             case 6:
                 System.out.println("Listo tu numero romano es : VI ");
                 break;
                      case 7:
                 System.out.println("Listo tu numero romano es : VII ");
                 break;
             case 8:
                 System.out.println("Listo tu numero romano es : VIII ");
                 break;
                 case 9:
                 System.out.println("Listo tu numero romano es : IX ");
                 break;
             case 10:
                 System.out.println("Listo tu numero romano es : X ");
                 break;
             default:
                 System.out.println("Humano imbecil te dije que un numero entre 1 al 10");
                 break;
               
                         
         }
    }
    
}
