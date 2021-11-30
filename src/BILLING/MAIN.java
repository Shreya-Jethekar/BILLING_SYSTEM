/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BILLING;

import ADD_USER.add_user;
import SLIP.RECIPT;
import UPDATE_USER.update_user;
import java.awt.Component;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHREYA
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form MAIN
     */
    public MAIN() {
        initComponents();
        upDB();
       
    }
  public  String item_name,name;
  public int total;
public String c0,c1="",c2,c3,c4,c5;

//public String a="asdf";

    Connection con1;
PreparedStatement ps; 


   public void upDB(){
          int c;
    try{
         con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","shreya22@");
           ps=con1.prepareStatement("SELECT * FROM java_billing_system.item");
    ResultSet re=ps.executeQuery();
    ResultSetMetaData Rss=re.getMetaData();
    c=Rss.getColumnCount();
     DefaultTableModel df=(DefaultTableModel)CN_TABLE.getModel();
         df.setRowCount(0);
         while(re.next())
         {
             Vector v2=new Vector();
             for(int a=1;a<=c;a++)
             {
//id, cus_name, cus_number, item, quantity, total
                 v2.add(re.getString("id"));
                 v2.add(re.getString("cus_name"));
                 v2.add(re.getString("cus_number"));
                 v2.add(re.getString("item"));
                 v2.add(re.getString("quantity"));
                 v2.add(re.getString("total"));
                
             }
             
             df.addRow(v2);
         }
    }   catch(SQLException ex)
{
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
}
    
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CN_name = new javax.swing.JTextField();
        CN_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CN_number = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CN_quantity = new javax.swing.JTextField();
        CN_UPDATE = new javax.swing.JButton();
        CN_RESET = new javax.swing.JButton();
        CN_ADD = new javax.swing.JButton();
        CN_SLIP = new javax.swing.JButton();
        CN_TOTAL = new javax.swing.JButton();
        CN_PRINT = new javax.swing.JButton();
        CN_total = new javax.swing.JTextField();
        CM_CN_itemname = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CN_TABLE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("                 BILLING");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("  Customer Name:");

        CN_name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        CN_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("  Customer Number:");

        CN_number.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("  Item name:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Quantity:");

        CN_quantity.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        CN_UPDATE.setBackground(new java.awt.Color(153, 153, 153));
        CN_UPDATE.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_UPDATE.setText("UPDATE");
        CN_UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_UPDATEActionPerformed(evt);
            }
        });

        CN_RESET.setBackground(new java.awt.Color(153, 153, 153));
        CN_RESET.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_RESET.setText("RESET");
        CN_RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_RESETActionPerformed(evt);
            }
        });

        CN_ADD.setBackground(new java.awt.Color(153, 153, 153));
        CN_ADD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_ADD.setText("ADD");
        CN_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_ADDActionPerformed(evt);
            }
        });

        CN_SLIP.setBackground(new java.awt.Color(153, 153, 153));
        CN_SLIP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_SLIP.setText("SLIP");
        CN_SLIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_SLIPActionPerformed(evt);
            }
        });

        CN_TOTAL.setBackground(new java.awt.Color(153, 153, 153));
        CN_TOTAL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_TOTAL.setText("TOTAL");
        CN_TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_TOTALActionPerformed(evt);
            }
        });

        CN_PRINT.setBackground(new java.awt.Color(153, 153, 153));
        CN_PRINT.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CN_PRINT.setText("PRINT");
        CN_PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CN_PRINTActionPerformed(evt);
            }
        });

        CN_total.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        CM_CN_itemname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Item 1", "Item 2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(319, Short.MAX_VALUE)
                        .addComponent(CN_id, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CM_CN_itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CN_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CN_name, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CN_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CN_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CN_SLIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CN_UPDATE))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CN_RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CN_PRINT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(CN_number, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(CN_total, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CN_id, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_number, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CM_CN_itemname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(CN_total, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CN_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CN_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_SLIP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CN_PRINT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        CN_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "cus_name", "cus_number", "item_name", "quantity", "total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CN_TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CN_TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CN_TABLE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    Connection con1;
//PreparedStatement ps; 

     private void insert(){
//      if(a_username.isBlank() ){
//             JOptionPane.showMessageDialog(frame,"Username cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);         
//      }
//      else if(a_password.isBlank() ){
//             JOptionPane.showMessageDialog(frame,"Password cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);  
//          }
//      else if(a_address.isBlank() ){
//             JOptionPane.showMessageDialog(frame,"Address cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);  
//          }
//      else if(a_phone.isBlank() ){
//             JOptionPane.showMessageDialog(frame,"Phone cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);  
//          }
//      else{
//c5=CNInteger.toString(total)
TOTAL();
    CN_total.setText(Integer.toString(total));
    
             if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Add New USER","Billing System",
             JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
//                   JOptionPane.showMessageDialog(frame,"User are ready to go.......","Alert",JOptionPane.WARNING_MESSAGE);  
            try {
           con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","shreya22@");
           ps=con1.prepareStatement("INSERT into java_billing_system.item(cus_name, cus_number,item, quantity, total)VALUES(?,?,?,?,?)");
           ps.setString(1,c1);
           ps.setString(2,c2);
           ps.setString(3,c3);
           ps.setString(4,c4);
           ps.setString(5,c5);
           ps.executeUpdate();
           
       } catch (SQLException ex) {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
       }
             JOptionPane.showMessageDialog(frame,"User added sucessfully","Alert",JOptionPane.WARNING_MESSAGE);  
     
            CN_name.setText("");
            CN_number.setText("");
//            CM_CN_itemname.setText("");
            CN_quantity.setText("");
            CN_id.setText("");
            CN_total.setText("");
//      }

            
    }
    private void CN_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_ADDActionPerformed
        c0=CN_id.getText();   
        c1=CN_name.getText();
        c2=CN_number.getText();
//        c3=CN_itemname.getText();
       item_name=CM_CN_itemname.getSelectedItem().toString();
       c3=item_name;
        c4=CN_quantity.getText();
          TOTAL();
        c5=CN_total.getText();

         insert();
        upDB();
    }//GEN-LAST:event_CN_ADDActionPerformed
private JFrame frame;
    private void CN_RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_RESETActionPerformed

          int CancelItem=JOptionPane.showConfirmDialog(frame, "Confirm if you want to RESET","Warning",
            JOptionPane.YES_NO_OPTION);
             if(CancelItem ==JOptionPane.YES_OPTION){
        CN_name.setText("");
        CN_number.setText("");
//        CN_itemname.setText("");
//item_name=CM_CN_itemname.getSelectedItem().toString();
       CM_CN_itemname.setSelectedIndex(0);
        CN_quantity.setText("");
          CN_id.setText("");
          CN_total.setText("");
             }
    }//GEN-LAST:event_CN_RESETActionPerformed

    private void CN_TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CN_TABLEMouseClicked
        
             //********************Selection Query****************************//
//         D();
         DefaultTableModel df=(DefaultTableModel)CN_TABLE.getModel();
         int selectedRowIndex=CN_TABLE.getSelectedRow();
          CN_id.setText(df.getValueAt(selectedRowIndex,0).toString());
        CN_name.setText(df.getValueAt(selectedRowIndex,1).toString());
        CN_number.setText(df.getValueAt(selectedRowIndex,2).toString());
        CM_CN_itemname.setSelectedItem(df.getValueAt(selectedRowIndex,3).toString());
        CN_quantity.setText(df.getValueAt(selectedRowIndex,4).toString());
        CN_total.setText(df.getValueAt(selectedRowIndex,5).toString());
    
    }//GEN-LAST:event_CN_TABLEMouseClicked
