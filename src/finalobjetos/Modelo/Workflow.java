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
public class Workflow {

    public ArrayList <String> getProximosEstados(String nombre, Estado actual) {
        ArrayList <String> lista = new ArrayList();
        switch (nombre){
            case "reporte de bug": lista = this.reporteBug(actual);
            case "ampliacion": lista = this.ampliacion(actual);
            case "mejora": lista = this.mejora(actual);
            case "nuevo requerimiento": lista = this.nuevoModulo(actual);
        }
        return lista;
    }

    private ArrayList mejora(Estado actual) {
        ArrayList lista = new ArrayList();
        switch (actual.getNombre()){
            case "iniciado": lista.add("desarrollo");
                break;
            case "desarrollo": lista.add("testing");
                break;
            case "testing": lista.add("validacion");
                lista.add("desarrollo");
                break;
            case "validacion": lista.add("terminado");
                lista.add("desarrollo");
                break;
        }
        return lista;
    }
    
    private ArrayList reporteBug(Estado actual) {
        ArrayList lista = new ArrayList();
        switch (actual.getNombre()){
            case "iniciado": lista.add("desarrollo");
                break;
            case "desarrollo": lista.add("validacion");
                break;
            case "validacion": lista.add("terminado");
                lista.add("desarrollo");
                break;
        }
        return lista;
    }
    
    private ArrayList nuevoModulo(Estado actual) {
        ArrayList lista = new ArrayList();
        switch (actual.getNombre()){
            case "iniciado": lista.add("desarrollo");
                lista.add("cancelado");
                break;
            case "desarrollo": lista.add("testing");
                lista.add("desarrollo");
                lista.add("cancelado");
                break;
            case "testing": lista.add("validacion");
                lista.add("desarrollo");
                lista.add("cancelado");
                lista.add("terminado");
                break;
        }
        return lista;
    }
        
    private ArrayList ampliacion(Estado actual) {
        ArrayList lista = new ArrayList();
        switch (actual.getNombre()){
            case "iniciado": lista.add("croquis");
                lista.add("cancelado");
                break;
            case "croquis": lista.add("esperando validacion del cliente");
                lista.add("croquis");
                lista.add("cancelado");
                break;
            case "esperando validacion del cliente": lista.add("implementacion");
                lista.add("cancelado");
                break;
            case "implementacion": lista.add("testing");
                lista.add("cancelado");
                break;
            case "testing": lista.add("terminado");
                lista.add("cancelado");
                break;
        }
        return lista;
    }
    
}
