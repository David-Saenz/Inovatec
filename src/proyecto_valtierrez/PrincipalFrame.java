package proyecto_valtierrez;
import java.sql.Timestamp;
import Conexion.BD;
import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.text.html.HTML.Attribute.ID;
public class PrincipalFrame extends javax.swing.JFrame {
//Se manda llamar a la BD
BD cx= new BD("proyecto");
String UsuarioI;
Connection con=cx.conectar();
int Aux=0;
    public PrincipalFrame() {
        initComponents();
        setLocationRelativeTo(this);
        recibir(0);
        Mostrar("");
        Pagos();
        

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones_horasExtra = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        lbFront = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        Darkmodel = new javax.swing.JSlider();
        lbTitleMode = new javax.swing.JLabel();
        btCerrarSesion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbtitulo1 = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        SEPARADOR = new javax.swing.JSeparator();
        tfID_Empleado = new javax.swing.JTextField();
        tfNombre_empleado = new javax.swing.JTextField();
        tfSalario_Empleado = new javax.swing.JTextField();
        SEPARADOR1 = new javax.swing.JSeparator();
        btEliminar = new javax.swing.JPanel();
        accion_eliminar = new javax.swing.JLabel();
        btModifi = new javax.swing.JPanel();
        accion_modifi = new javax.swing.JLabel();
        btDar_Alta = new javax.swing.JPanel();
        accion_darAlta = new javax.swing.JLabel();
        lbtitulo = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        txtHorasExtra = new javax.swing.JTextField();
        txtFechaEmision = new javax.swing.JFormattedTextField();
        txtNumFactura = new javax.swing.JTextField();
        rb2hrs = new javax.swing.JRadioButton();
        rb4hrs = new javax.swing.JRadioButton();
        rb6hrs = new javax.swing.JRadioButton();
        txtSalarioBase = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btPagar = new javax.swing.JPanel();
        btPagos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administracion / Contabilidad");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Trabajadores");
        lbTitulo.setToolTipText("");

