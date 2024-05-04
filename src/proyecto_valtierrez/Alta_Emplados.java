package proyecto_valtierrez;

/**
 *
 * @author Antonio Trujillo
 */
import Conexion.BD;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import imageresizer.ImageResizer;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.security.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto_valtierrez.PrincipalFrame;
public class Alta_Emplados extends javax.swing.JFrame {
//Hacemos la conexion    
BD cx= new BD("proyecto");
Connection con=cx.conectar();
String NImagen = "";
    public Alta_Emplados() {
        initComponents();
       ImageIcon Close = ImageResizer.resizeImage("src/source/close.png", lbClose.getWidth(), lbClose.getHeight());
       lbClose.setIcon(Close); 
        setLocationRelativeTo(this);
        recibir(9);
        recibirID(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        psicotecnicasrb = new javax.swing.ButtonGroup();
        HojaEstudios = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        pnSup = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbClose = new javax.swing.JLabel();
        lbTitleMode = new javax.swing.JLabel();
        Darkmodel = new javax.swing.JSlider();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        tfID_Empleado = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfSalario = new javax.swing.JTextField();
        cbPuestos = new javax.swing.JComboBox<>();
        SEPARADOR = new javax.swing.JSeparator();
        rdAprobado = new javax.swing.JRadioButton();
        rdRechazado = new javax.swing.JRadioButton();
        SEPARADOR1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservaciones = new javax.swing.JTextArea();
        pnPapeleria = new javax.swing.JPanel();
        chbComprobante = new javax.swing.JCheckBox();
        chbHojaTrabajo = new javax.swing.JCheckBox();
        chbCV = new javax.swing.JCheckBox();
        chbHojaEstudios = new javax.swing.JCheckBox();
        rbTitulado = new javax.swing.JRadioButton();
        rbPrepa = new javax.swing.JRadioButton();
        rbUni = new javax.swing.JRadioButton();
        SEPARADOR3 = new javax.swing.JSeparator();
        btContratar = new javax.swing.JPanel();
        btContratdo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Empleados");
        setMinimumSize(new java.awt.Dimension(950, 720));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(950, 720));
        bg.setPreferredSize(new java.awt.Dimension(950, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnSup.setPreferredSize(new java.awt.Dimension(1120, 1120));

        lbTitulo.setFont(new java.awt.Font("Courier New", 0, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Alta Trabajadores");
        lbTitulo.setToolTipText("");

        lbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCloseMouseClicked(evt);
            }
        });

        lbTitleMode.setText("Light Mode");

        Darkmodel.setMaximum(1);
        Darkmodel.setToolTipText("Cambia el tema del Programa");
        Darkmodel.setValue(0);
        Darkmodel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Darkmodel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DarkmodelStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnSupLayout = new javax.swing.GroupLayout(pnSup);
        pnSup.setLayout(pnSupLayout);
        pnSupLayout.setHorizontalGroup(
            pnSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSupLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addGroup(pnSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitleMode)
                    .addGroup(pnSupLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Darkmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        pnSupLayout.setVerticalGroup(
            pnSupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnSupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleMode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Darkmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(pnSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 13, 950, 70));

        lb1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb1.setText("Pruebas psicotécnicas *");
        bg.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 240, 40));

        lb2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb2.setText("ID Empleado");
        bg.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 112, 120, 40));

