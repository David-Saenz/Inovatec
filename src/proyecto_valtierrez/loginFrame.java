package proyecto_valtierrez;

/**
 *
 * @author Antonio Trujillo
 */
import Conexion.BD;
import imageresizer.ImageResizer;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class loginFrame extends javax.swing.JFrame {
    //Se conecta la base de datos
    BD cx;
    int intento=0;
    public loginFrame() {
        initComponents();
       // Imagen de fondo
       ImageIcon ImageDecoracion = ImageResizer.resizeImage("src/source/lbBG.jpg", lbBG.getWidth(), lbBG.getHeight());
       lbBG.setIcon(ImageDecoracion);
       cx = new BD("proyecto");
       this.setLocationRelativeTo(null);
       Color OnyxGray = new Color(55,55,55,220);
       pLogin.setBackground(OnyxGray);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pLogin = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        btLogin = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbmsj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        lbBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(1280, 720));
        bg.setPreferredSize(new java.awt.Dimension(1280, 720));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pLogin.setBackground(new java.awt.Color(245, 245, 245));
        pLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 204, 204));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Bienvenido a JGL Services");
        pLogin.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 30));

        tfUsername.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(153, 153, 153));
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfUsername.setText("Ingrese su usuario");
        tfUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tfUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfUsernameMouseClicked(evt);
            }
        });
        pLogin.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 50));

        btLogin.setBackground(new java.awt.Color(52, 152, 219));
        btLogin.setLayout(new java.awt.BorderLayout());

        lbLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Iniciar Sesión");
        lbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLoginMouseExited(evt);
            }
        });
        btLogin.add(lbLogin, java.awt.BorderLayout.CENTER);

        pLogin.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 360, 60));

        lbmsj.setBackground(new java.awt.Color(0, 102, 102));
        lbmsj.setForeground(new java.awt.Color(0, 204, 204));
        lbmsj.setText("No registrado?");
        pLogin.add(lbmsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 90, -1));

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" Solicite a un administrador su alta");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        pLogin.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 50));

        bg.add(pLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 400, 350));
        bg.add(lbBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfUsernameMouseClicked
         // Limpia el texto del Username
        if(tfUsername.getText().equals("Ingrese su usuario")){
            tfUsername.setText("");
            tfUsername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfUsernameMouseClicked

    private void lbLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseEntered
        //Efecto Cambiante de Color del boton Login
        Color AzulLigero = new Color(38,106,148);
        btLogin.setBackground(AzulLigero);
        lbLogin.setForeground(Color.WHITE);
    }//GEN-LAST:event_lbLoginMouseEntered

    private void lbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseExited
        //Efecto Cambiante de Color del boton Login
        Color AzulOriginal = new Color(52,152,219);
        btLogin.setBackground(AzulOriginal);
        lbLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbLoginMouseExited

    private void lbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseClicked
       //Ejecuta el login mediante los admins que esten en la base de datos si un admin no esta registrado no lo deja entrar. 
       //MAXIMO 3 intentos sino el programa se cierra
        try { 
            if(intento<3){
            String user = tfUsername.getText();
            String password = String.valueOf(this.txtpassword.getPassword());
            String query="SELECT * FROM Admins WHERE admin='"+user+"' and password='"+password+"'";
            Statement st = cx.conectar().createStatement();
            ResultSet rs = st.executeQuery(query);
              
            if(rs.next()){
            PrincipalFrame iniciarPrincipal = new PrincipalFrame();
            iniciarPrincipal.PerfilIngresado(user);
            iniciarPrincipal.setVisible(true);
            this.dispose();  
            }else{
                intento++;
                JOptionPane.showMessageDialog(this, "ERROR.... el usuario o contraseña no coinciden");
            }}else{
                JOptionPane.showMessageDialog(this, "Intentos fallidos excedidos... ");
                this.dispose();
            }
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_lbLoginMouseClicked

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBG;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbmsj;
    private javax.swing.JPanel pLogin;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
