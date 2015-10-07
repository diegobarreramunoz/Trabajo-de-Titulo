/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.OPAlter;
import Modelo.Tienda;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class panelmodificartienda extends javax.swing.JPanel {
private Tienda Tienda = new Tienda();
    public panelmodificartienda() {
        initComponents();
        txtdireccion.setDocument(new RestringeTextField(60));
        txtnombre.setDocument(new RestringeTextField(60));
        txttelefono.setDocument(new RestringeTextField(9, true));
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combotienda = new javax.swing.JComboBox();
        lblcombotienda = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        combotienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combotiendaItemStateChanged(evt);
            }
        });

        lblcombotienda.setText("Seleccionar Tienda A Modificar");

        lblnombre.setText("Nombre");

        lbldireccion.setText("Direccion");

        lbltelefono.setText("Telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcombotienda, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(combotienda, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombre)
                    .addComponent(txtdireccion)
                    .addComponent(txttelefono)
                    .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcombotienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combotienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbldireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combotiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combotiendaItemStateChanged
       if(combotienda.getSelectedIndex()==0){lblcombotienda.setForeground(Color.red); limpiar();}
       else{
           Tienda.setCODTIENDA(((Tienda)combotienda.getSelectedItem()).getCODTIENDA());
           lblcombotienda.setForeground(Color.black);
           txtnombre.setText(((Tienda)combotienda.getSelectedItem()).getNOMBRE()); txtnombre.setEditable(true);
           txtdireccion.setText(((Tienda)combotienda.getSelectedItem()).getDIRECCION()); txtdireccion.setEditable(true);
           txttelefono.setText(String.valueOf(((Tienda)combotienda.getSelectedItem()).getTELEFONO())); txttelefono.setEditable(true);
       }
    }//GEN-LAST:event_combotiendaItemStateChanged

    public void modificar(){
        Tienda.setDIRECCION(txtdireccion.getText());
        Tienda.setNOMBRE(txtnombre.getText());
        if(OPAlter.esNumerico(txttelefono.getText())){
        Tienda.setTELEFONO(Integer.parseInt(txttelefono.getText()));}
        else{Tienda.setTELEFONO(null);}
        if(Tienda.modificarTienda(Tienda)){JOptionPane.showMessageDialog(null, "(TIENDA) Cambios Realizados con Exito"); limpiar();}
        else{JOptionPane.showMessageDialog(null, "(TIENDA) No se Realizaron los Cambios Solicitados, Porfavor Revise los Datos Ingresados");}
    }
    public final void limpiar(){
        Tienda = new Tienda();
        combotienda.setModel(Tienda.comboTiendas());
        this.lblcombotienda.setForeground(Color.BLACK);
        this.txtnombre.setText(""); txtnombre.setEditable(false);
        this.txtdireccion.setText(""); txtdireccion.setEditable(false);
        this.txttelefono.setText(""); txttelefono.setEditable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combotienda;
    private javax.swing.JLabel lblcombotienda;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
