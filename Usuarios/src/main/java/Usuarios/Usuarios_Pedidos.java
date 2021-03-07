/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author kevin09
 */
public class Usuarios_Pedidos {
    private int id;
    private String nombre,nombreUsuario,fechaEntrega,tipoPan,horaEntrega;

    public Usuarios_Pedidos(int id, String nombre, String nombreUsuario, String fechaEntrega, String tipoPan, String horaEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.fechaEntrega = fechaEntrega;
        this.tipoPan = tipoPan;
        this.horaEntrega = horaEntrega;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    @Override
    public String toString() {
        return "Usuarios_Pedidos{" + "\nid=" + id + "\nnombre=" + nombre + "\nnombre Usuario=" + nombreUsuario + "\nFecha Entrega =" + fechaEntrega + "\ntipoPan=" + tipoPan + "\nhora Entrega =" + horaEntrega + '}';
    }

    
    
}
