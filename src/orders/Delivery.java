/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import admin.AdminMain;
import client.Client;
import items.Items;
import static orders.recipes.printdelivery;
import static orders.recipes.clname;
import static orders.recipes.clid;


/**
 *
 * @author Amer Osama
 */
public class Delivery extends javax.swing.JFrame {

    /**
     * Creates new form Cashiers
     */
    public Delivery() {
        initComponents();
        show_client();
        this.setTitle("Cashiers Data");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        notes = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        addclient = new javax.swing.JButton();
        updateclient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliverytable = new javax.swing.JTable();
        searchclient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtnotes = new javax.swing.JTextArea();
        name1 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addorder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 32, 55));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Delivery");
        jLabel1.setOpaque(true);

        name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 102, 0));
        name.setText("الاسم");

        phone.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 102, 0));
        phone.setText("الهاتف");

        Address.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 102, 0));
        Address.setText("العنوان");

        notes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        notes.setForeground(new java.awt.Color(255, 102, 0));
        notes.setText("ملاحظات");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtphone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        addclient.setBackground(new java.awt.Color(255, 51, 51));
        addclient.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addclient.setText("اضافه");
        addclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientActionPerformed(evt);
            }
        });

        updateclient.setBackground(new java.awt.Color(255, 51, 51));
        updateclient.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        updateclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        updateclient.setText("تحديث");
        updateclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateclientActionPerformed(evt);
            }
        });

        deliverytable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deliverytable.setForeground(new java.awt.Color(0, 102, 102));
        deliverytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "الاسم", "الهاتف", "العنوان", "ملاحظات"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deliverytable.setGridColor(new java.awt.Color(0, 153, 153));
        deliverytable.setRowHeight(20);
        deliverytable.setRowMargin(3);
        deliverytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliverytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(deliverytable);
        if (deliverytable.getColumnModel().getColumnCount() > 0) {
            deliverytable.getColumnModel().getColumn(0).setMinWidth(0);
            deliverytable.getColumnModel().getColumn(0).setMaxWidth(0);
            deliverytable.getColumnModel().getColumn(1).setPreferredWidth(12);
        }

        searchclient.setBackground(new java.awt.Color(255, 51, 51));
        searchclient.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchclient.setText("بحث");
        searchclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchclientActionPerformed(evt);
            }
        });

        txtnotes.setColumns(20);
        txtnotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnotes.setRows(5);
        jScrollPane2.setViewportView(txtnotes);

        name1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 102, 0));
        name1.setVisible(false);
        name1.setText("id");

        textid.setEditable(false);
        textid.setBackground(new java.awt.Color(204, 204, 204));
        textid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textid.setVisible(false);
        textid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidActionPerformed(evt);
            }
        });

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

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jButton1.setText("تنظيف");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addorder.setBackground(new java.awt.Color(255, 102, 0));
        addorder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/additem.png"))); // NOI18N
        addorder.setText("اضافه الطلب");
        addorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addorderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtphone)
                                    .addComponent(txtaddress)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(searchclient, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(addclient)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateclient)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchclient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addclient)
                    .addComponent(updateclient)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addorder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //for searching about a person in clients table
    
    private void searchclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchclientActionPerformed
        // TODO add your handling code here:
       

       find_client();
           
       
        
    }//GEN-LAST:event_searchclientActionPerformed

         public void find_client()
        {
            ArrayList<Client>clients= ListClients(txtname.getText());
            if (clients.isEmpty())
                JOptionPane.showMessageDialog(null, "لا يوجد مستخدم بهذا الاسم");
                else
            {
        DefaultTableModel model=new DefaultTableModel();
          model.setColumnIdentifiers(new Object[]{"id","الاسم ","الهاتف","العنوان","ملاحظات"});
        Object[] row=new Object[5];
        for(int i=0;i<clients.size();i++)
        {
            row[0]=clients.get(i).getid();
            row[1]=clients.get(i).getName();
            row[2]=clients.get(i).getPhone();
            row[3]=clients.get(i).getAddress();
            row[4]=clients.get(i).getNotes();

            
            model.addRow(row);
        }  
        deliverytable.setModel(model);
                    }
        }
        
    
    
    
        public ArrayList<Client>ListClients(String ValToSearch)
    {
       
        ArrayList<Client>clientsList=new ArrayList<Client>();
          Statement st;
        ResultSet rs;
        try{
        Connection connection= getConnection();   
        st=connection.createStatement();
        st.executeQuery("SET NAMES UTF8");
        st.executeQuery("SET CHARACTER SET UTF8");
        String query="SELECT * FROM `Clients` WHERE `Client_name`LIKE '%"+ValToSearch+"%'";
            rs=st.executeQuery(query);
            Client client;
            while(rs.next())
            {
                client = new Client(rs.getInt("Client_id"),rs.getString("Client_name"),rs.getString("Client_phone"),rs.getString("Client_address"),rs.getString("Client_notes"));
               clientsList.add(client);
            }
            
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
        return clientsList;
    }
        
        
         
        
       
        
        // show the Row that is selected from client table on the text field
    private void deliverytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliverytableMouseClicked
        int i=deliverytable.getSelectedRow();       
        TableModel model=deliverytable.getModel();
        textid.setText(model.getValueAt(i, 0).toString());
        txtname.setText(model.getValueAt(i, 1).toString());
        txtphone.setText(model.getValueAt(i, 2).toString());
        txtaddress.setText(model.getValueAt(i, 3).toString());
        txtnotes.setText(model.getValueAt(i, 4).toString());
       
    }//GEN-LAST:event_deliverytableMouseClicked

    private void updateclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateclientActionPerformed
        String query="UPDATE `Clients` SET `Client_name`='"+txtname.getText()+"',`Client_phone`='"+txtphone.getText()+"',`Client_address`='"+txtaddress.getText()+"',`Client_notes`='"+txtnotes.getText()+"' WHERE `Client_id`="+textid.getText();
        executeSQlQuery(query,"تعديل  ");
    }//GEN-LAST:event_updateclientActionPerformed

    private void addclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientActionPerformed
        String query="INSERT INTO `Clients`(`Client_name`,`Client_phone`,`Client_address`,`Client_notes`) VALUES('"+txtname.getText()+"','"+txtphone.getText()+"','"+txtaddress.getText()+"','"+txtnotes.getText()+"');";

        executeSQlQuery(query, "اضافة  ");
    }//GEN-LAST:event_addclientActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void textidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
       
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        // TODO add your handling code here:
               
    }//GEN-LAST:event_txtnameMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               textid.setText("");
               txtname.setText("");
               txtphone.setText("");
               txtaddress.setText("");
               txtnotes.setText("");      
    }//GEN-LAST:event_jButton1ActionPerformed

    public void chooseclient(){
        try{
             ArrayList<Client>clientList=new ArrayList<Client>();
             int index=deliverytable.getSelectedRow();
             TableModel model=deliverytable.getModel();
             String sid=model.getValueAt(index, 0).toString();
             String name=model.getValueAt(index, 1).toString();
             String phone=model.getValueAt(index, 2).toString();
             String address=model.getValueAt(index, 3).toString();
             String notes=model.getValueAt(index, 4).toString();
             int id=Integer.parseInt(sid);
             Client client;
             client=new Client(id,name,phone,address,notes);
             clientList.add(client);
             clientid =clientList.get(0).getid();
           clientname =clientList.get(0).getName();
            JOptionPane.showMessageDialog(null, "تمت اضافه"+" "+clientname+" "+"الي الطلب");
      
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
         JOptionPane.showMessageDialog(null, "يرجي تحديد العميل الذي تريده");
  
        }
        
        
    }
    
    
    
    private void addorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addorderActionPerformed
        // TODO add your handling code here: 
        chooseclient();
  
    if(clientid>0)
    {
    clname.setText(clientname);
    clid.setText(""+clientid);
    printdelivery.setEnabled(true);
   
    }
    else
    {
            clname.setText("");
            printdelivery.setEnabled(false);
    }
 this.setVisible(false);
    }//GEN-LAST:event_addorderActionPerformed

    
    
    
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
    public ArrayList<Client>getClientList()
    {
        ArrayList<Client>clientList=new ArrayList<Client>();
        Connection connection= getConnection();
        String query="SELECT * FROM `Clients`;";
        Statement st;
        ResultSet rs;
        
        try{
            st=connection.createStatement();
                st.executeQuery("SET NAMES UTF8");
        st.executeQuery("SET CHARACTER SET UTF8");
            rs=st.executeQuery(query);
            Client client;
            while(rs.next())
            {
                client = new Client(rs.getInt("Client_id"),rs.getString("Client_name"),rs.getString("Client_phone"),rs.getString("Client_address"),rs.getString("Client_notes"));
               clientList.add(client);
            }
            
        }
        catch(Exception e)
        {
         e.printStackTrace();
        }
        return clientList;
    }
    
    
        public ArrayList<Client>getClientList(int clientid)
    {
        ArrayList<Client>clientList=new ArrayList<Client>();
        Connection connection= getConnection();
        String query="SELECT * FROM `Clients`WHERE `item_id`="+clientid;
        Statement st;
        ResultSet rs;
        try{
            st=connection.createStatement();
                 st.executeQuery("SET NAMES UTF8");
        st.executeQuery("SET CHARACTER SET UTF8");
            rs=st.executeQuery(query);
            Client client;
            while(rs.next())
            {
                client = new Client(rs.getInt("Client_id"),rs.getString("Client_name"),rs.getString("Client_phone"),rs.getString("Client_address"),rs.getString("Client_notes"));
               clientList.add(client);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "لم يضاف للاوردر ");
        }
        return clientList;
    }
 // Display data in JTable
    public void show_client()
    {
        
        ArrayList<Client> list=getClientList();
        DefaultTableModel model=(DefaultTableModel)deliverytable.getModel();
        Object[] row=new Object[5];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getPhone();
            row[3]=list.get(i).getAddress();
            row[4]=list.get(i).getNotes();

            
            model.addRow(row);
        }  
        
    }
    

    
 
    
    
    
    
    public void executeSQlQuery(String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
                st.executeQuery("SET NAMES UTF8");
        st.executeQuery("SET CHARACTER SET UTF8");
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)deliverytable.getModel();
               model.setRowCount(0);
               show_client();
               textid.setText("");
               txtname.setText("");
               txtphone.setText("");
               txtaddress.setText("");
               txtnotes.setText("");               
               JOptionPane.showMessageDialog(null, "تم "+message+"العميل بنجاح  "+"  ");
           }else{
               JOptionPane.showMessageDialog(null, "لم يتم "+message+"العميل ");
           }
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null, "حدد ماذا تريد");
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
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delivery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delivery().setVisible(true);
            }
        });
    }
    private int clientid;
    private String clientname;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JButton addclient;
    public javax.swing.JButton addorder;
    private javax.swing.JTable deliverytable;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel notes;
    private javax.swing.JLabel phone;
    private javax.swing.JButton searchclient;
    public static javax.swing.JTextField textid;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtnotes;
    private javax.swing.JTextField txtphone;
    private javax.swing.JButton updateclient;
    // End of variables declaration//GEN-END:variables
}
