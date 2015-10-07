/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Ireport;
import Modelo.OPAlter;
import Modelo.Personal;
import Modelo.Tienda;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;

/**
 *
 * @author Diego
 */
public class panelinformecliente extends javax.swing.JPanel {
private Ireport Ireport;
private Tienda Tienda;
private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form panelinformecliente
     */
    public panelinformecliente() {
        Ireport = new Ireport();
        Tienda = new Tienda();
        initComponents();
        txtrut.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        paneltiendas = new javax.swing.JPanel();
        lbltiendas = new javax.swing.JLabel();
        combotiendas = new javax.swing.JComboBox();
        panelagrupa = new javax.swing.JPanel();
        checkplacas = new javax.swing.JCheckBox();
        checkflex = new javax.swing.JCheckBox();
        checkpantalla = new javax.swing.JCheckBox();
        lblfalla = new javax.swing.JLabel();
        checkauricular = new javax.swing.JCheckBox();
        checklimpieza = new javax.swing.JCheckBox();
        checkdesbloqueo = new javax.swing.JCheckBox();
        checkotros = new javax.swing.JCheckBox();
        checkprocesando = new javax.swing.JCheckBox();
        checkingresado = new javax.swing.JCheckBox();
        checkentregado = new javax.swing.JCheckBox();
        checkterminado = new javax.swing.JCheckBox();
        lblestados = new javax.swing.JLabel();
        separadorincluye = new javax.swing.JSeparator();
        panelfechas = new javax.swing.JPanel();
        radioestemes1 = new javax.swing.JRadioButton();
        radioesteaño1 = new javax.swing.JRadioButton();
        radioentre1 = new javax.swing.JRadioButton();
        lbla = new javax.swing.JLabel();
        spinnerfechaini1 = new javax.swing.JSpinner();
        spinnerfechafin1 = new javax.swing.JSpinner();
        separadorfechas = new javax.swing.JSeparator();
        spinnerfechafin2 = new javax.swing.JSpinner();
        lbla1 = new javax.swing.JLabel();
        spinnerfechaini2 = new javax.swing.JSpinner();
        radioentre2 = new javax.swing.JRadioButton();
        radioesteaño2 = new javax.swing.JRadioButton();
        radioestemes2 = new javax.swing.JRadioButton();
        radiofechaingreso = new javax.swing.JRadioButton();
        radiofechaentrega = new javax.swing.JRadioButton();
        radiohoy1 = new javax.swing.JRadioButton();
        radiohoy2 = new javax.swing.JRadioButton();
        panelcliente = new javax.swing.JPanel();
        lblclientes = new javax.swing.JLabel();
        radioclienteunico = new javax.swing.JRadioButton();
        radioclientestienda = new javax.swing.JRadioButton();
        radioclientesmitienda = new javax.swing.JRadioButton();
        radioclientestodaslastiendas = new javax.swing.JRadioButton();
        txtrut = new javax.swing.JTextField();
        txtdv = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        paneltiendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbltiendas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbltiendas.setText("Tienda Para generar el Informe");

        combotiendas.setEnabled(false);

        javax.swing.GroupLayout paneltiendasLayout = new javax.swing.GroupLayout(paneltiendas);
        paneltiendas.setLayout(paneltiendasLayout);
        paneltiendasLayout.setHorizontalGroup(
            paneltiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltiendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneltiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltiendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combotiendas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneltiendasLayout.setVerticalGroup(
            paneltiendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltiendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltiendas)
                .addGap(18, 18, 18)
                .addComponent(combotiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelagrupa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        checkplacas.setSelected(true);
        checkplacas.setText("Cambio/Reparacion Placas");

        checkflex.setSelected(true);
        checkflex.setText("Cambio/Reparacion de Flex");

        checkpantalla.setSelected(true);
        checkpantalla.setText("Quiebre Pantalla");

        lblfalla.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblfalla.setText("<html><body>Seleccione Fallas<br>que se incluiran en el informe</body></html>");

        checkauricular.setSelected(true);
        checkauricular.setText("Cambio Auricular Microfono");

        checklimpieza.setSelected(true);
        checklimpieza.setText("Limpieza / Zulfurado / etc.");

        checkdesbloqueo.setSelected(true);
        checkdesbloqueo.setText("Desbloqueo");

        checkotros.setSelected(true);
        checkotros.setText("Otros");

        checkprocesando.setSelected(true);
        checkprocesando.setText("Procesando");

        checkingresado.setSelected(true);
        checkingresado.setText("Ingresado");

        checkentregado.setText("Entregado");

        checkterminado.setText("Terminado");

        lblestados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblestados.setText("<html><body>Seleccione Estados de la Orden<br>que se incluiran en el informe</body></html>");

        separadorincluye.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout panelagrupaLayout = new javax.swing.GroupLayout(panelagrupa);
        panelagrupa.setLayout(panelagrupaLayout);
        panelagrupaLayout.setHorizontalGroup(
            panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagrupaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkotros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkdesbloqueo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblfalla)
                    .addComponent(checkpantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkflex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkauricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checklimpieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkplacas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(separadorincluye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkprocesando)
                    .addComponent(checkterminado)
                    .addComponent(checkingresado)
                    .addComponent(checkentregado)
                    .addComponent(lblestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        panelagrupaLayout.setVerticalGroup(
            panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelagrupaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelagrupaLayout.createSequentialGroup()
                        .addComponent(lblestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkingresado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkprocesando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkterminado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkentregado))
                    .addGroup(panelagrupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(separadorincluye)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelagrupaLayout.createSequentialGroup()
                            .addComponent(lblfalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkpantalla)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkflex)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkplacas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkauricular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checklimpieza)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkdesbloqueo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkotros))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelfechas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup3.add(radioestemes1);
        radioestemes1.setSelected(true);
        radioestemes1.setText("Este Mes");

        buttonGroup3.add(radioesteaño1);
        radioesteaño1.setText("Este Año");

        buttonGroup3.add(radioentre1);
        radioentre1.setText("Entre");
        radioentre1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioentre1ItemStateChanged(evt);
            }
        });

        lbla.setText("A");

        spinnerfechaini1.setModel(new javax.swing.SpinnerDateModel());
        spinnerfechaini1.setEnabled(false);

        spinnerfechafin1.setModel(new javax.swing.SpinnerDateModel());
        spinnerfechafin1.setEnabled(false);

        separadorfechas.setOrientation(javax.swing.SwingConstants.VERTICAL);

        spinnerfechafin2.setModel(new javax.swing.SpinnerDateModel());
        spinnerfechafin2.setEnabled(false);

        lbla1.setText("A");

        spinnerfechaini2.setModel(new javax.swing.SpinnerDateModel());
        spinnerfechaini2.setEnabled(false);

        buttonGroup4.add(radioentre2);
        radioentre2.setText("Entre");
        radioentre2.setEnabled(false);
        radioentre2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioentre2ItemStateChanged(evt);
            }
        });

        buttonGroup4.add(radioesteaño2);
        radioesteaño2.setText("Este Año");
        radioesteaño2.setEnabled(false);

        buttonGroup4.add(radioestemes2);
        radioestemes2.setSelected(true);
        radioestemes2.setText("Este Mes");
        radioestemes2.setEnabled(false);

        buttonGroup2.add(radiofechaingreso);
        radiofechaingreso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiofechaingreso.setSelected(true);
        radiofechaingreso.setText("Filtro por fecha de Ingreso");
        radiofechaingreso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiofechaingresoItemStateChanged(evt);
            }
        });

        buttonGroup2.add(radiofechaentrega);
        radiofechaentrega.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiofechaentrega.setText("Filtro por fecha de Entrega");
        radiofechaentrega.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiofechaentregaItemStateChanged(evt);
            }
        });

        buttonGroup3.add(radiohoy1);
        radiohoy1.setText("Hoy");

        buttonGroup4.add(radiohoy2);
        radiohoy2.setText("Hoy");
        radiohoy2.setEnabled(false);

        javax.swing.GroupLayout panelfechasLayout = new javax.swing.GroupLayout(panelfechas);
        panelfechas.setLayout(panelfechasLayout);
        panelfechasLayout.setHorizontalGroup(
            panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radiofechaingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelfechasLayout.createSequentialGroup()
                        .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radioestemes1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioesteaño1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelfechasLayout.createSequentialGroup()
                                .addComponent(radioentre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerfechaini1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radiohoy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerfechafin1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addComponent(separadorfechas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radiofechaentrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelfechasLayout.createSequentialGroup()
                        .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(radioestemes2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioesteaño2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelfechasLayout.createSequentialGroup()
                                .addComponent(radioentre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerfechaini2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfechasLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lbla1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerfechafin2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(panelfechasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radiohoy2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        panelfechasLayout.setVerticalGroup(
            panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separadorfechas)
                    .addGroup(panelfechasLayout.createSequentialGroup()
                        .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfechasLayout.createSequentialGroup()
                                .addComponent(radiofechaingreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioestemes1)
                                    .addComponent(radiohoy1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioesteaño1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioentre1)
                                    .addComponent(lbla)
                                    .addComponent(spinnerfechaini1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerfechafin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelfechasLayout.createSequentialGroup()
                                .addComponent(radiofechaentrega)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioestemes2)
                                    .addComponent(radiohoy2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioesteaño2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelfechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioentre2)
                                    .addComponent(lbla1)
                                    .addComponent(spinnerfechaini2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerfechafin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblclientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblclientes.setText("<html><body>Seleccione Clientes<br>que se incluiran en el informe</body></html>");

        buttonGroup1.add(radioclienteunico);
        radioclienteunico.setText("Cliente Unico");
        radioclienteunico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioclienteunicoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radioclientestienda);
        radioclientestienda.setText("Clientes Tienda");
        radioclientestienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioclientestiendaItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radioclientesmitienda);
        radioclientesmitienda.setSelected(true);
        radioclientesmitienda.setText("Clientes mi Tienda");
        radioclientesmitienda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioclientesmitiendaItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radioclientestodaslastiendas);
        radioclientestodaslastiendas.setText("Clientes todas las Tiendas");
        radioclientestodaslastiendas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioclientestodaslastiendasItemStateChanged(evt);
            }
        });

        txtrut.setEditable(false);
        txtrut.setEnabled(false);
        txtrut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtrutFocusGained(evt);
            }
        });

        txtdv.setEditable(false);
        txtdv.setEnabled(false);
        txtdv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdvKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelclienteLayout = new javax.swing.GroupLayout(panelcliente);
        panelcliente.setLayout(panelclienteLayout);
        panelclienteLayout.setHorizontalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelclienteLayout.createSequentialGroup()
                        .addComponent(lblclientes, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addGap(116, 116, 116))
                    .addGroup(panelclienteLayout.createSequentialGroup()
                        .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(radioclientestodaslastiendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioclientesmitienda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioclientestienda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelclienteLayout.createSequentialGroup()
                                .addComponent(radioclienteunico, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelclienteLayout.setVerticalGroup(
            panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioclienteunico)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioclientestienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioclientesmitienda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioclientestodaslastiendas)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelfechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(paneltiendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelagrupa, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneltiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelagrupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelfechas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void radioentre1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioentre1ItemStateChanged
        if(evt.getStateChange()==1){
            spinnerfechaini1.setEnabled(true);
            spinnerfechafin1.setEnabled(true);
        }else{
            spinnerfechaini1.setEnabled(false);
            spinnerfechafin1.setEnabled(false);
        }
    }//GEN-LAST:event_radioentre1ItemStateChanged

    private void radioentre2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioentre2ItemStateChanged
        if(evt.getStateChange()==1){
            spinnerfechaini2.setEnabled(true);
            spinnerfechafin2.setEnabled(true);
        }else{
            spinnerfechaini2.setEnabled(false);
            spinnerfechafin2.setEnabled(false);
        }
    }//GEN-LAST:event_radioentre2ItemStateChanged

    private void radiofechaingresoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiofechaingresoItemStateChanged
        if(evt.getStateChange()==1){
            radioestemes1.setEnabled(true);
            radioesteaño1.setEnabled(true);
            radioentre1.setEnabled(true);
            radiohoy1.setEnabled(true);
            spinnerfechaini2.setEnabled(false);
            spinnerfechafin2.setEnabled(false);
            radioestemes2.setEnabled(false);
            radioesteaño2.setEnabled(false);
            radioentre2.setEnabled(false);
            radiohoy2.setEnabled(false);
            if(radioentre1.isSelected()){
                spinnerfechaini1.setEnabled(true);
                spinnerfechafin1.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radiofechaingresoItemStateChanged

    private void radiofechaentregaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiofechaentregaItemStateChanged
        if(evt.getStateChange()==1){
            radioestemes2.setEnabled(true);
            radioesteaño2.setEnabled(true);
            radioentre2.setEnabled(true);
            radiohoy2.setEnabled(true);
            spinnerfechaini1.setEnabled(false);
            spinnerfechafin1.setEnabled(false);
            radioestemes1.setEnabled(false);
            radioesteaño1.setEnabled(false);
            radioentre1.setEnabled(false);
            radiohoy1.setEnabled(false);
            if(radioentre2.isSelected()){
                spinnerfechaini2.setEnabled(true);
                spinnerfechafin2.setEnabled(true);
            }
        }
    }//GEN-LAST:event_radiofechaentregaItemStateChanged

    private void radioclientestodaslastiendasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioclientestodaslastiendasItemStateChanged
        if(evt.getStateChange()==1){
            txtrut.setEnabled(false);
            txtdv.setEnabled(false);
            combotiendas.setEnabled(false);
        }
    }//GEN-LAST:event_radioclientestodaslastiendasItemStateChanged

    private void radioclienteunicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioclienteunicoItemStateChanged
        if(evt.getStateChange()==1){
            txtrut.setEnabled(true);
            txtdv.setEnabled(true);
            combotiendas.setEnabled(false);
        }
    }//GEN-LAST:event_radioclienteunicoItemStateChanged

    private void radioclientestiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioclientestiendaItemStateChanged
        if(evt.getStateChange()==1){
            txtrut.setEnabled(false);
            txtdv.setEnabled(false);
            combotiendas.setEnabled(true);
        }
    }//GEN-LAST:event_radioclientestiendaItemStateChanged

    private void radioclientesmitiendaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioclientesmitiendaItemStateChanged
        if(evt.getStateChange()==1){
            txtrut.setEnabled(false);
            txtdv.setEnabled(false);
            combotiendas.setEnabled(false);
        }
    }//GEN-LAST:event_radioclientesmitiendaItemStateChanged

    private void txtrutFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtrutFocusGained
        txtdv.requestFocus();
    }//GEN-LAST:event_txtrutFocusGained

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
    
    public void mostrarInforme(){
        String FALLA1 = "", FALLA2 = "", FALLA3 = "", FALLA4 = "", FALLA5 = "", FALLA6 = "", FALLA7 = "";
        String ESTADO1 = "", ESTADO2 = "", ESTADO3 = "", ESTADO4 = "";
        String FECHAINI1 = "", FECHAFIN1 = "", FECHAINI2 = "", FECHAFIN2 = "";
        String COD_TIENDA = "";
        String FECHA = "";
        String RUT_C = "RUT_C";
        Integer MI_COD_TIENDA = Personal.getCODTIENDA();
        if(checkpantalla.isSelected()){FALLA1=checkpantalla.getText();}
        if(checkflex.isSelected()){FALLA2=checkflex.getText();}
        if(checkplacas.isSelected()){FALLA3=checkplacas.getText();}
        if(checkauricular.isSelected()){FALLA4=checkauricular.getText();}
        if(checklimpieza.isSelected()){FALLA5=checklimpieza.getText();}
        if(checkdesbloqueo.isSelected()){FALLA6=checkdesbloqueo.getText();}
        if(checkotros.isSelected()){FALLA7=checkotros.getText();}
        if(checkingresado.isSelected()){ESTADO1=checkingresado.getText();}
        if(checkprocesando.isSelected()){ESTADO2=checkprocesando.getText();}
        if(checkterminado.isSelected()){ESTADO3=checkterminado.getText();}
        if(checkentregado.isSelected()){ESTADO4=checkentregado.getText();}
        if(radiofechaingreso.isSelected()){
            FECHA="FECHA DE INGRESO";
            FECHAFIN1=df.format(new Date());
            if(radioestemes1.isSelected()){
                FECHAINI1=df.format(OPAlter.restamesano(new Date(), "mes", -1));
            }
            if(radioesteaño1.isSelected()){
                FECHAINI1=df.format(OPAlter.restamesano(new Date(), "año", -1));
            }
            if(radiohoy1.isSelected()){
                FECHAINI1=df.format(OPAlter.restamesano(new Date(), "dia", 0));
            }
            if(radioentre1.isSelected()){
                    FECHAINI1=df.format(spinnerfechaini1.getModel().getValue());
                    FECHAFIN1=df.format(spinnerfechafin1.getModel().getValue());
            }
        }
        if(radiofechaentrega.isSelected()){
            FECHA="FECHA DE ENTREGA";
            FECHAFIN2=df.format(new Date());
            if(radioestemes2.isSelected()){
                FECHAINI2=df.format(OPAlter.restamesano(new Date(), "mes", -1));
            }
            if(radioesteaño2.isSelected()){
                FECHAINI2=df.format(OPAlter.restamesano(new Date(), "año", -1));
            }
            if(radiohoy2.isSelected()){
                FECHAINI2=df.format(OPAlter.restamesano(new Date(), "dia", 0));
            }
            if(radioentre2.isSelected()){
                    FECHAINI2=df.format(spinnerfechaini2.getModel().getValue());
                    FECHAFIN2=df.format(spinnerfechafin2.getModel().getValue());                
            }
        }
        if(radioclienteunico.isSelected()&&OPAlter.validarut(txtrut.getText(), txtdv.getText())){
            RUT_C = txtrut.getText()+"-"+txtdv.getText();
            radioclienteunico.setForeground(Color.black);
            COD_TIENDA="";
        }
        if(radioclientestienda.isSelected()&&combotiendas.getSelectedIndex()!=0){
            RUT_C = "";
            COD_TIENDA=String.valueOf(((Tienda)combotiendas.getSelectedItem()).getCODTIENDA());
        }
        if(radioclientesmitienda.isSelected()){
            RUT_C="";
            COD_TIENDA=String.valueOf(Personal.getCODTIENDA());
        }
        if(radioclientestodaslastiendas.isSelected()){
            RUT_C="";
            COD_TIENDA="";
        }
        Ireport.informeClientes(FALLA1, FALLA2, FALLA3, FALLA4, FALLA5, FALLA6, FALLA7, ESTADO1, ESTADO2, ESTADO3, ESTADO4, FECHAINI1, FECHAFIN1, FECHAINI2, FECHAFIN2, COD_TIENDA, FECHA, RUT_C, MI_COD_TIENDA).setVisible(true);
    }
    
    public final void limpiar(){
        JSpinner.DateEditor editor1= new JSpinner.DateEditor(spinnerfechaini1, "dd/MM/yyyy");
        JFormattedTextField ftf1 = editor1.getTextField();
        ftf1.setEditable(false);
        spinnerfechaini1.setEditor(editor1);
        JSpinner.DateEditor editor2= new JSpinner.DateEditor(spinnerfechafin1, "dd/MM/yyyy");
        JFormattedTextField ftf2 = editor2.getTextField();
        ftf2.setEditable(false);
        spinnerfechafin1.setEditor(editor2);
        JSpinner.DateEditor editor3= new JSpinner.DateEditor(spinnerfechaini2, "dd/MM/yyyy");
        JFormattedTextField ftf3 = editor3.getTextField();
        ftf3.setEditable(false);
        spinnerfechaini2.setEditor(editor3);
        JSpinner.DateEditor editor4= new JSpinner.DateEditor(spinnerfechafin2, "dd/MM/yyyy");
        JFormattedTextField ftf4 = editor4.getTextField();
        ftf4.setEditable(false);
        spinnerfechafin2.setEditor(editor4);
        combotiendas.setModel(Tienda.comboTiendas());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox checkauricular;
    private javax.swing.JCheckBox checkdesbloqueo;
    private javax.swing.JCheckBox checkentregado;
    private javax.swing.JCheckBox checkflex;
    private javax.swing.JCheckBox checkingresado;
    private javax.swing.JCheckBox checklimpieza;
    private javax.swing.JCheckBox checkotros;
    private javax.swing.JCheckBox checkpantalla;
    private javax.swing.JCheckBox checkplacas;
    private javax.swing.JCheckBox checkprocesando;
    private javax.swing.JCheckBox checkterminado;
    private javax.swing.JComboBox combotiendas;
    private javax.swing.JLabel lbla;
    private javax.swing.JLabel lbla1;
    private javax.swing.JLabel lblclientes;
    private javax.swing.JLabel lblestados;
    private javax.swing.JLabel lblfalla;
    private javax.swing.JLabel lbltiendas;
    private javax.swing.JPanel panelagrupa;
    private javax.swing.JPanel panelcliente;
    private javax.swing.JPanel panelfechas;
    private javax.swing.JPanel paneltiendas;
    private javax.swing.JRadioButton radioclientesmitienda;
    private javax.swing.JRadioButton radioclientestienda;
    private javax.swing.JRadioButton radioclientestodaslastiendas;
    private javax.swing.JRadioButton radioclienteunico;
    private javax.swing.JRadioButton radioentre1;
    private javax.swing.JRadioButton radioentre2;
    private javax.swing.JRadioButton radioesteaño1;
    private javax.swing.JRadioButton radioesteaño2;
    private javax.swing.JRadioButton radioestemes1;
    private javax.swing.JRadioButton radioestemes2;
    private javax.swing.JRadioButton radiofechaentrega;
    private javax.swing.JRadioButton radiofechaingreso;
    private javax.swing.JRadioButton radiohoy1;
    private javax.swing.JRadioButton radiohoy2;
    private javax.swing.JSeparator separadorfechas;
    private javax.swing.JSeparator separadorincluye;
    private javax.swing.JSpinner spinnerfechafin1;
    private javax.swing.JSpinner spinnerfechafin2;
    private javax.swing.JSpinner spinnerfechaini1;
    private javax.swing.JSpinner spinnerfechaini2;
    private javax.swing.JTextField txtdv;
    private javax.swing.JTextField txtrut;
    // End of variables declaration//GEN-END:variables
}