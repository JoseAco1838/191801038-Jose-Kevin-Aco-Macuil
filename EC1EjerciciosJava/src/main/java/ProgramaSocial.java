import java.util.Scanner;
public class ProgramaSocial {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in) ;
         System.out.println("Hola Britanny ¿Eres viuda? para casarme contigo");
         String nombre=scanner.nextLine();
         if(nombre.equals("si") ==true){
         System.out.println("A fuerza ¿cuantos hijos tienes con el Brayan ?");
         int Hijos=scanner.nextInt();
         if(Hijos<=2){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=70+20+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);
           }
         else if(Hijos>=6){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=120+20+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);
          
         }
         else{
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=90+20+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);
         }         
         }
         if(nombre.equals("no") ==true){
         System.out.println("chales ¿cuantos hijos tienes con el Kevin?");
         int Hijos=scanner.nextInt();
        if(Hijos<=2){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=70+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);
           }
        else if(Hijos>=6){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=120+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);
         }else{
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=90+(HijosEscuela*10);
          System.out.println("El gobierno te va a dar $ "+Total);      
         }
    
}
    }
}    
