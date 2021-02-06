
import java.util.ArrayList;
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
public class testMaterias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       var scan = new Scanner (System.in);
       System.out.println("Que onda resagado introduce los siguientes datos de la materia: ");
       System.out.println("Nombre de la materia:  ");
       String nombreMateria = scan.nextLine();
       System.out.println("Carrera:  ");
       String carreraMateria = scan.nextLine();
       System.out.println("Codigo de la materia:  ");
       String codigoMateria = scan.nextLine();
       System.out.println("Creditos de la materia:  ");
       int creditos = scan.nextInt();
       System.out.println("Cuatrimestre:  ");
       int Cuatrimestre = scan.nextInt();
       
       
       
        Materia materia1 = new Materia("Fisica", "Mecatronica", "MEC02", 10, 2);
        Materia materia2 = new Materia("Matematicas", "Biotecnologia", "BIOTEC01", 14, 3);
        Materia materia3 = new Materia( "Valores del ser", "Financiera", "FIN07", 10, 1);
        Materia materias = new Materia(nombreMateria, carreraMateria, codigoMateria, creditos, Cuatrimestre);
       
       System.out.println(materia1+"\n"+materia2+"\n"+materia3+"\n"+materias);
        
        
    }
    
}
