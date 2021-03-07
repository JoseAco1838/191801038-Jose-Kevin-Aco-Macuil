/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class Coche {
    public String marca,color,BolsasDeAire,Quemacocos;
    public double precio,motor;
    public int matricula,rines;
     
    public cliente cliente1;
    public Coche(String marca,String color,String BolsasDeAire,String Quemacocos, double precio,double motor, int matricula,int rines,cliente cliente1){
        
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.BolsasDeAire = BolsasDeAire;
        this.Quemacocos = Quemacocos;
        this.motor = motor ;
        this.matricula = matricula ;
        this.rines = rines ;
        this.cliente1=cliente1;
        
    }
    
    public Coche(){
        
        this.marca = "";
        this.color = "";
        this.BolsasDeAire = "" ;
        this.Quemacocos = "";
        this.precio = 0;
        this.motor = 0;
        this.matricula = 0;
        this.rines = 0 ;
        
    }
    
    
    @Override
    public String toString(){
        return "\n Marca del auto:" + marca + "\n Color del auto:" + color  + "\n Bolsas de Aire:" + BolsasDeAire + "\n Quemacocos: " + Quemacocos + "\n Precio del auto:"+ precio + "\n Motor del auto" + motor +"\n Matricula del auto:"+ matricula + "\n Rines del auto: "+ rines;
    }
}
