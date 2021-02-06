
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class Materia {
    //atributos
    public String nombreMateria;
    public String carreraMateria;
    public String codigoMateria;
    public int creditos;
    public int Cuatrimestre;
    
    
    public Materia(){
        
    }
    //Constructor Lleno
    public Materia(String nombreMateria, String carreraMateria,String codigoMateria, int creditos,int cuatrimestre){
        
        this.nombreMateria = nombreMateria;
        this.carreraMateria = carreraMateria;
        this.codigoMateria = codigoMateria;
        this.creditos = creditos;
        this.Cuatrimestre=cuatrimestre;
        
    } 
    @Override
    public String toString(){        
        return "\nMateria: " + nombreMateria + "\nMateria de la carrera :" + carreraMateria + "\nCodigo de la materia :" + codigoMateria + "\nCreditos de la materia:" + creditos + "\nCuatrimestre: " + Cuatrimestre ;
    }    
}
