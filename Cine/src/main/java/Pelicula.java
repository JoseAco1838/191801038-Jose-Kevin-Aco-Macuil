/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class Pelicula {
    public String titulo,director,genero,casaProductora,clasificacion;
       public int año;
       public double duracion;
       public boolean subtitulos;
 public Pelicula(){
        
    }
    //Constructor Lleno
    public Pelicula(String titulo, String director,String genero,String casaProductora,String clasificacion ,int año,double duracion,boolean subtitulos){
        
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.casaProductora = casaProductora;
        this.clasificacion= clasificacion;
        this.año = año;
        this.duracion = duracion;
        this.subtitulos = subtitulos;
        
    } 

    public Pelicula(String titulo){
    this.titulo= titulo ;
    }
   
    @Override
    public String toString(){        
        return "\nNombre de la pelicula: " + titulo + "\nGenero de la pelicula :" + genero + "\nProductora de la pelicula :" + casaProductora + "\nClsificacion de la pelicula: " + clasificacion + "\nAño de la pelicula: " + año + "\nDuracion de la pelicula: "+ duracion+"\nSubtitulos de la pelicula:"+ subtitulos ;
    }    
}
