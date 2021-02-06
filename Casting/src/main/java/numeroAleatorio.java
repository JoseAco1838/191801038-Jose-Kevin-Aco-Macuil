public class numeroAleatorio {
public static void main(String[] args) {
        int max = 43; 
        int min = 1; 
        int range = max - min + 1; 
        int rand = (int)(Math.random() * range) + min;            
            System.out.println(rand);
    }    
}
