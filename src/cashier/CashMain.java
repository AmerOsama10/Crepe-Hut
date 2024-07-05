package cashier;

import admin.EnterSystem;
import orders.recipes;
import client.ClientsDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import orders.backtoorder;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amer Osama
 */
public class CashMain extends javax.swing.JFrame {
    ImageIcon uplogo =new ImageIcon (getClass().getResource("/images/uppo.jpg"));

    /**
     * Creates new form CashMain
     */
    public CashMain() {
        initComponents();
               this.setLocationRelativeTo(null);
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
        backtoorderlb = new javax.swing.JLabel();
        clientsdatalb = new javax.swing.JLabel();
        menulb = new javax.swing.JLabel();
        checkout = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quick Bill");
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backtoorderlb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        backtoorderlb.setForeground(new java.awt.Color(255, 255, 255));
        backtoorderlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backtoorderlb.setText("الرجوع للاوردر");
        backtoorderlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtoorderlbMouseClicked(evt);
            }
        });
        jPanel1.add(backtoorderlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 30));

        clientsdatalb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        clientsdatalb.setForeground(new java.awt.Color(255, 255, 255));
        clientsdatalb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientsdatalb.setText("بيانات العملاء");
        clientsdatalb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsdatalbMouseClicked(evt);
            }
        });
        jPanel1.add(clientsdatalb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 90, 30));

        menulb.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        menulb.setForeground(new java.awt.Color(255, 255, 255));
        menulb.setText("   Check Out Menu");
        menulb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulbMouseClicked(evt);
            }
        });
        jPanel1.add(menulb, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 261, 100, 30));

        checkout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        checkout.setForeground(new java.awt.Color(255, 255, 255));
        checkout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkout.setText("قائمه الطعام");
        checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkoutMouseClicked(evt);
            }
        });
        jPanel1.add(checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 90, 30));

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
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 30));

        jLabel1.setBackground(new java.awt.Color(49, 51, 63));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/maincashier.jpg"))); // NOI18N
        jLabel1.setToolTipText(null);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    
       this.dispose();
       EnterSystem e=new EnterSystem();
       e.setVisible(true);
       exitdata();
    }//GEN-LAST:event_exitActionPerformed
    public Connection getConnection()
    {
        Connection con;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xmix","root","");
            return con;
        } catch(Exception e)
        {
           return null;
        }
    }
    
    void deletedata(){
         Connection connection= getConnection();
        String query1="DELETE FROM `dates`;";
        String query2="DELETE FROM `orders`;";
        Statement st;
        ResultSet rs;
        try{
            st=connection.createStatement();
            st.executeUpdate(query1);
            st.executeUpdate(query2);
            JOptionPane.showMessageDialog(null, "تم حذف جميع الاوردرات بتجاح");     
        }
            catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, "لم يتم الحذف بنحاح");
        }
        
    }
    
    private void menulbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulbMouseClicked
        // TODO add your handling code here:
          this.setVisible(false);
        recipes recipe=new recipes();
    recipe.setVisible(true);
    }//GEN-LAST:event_menulbMouseClicked

    private void clientsdatalbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsdatalbMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
     ClientsDetails client=new ClientsDetails(); 
     client.setVisible(true);
    }//GEN-LAST:event_clientsdatalbMouseClicked

    private void backtoorderlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtoorderlbMouseClicked
        // TODO add your handling code here:
     this.setVisible(false);
     backtoorder back=new backtoorder(); 
     back.setVisible(true);
     
    }//GEN-LAST:event_backtoorderlbMouseClicked

    private void checkoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkoutMouseClicked
        // TODO add your handling code here:
            this.setVisible(false);
        recipes recipe=new recipes();
    recipe.setVisible(true);
    }//GEN-LAST:event_checkoutMouseClicked

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
            java.util.logging.Logger.getLogger(CashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backtoorderlb;
    private javax.swing.JLabel checkout;
    private javax.swing.JLabel clientsdatalb;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel menulb;
    // End of variables declaration//GEN-END:variables
}
