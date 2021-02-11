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
public class Item {
    private String nombre;
    private String prioridad;
    private Equipo equipo;
    private TipoItem tipoItem = new TipoItem();
    private Estado estadoActual = new Estado();
    private ArrayList <Estado> historial = new ArrayList();

    public Item() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public TipoItem getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String nombre) {
        this.tipoItem.setNombre(nombre);
        
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public ArrayList getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList historial) {
        this.historial = historial;
    }
    
    
}
