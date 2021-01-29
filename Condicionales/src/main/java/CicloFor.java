import java.util.Scanner;
public class CicloFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano dame un numero de la serie: ");
         int Serie=scanner.nextInt();
         for(int i=0;i<=Serie ;i++){
             System.out.println(i);
         }
         
         int i=Serie;
         while(i>=0) {
            System.out.println(i);
              i--;
         }
    }
    
}
