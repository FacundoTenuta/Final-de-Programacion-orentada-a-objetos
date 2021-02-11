/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author facuu
 */
public class Mensaje {
    private String asunto;
    private String contenido;

    public Mensaje() {
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        String date = new SimpleDateFormat("ss:mm:HH-dd-MM-yyyy").format(new Date());
        this.asunto = asunto + " " + date;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
}
