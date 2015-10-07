/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Ireport;
import Modelo.OrdenDeTrabajo;
import Modelo.Personal;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class FrmMenuAdministrador extends javax.swing.JFrame {
private repintado repintado=new repintado();
private OrdenDeTrabajo Ordendetrabajo = new OrdenDeTrabajo();
private int menu=0;
private Ireport ireport = new Ireport();
private panelmodificarorden panelmodificarorden = new panelmodificarorden();
private panelagregaorden panelagregaorden = new panelagregaorden();
private panelagregapersonal panelagregapersonal = new panelagregapersonal();
private panelagregatienda panelagregatienda = new panelagregatienda();
private panelconfiguracion panelconfiguracion = new panelconfiguracion();
private panelmodificarmisdatos panelmodificarmisdatos = new panelmodificarmisdatos();
private panelmodificarcliente panelmodificarcliente = new panelmodificarcliente();
private panelmodificarequipo panelmodificarequipo = new panelmodificarequipo();
private panelmodificarpersonal panelmodificarpersonal = new panelmodificarpersonal();
private panelmodificartienda panelmodificartienda = new panelmodificartienda();
private panelinformecliente panelinformecliente = new panelinformecliente();
private panelinformepersonal panelinformepersonal = new panelinformepersonal();
private panelinformetienda panelinformetienda = new panelinformetienda();
private panelinformeequipos panelinformeequipos = new panelinformeequipos();
private panelinformerepuestos panelinformerepuestos = new panelinformerepuestos();
private panelentregaorden panelentregaorden = new panelentregaorden();

    public FrmMenuAdministrador() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Vista/icon/logo_icon.png")).getImage();
        setIconImage(icon);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
        this.setLocationRelativeTo(null);
        limpiar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnaccion1 = new javax.swing.JButton();
        btnaccion2 = new javax.swing.JButton();
        btnaccion3 = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lblsubtitulo = new javax.swing.JLabel();
        panelprincipal = new javax.swing.JPanel();
        scrolltableordenes = new javax.swing.JScrollPane();
        tableordenes = new javax.swing.JTable();
        lbltitulo = new javax.swing.JLabel();
        lblicono = new javax.swing.JLabel();
        btnaccion4 = new javax.swing.JButton();
        menubarra = new javax.swing.JMenuBar();
        menuorden = new javax.swing.JMenu();
        menunuevaorden = new javax.swing.JMenu();
        menumodificarorden = new javax.swing.JMenu();
        menuentregaorden = new javax.swing.JMenu();
        menulistaordenes = new javax.swing.JMenu();
        menupersonal = new javax.swing.JMenu();
        menumodificarcolores = new javax.swing.JMenu();
        menumodificarmisdatos = new javax.swing.JMenu();
        menumodificarpersonal = new javax.swing.JMenu();
        menuagregarpersonal = new javax.swing.JMenu();
        menucerrarsesion = new javax.swing.JMenu();
        menucliente = new javax.swing.JMenu();
        menuagregamcliente = new javax.swing.JMenu();
        menuequipo = new javax.swing.JMenu();
        menuagregamequipo = new javax.swing.JMenu();
        menutienda = new javax.swing.JMenu();
        menumodificatienda = new javax.swing.JMenu();
        menuagregatienda = new javax.swing.JMenu();
        menuinforme = new javax.swing.JMenu();
        menuinformecliente = new javax.swing.JMenu();
        menuinformepersonal = new javax.swing.JMenu();
        menuinformetienda = new javax.swing.JMenu();
        menuinformerepuestos = new javax.swing.JMenu();
        menuinformeequipos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(959, 630));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555595_left_circular.png"))); // NOI18N
        btnaccion1.setText("Ir a Orden");
        btnaccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccion1ActionPerformed(evt);
            }
        });

        btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png"))); // NOI18N
        btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        btnaccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccion2ActionPerformed(evt);
            }
        });

        btnaccion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccion3ActionPerformed(evt);
            }
        });

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407556164_close_window.png"))); // NOI18N
        btnsalir.setText("      SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lblsubtitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblsubtitulo.setText("Bienvenido: ");

        panelprincipal.setBackground(new java.awt.Color(153, 153, 153));
        panelprincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tableordenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod_Orden", "Tecnico", "Marca", "Modelo", "Falla", "Fecha Ingreso", "Fecha Entrega", "Estado Orden", "Resto Dias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrolltableordenes.setViewportView(tableordenes);
        tableordenes.getColumnModel().getColumn(0).setMaxWidth(70);
        tableordenes.getColumnModel().getColumn(5).setMaxWidth(65);
        tableordenes.getColumnModel().getColumn(6).setMaxWidth(65);
        tableordenes.getColumnModel().getColumn(7).setMaxWidth(65);
        tableordenes.getColumnModel().getColumn(8).setMaxWidth(35);

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltableordenes, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltableordenes)
                .addContainerGap())
        );

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("MENU ADMINISTRADOR");

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555556_services.png"))); // NOI18N

        btnaccion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccion4ActionPerformed(evt);
            }
        });

        menuorden.setText("[Orden De Trabajo]");

        menunuevaorden.setText("Nueva Orden");
        menunuevaorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menunuevaordenMousePressed(evt);
            }
        });
        menuorden.add(menunuevaorden);

        menumodificarorden.setText("Modificar o Eliminar Orden");
        menumodificarorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menumodificarordenMousePressed(evt);
            }
        });
        menuorden.add(menumodificarorden);

        menuentregaorden.setText("Entregar Orden");
        menuentregaorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuentregaordenMousePressed(evt);
            }
        });
        menuorden.add(menuentregaorden);

        menulistaordenes.setText("Lista Ordenes");
        menulistaordenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menulistaordenesMousePressed(evt);
            }
        });
        menuorden.add(menulistaordenes);

        menubarra.add(menuorden);

        menupersonal.setText("[Personal]");

        menumodificarcolores.setText("Modificar mis Colores y Titulo");
        menumodificarcolores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menumodificarcoloresMousePressed(evt);
            }
        });
        menupersonal.add(menumodificarcolores);

        menumodificarmisdatos.setText("Modificar mis Datos");
        menumodificarmisdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menumodificarmisdatosMousePressed(evt);
            }
        });
        menupersonal.add(menumodificarmisdatos);

        menumodificarpersonal.setText("Modificar Personal Tecnico");
        menumodificarpersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menumodificarpersonalMousePressed(evt);
            }
        });
        menupersonal.add(menumodificarpersonal);

        menuagregarpersonal.setText("Agregar Personal");
        menuagregarpersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuagregarpersonalMousePressed(evt);
            }
        });
        menupersonal.add(menuagregarpersonal);

        menucerrarsesion.setText("Cerrar Sesion");
        menucerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menucerrarsesionMousePressed(evt);
            }
        });
        menupersonal.add(menucerrarsesion);

        menubarra.add(menupersonal);

        menucliente.setText("[Cliente]");

        menuagregamcliente.setText("Modificar Agregar Cliente");
        menuagregamcliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuagregamclienteMousePressed(evt);
            }
        });
        menucliente.add(menuagregamcliente);

        menubarra.add(menucliente);

        menuequipo.setText("[Equipo]");

        menuagregamequipo.setText("Modificar Agregar Equipo");
        menuagregamequipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuagregamequipoMousePressed(evt);
            }
        });
        menuequipo.add(menuagregamequipo);

        menubarra.add(menuequipo);

        menutienda.setText("[Tienda]");

        menumodificatienda.setText("Modificar Datos Tienda");
        menumodificatienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menumodificatiendaMousePressed(evt);
            }
        });
        menutienda.add(menumodificatienda);

        menuagregatienda.setText("Agregar Tienda");
        menuagregatienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuagregatiendaMousePressed(evt);
            }
        });
        menutienda.add(menuagregatienda);

        menubarra.add(menutienda);

        menuinforme.setText("[Informe]");

        menuinformecliente.setText("Informe Cliente");
        menuinformecliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuinformeclienteMousePressed(evt);
            }
        });
        menuinforme.add(menuinformecliente);

        menuinformepersonal.setText("Informe Personal");
        menuinformepersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuinformepersonalMousePressed(evt);
            }
        });
        menuinforme.add(menuinformepersonal);

        menuinformetienda.setText("Informe Tienda");
        menuinformetienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuinformetiendaMousePressed(evt);
            }
        });
        menuinforme.add(menuinformetienda);

        menuinformerepuestos.setText("Informe Repuestos");
        menuinformerepuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuinformerepuestosMousePressed(evt);
            }
        });
        menuinforme.add(menuinformerepuestos);

        menuinformeequipos.setText("Informe Equipos");
        menuinformeequipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuinformeequiposMousePressed(evt);
            }
        });
        menuinforme.add(menuinformeequipos);

        menubarra.add(menuinforme);

        setJMenuBar(menubarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(btnaccion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaccion2)
                            .addComponent(btnaccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaccion4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblsubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbltitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblicono)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbltitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblsubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblicono)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnaccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaccion3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccion1ActionPerformed
        switch (menu){
            case 0:
                if(tableordenes.getSelectedRow()>=0 && tableordenes.getValueAt(tableordenes.getSelectedRow(), 0)!=null){
                    menu=2;
                    this.lblsubtitulo.setText("Modificar Orden");
                    this.panelprincipal.removeAll();
                    this.panelmodificarorden.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                    this.panelprincipal.add(panelmodificarorden);
                    this.panelprincipal.updateUI();
                    this.panelmodificarorden.getComboguia().setModel(new javax.swing.DefaultComboBoxModel(new String[] {String.valueOf(tableordenes.getValueAt(tableordenes.getSelectedRow(), 0))}));
                    this.panelmodificarorden.getComboguia().requestFocus();
                    this.panelmodificarorden.getComboguia().transferFocus();
                    this.btnaccion1.setText("Modificar");
                    this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
                    this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
                    this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
                    this.btnaccion3.setText("Eliminar");
                    this.btnaccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555690_full_trash.png")));
                    this.btnaccion4.setText("Ver Orden");
                    this.btnaccion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555595_left_circular.png")));
                    this.btnaccion1.setVisible(true);
                    this.btnaccion2.setVisible(true);
                    this.btnaccion3.setVisible(true);
                    this.btnaccion4.setVisible(true);
                }
                break;
            //agregar cliente, equipo y orden
            case 1:
                panelagregaorden.agregar();
                break;
            //modificar y eliminar orden
            case 2:
                panelmodificarorden.modificar();
                break;
            //modificar mis colores y titulo
            case 3:
                panelentregaorden.entrega();
                break;
            //modificar mis datos
            case 4:
                panelconfiguracion.modificar();
                limpiar();
                break;
            //modificar personal tecnico
            case 5:
                panelmodificarmisdatos.modificar();
                break;
            //agregar personal
            case 6:
                panelmodificarpersonal.modificar();
                break;
            //modificar Agregar datos cliente
            case 7:
                panelagregapersonal.agregar();
                break;
            //modificar Agregar datos equipo
            case 8:
                break;
            //modificar datos tienda
            case 9:
                panelmodificarcliente.agregarmodificar();
                break;
            //agregar tienda
            case 10:
                panelmodificarequipo.agregarmodificar();
                break;
            case 11:
                panelmodificartienda.modificar();
                break;
            case 12:
                panelagregatienda.agregar();
                break;
            case 13:
                panelinformecliente.mostrarInforme();
                break;
            case 14:
                panelinformepersonal.mostrarInforme();
                break;
            case 15:
                panelinformetienda.mostrarInforme();
                break;
            case 16:
                panelinformerepuestos.mostrarInforme();
                
                break;
            case 17:
                panelinformeequipos.mostrarInforme();
                break;
        }
    }//GEN-LAST:event_btnaccion1ActionPerformed
    private void btnaccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccion2ActionPerformed
        switch (menu){
            case 0:
                limpiar();
                break;
            //agregar cliente, equipo y orden
            case 1:
                panelagregaorden.limpiar();
                break;
            //modificar y eliminar orden
            case 2:
                panelmodificarorden.limpiar();
                break;
            //modificar mis colores y titulo
            case 3:
                panelentregaorden.limpiar();
                break;
            //modificar mis datos
            case 4:
                panelconfiguracion.limpiar();
                break;
            //modificar personal tecnico
            case 5:
                panelmodificarmisdatos.limpiar();
                break;
            //agregar personal
            case 6:
                panelmodificarpersonal.limpiar();
                break;
            //modificar Agregar datos cliente
            case 7:
                panelagregapersonal.limpiar();
                break;
            //modificar Agregar datos equipo
            case 8:
                break;
            //modificar datos tienda
            case 9:
                panelmodificarcliente.limpiar();
                break;
            //agregar tienda
            case 10:
                panelmodificarequipo.limpiar();
                break;
            case 11:
                panelmodificartienda.limpiar();
                break;
            case 12:
                panelagregatienda.limpiar();
                break;
            case 13:
                panelinformecliente.limpiar();
                break;
            case 14:
                panelinformepersonal.limpiar();
                break;
            case 15:
                panelinformetienda.limpiar();
                break;
            case 16:
                panelinformerepuestos.limpiar();
                break;
            case 17:
                break;
        }
    }//GEN-LAST:event_btnaccion2ActionPerformed
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        this.repintado.setBounds(0, 0, this.getWidth(), 70);
        switch (menu){
            //agregar cliente, equipo y orden
            case 1:
                this.panelagregaorden.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            //modificar y eliminar orden
            case 2:
                this.panelmodificarorden.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            //modificar mis colores y titulo
            case 3:
                this.panelentregaorden.setBounds((panelprincipal.getWidth()/2)-(508/2), (panelprincipal.getHeight()/2)-(270/2), 508, 270);
                break;
            //modificar mis datos
            case 4:
                this.panelconfiguracion.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            //modificar personal tecnico
            case 5:
                this.panelmodificarmisdatos.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            //agregar personal
            case 6:
                this.panelmodificarpersonal.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            //modificar Agregar datos cliente
            case 7:
                this.panelagregapersonal.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            //modificar Agregar datos equipo
            case 8:
                break;
            //modificar datos tienda
            case 9:
                this.panelmodificarcliente.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            //agregar tienda
            case 10:
                this.panelmodificarequipo.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            case 11:
                this.panelmodificartienda.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            case 12:
                this.panelagregatienda.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
            case 13:
                this.panelinformecliente.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            case 14:
                this.panelinformepersonal.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            case 15:
                this.panelinformetienda.setBounds((panelprincipal.getWidth()/2)-(753/2), (panelprincipal.getHeight()/2)-(459/2), 753, 459);
                break;
            case 16:
                this.panelinformerepuestos.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
                break;
            case 17:
                this.panelinformeequipos.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
                break;
        }
        
    }//GEN-LAST:event_formComponentResized
    private void menunuevaordenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menunuevaordenMousePressed
        menu=1;
        this.lblsubtitulo.setText("Agregar Nueva Orden");
        this.panelprincipal.removeAll();
        this.panelagregaorden.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelagregaorden);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Crear");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555242_add_file.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion3.setText("Ultima Orden");
        this.btnaccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555595_left_circular.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(true);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menunuevaordenMousePressed
    private void menumodificarordenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarordenMousePressed
        menu=2;
        this.lblsubtitulo.setText("Modificar Orden");
        this.panelprincipal.removeAll();
        this.panelmodificarorden.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelmodificarorden);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Modificar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion3.setText("Eliminar");
        this.btnaccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555690_full_trash.png")));
        this.btnaccion4.setText("Ver Orden");
        this.btnaccion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555595_left_circular.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(true);
        this.btnaccion4.setVisible(true);
    }//GEN-LAST:event_menumodificarordenMousePressed
    private void menumodificarcoloresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarcoloresMousePressed
        menu=4;
        this.lblsubtitulo.setText("Modificar Opciones");
        this.panelprincipal.removeAll();
        this.panelconfiguracion.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelconfiguracion);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Modificar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407556194_hammer.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menumodificarcoloresMousePressed
    private void menumodificarmisdatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarmisdatosMousePressed
        menu=5;
        this.lblsubtitulo.setText("Modificar Mis Datos");
        this.panelprincipal.removeAll();
        this.panelmodificarmisdatos.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelmodificarmisdatos);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Modificar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407556194_hammer.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menumodificarmisdatosMousePressed
    private void menumodificarpersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarpersonalMousePressed
        menu=6;
        this.lblsubtitulo.setText("Modificar Personal");
        this.panelprincipal.removeAll();
        this.panelmodificarpersonal.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelmodificarpersonal);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Modificar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menumodificarpersonalMousePressed
    private void menuagregarpersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuagregarpersonalMousePressed
        menu=7;
        this.lblsubtitulo.setText("Agregar Nuevo Personal");
        this.panelprincipal.removeAll();
        this.panelagregapersonal.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelagregapersonal);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Agregar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555242_add_file.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuagregarpersonalMousePressed
    private void menuagregamclienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuagregamclienteMousePressed
        menu=9;
        this.lblsubtitulo.setText("Modificar / Agregar Cliente");
        this.panelprincipal.removeAll();
        this.panelmodificarcliente.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelmodificarcliente);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Agregar/Editar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555242_add_file.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuagregamclienteMousePressed
    private void menuagregamequipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuagregamequipoMousePressed
        menu=10;
        this.lblsubtitulo.setText("Modificar / Agregar Equipo");
        this.panelprincipal.removeAll();
        this.panelmodificarequipo.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelmodificarequipo);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Agregar/Editar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555242_add_file.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuagregamequipoMousePressed
    private void menumodificatiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificatiendaMousePressed
        menu=11;
        this.lblsubtitulo.setText("Modificar Tienda");
        this.panelprincipal.removeAll();
        this.panelmodificartienda.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelmodificartienda);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Modificar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menumodificatiendaMousePressed
    private void menuagregatiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuagregatiendaMousePressed
        menu=12;
        this.lblsubtitulo.setText("Agregar Nueva Tienda");
        this.panelprincipal.removeAll();
        this.panelagregatienda.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelagregatienda);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Crear");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555242_add_file.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuagregatiendaMousePressed
    private void btnaccion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccion3ActionPerformed
        switch (menu){
            //agregar cliente, equipo y orden
            case 1:
                ireport.crearOrden().setVisible(true);
                break;
            //modificar y eliminar orden
            case 2:
                panelmodificarorden.eliminar();
                break;
            //modificar mis colores y titulo
            case 3:
                break;
            //modificar mis datos
            case 4:
                break;
            //modificar personal tecnico
            case 5:
                break;
            //agregar personal
            case 6:
                break;
            //modificar Agregar datos cliente
            case 7:
                break;
            //modificar Agregar datos equipo
            case 8:
                break;
            //modificar datos tienda
            case 9:
                break;
            //agregar tienda
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                panelinformerepuestos.actualizarestado();
                break;
            case 17:
                break;
        }
        
    }//GEN-LAST:event_btnaccion3ActionPerformed
    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed
    private void menuinformeclienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuinformeclienteMousePressed
        menu=13;
        this.lblsubtitulo.setText("Infome Clientes");
        this.panelprincipal.removeAll();
        this.panelinformecliente.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelinformecliente);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Generar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555711_statistics.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuinformeclienteMousePressed
    private void menuinformepersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuinformepersonalMousePressed
        menu=14;
        this.lblsubtitulo.setText("Informe Personal");
        this.panelprincipal.removeAll();
        this.panelinformepersonal.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelinformepersonal);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Generar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555711_statistics.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuinformepersonalMousePressed
    private void menuinformetiendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuinformetiendaMousePressed
        menu=15;
        this.lblsubtitulo.setText("Informe Tienda");
        this.panelprincipal.removeAll();
        this.panelinformetienda.setBounds((panelprincipal.getWidth()/2)-(753/2), (panelprincipal.getHeight()/2)-(459/2), 753, 459);
        this.panelprincipal.add(panelinformetienda);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Generar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555711_statistics.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuinformetiendaMousePressed
    private void menucerrarsesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucerrarsesionMousePressed
        menu = 8;
        new FrmIngreso().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menucerrarsesionMousePressed
    private void menuinformerepuestosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuinformerepuestosMousePressed
        menu=16;
        this.lblsubtitulo.setText("Informe Repuestos");
        this.panelprincipal.removeAll();
        this.panelinformerepuestos.setBounds((panelprincipal.getWidth()/2)-(762/2), (panelprincipal.getHeight()/2)-(473/2), 762, 473);
        this.panelprincipal.add(panelinformerepuestos);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Generar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555711_statistics.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion3.setText("<html><body>Ingresar<br>Datos</body></html>");
        this.btnaccion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(true);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuinformerepuestosMousePressed
    private void menuinformeequiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuinformeequiposMousePressed
        menu=17;
        this.lblsubtitulo.setText("Informe Equipo");
        this.panelprincipal.removeAll();
        this.panelinformeequipos.setBounds((panelprincipal.getWidth()/2)-(500/2), (panelprincipal.getHeight()/2)-(270/2), 500, 270);
        this.panelprincipal.add(panelinformeequipos);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Generar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555711_statistics.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(false);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuinformeequiposMousePressed
    private void btnaccion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccion4ActionPerformed
        switch(menu){
            case 1:
                break;
            case 2:
                panelmodificarorden.ver();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
        }
    }//GEN-LAST:event_btnaccion4ActionPerformed
    private void menuentregaordenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuentregaordenMousePressed
        menu=3;
        this.lblsubtitulo.setText("Entrega Orden");
        this.panelprincipal.removeAll();
        this.panelentregaorden.setBounds((panelprincipal.getWidth()/2)-(508/2), (panelprincipal.getHeight()/2)-(270/2), 508, 270);
        this.panelprincipal.add(panelentregaorden);
        this.panelprincipal.updateUI();
        this.btnaccion1.setText("Entregar");
        this.btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555671_bill.png")));
        this.btnaccion2.setText("<html><body>Limpiar<br>Actualiza</body></hmtl>");
        this.btnaccion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1412200479_refresh.png")));
        this.btnaccion1.setVisible(true);
        this.btnaccion2.setVisible(true);
        this.btnaccion3.setVisible(false);
        this.btnaccion4.setVisible(false);
    }//GEN-LAST:event_menuentregaordenMousePressed

    private void menulistaordenesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulistaordenesMousePressed
        limpiar();
    }//GEN-LAST:event_menulistaordenesMousePressed
    
    /**
     * @param args the command line arguments
     */
    private void limpiar(){
        menu=0;
        lblsubtitulo.setText("Bienvenido:");
        btnaccion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icon/1407555595_left_circular.png"))); // NOI18N
        btnaccion1.setText("Ir a Orden");
        btnaccion2.setVisible(true);
        btnaccion3.setVisible(false);
        btnaccion4.setVisible(false);
        this.remove(repintado);
        repintado = new repintado();
        this.repintado.setBounds(0, 0, this.getWidth(), 70);
        try{
            int a=Integer.parseInt(Personal.getCOLORES().substring(0, 3));
            int b=Integer.parseInt(Personal.getCOLORES().substring(4, 7));
            int c=Integer.parseInt(Personal.getCOLORES().substring(8, 11));
            int d=Integer.parseInt(Personal.getCOLORES().substring(12, 15));
            int e=Integer.parseInt(Personal.getCOLORES().substring(16, 19));
            int f=Integer.parseInt(Personal.getCOLORES().substring(20, 23));
            Color c1 = new Color(a,b,c);
            Color c2 = new Color(d,e,f);
            this.repintado.setColor1(c1);
            this.repintado.setColor2(c2);
        }catch(Exception e){}
        this.add(repintado);
        if(Personal.getTITULO()!=null){
            this.lbltitulo.setText(Personal.getTITULO());
        }
        this.repaint();
        this.panelprincipal.removeAll();
        this.panelprincipal.add(tableordenes);
        
        tableordenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod_Orden", "Tecnico", "Marca", "Modelo", "Falla", "Fecha Ingreso", "Fecha Entrega", "Estado Orden", "Resto Dias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrolltableordenes.setViewportView(tableordenes);
        tableordenes.getColumnModel().getColumn(0).setPreferredWidth(70);
        tableordenes.getColumnModel().getColumn(5).setPreferredWidth(65);
        tableordenes.getColumnModel().getColumn(6).setPreferredWidth(65);
        tableordenes.getColumnModel().getColumn(7).setPreferredWidth(65);
        tableordenes.getColumnModel().getColumn(8).setPreferredWidth(35);

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltableordenes, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrolltableordenes)
                .addContainerGap())
        );
        tableordenes.setModel(Ordendetrabajo.tablaOrdenesAdministrador((DefaultTableModel) tableordenes.getModel()));
        tableordenes.setDefaultRenderer(String.class, new FormatoTabla());
        tableordenes.setRowMargin(1);
        tableordenes.repaint();
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccion1;
    private javax.swing.JButton btnaccion2;
    private javax.swing.JButton btnaccion3;
    private javax.swing.JButton btnaccion4;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel lblicono;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JMenu menuagregamcliente;
    private javax.swing.JMenu menuagregamequipo;
    private javax.swing.JMenu menuagregarpersonal;
    private javax.swing.JMenu menuagregatienda;
    private javax.swing.JMenuBar menubarra;
    private javax.swing.JMenu menucerrarsesion;
    private javax.swing.JMenu menucliente;
    private javax.swing.JMenu menuentregaorden;
    private javax.swing.JMenu menuequipo;
    private javax.swing.JMenu menuinforme;
    private javax.swing.JMenu menuinformecliente;
    private javax.swing.JMenu menuinformeequipos;
    private javax.swing.JMenu menuinformepersonal;
    private javax.swing.JMenu menuinformerepuestos;
    private javax.swing.JMenu menuinformetienda;
    private javax.swing.JMenu menulistaordenes;
    private javax.swing.JMenu menumodificarcolores;
    private javax.swing.JMenu menumodificarmisdatos;
    private javax.swing.JMenu menumodificarorden;
    private javax.swing.JMenu menumodificarpersonal;
    private javax.swing.JMenu menumodificatienda;
    private javax.swing.JMenu menunuevaorden;
    private javax.swing.JMenu menuorden;
    private javax.swing.JMenu menupersonal;
    private javax.swing.JMenu menutienda;
    private javax.swing.JPanel panelprincipal;
    private javax.swing.JScrollPane scrolltableordenes;
    private javax.swing.JTable tableordenes;
    // End of variables declaration//GEN-END:variables
}
