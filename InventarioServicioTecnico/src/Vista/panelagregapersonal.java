/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.OPAlter;
import Modelo.Personal;
import Modelo.Tienda;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class panelagregapersonal extends javax.swing.JPanel {
    private Personal Personal = new Personal();
    private Tienda Tienda = new Tienda();
    public panelagregapersonal() {
        initComponents();
        txtayudacontrasena.setDocument(new RestringeTextField(70));
        txtcontrasena.setDocument(new RestringeTextField(10));
        txtnombre.setDocument(new RestringeTextField(60));
        txttelefono.setDocument(new RestringeTextField(9, true));
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblrut = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        txtdv = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbltienda = new javax.swing.JLabel();
        combotienda = new javax.swing.JComboBox();
        lblcontrasena = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JPasswordField();
        checkcontrasena = new javax.swing.JCheckBox();
        lblayudacontrasena = new javax.swing.JLabel();
        txtayudacontrasena = new javax.swing.JTextField();
        lblpermiso = new javax.swing.JLabel();
        combopermiso = new javax.swing.JComboBox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        setMaximumSize(new java.awt.Dimension(500, 255));
        setMinimumSize(new java.awt.Dimension(500, 255));
        setPreferredSize(new java.awt.Dimension(500, 255));

        lblrut.setText("Rut Nuevo Personal");
        lblrut.setMaximumSize(new java.awt.Dimension(230, 14));
        lblrut.setMinimumSize(new java.awt.Dimension(230, 14));
        lblrut.setPreferredSize(new java.awt.Dimension(230, 14));

        txtrut.setEditable(false);
        txtrut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrutFocusGained(evt);
            }
        });

        txtdv.setEditable(false);
        txtdv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdvFocusLost(evt);
            }
        });
        txtdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdvKeyPressed(evt);
            }
        });

        lblnombre.setText("Nombre");
        lblnombre.setMaximumSize(new java.awt.Dimension(230, 14));
        lblnombre.setMinimumSize(new java.awt.Dimension(230, 14));
        lblnombre.setPreferredSize(new java.awt.Dimension(230, 14));

        txtnombre.setEditable(false);

        lbltelefono.setText("Telefono");
        lbltelefono.setMaximumSize(new java.awt.Dimension(230, 14));
        lbltelefono.setMinimumSize(new java.awt.Dimension(230, 14));
        lbltelefono.setPreferredSize(new java.awt.Dimension(230, 14));

        txttelefono.setEditable(false);

        lbltienda.setText("Tienda Actual()");
        lbltienda.setMaximumSize(new java.awt.Dimension(230, 14));
        lbltienda.setMinimumSize(new java.awt.Dimension(230, 14));
        lbltienda.setPreferredSize(new java.awt.Dimension(230, 14));

        combotienda.setEnabled(false);
        combotienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combotiendaItemStateChanged(evt);
            }
        });

        lblcontrasena.setText("Contraseña");
        lblcontrasena.setMaximumSize(new java.awt.Dimension(109, 14));
        lblcontrasena.setMinimumSize(new java.awt.Dimension(109, 14));
        lblcontrasena.setPreferredSize(new java.awt.Dimension(109, 14));

        txtcontrasena.setEditable(false);

        checkcontrasena.setText("Mostrar Contraseña");
        checkcontrasena.setMaximumSize(new java.awt.Dimension(121, 14));
        checkcontrasena.setMinimumSize(new java.awt.Dimension(121, 14));
        checkcontrasena.setPreferredSize(new java.awt.Dimension(121, 14));
        checkcontrasena.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkcontrasenaItemStateChanged(evt);
            }
        });

        lblayudacontrasena.setText("Ayuda Contraseña (datos para recordarla)");
        lblayudacontrasena.setMaximumSize(new java.awt.Dimension(230, 14));
        lblayudacontrasena.setMinimumSize(new java.awt.Dimension(230, 14));
        lblayudacontrasena.setPreferredSize(new java.awt.Dimension(230, 14));

        txtayudacontrasena.setEditable(false);

        lblpermiso.setText("Permiso tipo Administrador local o Tecnico local");
        lblpermiso.setMaximumSize(new java.awt.Dimension(230, 14));
        lblpermiso.setMinimumSize(new java.awt.Dimension(230, 14));
        lblpermiso.setPreferredSize(new java.awt.Dimension(230, 14));

        combopermiso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Permiso", "Tecnico", "Administrador" }));
        combopermiso.setEnabled(false);
        combopermiso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combopermisoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblrut, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combotienda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblpermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combopermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblayudacontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtayudacontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblrut, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre)
                            .addComponent(txtcontrasena))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblayudacontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelefono)
                            .addComponent(txtayudacontrasena))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltienda, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpermiso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combotienda)
                            .addComponent(combopermiso))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtdvKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdvKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_BACK_SPACE)
        {
            try{
                txtdv.setText(String.valueOf(txtrut.getText().charAt(txtrut.getText().length()-1)));
                txtrut.setText(txtrut.getText().substring(0,txtrut.getText().length()-1));
            }catch(Exception e){txtdv.setText("");}
        }
        else if(OPAlter.esNumerico(String.valueOf(evt.getKeyChar())) || evt.getKeyChar()=='k'||evt.getKeyChar()=='K')
        {
            if(OPAlter.esNumerico(txtdv.getText())&& txtrut.getText().length()<=7)
            {
                txtrut.setText(txtrut.getText()+txtdv.getText());
            }
            if (String.valueOf(evt.getKeyChar()).matches("[0-9]") || evt.getKeyChar()=='k' || evt.getKeyChar()=='K')
            {
                txtdv.setText(String.valueOf(evt.getKeyChar()));
            }
        }
    }//GEN-LAST:event_txtdvKeyPressed

    private void txtrutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutFocusGained
        txtdv.requestFocus(true);
    }//GEN-LAST:event_txtrutFocusGained

    private void txtdvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdvFocusLost
        if (OPAlter.validarut(txtrut.getText(), txtdv.getText())) {
            Personal.setMRUT_P(txtrut.getText()+"-"+txtdv.getText());
            if(Personal.buscarPersonal()){Personal.setMRUT_P(null);
            this.txtayudacontrasena.setEditable(false);
            this.txtcontrasena.setEditable(false);
            this.txtnombre.setEditable(false);
            this.txttelefono.setEditable(false);
            this.combotienda.setEnabled(false);
            this.combopermiso.setEnabled(false);
            this.lblrut.setForeground(Color.red);
            this.lblrut.setText("Rut Nuevo Personal Existente");
            this.checkcontrasena.setEnabled(false);
            }else{
            this.txtayudacontrasena.setEditable(true);
            this.txtcontrasena.setEditable(true);
            this.txtnombre.setEditable(true);
            this.txttelefono.setEditable(true);
            this.combotienda.setEnabled(true);
            this.combopermiso.setEnabled(true);
            this.lblrut.setForeground(Color.GREEN.darker().darker());
            this.lblrut.setText("Rut Nuevo Personal Valido");
            this.checkcontrasena.setEnabled(true);}
        }else{
            Personal.setMRUT_P(null);
            this.txtayudacontrasena.setEditable(false);
            this.txtcontrasena.setEditable(false);
            this.txtnombre.setEditable(false);
            this.txttelefono.setEditable(false);
            this.combotienda.setEnabled(false);
            this.combopermiso.setEnabled(false);
            this.lblrut.setForeground(Color.red);
            this.lblrut.setText("Rut Nuevo Personal Invalido");
            this.checkcontrasena.setEnabled(false);
        }
    }//GEN-LAST:event_txtdvFocusLost

    private void checkcontrasenaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkcontrasenaItemStateChanged
        if(evt.getStateChange()==1){txtcontrasena.setEchoChar('\0');}
        else{txtcontrasena.setEchoChar('*');}
    }//GEN-LAST:event_checkcontrasenaItemStateChanged

    private void combopermisoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combopermisoItemStateChanged
        if(combopermiso.getSelectedIndex()==0){Personal.setMPERMISO(null);}
        if(combopermiso.getSelectedIndex()==1){Personal.setMPERMISO("T");}
        if(combopermiso.getSelectedIndex()==2){Personal.setMPERMISO("A");}
    }//GEN-LAST:event_combopermisoItemStateChanged

    private void combotiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combotiendaItemStateChanged
        if(combotienda.getSelectedIndex()==0){
            this.lbltienda.setText("Tienda Actual()");
            this.lbltienda.setForeground(Color.red);
            Personal.setMCODTIENDA(null);
        }
        else{
            this.lbltienda.setForeground(Color.BLACK);
            this.lbltienda.setText("Tienda Actual(" + ((Tienda) combotienda.getSelectedItem()).getCODTIENDA()+ ")");
            Personal.setMCODTIENDA(((Tienda) combotienda.getSelectedItem()).getCODTIENDA());
        }
    }//GEN-LAST:event_combotiendaItemStateChanged

    public void agregar(){
        Personal.setMAYUDACONTRASENA(this.txtayudacontrasena.getText());
        Personal.setMCONTRASENA(String.valueOf(this.txtcontrasena.getPassword()));
        Personal.setMNOMBRE_P(this.txtnombre.getText());
        if(OPAlter.esNumerico(this.txttelefono.getText())){
            Personal.setMTELEFONO(Integer.parseInt(this.txttelefono.getText()));
            lbltelefono.setForeground(Color.BLACK);
        }else{
            Personal.setMTELEFONO(null); lbltelefono.setForeground(Color.red);
        }
        if(Personal.crearPersonal()){
            limpiar();
            JOptionPane.showMessageDialog(null, "[PERSONAL] DATOS AGREGADOS CORRECTAMENTE", "PERSONAL", JOptionPane.INFORMATION_MESSAGE);
        }else{JOptionPane.showMessageDialog(null, "[PERSONAL] NO SE REALIZARON LOS CAMBIOS SOLICITADOS, PORFAVOR REVISE LOS DATOS INGRESADOS", "PERSONAL", JOptionPane.ERROR_MESSAGE);}
    }
    
    public final void limpiar(){
            Personal = new Personal();
            Tienda = new Tienda();
            Tienda.setCODTIENDA(Personal.getCODTIENDA());
            Tienda = Tienda.buscarTienda(Tienda);
            combotienda.setModel(Tienda.comboTiendas());
            combotienda.setEnabled(false);
            lbltienda.setText("Tienda Actual("+Tienda.getNOMBRE()+")");
            checkcontrasena.setSelected(true);
            txtcontrasena.setEchoChar('\0');
            txtrut.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            txtdv.requestFocus();
            this.txtrut.setText("");
            this.txtdv.setText("");
            this.combopermiso.setSelectedIndex(0); this.combopermiso.setEnabled(false);
            this.txtayudacontrasena.setText(""); this.txtayudacontrasena.setEditable(false);
            this.txtcontrasena.setText(""); this.txtcontrasena.setEditable(false);
            this.txtnombre.setText(""); this.txtnombre.setEditable(false);
            this.txttelefono.setText(""); this.txttelefono.setEditable(false);
            this.lbltienda.setForeground(Color.BLACK);
            this.lblpermiso.setText("Permiso");
            this.lblpermiso.setForeground(Color.BLACK);
            this.lblrut.setForeground(Color.BLACK);
            this.lblrut.setText("Rut Nuevo Personal");
            this.lbltelefono.setForeground(Color.BLACK);
            this.checkcontrasena.setEnabled(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkcontrasena;
    private javax.swing.JComboBox combopermiso;
    private javax.swing.JComboBox combotienda;
    private javax.swing.JLabel lblayudacontrasena;
    private javax.swing.JLabel lblcontrasena;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpermiso;
    private javax.swing.JLabel lblrut;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltienda;
    private javax.swing.JTextField txtayudacontrasena;
    private javax.swing.JPasswordField txtcontrasena;
    private javax.swing.JTextField txtdv;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