        lb3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb3.setText("Nombre/s del Empleado *");
        bg.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 260, 40));

        lb4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb4.setText("Apellidos del Empleado *");
        bg.add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 260, 40));

        lb5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb5.setText("Puesto Postulado *");
        bg.add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 40));

        lb6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb6.setText("Papeleria Entregada");
        bg.add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 290, 40));

        lb7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb7.setText("Salario del Puesto *");
        bg.add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 210, 40));

        lb8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lb8.setText("Observaciones de la persona");
        bg.add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 290, 40));

        tfID_Empleado.setEditable(false);
        tfID_Empleado.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfID_Empleado.setFocusable(false);
        bg.add(tfID_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 40));

        tfNombres.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        bg.add(tfNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 290, 40));

        tfApellidos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        bg.add(tfApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 290, 40));

        tfSalario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        bg.add(tfSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 200, 40));

        cbPuestos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        cbPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione uno...", "Ingeniero en Software", "Ingeniero Industrial", "Cocinero", "Operadores de Area" }));
        bg.add(cbPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 50));
        bg.add(SEPARADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 250, 10));

        psicotecnicasrb.add(rdAprobado);
        rdAprobado.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        rdAprobado.setText("Aprobado");
        bg.add(rdAprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 100, 40));

        psicotecnicasrb.add(rdRechazado);
        rdRechazado.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        rdRechazado.setText("Rechazado");
        bg.add(rdRechazado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, 40));
        bg.add(SEPARADOR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 830, 10));

        taObservaciones.setColumns(20);
        taObservaciones.setRows(5);
        jScrollPane1.setViewportView(taObservaciones);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 420, 340));

        pnPapeleria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chbComprobante.setText("Comprobante (Agua/Luz/Internet/Gas)");
        pnPapeleria.add(chbComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        chbHojaTrabajo.setText("Hoja de pedir chamba");
        pnPapeleria.add(chbHojaTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        chbCV.setText("CV (Curriculum Vitae)");
        pnPapeleria.add(chbCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        chbHojaEstudios.setText("Hoja de Estudios Vigente *");
        chbHojaEstudios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chbHojaEstudiosStateChanged(evt);
            }
        });
        pnPapeleria.add(chbHojaEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        HojaEstudios.add(rbTitulado);
        rbTitulado.setText("Titulado");
        rbTitulado.setEnabled(false);
        pnPapeleria.add(rbTitulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        HojaEstudios.add(rbPrepa);
        rbPrepa.setText("Preparatoria");
        rbPrepa.setEnabled(false);
        pnPapeleria.add(rbPrepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        HojaEstudios.add(rbUni);
        rbUni.setText("Universidad");
        rbUni.setEnabled(false);
        pnPapeleria.add(rbUni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        SEPARADOR3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnPapeleria.add(SEPARADOR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 10, 90));

        bg.add(pnPapeleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 410, 220));

        btContratar.setBackground(new java.awt.Color(52, 152, 219));
        btContratar.setLayout(new java.awt.BorderLayout());

        btContratdo.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        btContratdo.setForeground(new java.awt.Color(255, 255, 255));
        btContratdo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btContratdo.setText("Contratar");
        btContratdo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btContratdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btContratdoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btContratdoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btContratdoMouseExited(evt);
            }
        });
        btContratar.add(btContratdo, java.awt.BorderLayout.CENTER);

        bg.add(btContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 180, 60));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chbHojaEstudiosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbHojaEstudiosStateChanged
       //Estado de los RadioButtons de Estudios para activarlos. Hoja de Estudios
        if(chbHojaEstudios.isSelected()){
           rbPrepa.setEnabled(true);
           rbTitulado.setEnabled(true);
           rbUni.setEnabled(true);
       }
        else{
           rbPrepa.setEnabled(false);
           rbTitulado.setEnabled(false);
           rbUni.setEnabled(false); 
        }
    }//GEN-LAST:event_chbHojaEstudiosStateChanged
    //Tuneos de los botones
    private void btContratdoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratdoMouseEntered
        // Tuneo de boton Contrato
        Color azulSombreado = new Color(41,128,185);
        btContratar.setBackground(azulSombreado);
        
    }//GEN-LAST:event_btContratdoMouseEntered

    private void btContratdoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratdoMouseExited
        // Tuneo de boton Contrato (Color original)
        Color azulOriginal = new Color(52,152,219);
        btContratar.setBackground(azulOriginal);
    }//GEN-LAST:event_btContratdoMouseExited
    //Fin Tuneo de los botones
    private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
        //Accion para Cerrar esta ventana y abrir la anterior.
        PrincipalFrame volver = new PrincipalFrame();
//        volver.setVisible(true);
        this.dispose();
        
        // Envia el valor al otro metodo (Para obtener el tema actual y se aplique No borrar)
        int value = Darkmodel.getValue();
        volver.recibir(value);
    }//GEN-LAST:event_lbCloseMouseClicked

    private void DarkmodelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DarkmodelStateChanged

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
            pnSup.setBackground(NegroCarbon);
            bg.setBackground(OnyxGray);
            lb8.setForeground(Blanco);
            lb1.setForeground(Blanco);
            lb2.setForeground(Blanco);
            lb3.setForeground(Blanco);
            lb4.setForeground(Blanco);
            lb5.setForeground(Blanco);
            lb6.setForeground(Blanco);
            lb7.setForeground(Blanco);
            lbTitulo.setForeground(Blanco);
            rdAprobado.setForeground(Blanco);
            rdRechazado.setForeground(Blanco);
            rbPrepa.setForeground(Blanco);
            rbTitulado.setForeground(Blanco);
            rbUni.setForeground(Blanco);
            lbTitleMode.setForeground(Blanco);
            chbCV.setForeground(Blanco);
            chbComprobante.setForeground(Blanco);
            chbHojaEstudios.setForeground(Blanco);
            chbHojaTrabajo.setForeground(Blanco);
            pnPapeleria.setBackground(NegroCarbon);
            //Check Mode Cambia a tema Light
        }else{
            lbTitleMode.setText("Light Mode");
            pnPapeleria.setBackground(cagado);
            pnSup.setBackground(cagado);
            bg.setBackground(cagado);
            lb8.setForeground(negro);
            lb1.setForeground(negro);
            lb2.setForeground(negro);
            lb3.setForeground(negro);
            lb4.setForeground(negro);
            lb5.setForeground(negro);
            lb6.setForeground(negro);
            lb7.setForeground(negro);
            lbTitulo.setForeground(negro);
            rdAprobado.setForeground(negro);
            rdRechazado.setForeground(negro);
            rbPrepa.setForeground(negro);
            rbTitulado.setForeground(negro);
            rbUni.setForeground(negro);
            lbTitleMode.setForeground(negro);
            chbCV.setForeground(negro);
            chbComprobante.setForeground(negro);
            chbHojaEstudios.setForeground(negro);
            chbHojaTrabajo.setForeground(negro);
        }
    }//GEN-LAST:event_DarkmodelStateChanged

    private void btContratdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btContratdoMouseClicked
        //Comprobaciones
        String nom = tfNombres.getText();
        String Apellido = tfApellidos.getText();
        String salario = tfSalario.getText();
        String seleccion = cbPuestos.getSelectedItem().toString();
        if(nom.isEmpty() || Apellido.isEmpty() || salario.isEmpty() || seleccion.equals("Seleccione uno...") || psicotecnicasrb.getSelection() == null || HojaEstudios.getSelection() == null ){
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos obligatorios marcados con *","Campos vacios",JOptionPane.INFORMATION_MESSAGE);
        }else{
            Alta();
        }
            
    }//GEN-LAST:event_btContratdoMouseClicked
           
            // Metodos para el tema //
