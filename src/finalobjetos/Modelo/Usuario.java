/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.Modelo;

import java.util.ArrayList;

/**
 *
 * @author facuu
 */
public class Usuario {
    private String usuarioID;
    private String contraseña;
    private String nombre;
    private ArrayList <Proyecto> proyectos = new ArrayList();
    private boolean admin;
    private ArrayList <Mensaje> mensajes = new ArrayList();
    private Equipo equipo;
    

    public Usuario() {
        
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList proyectos) {
        this.proyectos = proyectos;
    }

    public boolean getAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }
    


}
