/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;
    
public class S_UI_Manage extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public S_UI_Manage(String exit) {
        initComponents();
        try {
            String url = "jdbc:mysql://localhost/Apple_iStore";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!...");
        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
        combo();
    }
    public void combo()
    {
        String sql = "SELECT * FROM catagory";
          try {
            

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    catComBox.addItem(rs.getString("Catagory"));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Product Records Not Found!");
            }

        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        additmbtn = new javax.swing.JButton();
        lgoutbtn = new javax.swing.JButton();
        salesbtn = new javax.swing.JButton();
        addnewcat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pronamelb = new javax.swing.JLabel();
        proidlb = new javax.swing.JLabel();
        catlb = new javax.swing.JLabel();
        pricelb = new javax.swing.JLabel();
        quantitylb = new javax.swing.JLabel();
        pronametxt = new javax.swing.JTextField();
        proidtxt = new javax.swing.JTextField();
        pricetxt = new javax.swing.JTextField();
        quantitytxt = new javax.swing.JTextField();
        catComBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttbl = new javax.swing.JTable();
        trefresh = new javax.swing.JButton();
        ncatlb = new javax.swing.JLabel();
        CATID = new javax.swing.JTextField();
        ncatlb1 = new javax.swing.JLabel();
        ncattxt1 = new javax.swing.JTextField();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(726, 599));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        additmbtn.setBackground(new java.awt.Color(153, 0, 0));
        additmbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        additmbtn.setForeground(new java.awt.Color(255, 255, 255));
        additmbtn.setText("Add");
        additmbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additmbtnActionPerformed(evt);
            }
        });

        lgoutbtn.setBackground(new java.awt.Color(153, 0, 0));
        lgoutbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lgoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        lgoutbtn.setText("Logout");
        lgoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgoutbtnActionPerformed(evt);
            }
        });

        salesbtn.setBackground(new java.awt.Color(153, 0, 0));
        salesbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        salesbtn.setForeground(new java.awt.Color(255, 255, 255));
        salesbtn.setText("Sales");
        salesbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesbtnActionPerformed(evt);
            }
        });

        addnewcat.setBackground(new java.awt.Color(153, 0, 0));
        addnewcat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addnewcat.setForeground(new java.awt.Color(255, 255, 255));
        addnewcat.setText("Add New Catagory");
        addnewcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewcatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(additmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lgoutbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addnewcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(additmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(salesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(addnewcat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(lgoutbtn))
        );

        pronamelb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pronamelb.setText("Product Name");

        proidlb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        proidlb.setText("Product ID");

        catlb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        catlb.setText("Catagory");

        pricelb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricelb.setText("Price");

        quantitylb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantitylb.setText("Quantity");

        quantitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitytxtActionPerformed(evt);
            }
        });

        catComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catComBoxActionPerformed(evt);
            }
        });

        producttbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Catagory", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(producttbl);

        trefresh.setBackground(new java.awt.Color(153, 0, 0));
        trefresh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        trefresh.setForeground(new java.awt.Color(255, 255, 255));
        trefresh.setText("Refresh");
        trefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trefreshActionPerformed(evt);
            }
        });

        ncatlb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ncatlb.setText("New Catagory");

        ncatlb1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ncatlb1.setText("Catagory ID");

        reset.setBackground(new java.awt.Color(153, 0, 0));
        reset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(quantitylb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(pronamelb))
                            .addComponent(proidlb)
                            .addComponent(ncatlb1)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(reset)
                                .addComponent(ncatlb)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(proidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pronametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ncattxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CATID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(trefresh)
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(catlb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(catComBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pricelb, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pronamelb)
                    .addComponent(pronametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proidlb)
                    .addComponent(proidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ncattxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ncatlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CATID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ncatlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catlb)
                    .addComponent(catComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricelb)
                    .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantitylb)
                    .addComponent(quantitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(trefresh))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void additmbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additmbtnActionPerformed
       try {
            String name = pronametxt.getText();
            int id = Integer.parseInt(proidtxt.getText());
            String cat = String.valueOf(catComBox.getSelectedItem());
            String price = pricetxt.getText();
            String qun = quantitytxt.getText();

            String sql = "INSERT INTO product_details VALUES(?,?,?,?,?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(1, name);
            pst.setInt(2, id);
            pst.setString(3, cat);
            pst.setString(5, price);
            pst.setString(6, qun);
            
            

            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "User Record Inserted");
                clear();
            }
            
        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
    }//GEN-LAST:event_additmbtnActionPerformed

    private void lgoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgoutbtnActionPerformed
        // TODO add your handling code here:
        S_UI_Manage frame = new S_UI_Manage ("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit" , "EXIT" ,
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_lgoutbtnActionPerformed

    private void quantitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantitytxtActionPerformed

    private void salesbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesbtnActionPerformed
        // TODO add your handling code here:
        dispose();
        S_UI_SALES sale = new S_UI_SALES("EXIT");
        sale.show();
    }//GEN-LAST:event_salesbtnActionPerformed

    private void trefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trefreshActionPerformed
        // TODO add your handling code here:
          try {
            String sql = "SELECT * FROM product_details";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) producttbl.getModel();
            model.setRowCount(0);
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    model.addRow(new String[]{rs.getString(2), rs.getString(1),
                        rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(5)});
                }
            } else {
                JOptionPane.showMessageDialog(this, "Students Records Not Found!");
            }

        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
       
    }//GEN-LAST:event_trefreshActionPerformed

    private void addnewcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewcatActionPerformed
        // TODO add your handling code here:
             
        
          try {
              String item = ncattxt1.getText();
              catComBox.addItem(item);
              item = ncattxt1.getText();
              String ID = CATID.getText();
              String sql = "INSERT INTO catagory VALUES(?,?)";

            pst = conn.prepareStatement(sql);

            pst.setString(2, item);
            pst.setString(1, ID);
            
            
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, " Record Inserted");
                clear();
            }else{
                JOptionPane.showMessageDialog(this, " Record Field Empty");
                clear();
            }
            
        } catch (Exception ex) {
            System.out.println("Erorr : " + ex.getMessage());
        }
        
    }//GEN-LAST:event_addnewcatActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        pronametxt.setText("");
        proidtxt.setText("");
        ncattxt1.setText("");
        CATID.setText("");
        pricetxt.setText("");
        quantitytxt.setText("");
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void catComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catComBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_catComBoxActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(S_UI_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_UI_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_UI_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_UI_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S_UI_Manage("EXIT").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CATID;
    private javax.swing.JButton additmbtn;
    private javax.swing.JButton addnewcat;
    private javax.swing.JComboBox<String> catComBox;
    private javax.swing.JLabel catlb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lgoutbtn;
    private javax.swing.JLabel ncatlb;
    private javax.swing.JLabel ncatlb1;
    private javax.swing.JTextField ncattxt1;
    private javax.swing.JLabel pricelb;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JTable producttbl;
    private javax.swing.JLabel proidlb;
    private javax.swing.JTextField proidtxt;
    private javax.swing.JLabel pronamelb;
    private javax.swing.JTextField pronametxt;
    private javax.swing.JLabel quantitylb;
    private javax.swing.JTextField quantitytxt;
    private javax.swing.JButton reset;
    private javax.swing.JButton salesbtn;
    private javax.swing.JButton trefresh;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
