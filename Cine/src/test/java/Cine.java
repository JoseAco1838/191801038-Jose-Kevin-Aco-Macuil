
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
public class Cine {
    public static void main(String[] args) {
            Pelicula pelicula1 = new Pelicula ("Black widow");
            Pelicula pelicula2 = new Pelicula ("Godzilla vs Kong");
            Pelicula pelicula3 = new Pelicula ("Love");
            //Una lista ligada puede ser de un tipo de variable o de una clase
            ArrayList <Pelicula> peliculas = new ArrayList ();
            //como agrgar objetos de una lista ligada
            peliculas.add(pelicula1);
            peliculas.add(pelicula2);
            peliculas.add(pelicula3);
            peliculas.size();
            //Nos ingresa el numero de oibjetos e la lista ligada
            System.out.println(peliculas.size());
            for(Pelicula pelicula:peliculas){
            System.out.println(pelicula);
            }
    }
}
