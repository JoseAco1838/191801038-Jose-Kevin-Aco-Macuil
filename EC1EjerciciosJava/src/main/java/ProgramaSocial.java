import java.util.Scanner;
public class ProgramaSocial {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in) ;
         System.out.println("¿Eres viuda?");
         String nombre=scanner.nextLine();
         if(nombre.equals("si") ==true){
         System.out.println("¿cuantos hijos tienes?");
         int Hijos=scanner.nextInt();
         if(Hijos<=2){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=70+20+(HijosEscuela*10);
          System.out.println(Total);
           }
          if(Hijos>=6){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=120+20+(HijosEscuela*10);
          System.out.println(Total);
          
         }
         else{
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=90+20+(HijosEscuela*10);
          System.out.println(Total);
         }         
         }
         if(nombre.equals("no") ==true){
         System.out.println("¿cuantos hijos tienes?");
         int Hijos=scanner.nextInt();
        if(Hijos<=2){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=70+(HijosEscuela*10);
          System.out.println(Total);
           }
         if(Hijos>=6){
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=120+(HijosEscuela*10);
          System.out.println(Total);
         }else{
         System.out.println("¿Cuantos hijos van a la escuela? Considerado que la edad escolar es entre 6-18 años");
         scanner.nextLine();
         int HijosEscuela=scanner.nextInt();
          int Total=90+(HijosEscuela*10);
          System.out.println(Total);      
         }
    
}
    }
}    
