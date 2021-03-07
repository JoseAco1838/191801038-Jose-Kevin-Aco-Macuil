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
public class Usuarios {
    private int id;
    private String nombreUsuario,contraseña,fechaAlta;
    private boolean status;

    public Usuarios(int id, String nombreUsuario, String contraseña, String fechaAlta, boolean status) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaAlta = fechaAlta;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "\nid=" + id + "\nnombreUsuario=" + nombreUsuario + "\ncontraseña=" + contraseña + "\nfecha Alta=" + fechaAlta + "\nstatus=" + status + '}';
    }

    
    
    
    
}
