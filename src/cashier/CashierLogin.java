/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import admin.AdminLogin;
import admin.AdminMain;
import admin.EnterSystem;
import items.Items;
import java.awt.Font;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author Amer Osama
 */
public class CashierLogin extends javax.swing.JFrame {
    ImageIcon uplogo =new ImageIcon (getClass().getResource("/images/uppo.jpg"));

    /**
     * Creates new form AdminLogin
     */
    public CashierLogin() {
        initComponents();
        
        this.setResizable(false);
         this.setLocationRelativeTo(null);
        this.setTitle("Cashier Login");
                this.setIconImage(uplogo.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        checkshowpassword = new javax.swing.JCheckBox();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel1.setToolTipText(null);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, 30));

        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 200, 30));

        checkshowpassword.setBackground(new java.awt.Color(255, 255, 255));
        checkshowpassword.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        checkshowpassword.setText("show password");
        checkshowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkshowpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(checkshowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 100, 20));

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 102));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));

        jLabel1.setToolTipText("فقط المسجلين بواسطه المطعم يمكن دخوله للسستم");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, 10));

        jButton1.setBackground(new java.awt.Color(57, 153, 52));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("الدخول");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 100, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logincashier.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 545));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkshowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkshowpasswordActionPerformed
        // TODO add your handling code here:
          if(checkshowpassword.isSelected())
        {
            password.setEchoChar((char)0);
        }
        else{
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_checkshowpasswordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

         public void exitdata()
    {
        Connection con;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xmix", "root", "");
             Statement s;    
             Cash cashier=new Cash();
             cashier.clockOut();
             String query="UPDATE `cashiers` SET `cashier_state`='"+cashier.getWorkState()+"'WHERE `cashier_state`=1;";
             s = con.createStatement();
             s.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(CashMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:  
        exitdata();             
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
        
                Connection con;
                PreparedStatement ps; 
                try {
                    
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xmix", "root", "");
//                       //to check username and password
                        ps=con.prepareStatement("SELECT `cashier_email`,`cashier_password`,`cashier_state` FROM `cashiers` WHERE `cashier_email`=? AND `cashier_password`=?;");                      
                        ps.setString(1,username.getText());
                        ps.setString(2, String.valueOf(password.getPassword()));
                        ResultSet result=ps.executeQuery();
                        if(result.next())
                        {
                         
                        byte stat=result.getByte("cashier_state");
                        
                        if(stat ==0)
                        {
                        PreparedStatement ps2;    
                        Cash cashier=new Cash();
                        cashier.clockIn();
                        String query="UPDATE `cashiers` SET `cashier_state`='"+cashier.getWorkState()+"'WHERE `cashier_email`=?;";
                        ps2=con.prepareStatement(query);
                        ps2.setString(1,username.getText());
                        ps2.executeUpdate();
                        }   
                      
                        
                        this.setVisible(false);
                        this.dispose();
                        CashMain main =new CashMain();
                        main.setVisible(true);
                        
                        }else
                        {
                        JLabel label = new JLabel("اسم المستخدم او الرقم السري غير صحيح");
                        label.setFont(new Font("Tahoma", Font.BOLD, 14));
                        JOptionPane.showMessageDialog(null, label);
                         username.setText("");
                         password.setText("");
                        }
                        
                    }
                catch (SQLException ex) {
                        //System.out.print(ex.toString());
                        JLabel label = new JLabel("خطا السرفر غير متصل يرجي الاتصال اولا واعاده المحاوله");
                        label.setFont(new Font("Tahoma", Font.BOLD, 14));
                        JOptionPane.showMessageDialog(null, label);
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkshowpassword;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
