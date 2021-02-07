
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class Fracciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var scan=new Scanner(System.in) ;
        System.out.println("Hola humano como veo que no puedes ni sumar yo te voy a ayudar a simplificar tus fracciones ");
        System.out.println("Dame el numero de tu numerador menos el cero");
        int numerador = scan.nextInt();
        System.out.println("Dame el numero de tu denominador....excepto el cero..que acaso quieres explotar el mundo");
        int denominador = scan.nextInt(); 
       int divisor=2;
        while (divisor<=numerador && divisor <=denominador) {            
            if (divisor<=numerador && denominador%divisor==0) {
            numerador=numerador/divisor;
            denominador=denominador/divisor;
            } else {
                divisor++;
            }
        } 
System.out.println("Tu numerador simplificado es:  " + numerador);
    System.out.println("Tu denominador simplificado es: " +denominador);
    
}
}

