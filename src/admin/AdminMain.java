package admin;

import cashier.CashiersDetails;
import client.ClientsDetails;
import items.ItemsDetails;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amer Osama
 */
public class AdminMain extends javax.swing.JFrame {

    /**
     * Creates new form CashMain
     */
    public AdminMain() {
        initComponents();
        this.setTitle("Home");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homepanel = new javax.swing.JPanel();
        ItemsData = new javax.swing.JButton();
        cashiersData = new javax.swing.JButton();
        InvoicesData = new javax.swing.JButton();
        deletedb = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        tareer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quick Bill");
        setBackground(new java.awt.Color(153, 0, 0));
        setUndecorated(true);

        homepanel.setBackground(new java.awt.Color(153, 0, 0));
        homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ItemsData.setBackground(new java.awt.Color(255, 255, 255));
        ItemsData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ItemsData.setForeground(new java.awt.Color(0, 102, 102));
        ItemsData.setText("بيانات الاصناف");
        ItemsData.setBorder(null);
        ItemsData.setContentAreaFilled(true);
        ItemsData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsDataActionPerformed(evt);
            }
        });
        homepanel.add(ItemsData, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 110, 40));

        cashiersData.setBackground(new java.awt.Color(255, 255, 255));
        cashiersData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cashiersData.setForeground(new java.awt.Color(0, 102, 102));
        cashiersData.setText("بيانات الكاشير");
        cashiersData.setBorder(null);
        cashiersData.setContentAreaFilled(true);
        cashiersData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashiersDataActionPerformed(evt);
            }
        });
        homepanel.add(cashiersData, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 120, 40));

        InvoicesData.setBackground(new java.awt.Color(255, 255, 255));
        InvoicesData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InvoicesData.setForeground(new java.awt.Color(0, 102, 102));
        InvoicesData.setText("حصر المبيعات");
        InvoicesData.setBorder(null);
        InvoicesData.setContentAreaFilled(true);
        InvoicesData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoicesDataActionPerformed(evt);
            }
        });
        homepanel.add(InvoicesData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 110, 40));

        deletedb.setBackground(new java.awt.Color(255, 255, 255));
        deletedb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletedb.setForeground(new java.awt.Color(0, 102, 102));
        deletedb.setText("حذف الاوردرات");
        deletedb.setBorder(null);
        deletedb.setContentAreaFilled(true);
        deletedb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedbActionPerformed(evt);
            }
        });
        homepanel.add(deletedb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, 40));

        exit.setBackground(new java.awt.Color(255, 204, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 153, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        exit.setBorder(null);
        exit.setContentAreaFilled(true);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        homepanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 40));

        tareer.setBackground(new java.awt.Color(255, 255, 255));
        tareer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tareer.setForeground(new java.awt.Color(0, 102, 102));
        tareer.setText("الشيك اليومي");
        tareer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tareerActionPerformed(evt);
            }
        });
        homepanel.add(tareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu2.jpg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        homepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void close(){
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    private void cashiersDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashiersDataActionPerformed
       this.setVisible(false);
      CashiersDetails cashierdata=new CashiersDetails();
      cashierdata.setVisible(true);
     
    }//GEN-LAST:event_cashiersDataActionPerformed

    private void ItemsDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsDataActionPerformed
       this.setVisible(false);
     ItemsDetails item = new ItemsDetails();
     item.setVisible(true);    
    }//GEN-LAST:event_ItemsDataActionPerformed

    private void InvoicesDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoicesDataActionPerformed
       this.setVisible(false);
                 InvoicesDetails invoice=new InvoicesDetails();
                 invoice.setVisible(true);
    }//GEN-LAST:event_InvoicesDataActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

       this.dispose();
       EnterSystem e=new EnterSystem();
       e.setVisible(true);
       
    }//GEN-LAST:event_exitActionPerformed

    
         public Connection getConnection()
    {
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
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
    
    
    
    
    
    
    
    
    private void deletedbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedbActionPerformed
        // TODO add your handling code here:
  int a=JOptionPane.showConfirmDialog(null,"هل تود بالفعل حذف جميع الاوردرات");  
  if(a==JOptionPane.YES_OPTION){  
    deletedata();
}
    }//GEN-LAST:event_deletedbActionPerformed

    private void tareerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tareerActionPerformed
    
      tareer t=new tareer();
      t.setVisible(true);
    }//GEN-LAST:event_tareerActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InvoicesData;
    private javax.swing.JButton ItemsData;
    private javax.swing.JButton cashiersData;
    private javax.swing.JButton deletedb;
    private javax.swing.JButton exit;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton tareer;
    // End of variables declaration//GEN-END:variables
}
