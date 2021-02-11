/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalobjetos.VistaControlador;

import finalobjetos.Modelo.Equipo;
import finalobjetos.Modelo.Item;
import finalobjetos.Modelo.Proyecto;
import finalobjetos.Modelo.Usuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author facuu
 */
public class ItemsForm extends javax.swing.JFrame {
    private ProyectosForm proyectos;
    private VerItemForm item;
    private AltaItemForm nuevoItem;
    private Proyecto proyecto;
    private ArrayList<Equipo> equipos;
    private Usuario usuario;

    /**
     * Creates new form ItemsForm
     * @param aThis
     */

    public ItemsForm(ProyectosForm aThis) {
        initComponents();
        this.proyectos = aThis;
        this.item = new VerItemForm(this);
        this.item.setLocationRelativeTo(null);
        this.nuevoItem = new AltaItemForm(this);
        this.nuevoItem.setLocationRelativeTo(null);
        this.etiquetaError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        etiquetaProyecto = new javax.swing.JLabel();
        etiquetaLider = new javax.swing.JLabel();
        etiquetaError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proyecto:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ver item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Lider:");

        jButton3.setText("Agregar item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        etiquetaError.setForeground(new java.awt.Color(255, 0, 0));
        etiquetaError.setText("Debe seleccionar un item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(etiquetaLider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(etiquetaError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(etiquetaProyecto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(etiquetaLider))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        this.proyectos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.tabla.getSelectedRow() != -1) {
            this.setVisible(false);
            Item itemVisto = (Item) this.proyecto.getItems().get(this.tabla.getSelectedRow());
            this.item.setProyecto(proyecto);
            this.item.setItem(itemVisto);
            this.item.setUsuario(this.usuario);
            this.item.setVisible(true);
        }else{
            this.etiquetaError.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.nuevoItem.setItems(this.proyecto.getItems());
        this.setVisible(false);
        this.nuevoItem.setUsuario(this.usuario);
        this.nuevoItem.setEquipos(this.equipos);
        this.nuevoItem.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaError;
    private javax.swing.JLabel etiquetaLider;
    private javax.swing.JLabel etiquetaProyecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    void inicializarItems(ArrayList items) {
        this.clearJTable();
        this.addRowToJTable(items);
        this.etiquetaError.setVisible(false);
    }

    private void addRowToJTable(ArrayList <Item> lista) {
        DefaultTableModel model = (DefaultTableModel) this.tabla.getModel();
        Object rowData[] = new Object[1];
        if (!lista.isEmpty()) {
            for (int i = 0; i < (lista.size()); i++) {
                rowData[0] = lista.get(i).getNombre();
                model.addRow(rowData);
            }
        }
    }

    private void clearJTable() {
        DefaultTableModel model = (DefaultTableModel) this.tabla.getModel();
        int filas = model.getRowCount();
        for (int i = 0; i < filas; i++) {
            model.removeRow(0);
        }
    }

    void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
        this.etiquetaLider.setText(this.proyecto.getLider());
        this.etiquetaProyecto.setText(this.proyecto.getNombre());
    }

    void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
