/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_valtierrez;

import Conexion.BD;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class Liquidar extends javax.swing.JFrame {

    BD cx= new BD("proyecto");
    Connection con=cx.conectar();
    
    
    public Liquidar() {
        initComponents();
        Mostrar("");
        setLocationRelativeTo(this);
        recibir(9);
    }
    public void Borrar()
    {
        int fila = TablaLiquidaciones.getSelectedRow();
        String ID=TablaLiquidaciones.getValueAt(fila, 0).toString();
        int n=JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro seleccionado?","Eliminar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(n==JOptionPane.YES_OPTION){
            try {
                PreparedStatement borrar= con.prepareStatement("DELETE FROM liquidaciones WHERE id='"+ID+"'");
                borrar.executeUpdate();
                Mostrar("");
            } catch (SQLException ex) {
                Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
     public JTable Mostrar(String Nombre){
        try {
            String sql;
            Statement st=con.createStatement();
            if(Nombre.equals("")){
            sql="SELECT id AS 'ID Empleado', Nom_Empleado AS 'Nombre empleado', fechaemision AS 'Fecha emisión', salariobase AS 'Salario base', horasextra AS 'Pago horas extra', totalneto AS 'Total recibido' FROM liquidaciones";}
            else{
                sql="Select * from liquidaciones where nombre_E like'%"+Nombre+"%'";
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
            TablaLiquidaciones.setModel(modelo);
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error...", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        return TablaLiquidaciones;
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaLiquidaciones = new javax.swing.JTable();
        lbTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbTitleMode = new javax.swing.JLabel();
        Darkmodel = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaLiquidaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(TablaLiquidaciones);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, -1));

        lbTitulo.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Historial Liquidaciones");
        lbTitulo.setToolTipText("");
        jPanel2.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(102, 102, 255));
        btnCerrar.setText("Regresar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 340, 50));

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.setText("Eliminar Registro");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 360, 50));

        lbTitleMode.setText("Light Mode");
        jPanel2.add(lbTitleMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        Darkmodel.setMaximum(1);
        Darkmodel.setToolTipText("Cambia el tema del Programa");
        Darkmodel.setValue(0);
        Darkmodel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Darkmodel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DarkmodelStateChanged(evt);
            }
        });
        jPanel2.add(Darkmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        PrincipalFrame Main = new PrincipalFrame();
//        Main.setVisible(true);
//        this.dispose();
         int value = Darkmodel.getValue();
        Main.recibir(value);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int fila=TablaLiquidaciones.getSelectedRow();
        if (fila != -1) 
        {
            Borrar();
            Mostrar("");
        } 
        else 
        {
         JOptionPane.showMessageDialog(null,"PRIMERO SELECCIONA  UN REGISTRO", "ERROR",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        PrincipalFrame abrir = new PrincipalFrame();
//        abrir.setVisible(true);
        int value = Darkmodel.getValue();
        abrir.recibir(value);
    }//GEN-LAST:event_formWindowClosing

    private void DarkmodelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DarkmodelStateChanged
        //Cambiar tema del porgrama
        int value = Darkmodel.getValue();
        //DarkMode
        Color OnyxGray = new Color(53, 56, 57);
        Color Blanco = new Color(255,255,255);
        //Color NegroCarbon = new Color(51, 51, 51);
        //NormalMode
        Color cagado = new Color (240,240,240);
        Color negro = new Color(0,0,0);
        //Check Mode Cambia a tema Dark
        if(value != 0){
            lbTitleMode.setText("Dark Mode");
            lbTitulo.setForeground(Blanco);
            lbTitleMode.setForeground(Blanco);
            jPanel2.setBackground(OnyxGray);
            //Check Mode Cambia a tema Light
        }else{
            lbTitleMode.setText("Light Mode");
            lbTitulo.setForeground(negro);
            lbTitleMode.setForeground(negro);
            jPanel2.setBackground(cagado);
        }
    }//GEN-LAST:event_DarkmodelStateChanged

    public int getTemaActual(){
        int enviar = Darkmodel.getValue();
        return enviar ;        
    }
    // Recibe el valor del Slider (Tema actual del frame principal)
    public void recibir(int recibido){
        Darkmodel.setValue(recibido);
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
            java.util.logging.Logger.getLogger(Liquidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liquidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liquidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liquidar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liquidar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Darkmodel;
    private javax.swing.JTable TablaLiquidaciones;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitleMode;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
