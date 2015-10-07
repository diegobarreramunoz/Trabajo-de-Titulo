/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import Modelo.OPAlter;
import Modelo.Personal;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class FrmIngreso extends JFrame {

    //DECLARACION DE VARIABLES
    private Personal Personal;
    private FrmCarga FrmCarga;
    private Font Font1 = new Font("tahoma", Font.HANGING_BASELINE, 10);
    private Font Font2 = new Font("tahoma", Font.PLAIN, 10);
    private Cursor C_Hand = new Cursor(Cursor.HAND_CURSOR);
    private repintado repintado;
    
    
    //CONSTRUCTOR PREDETERMINADO HE INSTANCIACION DE CLASES
    public FrmIngreso() {
        Personal = new Personal();
        FrmCarga = new FrmCarga();
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Vista/icon/logo_icon.png")).getImage();
        setIconImage(icon);
        if(Personal.primeruso()){FrmCarga.setVisible(true);}
        txtrut.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        txtdv.requestFocus();
        txtrut.setText("");
        txtdv.setText("");
        repintado = new repintado();
        repintado.setBounds(0, 0, this.getWidth(), 70);
        this.add(repintado);
        repintado.repaint();
    }
    
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblcontraseña = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        btnaceptar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtrut = new javax.swing.JTextField();
        txtdv = new javax.swing.JTextField();
        lbltitulo = new javax.swing.JLabel();
        lblayuda = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        lblicon2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        lblusuario.setText("USUARIO (RUT):");

        lblcontraseña.setText("CONTRASEÑA:");

        btnaceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407556317_ok.png"))); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.setMaximumSize(new java.awt.Dimension(146, 57));
        btnaceptar.setMinimumSize(new java.awt.Dimension(146, 57));
        btnaceptar.setPreferredSize(new java.awt.Dimension(146, 57));
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407556291_cancel.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setMaximumSize(new java.awt.Dimension(146, 57));
        btnsalir.setMinimumSize(new java.awt.Dimension(146, 57));
        btnsalir.setPreferredSize(new java.awt.Dimension(146, 57));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        txtrut.setEditable(false);
        txtrut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrutFocusGained(evt);
            }
        });

        txtdv.setEditable(false);
        txtdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdvKeyPressed(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("IDENTIFICATE");

        lblayuda.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblayuda.setText("¿Ha Olvidado su Contraseña?");
        lblayuda.setMaximumSize(new java.awt.Dimension(146, 29));
        lblayuda.setMinimumSize(new java.awt.Dimension(146, 29));
        lblayuda.setPreferredSize(new java.awt.Dimension(146, 29));
        lblayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblayudaMouseClicked(evt);
            }
        });
        lblayuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblayudaMouseMoved(evt);
            }
        });

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555566_unlock.png"))); // NOI18N

        lblicon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555646_key.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtrut)
                                    .addComponent(lblusuario))
                                .addGap(7, 7, 7)
                                .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblayuda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblicon2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblicon2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblusuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblcontraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //VALIDACION DE CONTRASEÑA Y RUT Y TRASPASO AL FORMULARIO CORRSPONDIENTE SEGUN PERMISO
    // <editor-fold defaultstate="collapsed" desc="btnaceptarActionPerformed">  
    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        try{    
        if (OPAlter.validarut(txtrut.getText(), txtdv.getText())) {
            Personal.setRUT_P(txtrut.getText()+"-"+txtdv.getText());
            Personal.setCONTRASENA(String.valueOf(txtcontraseña.getPassword()));
            if (Personal.validaEntrada()) {
                switch (Personal.getPERMISO().trim()){
                    case "A":
                FrmMenuAdministrador formu1=new FrmMenuAdministrador();
                formu1.setVisible(true);
                    break;
                    case "T":
                FrmMenuTecnico formu2=new FrmMenuTecnico();
                formu2.setVisible(true);
                    break;
                }
                this.setVisible(false);
                txtdv.setText("");
                txtrut.setText("");
                txtcontraseña.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Rut y/o Contraseña Invalidas");
            }
        }else{JOptionPane.showMessageDialog(rootPane, "Rut Invalido");}}
        catch(Exception e){JOptionPane.showMessageDialog(rootPane, "Rut Invalido");}
        txtcontraseña.setText("");
    }//GEN-LAST:event_btnaceptarActionPerformed
// </editor-fold>
    
    //VALIDACION DE CAMPOS TXTRUT Y TXTDV
    // <editor-fold defaultstate="collapsed" desc="txtdvKeyPressed">  
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
// </editor-fold>
    
    //TRASPASO DE FOCO DESDE TXTRUT A TXTDV
    // <editor-fold defaultstate="collapsed" desc="txtrutFocusGained">  
    private void txtrutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutFocusGained
        txtdv.requestFocus();
    }//GEN-LAST:event_txtrutFocusGained
// </editor-fold>
    
    //CAMBIO DE FORMATO DE TEXTO Y MOUSE AL PASAR SOBRE LBLAYUDA
    // <editor-fold defaultstate="collapsed" desc="lblayudaMouseMoved">  
    private void lblayudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblayudaMouseMoved
        lblayuda.setCursor(C_Hand);
        lblayuda.setFont(Font1);
        lblayuda.setForeground(Color.BLUE);
    }//GEN-LAST:event_lblayudaMouseMoved
// </editor-fold>
    
    //RE HACER FORMATO DE TEXTO Y MOUSE DE LBLAYUDA AL PASAR SOBRE FRMINGRESO
    // <editor-fold defaultstate="collapsed" desc="formMouseMoved">  
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        lblayuda.setFont(Font2);
        lblayuda.setForeground(Color.BLACK);
    }//GEN-LAST:event_formMouseMoved
// </editor-fold>
    
    //VALIDACION DE RUT Y VISUALIZACION DE AYUDA DE CONTRASEÑA
    // <editor-fold defaultstate="collapsed" desc="lblayudaMouseClicked">  
    private void lblayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblayudaMouseClicked
        if(OPAlter.validarut(txtrut.getText(),txtdv.getText())){
            Personal.setRUT_P(txtrut.getText()+"-"+txtdv.getText());
            if(Personal.ayudaContraseña()){JOptionPane.showMessageDialog(rootPane, "Datos para recordar Contraseña:\n "+Personal.getAYUDACONTRASENA(), "Ayuda", WIDTH, null);}
            else{JOptionPane.showMessageDialog(rootPane,"El Rut Ingresado no Existe", "Ayuda", WIDTH, null);}
        }else{JOptionPane.showMessageDialog(rootPane,"Debe Ingresar un Rut Valido", "Ayuda", WIDTH, null);}
    }//GEN-LAST:event_lblayudaMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmIngreso().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Variables declaration">  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lblayuda;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lblicon2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtdv;
    private javax.swing.JTextField txtrut;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
    
    
}