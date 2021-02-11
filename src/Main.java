
import finalobjetos.Modelo.Equipo;
import finalobjetos.Modelo.Estado;
import finalobjetos.Modelo.Item;
import finalobjetos.Modelo.Proyecto;
import finalobjetos.Modelo.TipoItem;
import finalobjetos.Modelo.Usuario;
import finalobjetos.VistaControlador.IniciarSesionForm;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author facuu
 */
public class Main {
    
    public static void main(String args[]) {
        IniciarSesionForm iniciarSesion = new IniciarSesionForm();
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Pagina web de Laboratorio de programacion");
        ArrayList <Item> items = new ArrayList <Item>();
        Item item = new Item();
        item.setNombre("Error en la seccion de carousel");
        //TipoItem tipoItem = new TipoItem();
        //tipoItem.setNombre("reporte de bug");
        item.setTipoItem("reporte de bug");
        Estado estado = new Estado();
        estado.setResponsable("facundo");
        Estado historial = new Estado();
        historial.setResponsable("facundo");
        item.setEstadoActual(estado);
        item.getHistorial().add(historial);
        Equipo equipo = new Equipo();
        equipo.setNombre("Desarrollo");
        Usuario e = new Usuario();
        e.setNombre("facundo");
        e.setUsuarioID("facundo");
        e.setContraseña("tenuta");
        e.setAdmin(true);
        e.setEquipo(equipo);
        equipo.getMiembros().add(e);
        item.setEquipo(equipo);
        item.setPrioridad("baja");
        items.add(item);
        proyecto.setItems(items);
        proyecto.setLider("facundo");
        
        e.getProyectos().add(proyecto);
        proyecto.getMiembros().add(e);
        iniciarSesion.getUsuarios().add(e);
        //iniciarSesion.agregarUsuario("facundo", "tenuta", true, proyecto);
        iniciarSesion.setLocationRelativeTo(null);
        iniciarSesion.setVisible(true);
    }
}
