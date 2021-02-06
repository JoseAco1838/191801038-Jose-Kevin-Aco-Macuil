import java.util.Scanner;
public class Inversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola humano te quiero preguntar ¿Cuanto dinero del terreno de tu abuelita quieres invertir rufian ?  $ ");
         float Dinero=scanner.nextFloat();
         if(Dinero<=1000) { System.out.println("Eres Bien codo....no tienes mente de tiburon :c");System.out.println("Humano ¿Cuanto quieres de intereses para que le des valor a tu inversion? : ");
        scanner.nextLine();
         float Intereses=scanner.nextFloat();
         float TotalIntereses=Intereses/100;
        System.out.println("Humano ¿Cuantos años quieres que nos quedemos con tu dinero? xd no es cierto ¿Cuantos años quieres como inversion ?  ");
         float Años=scanner.nextFloat();         
         float Inversion=(Dinero)*(1+TotalIntereses);            
        System.out.println("Humano no estas listo para ser un Shark Tank porque tu inversion es $ "+ Inversion);
        } else {
         System.out.println("Es sin miedo al exito Papi");    
       System.out.println("Papi ¿Cuanto quieres de intereses para que le des valor a tu inversion? : ");
        scanner.nextLine();
         float Intereses=scanner.nextFloat();
         float TotalIntereses=Intereses/100;
        System.out.println("Papi  ¿Cuantos años quieres que nos quedemos con tu dinero? xd no es cierto ¿Cuantos años quieres como inversion ?  ");
         float Años=scanner.nextFloat();         
         float Inversion=(Dinero)*(1+TotalIntereses);            
        System.out.println("Listo Arturo Elias se sentira orgulloso de que tengas mente de tiburon porque tu inversion es $ "+Inversion);
 }
}    
        
    
}
