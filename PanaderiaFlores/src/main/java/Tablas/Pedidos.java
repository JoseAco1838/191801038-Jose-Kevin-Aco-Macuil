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
public class Pedidos {

    private String nombreUsuario,fechaEntrega,panEscoger,horaEntrega;
    private int id;
    

    public Pedidos(String nombreUsuario, String fechaEntrega, String panEscoger, String horaEntrega) {
        this.nombreUsuario = nombreUsuario;
        this.fechaEntrega = fechaEntrega;
        this.panEscoger = panEscoger;
        this.horaEntrega = horaEntrega;                
    }

    public Pedidos(String nombreUsuario, String fechaEntrega, String panEscoger, String horaEntrega, int id) {
        this.nombreUsuario = nombreUsuario;
        this.fechaEntrega = fechaEntrega;
        this.panEscoger = panEscoger;
        this.horaEntrega = horaEntrega;
        this.id = id;
    }

    public Pedidos() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getPanEscoger() {
        return panEscoger;
    }

    public void setPanEscoger(String panEscoger) {
        this.panEscoger = panEscoger;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    
    @Override
    public String toString() {
        return "Pedidos{" + "nombreUsuario=" + nombreUsuario + ", fechaEntrega=" + fechaEntrega + ", panEscoger=" + panEscoger + ", horaEntrega=" + horaEntrega + ", id=" + id + '}';
    }
    
    
    
}
