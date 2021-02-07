/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class ProductoCereal {
        //atributos
    public String nombreCereal;
    public String saborCereal;
    public String marcaCereal;
    public String tamanioCereal;
    public int gramos;
    public double precio;
    
    
    public ProductoCereal(){
        
    }
    //Constructor Lleno
    public ProductoCereal(String nombreCereal, String saborCereal,String marcaCereal,String tamanioCereal, int gramos,double precio){
        
        this.nombreCereal = nombreCereal;
        this.saborCereal = saborCereal;
        this.marcaCereal = marcaCereal;
        this.tamanioCereal = tamanioCereal;
        this.gramos= gramos;
        this.precio = precio;
        
    } 
    @Override
    public String toString(){        
        return "\nNombre del Cereal: " + nombreCereal + "\nSabor del cereal :" + saborCereal + "\nMarca del cereal :" + marcaCereal + "\nTamaño del cereal: " + tamanioCereal + "\nGramos del cereal: " + gramos + "\nPrecio del cereal: "+ precio ;
    }    
}
