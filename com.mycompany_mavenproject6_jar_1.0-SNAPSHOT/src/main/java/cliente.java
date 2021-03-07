


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class cliente {
    public int dni,telefono,CodigoPostal;
    public String nombre,auto,Apellido,Estado,Marca,Genero,Correo;
    
    
    
    
    public cliente(int dni, int telefono,int CodigoPostal, String nombre,String auto,String Apellido,String Estado,String Marca,String Genero,String Correo ){
        
        this.dni = dni;
        this.telefono = telefono;
        this.CodigoPostal = CodigoPostal;
        this.nombre = nombre;
        this.auto=auto;
        this.Apellido = Apellido;
        this.Estado = Estado;
        this.Marca=Marca;
        this.Genero=Genero;
        this.Correo=Correo;
        
        
        
        
    }
    
    public cliente(){
        this.dni = 0;
        this.telefono = 0;
        this.CodigoPostal = 0;
        this.nombre = "";
        this.auto="";
        this.Apellido = "";
        this.Estado = "";
        this.Marca="";
        this.Genero="";
        this.Correo="";
        
        
    } 
    
    @Override
    public String toString(){
        return "\n dni: " + dni + "\n telefono:" + telefono +"\n Estado:"+Estado+"\n Codigo Postal: "+ CodigoPostal +"\n Nombre:" + nombre +"\n Apellido: "+Apellido+ "\n Genero:"+Genero+"\n Auto:" + auto+"\n Marca: "+Marca+"\n Correo:"+Correo;
        
    }
}
