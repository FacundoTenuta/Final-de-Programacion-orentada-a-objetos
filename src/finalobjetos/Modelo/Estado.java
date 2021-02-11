/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author facuu
 */
public class Estado {
    private String nombre;
    private String responsable;
    private Date fecha;

    public Estado() {
        Date fecha = new Date();
        fecha.setSeconds(00);
        fecha.setMinutes(00);
        fecha.setHours(00);
        //this.removeTime(fecha);
        this.fecha = fecha;
        this.nombre = "iniciado";
    }

    public Date removeTime(Date date) {    
        Calendar cal = Calendar.getInstance();  
        cal.setTime(date);  
        cal.set(Calendar.HOUR_OF_DAY, 0);  
        cal.set(Calendar.MINUTE, 0);  
        cal.set(Calendar.SECOND, 0);  
        cal.set(Calendar.MILLISECOND, 0);  
        return cal.getTime(); 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