//Metodo para dar de alta a los empleados
    public void Alta(){
        //Creamos variables para almacenar lo que se introduzca en los campos y hacerlo mas facil
        String ID=tfID_Empleado.getText(), Nombre=(tfNombres.getText()+" "+tfApellidos.getText()), Puesto=cbPuestos.getSelectedItem().toString(),
                Salario=tfSalario.getText();
        // Mandamos llamar al INSERT INTO
        String sql="INSERT INTO Empleados() Values(?,?,?,?)";
try {
    //Hacemos la consulta para verificar si el usuario existe o no
        Statement st=con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Empleados WHERE id_E LIKE '"+tfID_Empleado.getText()+"'");
        if(rs.next()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "El Empleado ya existe con ese ID");
            tfID_Empleado.requestFocus();
        }else if(tfID_Empleado.getText().isEmpty() || tfNombres.getText().isEmpty() || tfApellidos.getText().isEmpty()
                || cbPuestos.getSelectedIndex()<1 || tfSalario.getText().isEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Llenar los campos correspondientes...","Error",JOptionPane.ERROR_MESSAGE);
            tfID_Empleado.requestFocus();
            limpiar();
        }else{
            //Metemos los datos correspondientes de los campos. NOTA: no todos los campos los puse obligatorios
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, Nombre);
            ps.setString(3, Puesto);
            ps.setString(4, Salario);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El Empleado fue registrado!!!");
            limpiar();
        }
    } catch (SQLException ex) {
        Logger.getLogger(Alta_Emplados.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    //Como su nombre lo dice limpia todo el pinche rollo
    void limpiar(){
        tfID_Empleado.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfSalario.setText("");
        cbPuestos.setSelectedIndex(0);
        psicotecnicasrb.clearSelection();
        HojaEstudios.clearSelection();
        chbCV.setSelected(false);
        chbComprobante.setSelected(false);
        chbHojaEstudios.setSelected(false);
        chbHojaTrabajo.setSelected(false);
        taObservaciones.setText("");
    }
// Recibe el valor del Slider (Tema actual del frame principal)
    public void recibir(int recibido){
        Darkmodel.setValue(recibido);
    }
    //Enviar tema (Obtiene el valor del slider)
    public int getTemaActual(){
        int enviar = Darkmodel.getValue();
        return enviar ;        
    }
            
    // Fin metodos del Tema
    public void recibirID(int recibirID){
        tfID_Empleado.setText(""+recibirID);
    }
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
            java.util.logging.Logger.getLogger(Alta_Emplados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta_Emplados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta_Emplados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta_Emplados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta_Emplados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Darkmodel;
    private javax.swing.ButtonGroup HojaEstudios;
    private javax.swing.JSeparator SEPARADOR;
    private javax.swing.JSeparator SEPARADOR1;
    private javax.swing.JSeparator SEPARADOR3;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btContratar;
    private javax.swing.JLabel btContratdo;
    private javax.swing.JComboBox<String> cbPuestos;
    private javax.swing.JCheckBox chbCV;
    private javax.swing.JCheckBox chbComprobante;
    private javax.swing.JCheckBox chbHojaEstudios;
    private javax.swing.JCheckBox chbHojaTrabajo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbTitleMode;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnPapeleria;
    private javax.swing.JPanel pnSup;
    private javax.swing.ButtonGroup psicotecnicasrb;
    private javax.swing.JRadioButton rbPrepa;
    private javax.swing.JRadioButton rbTitulado;
    private javax.swing.JRadioButton rbUni;
    private javax.swing.JRadioButton rdAprobado;
    private javax.swing.JRadioButton rdRechazado;
    private javax.swing.JTextArea taObservaciones;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfID_Empleado;
    private javax.swing.JTextField tfNombres;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables
}
