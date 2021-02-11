/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Facu
 */
public class Equipo {
    private String nombre;
    private ArrayList <Usuario> miembros = new ArrayList();

    public Equipo() {
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList miembros) {
        this.miembros = miembros;
    }
    
    
}
