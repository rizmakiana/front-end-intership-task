package com.unindra.view;

import com.unindra.model.request.LoginRequest;
import com.unindra.service.AuthService;
import com.unindra.util.AppManager;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author rizmakiana
 */
public class LoginView extends javax.swing.JFrame {
    
    AuthService authService = new AuthService();

    public LoginView() {
        generateComponent();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();
        corner = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        showPasswordCheckbox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management School App");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/image-login.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));
        getContentPane().add(corner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 720, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adwaita Sans", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Masuk");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 90, 150, 50));
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 260, 300, 40));
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 335, 300, 40));

        showPasswordCheckbox.setText("Tampilkan kata sandi");
        jPanel1.add(showPasswordCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 380, -1, -1));

        jLabel2.setText("Nama pengguna");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 235, -1, -1));

        jLabel3.setText("Kata sandi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 310, -1, -1));

        loginButton.setText("Masuk");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 450, 300, 40));

        jTabbedPane1.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        LoginRequest request = new LoginRequest();
        request.setUsername(usernameField.getText());
        request.setPassword(new String (passwordField.getPassword()));
        
        try {
            String message = authService.loginStaff(request);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.PLAIN_MESSAGE);
            
            Dashboard view = new Dashboard();
            view.setVisible(true);
        
        this.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void generateComponent(){
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(AppManager.getImageIcon().getImage());
        
        jTabbedPane1.putClientProperty("JTabbedPane.tabAreaAlignment", "fill");
        jTabbedPane1.putClientProperty("JTabbedPane.tabHeight", 40);
        
        jTabbedPane1.setTitleAt(0, "Masuk");
        jTabbedPane1.setTitleAt(1, "Daftar");
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel corner;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPasswordCheckbox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
