/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.Modelo;

/**
 *
 * @author facuu
 */
public class TipoItem {
    private String nombre;
    private Workflow workflow = new Workflow();

    public TipoItem() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }
    
    
}
