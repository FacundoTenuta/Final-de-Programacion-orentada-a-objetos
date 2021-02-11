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
public class Proyecto {
    private String nombre;
    private ArrayList <Item> items = new ArrayList();
    private String lider;
    private ArrayList <Usuario> miembros = new ArrayList();

    public Proyecto() {
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }
    
    
}
