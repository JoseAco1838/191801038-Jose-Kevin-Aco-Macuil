import java.util.Scanner;


public class rectangulo1 {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in) ;
        System.out.println("Humano dame tu la altura");
    int altura=scanner.nextInt();
    System.out.println("Humano dame tu la ancho");
    int ancho=scanner.nextInt();
    for(int i=0;i<altura;i++){
    for(int j=0;j<ancho;j++){
        System.out.print("*");
    }
    System.out.print("\n");
    }
    }
}
    