public void TOTAL(){
      c4=CN_quantity.getText();
       item_name=CM_CN_itemname.getSelectedItem().toString();
       
        if(CM_CN_itemname.getSelectedIndex() ==0){
             JOptionPane.showMessageDialog(frame,"Item name cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);         
                
        }
        if(CM_CN_itemname.getSelectedIndex() ==1){
//             JOptionPane.showMessageDialog(frame,"Item name cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);         
                total=200*Integer.parseInt(c4);
                CN_total.setText(Integer.toString(total));
        }
        if(CM_CN_itemname.getSelectedIndex() ==2){
//             JOptionPane.showMessageDialog(frame,"Item name cant't be empty.","Alert",JOptionPane.WARNING_MESSAGE);         
                total=100*Integer.parseInt(c4);
                 CN_total.setText(Integer.toString(total));
        }
}
    private void CN_TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_TOTALActionPerformed
           TOTAL();
       
        
    }//GEN-LAST:event_CN_TOTALActionPerformed
 public void Update(){
  
         try {
              int updateItem=JOptionPane.showConfirmDialog(frame, "Confirm if you want to Update","Warning",
            JOptionPane.YES_NO_OPTION);
             if(updateItem ==JOptionPane.YES_OPTION){
             c0 =CN_id.getText();
           con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","shreya22@");
           ps=con1.prepareStatement("UPDATE java_billing_system.item set  cus_name=?, cus_number=?,item=?, quantity=?, total=? where id=?");
           ps.setString(1,c1);
           ps.setString(2,c2);
           ps.setString(3,c3);
           ps.setString(4,c4);
           ps.setString(5,c5);
           ps.setString(6, c0);
           ps.executeUpdate();
           upDB();
             }
           
       } catch (SQLException ex) {
           Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
    private void CN_UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_UPDATEActionPerformed
        c0=CN_id.getText();   
        c1=CN_name.getText();
        c2=CN_number.getText();
//        c3=CN_itemname.getText();
        c4=CN_quantity.getText();
        c5=CN_total.getText();
        Update();
    }//GEN-LAST:event_CN_UPDATEActionPerformed

   
    private void CN_SLIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_SLIPActionPerformed
       
   c0=CN_id.getText();   
        c1=CN_name.getText();
        c2=CN_number.getText();
       item_name=CM_CN_itemname.getSelectedItem().toString();
       c3=item_name;
        c4=CN_quantity.getText();
          TOTAL();
        c5=CN_total.getText();
   Random r=new Random();
        int reg=r.nextInt(110)+0;
        Date dt=new Date();
        String date =dt.toString();
        int tax=20;
        int i=tax +Integer.parseInt(c5);
     RECIPT a= new RECIPT();
     RECIPT.jTextArea1_txt.setText("\n*******************************************"
                                                    +"\n\t\trecipt no:"+reg+"\n\t\tdate:"+date
                                                   +"\n\n\tXYZ MART ..................."
                                                   +"\n\tMob No.11543878445"
                                                   +"\n\tAddress- Sadar Nagpur"
                              +"\n--------------------------------------------------------------------\n"
                        +"\nCustumer Name :-"        + "  " +c1
                        +"\nCustumer Mobile No :-"   +" " +c2
                        +"\n********************************************"
                        +"\n********************************************"
                        +"\nName of each item  :-\t"    +c3
                        +"\nQuantity of item  :-\t"    +c4
                        +"\nTotal cost of items  :-\t"    +c5
                        +"\nTotal Tax  :-\t"                   +tax
                        +"\nTotal Cost to be Paid  :-\t"  +  (i)      
                        +"\n\n--------------------------------------------------------"
                       +"\n\n\nThank You ................."
                              + "\n\tVisit Again................................. "
            );
      a.setVisible(true);
    }//GEN-LAST:event_CN_SLIPActionPerformed

    private void CN_PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CN_PRINTActionPerformed
       try {
           RECIPT.jTextArea1_txt.print();
//            RECIPT.print();
        } catch (PrinterException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CN_PRINTActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CM_CN_itemname;
    private javax.swing.JButton CN_ADD;
    private javax.swing.JButton CN_PRINT;
    private javax.swing.JButton CN_RESET;
    private javax.swing.JButton CN_SLIP;
    private javax.swing.JTable CN_TABLE;
    private javax.swing.JButton CN_TOTAL;
    private javax.swing.JButton CN_UPDATE;
    private javax.swing.JTextField CN_id;
    public static javax.swing.JTextField CN_name;
    private javax.swing.JTextField CN_number;
    private javax.swing.JTextField CN_quantity;
    private javax.swing.JTextField CN_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