        tfBusqueda.setText("Buscar empleado");
        tfBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfBusquedaMouseClicked(evt);
            }
        });
        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyReleased(evt);
            }
        });

        Darkmodel.setMaximum(1);
        Darkmodel.setToolTipText("Cambia el tema del Programa");
        Darkmodel.setValue(0);
        Darkmodel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Darkmodel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DarkmodelStateChanged(evt);
            }
        });

        lbTitleMode.setText("Light Mode");

        btCerrarSesion.setBackground(new java.awt.Color(100, 100, 100));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cerrar Sesión");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btCerrarSesionLayout = new javax.swing.GroupLayout(btCerrarSesion);
        btCerrarSesion.setLayout(btCerrarSesionLayout);
        btCerrarSesionLayout.setHorizontalGroup(
            btCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btCerrarSesionLayout.setVerticalGroup(
            btCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout lbFrontLayout = new javax.swing.GroupLayout(lbFront);
        lbFront.setLayout(lbFrontLayout);
        lbFrontLayout.setHorizontalGroup(
            lbFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbFrontLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(lbFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleMode)
                    .addGroup(lbFrontLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Darkmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lbFrontLayout.setVerticalGroup(
            lbFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbFrontLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbFrontLayout.createSequentialGroup()
                .addGroup(lbFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbFrontLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfBusqueda))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbFrontLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(lbFrontLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbFrontLayout.createSequentialGroup()
                                .addComponent(btCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(lbFrontLayout.createSequentialGroup()
                                .addComponent(lbTitleMode)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Darkmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        BG.add(lbFront, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 70));

        lbtitulo1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lbtitulo1.setText("Liquidar Salario al Trabajador");
        BG.add(lbtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, -1));

        lbSalario.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lbSalario.setText("Salario Base");
        BG.add(lbSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, -1, -1));

        lbID.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lbID.setText("ID Empleado");
        BG.add(lbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, -1, -1));

        lbnombre.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lbnombre.setText("Nombre Empleado");
        BG.add(lbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

        SEPARADOR.setForeground(new java.awt.Color(0, 0, 0));
        SEPARADOR.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(SEPARADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 10, 630));

        tfID_Empleado.setEditable(false);
        tfID_Empleado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        tfID_Empleado.setFocusable(false);
        BG.add(tfID_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 100, 30));

        tfNombre_empleado.setEditable(false);
        tfNombre_empleado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BG.add(tfNombre_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, 210, 30));

        tfSalario_Empleado.setEditable(false);
        tfSalario_Empleado.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BG.add(tfSalario_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 240, 120, 30));
        BG.add(SEPARADOR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 410, 10));

        btEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btEliminar.setLayout(new java.awt.BorderLayout());

        accion_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        accion_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accion_eliminar.setText("Eliminar");
        accion_eliminar.setToolTipText("Elimina el empleado seleccionado");
        accion_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accion_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accion_eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accion_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accion_eliminarMouseExited(evt);
            }
        });
        btEliminar.add(accion_eliminar, java.awt.BorderLayout.CENTER);

        BG.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 130, 40));

        btModifi.setBackground(new java.awt.Color(102, 204, 0));
        btModifi.setForeground(new java.awt.Color(255, 255, 255));
        btModifi.setLayout(new java.awt.BorderLayout());

        accion_modifi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accion_modifi.setText("Modificar");
        accion_modifi.setToolTipText("Modifica el empleado seleccionado");
        accion_modifi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accion_modifi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accion_modifiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accion_modifiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accion_modifiMouseExited(evt);
            }
        });
        btModifi.add(accion_modifi, java.awt.BorderLayout.CENTER);

        BG.add(btModifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 310, 130, 40));

        btDar_Alta.setBackground(new java.awt.Color(51, 153, 255));
        btDar_Alta.setForeground(new java.awt.Color(255, 255, 255));
        btDar_Alta.setLayout(new java.awt.BorderLayout());

        accion_darAlta.setForeground(new java.awt.Color(255, 255, 255));
        accion_darAlta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accion_darAlta.setText("Dar Alta");
        accion_darAlta.setToolTipText("Dar de alta a un nuevo empleado");
        accion_darAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accion_darAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accion_darAltaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accion_darAltaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accion_darAltaMouseExited(evt);
            }
        });
        btDar_Alta.add(accion_darAlta, java.awt.BorderLayout.CENTER);

        BG.add(btDar_Alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 310, 130, 40));

        lbtitulo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lbtitulo.setText("Datos del Trabajador");
        BG.add(lbtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        lb.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb.setText("Horas extra?");
        BG.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, -1, -1));

        lb1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("=");
        BG.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 540, 20, 30));

        lb2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb2.setText("Num. Factura");
        BG.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, -1, -1));

        lb3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb3.setText("Fecha de Emisión");
        BG.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, -1, -1));

        lb4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb4.setText("Salario Base");
        BG.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, -1, -1));

        lb5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb5.setText("Total(neto)");
        BG.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 520, -1, -1));

        lb6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("+");
        BG.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 20, 30));

        lb7.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lb7.setText("Horas Extra");
        BG.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, -1, -1));

        txtHorasExtra.setEditable(false);
        txtHorasExtra.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtHorasExtra.setText("0");
        txtHorasExtra.setFocusable(false);
        BG.add(txtHorasExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, 110, 30));

        txtFechaEmision.setEditable(false);
        txtFechaEmision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.LONG))));
        txtFechaEmision.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFechaEmision.setFocusable(false);
        BG.add(txtFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 130, 30));

        txtNumFactura.setEditable(false);
        txtNumFactura.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtNumFactura.setFocusable(false);
        BG.add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, 110, 30));

        botones_horasExtra.add(rb2hrs);
        rb2hrs.setText("2 hrs");
        rb2hrs.setToolTipText("Añade un 10% al salario base");
        rb2hrs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb2hrsStateChanged(evt);
            }
        });
        BG.add(rb2hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, 80, -1));

        botones_horasExtra.add(rb4hrs);
        rb4hrs.setText("4 hrs");
        rb4hrs.setToolTipText("Añade un 13% al salario base");
        rb4hrs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb4hrsStateChanged(evt);
            }
        });
        BG.add(rb4hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 80, -1));

        botones_horasExtra.add(rb6hrs);
        rb6hrs.setText("6 hrs");
        rb6hrs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb6hrsStateChanged(evt);
            }
        });
        BG.add(rb6hrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 660, 80, -1));

        txtSalarioBase.setEditable(false);
        txtSalarioBase.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BG.add(txtSalarioBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 540, 110, 30));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        BG.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 540, 150, 30));

        btPagar.setBackground(new java.awt.Color(255, 153, 51));
        btPagar.setLayout(new java.awt.BorderLayout());

        btPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btPagos.setText("Pagar");
        btPagos.setToolTipText("Pagar salario al trabajador");
        btPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btPagosMouseExited(evt);
            }
        });
        btPagar.add(btPagos, java.awt.BorderLayout.CENTER);

        BG.add(btPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, 280, 40));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabla);

        BG.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 790, 590));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Historial Liquidaciones");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 280, 40));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        BG.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 20, 20));

        getContentPane().add(BG, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfBusquedaMouseClicked
        //Limpiador de barra de busqueda al dar click <--- añadir un boton para la busqueda.
        if(tfBusqueda.getText().equals("Buscar empleado")){
            tfBusqueda.setText("");
        }
    }//GEN-LAST:event_tfBusquedaMouseClicked

    private void DarkmodelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DarkmodelStateChanged
        //Cambiar tema del porgrama
        int value = Darkmodel.getValue();
        //DarkMode
        Color OnyxGray = new Color(53, 56, 57);
        Color Blanco = new Color(255,255,255);
        Color NegroCarbon = new Color(51, 51, 51);
        //NormalMode
        Color cagado = new Color (240,240,240);
        Color negro = new Color(0,0,0);
        //Check Mode Cambia a tema Dark
        if(value != 0){
            lbTitleMode.setText("Dark Mode");
            lbFront.setBackground(NegroCarbon);
            BG.setBackground(OnyxGray);
            lb.setForeground(Blanco);
            lb1.setForeground(Blanco);
            lb2.setForeground(Blanco);
            lb3.setForeground(Blanco);
            lb4.setForeground(Blanco);
            lb5.setForeground(Blanco);
            lb6.setForeground(Blanco);
            lb7.setForeground(Blanco);
            lbTitulo.setForeground(Blanco);
            lbnombre.setForeground(Blanco);
            lbSalario.setForeground(Blanco);
            lbID.setForeground(Blanco);
            lbtitulo.setForeground(Blanco);
            lbtitulo1.setForeground(Blanco);
            lbTitleMode.setForeground(Blanco);
            rb2hrs.setForeground(Blanco);
            rb4hrs.setForeground(Blanco);
            rb6hrs.setForeground(Blanco);
        //Check Mode Cambia a tema Light
        }else{
            lbTitleMode.setText("Light Mode");
            lbFront.setBackground(cagado);
            BG.setBackground(Blanco);
            lb.setForeground(negro);
            lb1.setForeground(negro);
            lb2.setForeground(negro);
            lb3.setForeground(negro);
            lb4.setForeground(negro);
            lb5.setForeground(negro);
            lb6.setForeground(negro);
            lb7.setForeground(negro);
            lbTitulo.setForeground(negro);
            lbnombre.setForeground(negro);
            lbSalario.setForeground(negro);
            lbID.setForeground(negro);
            lbtitulo.setForeground(negro);
            lbtitulo1.setForeground(negro);
            lbTitleMode.setForeground(negro);
            rb2hrs.setForeground(negro);
            rb4hrs.setForeground(negro);
            rb6hrs.setForeground(negro);
        }
    }//GEN-LAST:event_DarkmodelStateChanged
    // Tuneos para efectos de boton con el mouse encima o fuera //
    private void accion_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_eliminarMouseEntered
        // Tuneo de un boton Eliminar
        Color rojoSombra = new Color(204,41,41);
        btEliminar.setBackground(rojoSombra);
    }//GEN-LAST:event_accion_eliminarMouseEntered

    private void accion_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_eliminarMouseExited
        // Tuneo del boton Eliminar (Color original)
        Color rojoOriginal = new Color(255,51,51);
        btEliminar.setBackground(rojoOriginal);
    }//GEN-LAST:event_accion_eliminarMouseExited

    private void accion_modifiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_modifiMouseEntered
        // Tuneo de un boton Modifi
        Color verdeSombra = new Color(83,163,20);
        btModifi.setBackground(verdeSombra);
    }//GEN-LAST:event_accion_modifiMouseEntered

    private void accion_modifiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_modifiMouseExited
        // Tuneo boton Modifi (Color original)
        Color verdeOriginal = new Color(102,204,0);
        btModifi.setBackground(verdeOriginal);
    }//GEN-LAST:event_accion_modifiMouseExited

    private void accion_darAltaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_darAltaMouseEntered
        // Tuneo boton DarAlta
        Color azulSombra = new Color(41,122,204);
        btDar_Alta.setBackground(azulSombra);
    }//GEN-LAST:event_accion_darAltaMouseEntered

    private void accion_darAltaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_darAltaMouseExited
        // Tuneo boton DarAlta (color original)
        Color azulOriginal = new Color(51,153,255);
        btDar_Alta.setBackground(azulOriginal);
    }//GEN-LAST:event_accion_darAltaMouseExited

    private void btPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPagosMouseEntered
        // Tuneo boton Pagar
        Color doradoSombra = new Color(204,122,41);
        btPagar.setBackground(doradoSombra);
    }//GEN-LAST:event_btPagosMouseEntered

    private void btPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPagosMouseExited
        // Tuneo boton pagar (color original)
        Color doradoOriginal = new Color(255,153,51);
        btPagar.setBackground(doradoOriginal);
    }//GEN-LAST:event_btPagosMouseExited
    // Fin tuneos de los botones //
    private void accion_darAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_darAltaMouseClicked
    try {
        // Abre la pantalla Alta_Empleados                                 <----
        Alta_Emplados abrir = new Alta_Emplados();

        // Envia el valor al otro metodo
        abrir.setVisible(true);
        //this.dispose();
        
        // Obtiene y envia el valor actual del tema, (0 o 1) Este no es necesario en la BD pero no lo borren.
        int value = Darkmodel.getValue();
        abrir.recibir(value);
        int enviarEsto = getIDEmpleado();
        abrir.recibirID(enviarEsto);
        // Fin del no borrar
    } catch (SQLException ex) {
        Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_accion_darAltaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        //Cierra la ventana actual o bien cierra sesión                    <----
        loginFrame inicio = new loginFrame();
        inicio.setVisible(true);
        this.dispose();
        
            String sql="INSERT INTO historial() Values(?,?,?)";
            PreparedStatement ps;
    try {
        ps = con.prepareStatement(sql);
        ps.setString(1, UsuarioI);
        ps.setString(2, "Salio");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        ps.setTimestamp(3, timestamp);
        ps.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
         

    }//GEN-LAST:event_jLabel3MouseClicked

    private void accion_modifiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_modifiMouseClicked
        // Este boton debera de habilitar las casillas como el nombre, salario y el ID se mantiene deshabilitado por segurida ya que es PK   <-----
        String nom_Empleado = tfNombre_empleado.getText();
        String IDEmpleado = tfID_Empleado.getText();
      int opcion =  JOptionPane.showConfirmDialog(null, "Deseas aplicar las modificaciones realizadas a "+nom_Empleado+" con ID: "+IDEmpleado,"Confirmar Modificacion",JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
           ModificarDatos(); 
        }else{
            JOptionPane.showMessageDialog(null, "Modificacion rechazada por el usuario","Modificacion cancelada",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_accion_modifiMouseClicked

    private void accion_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accion_eliminarMouseClicked
        // Con la columna seleccionada lo que hara es ejecutar el Delete en la BD con solo la consulta del ID. por eso el ID se mantiene deshabilitado en Modificar.    <-----
        String nom_Empleado = tfNombre_empleado.getText();
        String IDEmpleado = tfID_Empleado.getText();
        int opcion = JOptionPane.showConfirmDialog(null, "Estas por borrar al empleado "+nom_Empleado+" con ID "+IDEmpleado+" de forma permanemtne","Confirmacion de eliminar empleado",JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
        Borrar();    
        }else{
            JOptionPane.showMessageDialog(null, "La operacion fue cancelada por el usuario.","Operacion cancelada",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_accion_eliminarMouseClicked

    private void btPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPagosMouseClicked
        // En pagar preferiblemente se haga una ventana de confirmacion de datos pa darle ok, estos datos se envian al frame de emplado pa su hoja de pago. (Despues de habla del diseño y acceso de esta misma.)   <-----
        // 150 la hora
        if(Aux==0)
        {
            JOptionPane.showMessageDialog(null,"VERIFICA LOS DATOS", "ERROR",JOptionPane.INFORMATION_MESSAGE);
        } 
        else
        {
            // SUBIR A LA BD
            int n=JOptionPane.showConfirmDialog(null, "¿Finalizar liquidacion del salario?","Liquidar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(n==JOptionPane.YES_OPTION)
            {   
              //  double recibirExtra = recibirHorasExtra(0);
                String ID=tfID_Empleado.getText();
                String NumFactura=txtNumFactura.getText();
                String FechaEmision=txtFechaEmision.getText();
                String SalarioBase=txtSalarioBase.getText();
                String HorasExtra=txtHorasExtra.getText();
                String TotalNeto=txtTotal.getText();
                String NombreEmpleado = tfNombre_empleado.getText();
                

                String sql="INSERT INTO liquidaciones() Values(?,?,?,?,?,?,?)";
                PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ID);
                ps.setString(2, NumFactura);
                ps.setString(3, NombreEmpleado);
                ps.setString(4, FechaEmision);
                ps.setString(5, SalarioBase);
                ps.setString(6, HorasExtra);
                ps.setString(7, TotalNeto);
                ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

                JOptionPane.showMessageDialog(null,"SALARIO LIQUIDADO", "LIQUIDACION FINALIZADA",JOptionPane.INFORMATION_MESSAGE);
               // Limpiar();
               txtHorasExtra.setText("");
               txtNumFactura.setText("");
               txtSalarioBase.setText("");
               txtTotal.setText("");
               Modificar();
                jCheckBox2.setSelected(false);
                botones_horasExtra.clearSelection();
                Aux=0;
        }else{
                
            }
        }///////////////////////////// FIN SI
 
    }//GEN-LAST:event_btPagosMouseClicked

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        Modificar();
        Pagar();
    }//GEN-LAST:event_TablaMouseClicked

    private void tfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyReleased
        Mostrar(tfBusqueda.getText());
        
    }//GEN-LAST:event_tfBusquedaKeyReleased

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        Liquidar Liquidar = new Liquidar();
        Liquidar.setVisible(true);
        //this.dispose();
        int value = Darkmodel.getValue();
        Liquidar.recibir(value);
    }//GEN-LAST:event_jPanel1MouseClicked
    public void Pagos()
    {
        txtNumFactura.setEditable(false);
        txtFechaEmision.setEditable(false);
        txtHorasExtra.setEditable(false);
        txtTotal.setEditable(false); 
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        Date fechaActual = new Date();
        int fila=Tabla.getSelectedRow();
        if (fila != -1) 
        {
            if(jCheckBox2.isSelected()){
            
            try {
                txtFechaEmision.setEditable(true);
                txtSalarioBase.setText(Tabla.getValueAt(fila, 3).toString());
                txtTotal.setText(Tabla.getValueAt(fila, 3).toString());
                txtFechaEmision.setValue(fechaActual);
                Aux+=1;
                
                String sql;
                Statement st = con.createStatement();
                sql = "SELECT MAX(numfactura) AS UltimoNumFactura FROM liquidaciones";
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()){
                    int ultimaFactura = rs.getInt("UltimoNumFactura");
                    int NuevaFactura = ultimaFactura + 1;
                    txtNumFactura.setText(""+NuevaFactura);
                    
                }else{
                    {
                        txtNumFactura.setText(""+1);
                    }
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else{
                txtFechaEmision.setText("");
                txtHorasExtra.setText("");
                txtNumFactura.setText("");
                txtSalarioBase.setText("");
                txtTotal.setText("");
                rb2hrs.setSelected(false);
                rb4hrs.setSelected(false);
                rb6hrs.setSelected(false);
            }
        } else {
         JOptionPane.showMessageDialog(null,"PRIMERO SELECCINA A UNA TRABAJADOR", "ERROR",JOptionPane.INFORMATION_MESSAGE);
         jCheckBox2.setSelected(false);
        }

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    
    int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres salir?", "Estas por cerrar sesión", JOptionPane.YES_NO_OPTION);
    if (opcion == JOptionPane.YES_OPTION) {
        dispose();    
        loginFrame abrir = new loginFrame();
        abrir.setVisible(true);
    } else {
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
    }
    }//GEN-LAST:event_formWindowClosing

    private void rb2hrsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb2hrsStateChanged
        String SalarioBaseString = txtSalarioBase.getText();
        int SalarioConv = Integer.parseInt(SalarioBaseString);
        if(rb2hrs.isSelected()){
                txtHorasExtra.setText("");
                double SalarioExtra2 = (SalarioConv * .10) + SalarioConv;
                double Extra2 = SalarioConv * .10;
                txtHorasExtra.setText(""+Extra2);
                txtTotal.setText(""+SalarioExtra2);
        }
    }//GEN-LAST:event_rb2hrsStateChanged

    private void rb4hrsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb4hrsStateChanged
        String SalarioBaseString = txtSalarioBase.getText();
        int SalarioConv = Integer.parseInt(SalarioBaseString);
        if(rb4hrs.isSelected()){
                txtHorasExtra.setText("");
                double SalarioExtra4 = (SalarioConv * .13) + SalarioConv;
                double Extra4 = SalarioConv * .13;
                txtHorasExtra.setText(""+Extra4);
                txtTotal.setText(""+SalarioExtra4);
        }
    }//GEN-LAST:event_rb4hrsStateChanged

    private void rb6hrsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb6hrsStateChanged
        String SalarioBaseString = txtSalarioBase.getText();
        int SalarioConv = Integer.parseInt(SalarioBaseString);
        if(rb6hrs.isSelected()){
                txtHorasExtra.setText("");
                double SalarioExtra6 = (SalarioConv * .15) + SalarioConv;
                double Extra6 = SalarioConv * .15;
                txtHorasExtra.setText(""+Extra6);
                txtTotal.setText(""+SalarioExtra6);
        }
    }//GEN-LAST:event_rb6hrsStateChanged
      // Metodos para obtener el tema actual //
    //Este metodo muestra en la jTable los campos de la tabla en la base de datos
    public JTable Mostrar(String Nombre){
        try {
            String sql;
            Statement st=con.createStatement();
            if(Nombre.equals("")){
            sql="SELECT id_E AS ID,nombre_E as 'Nombre empleado', puesto_E AS 'Puesto del empleado', salario_E AS 'Salario base' FROM empleados";}
            else{
                sql="Select * from empleados where nombre_E like'%"+Nombre+"%'";
            }
            ResultSet rs= st.executeQuery(sql);
            ResultSetMetaData rsm=rs.getMetaData();
            int col=rsm.getColumnCount();
            DefaultTableModel modelo = new DefaultTableModel();
            for(int i=1;i<=col;i++){
                modelo.addColumn(rsm.getColumnLabel(i));
            }
            while(rs.next()){
                String[] fila = new String[col];
                for(int j=0;j<col;j++){
                    fila[j]=rs.getString(j+1);
                }
                modelo.addRow(fila);
            }
            Tabla.setModel(modelo);
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error...", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return Tabla;
    }
    //Metodo que muestra los datos de la tabla en los campos de los txt
    public void Modificar(){
    int fila=Tabla.getSelectedRow();
    if(fila>=0){
            tfID_Empleado.setText(Tabla.getValueAt(fila, 0).toString());
            tfNombre_empleado.setText(Tabla.getValueAt(fila, 1).toString());
            tfSalario_Empleado.setText(Tabla.getValueAt(fila, 3).toString());
            // tfID_Empleado.setEditable(false);
            tfNombre_empleado.setEditable(true);
            tfSalario_Empleado.setEditable(true);
            
            
            // Reiniciar checkbox al cambiar de empleado
            jCheckBox2.setSelected(false);
            botones_horasExtra.clearSelection();
            txtSalarioBase.setText("");

        
        
    }else{
        JOptionPane.showMessageDialog(null, "Seleccione fila");
    }
  
}//Metodo que modifica los datos ingresados en las txt mandados ya a la base de datos y actualizados en tiempo real en la tabla :)
    public void ModificarDatos(){
    try {
        PreparedStatement ps= con.prepareStatement("update empleados set nombre_E='"+tfNombre_empleado.getText()+"',salario_E='"+tfSalario_Empleado.getText()+"' "
                + "where id_E='"+tfID_Empleado.getText()+"'");
        ps.executeUpdate();
        Mostrar("");
    } catch (SQLException ex) {
        Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Limpiar(){
        txtNumFactura.setText("");
        txtFechaEmision.setText("");
        txtSalarioBase.setText("");
        txtHorasExtra.setText("");
        txtTotal.setText("");
        
    }
    
    public void Pagar(){
        //int fila=Tabla.getSelectedRow();
        //txtNumFactura.setEditable(true);
        //txtFechaEmision.setEditable(true);
        //txtSalarioBase.setText(Tabla.getValueAt(fila, 3).toString());
        
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   //Metodo para Eliminar 
    public void Borrar(){
        int fila = Tabla.getSelectedRow();
        String ID=Tabla.getValueAt(fila, 0).toString();
        int n=JOptionPane.showConfirmDialog(null, "Desea eliminar registro?","Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n==JOptionPane.YES_NO_OPTION){
            try {
                PreparedStatement borrar= con.prepareStatement("DELETE FROM empleados WHERE id_E='"+ID+"'");
                borrar.executeUpdate();
                Mostrar("");
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    //Enviar tema (Obtiene el valor del slider)
    public int getTemaActual(){
        int enviar = Darkmodel.getValue();
        return enviar ;        
    }
    // Recibe el valor del Slider (Tema actual del frame principal)
    public void recibir(int recibido){
        Darkmodel.setValue(recibido);
    }
    
                   // Fin metodos para obtener el tema
    
    public int getIDEmpleado() throws SQLException{
                String sql;
                Statement st = con.createStatement();
                sql = "SELECT MAX(id_E) AS UltimoID FROM empleados";
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()){
                    int ultimoID = rs.getInt("UltimoID");
                    int UltimoIDEmpleado = ultimoID + 1;
                    return UltimoIDEmpleado;
                }else{
                    {
                  return 1;      
                    }
                }
    }
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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JSlider Darkmodel;
    private javax.swing.JSeparator SEPARADOR;
    private javax.swing.JSeparator SEPARADOR1;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel accion_darAlta;
    private javax.swing.JLabel accion_eliminar;
    private javax.swing.JLabel accion_modifi;
    private javax.swing.ButtonGroup botones_horasExtra;
    private javax.swing.JPanel btCerrarSesion;
    private javax.swing.JPanel btDar_Alta;
    private javax.swing.JPanel btEliminar;
    private javax.swing.JPanel btModifi;
    private javax.swing.JPanel btPagar;
    private javax.swing.JLabel btPagos;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JPanel lbFront;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTitleMode;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JLabel lbtitulo1;
    private javax.swing.JRadioButton rb2hrs;
    private javax.swing.JRadioButton rb4hrs;
    private javax.swing.JRadioButton rb6hrs;
    private javax.swing.JTextField tfBusqueda;
    private javax.swing.JTextField tfID_Empleado;
    private javax.swing.JTextField tfNombre_empleado;
    private javax.swing.JTextField tfSalario_Empleado;
    private javax.swing.JFormattedTextField txtFechaEmision;
    private javax.swing.JTextField txtHorasExtra;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    void PerfilIngresado(String Usuario) throws SQLException {
UsuarioI=Usuario;        
         String sql="INSERT INTO historial() Values(?,?,?)";
         PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            ps.setString(2, "ingreso");
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            ps.setTimestamp(3, timestamp);
            ps.executeUpdate();

    }
}
