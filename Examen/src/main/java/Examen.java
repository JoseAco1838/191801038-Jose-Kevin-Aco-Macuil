/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevin09
 */
public class Examen {
    public String marca;
    public double precio;
    public int maticula;
    public cliente cliente1;

    public Examen(String marca, double precio, int maticula, cliente cliente1) {
        this.marca = marca;
        this.precio = precio;
        this.maticula = maticula;
        this.cliente1 = cliente1;
    }
public Examen(){

}
    @Override
    public String toString() {
        return "Examen{" + "marca=" + marca + ", precio=" + precio + ", maticula=" + maticula + ", cliente1=" + cliente1 + '}';
    }
    
    
}
