/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author kevin09
 */
public class Venta {

    private String nombreUsuario,nombrePan;
    private int id,totalDePan;
    private double totalPagar;

    public Venta(String nombreUsuario, String nombrePan, int id, int totalDePan, double totalPagar) {
        this.nombreUsuario = nombreUsuario;
        this.nombrePan = nombrePan;
        this.id = id;
        this.totalDePan = totalDePan;
        this.totalPagar = totalPagar;
    }

    public Venta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Venta(String nombreCliente, double totalVenta, double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Venta(String nombreCliente, int id, double totalVenta, double descuento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombrePan() {
        return nombrePan;
    }

    public int getId() {
        return id;
    }

    public int getTotalDePan() {
        return totalDePan;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNombrePan(String nombrePan) {
        this.nombrePan = nombrePan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalDePan(int totalDePan) {
        this.totalDePan = totalDePan;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreUsuario=" + nombreUsuario + ", nombrePan=" + nombrePan + ", id=" + id + ", totalDePan=" + totalDePan + ", totalPagar=" + totalPagar + '}';
    }
    
    
}
