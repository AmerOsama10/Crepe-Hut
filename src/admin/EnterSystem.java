package admin;


import admin.AdminLogin;
import cashier.CashMain;
import cashier.CashierLogin;
import java.awt.event.*;
import java.awt.*;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amer Osama
 */
public class EnterSystem extends javax.swing.JFrame {
    ImageIcon uplogo =new ImageIcon (getClass().getResource("/images/uppo.jpg"));


    /**
     * Creates new form EnterSystem
     */
    public EnterSystem() {
        
        initComponents();
        this.setTitle("MEX System");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setIconImage(uplogo.getImage());
    }
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        cashier = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        design = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quick Bill");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, 30, 30));

        facebook.setToolTipText("www.facebook.com/AmerOsamahh");
        getContentPane().add(facebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 410, 20, 70));

        phone.setToolTipText("01007698027");
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 280, 20, 50));

        cashier.setBackground(new java.awt.Color(240, 26, 36));
        cashier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cashier.setForeground(new java.awt.Color(255, 255, 255));
        cashier.setText("Cashier");
        cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierActionPerformed(evt);
            }
        });
        getContentPane().add(cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 449, 120, 34));

        admin.setBackground(new java.awt.Color(240, 26, 36));
        admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 450, 120, 34));

        design.setBackground(new java.awt.Color(51, 51, 51));
        design.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entering.jpg"))); // NOI18N
        design.setToolTipText(null);
        design.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        design.setOpaque(true);
        getContentPane().add(design, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1140, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
                System.exit(0);

    }//GEN-LAST:event_exitMouseClicked

    private void cashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashierActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
           close();
         CheckContinue ob =new CheckContinue();                   
                       if(ob.check()==true)
                       {
                        this.setVisible(false);
                        this.dispose();
//                        CashMain main =new CashMain();
//                        main.setVisible(true);
                         CashierLogin cashier=new CashierLogin();
        cashier.setVisible(true);// TODO add your handling code here:
                       }
                       else
                        {
        CashierLogin cashier=new CashierLogin();
        cashier.setVisible(true);// TODO add your handling code here:
                        }
    }//GEN-LAST:event_cashierActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
          close();
        AdminLogin admin=new AdminLogin();
         
        admin.setVisible(true);
    }//GEN-LAST:event_adminActionPerformed

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
            java.util.logging.Logger.getLogger(EnterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EnterSystem().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton cashier;
    private javax.swing.JLabel design;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel phone;
    // End of variables declaration//GEN-END:variables
}
