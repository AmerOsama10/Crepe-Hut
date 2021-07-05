/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.PrinterName;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import orders.recipes;

/**
 *
 * @author Amer Osama
 */
public class tareer extends javax.swing.JFrame {
    ImageIcon uplogo =new ImageIcon (getClass().getResource("/images/uppo.jpg"));

    /**
     * Creates new form tareer
     */
    public tareer() {
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
        exit = new javax.swing.JButton();
        viewallrecord = new javax.swing.JButton();
        printallrecord = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 0), 3, true));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        viewallrecord.setBackground(new java.awt.Color(255, 102, 51));
        viewallrecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewallrecord.setForeground(new java.awt.Color(255, 255, 255));
        viewallrecord.setText("عرض الكل");
        viewallrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallrecordActionPerformed(evt);
            }
        });

        printallrecord.setBackground(new java.awt.Color(255, 102, 51));
        printallrecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        printallrecord.setForeground(new java.awt.Color(255, 255, 255));
        printallrecord.setText("طباعه الكل");
        printallrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printallrecordActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("الشيك اليومي");
        jLabel4.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("يرجي العلم انه يتم اظهار جميع الاوردرات المطلوبه حتي الان ");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(printallrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(viewallrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(3, 3, 3)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printallrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewallrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();

        AdminMain main =new AdminMain();
        main.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

 
    public Connection getConnection()
    {
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xmix","root","");
            return con;
        } catch(Exception e)
        {
           return null;
        }
    }
                                  
 

           private int maxorder() {
       int id=0; 
       Connection connection= getConnection();
        String query="SELECT MAX(order_id) FROM dates";
        Statement st;
        ResultSet rs;
        try{
            st=connection.createStatement();
            rs=st.executeQuery(query);
           if(rs.next())
           {
               id=rs.getInt(1);
                 
           }
            
        }
        catch(Exception e)
        {
          
            System.out.print(e.toString());
        }
        return id;
        
    }
       
        public void view_All_records() 
{
     try { 
     Connection con =getConnection();
     Map map = new HashMap();
     int id=maxorder();
     map.put("totalid",id);

    JasperDesign jsd = JRXmlLoader.load("C:/Reports/allrecord.jrxml");
    JasperReport jr = JasperCompileManager.compileReport(jsd);
    JasperPrint jp = JasperFillManager.fillReport(jr, map,con);
    JasperViewer.viewReport(jp,false);
    //JasperPrintManager.printPage(jp, 0, false);
    //JasperPrint jp =reportEngine.fillReport() ;//it returns stream 
                
        }
     catch (NullPointerException ex) {
           JLabel label = new JLabel("هناك خطا لا يمكن العرض");
           label.setFont(new Font("Tahoma", Font.BOLD, 14));
           JOptionPane.showMessageDialog(null,label);
        }
    catch (JRException ex) {
            Logger.getLogger(InvoicesDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
      catch (IllegalArgumentException ex) {
           JLabel label = new JLabel(" لا توجد اوردرات موجوده");
           label.setFont(new Font("Tahoma", Font.BOLD, 14));
           JOptionPane.showMessageDialog(null,label);
        }
}       
   
      
        
public void print_All_records() 
{
   

   try { 
     Connection con =getConnection();
     Map map = new HashMap();
     int id=maxorder();
     map.put("totalid",id);

    JasperDesign jsd = JRXmlLoader.load("C:/Reports/allrecord.jrxml");
    JasperReport jr = JasperCompileManager.compileReport(jsd);
    JasperPrint jp = JasperFillManager.fillReport(jr, map,con);
  
   // JasperPrintManager.printPage(jp, 0, false);
   // JasperPrint jp =reportEngine.fillReport() ;//it returns stream 
    print_All_records(jp);//call method
    ImageIcon icon = new ImageIcon(this.getClass().getResource("correct.png"));

           JLabel label = new JLabel(" تم طباعه كل الاوردرات بنجاح");
           label.setFont(new Font("Tahoma", Font.BOLD, 14));
           JOptionPane.showMessageDialog(null, label,"DONE",JOptionPane.PLAIN_MESSAGE,icon); 

}      
 catch (NullPointerException ex) {
     JLabel label = new JLabel(" لم تتم طباعه الاوردرات بنجاح");
           label.setFont(new Font("Tahoma", Font.BOLD, 14));
           JOptionPane.showMessageDialog(null,label);
        }
catch (JRException ex) {
            Logger.getLogger(tareer.class.getName()).log(Level.SEVERE, null, ex);
        }
   catch (IllegalArgumentException ex) {
       JLabel label = new JLabel(" لا توجد اوردرات موجوده");
           label.setFont(new Font("Tahoma", Font.BOLD, 14));
          JOptionPane.showMessageDialog(null,label);
        }
   
}        
    
 
  

     private void print_All_records(JasperPrint jp) throws JRException {
    // TODO Auto-generated method stub
    PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
    // printRequestAttributeSet.add(MediaSizeNdame.ISO_A4); //setting page size
    printRequestAttributeSet.add(new Copies(1));
    //PrinterName printerName = new PrinterName("Microsoft XPS Document Writer", null);

      PrinterName printerName = new PrinterName("XP-80C", null); //gets printer 


    PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
    printServiceAttributeSet.add(printerName);

    JRPrintServiceExporter exporter = new JRPrintServiceExporter();

    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jp);
    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_REQUEST_ATTRIBUTE_SET, printRequestAttributeSet);
    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printServiceAttributeSet);
    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
    exporter.exportReport();
}   
    private void viewallrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallrecordActionPerformed

        view_All_records();

    }//GEN-LAST:event_viewallrecordActionPerformed

    private void printallrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printallrecordActionPerformed
        // TODO add your handling code here:
        print_All_records();

    }//GEN-LAST:event_printallrecordActionPerformed

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
            java.util.logging.Logger.getLogger(tareer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tareer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tareer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tareer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tareer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton printallrecord;
    private javax.swing.JButton viewallrecord;
    // End of variables declaration//GEN-END:variables
}
