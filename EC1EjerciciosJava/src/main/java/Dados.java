import java.util.Random;

public class Dados {
public static void main(String[] args) {
    System.out.println("A ver humano vamos a jugar con tu suerte... ");    
    Random rand=new Random();
        int dado1=rand.nextInt(5)+1;
        int dado2=rand.nextInt(5)+1;
        System.out.println("Dado 1= "+dado1);
        System.out.println("Dado 2= "+dado2);  
                
    }    
}
