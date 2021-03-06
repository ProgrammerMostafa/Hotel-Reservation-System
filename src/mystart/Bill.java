/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystart;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author The Prince
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
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
        Price = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        chkin = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        rec_id = new javax.swing.JLabel();
        BillN = new javax.swing.JLabel();
        RNum = new javax.swing.JLabel();
        chkout = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        Price.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Price.setText("Total Price : ");
        jPanel1.add(Price);
        Price.setBounds(370, 220, 257, 15);

        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setText("Customer ID : ");
        jPanel1.add(id);
        id.setBounds(370, 130, 257, 15);

        chkin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkin.setText("Check in : ");
        jPanel1.add(chkin);
        chkin.setBounds(10, 90, 365, 15);

        Name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Name.setText("Customer Name : ");
        jPanel1.add(Name);
        Name.setBounds(10, 130, 365, 15);

        rec_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rec_id.setText("Receptionist ID : ");
        jPanel1.add(rec_id);
        rec_id.setBounds(10, 220, 365, 15);

        BillN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BillN.setText("Bill Number : ");
        jPanel1.add(BillN);
        BillN.setBounds(370, 170, 257, 20);

        RNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RNum.setText("Room Number : ");
        jPanel1.add(RNum);
        RNum.setBounds(10, 170, 365, 15);

        chkout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkout.setText("Check out : ");
        jPanel1.add(chkout);
        chkout.setBounds(370, 90, 257, 15);

        jButton1.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 51));
        jButton1.setText("Done");
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(590, 260, 80, 29);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Golden Hotel ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 189, 44);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Our Hopes To Spend Enjoing Times ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 270, 310, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        PreparedStatement d;
        try {
            d = help.getConnected().prepareStatement("insert into rec_cust values (?,?)");
            d.setString(1, help.Rec_ID);
            d.setString(2, help.Cust_ID);
            d.executeUpdate();
            
            d = help.getConnected().prepareStatement("insert into rec_room values (?,?)");
            d.setString(1, help.Rec_ID);
            d.setString(2, help.roomNum.toString());
            d.executeUpdate();
            
            d = help.getConnected().prepareStatement("insert into rec_cust_bill values (?,?,?)");
            d.setString(1, help.Rec_ID);
            d.setString(2, help.Cust_ID);
            d.setString(3, help.bill_ID);
            d.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /////////// return bed type
        int price = 0;
        try {
            PreparedStatement st=help.getConnected().prepareStatement("select * from rooms where Room_Number = ? ");
            st.setString(1, help.roomNum.toString());
            ResultSet rt=st.executeQuery();
            rt.next();
            String bed_type=rt.getString(1);
            if(bed_type.equals("single"))
                price=300;
            else
                price=550;
            
        } catch (SQLException ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ///////////Format date :
        Date co = help.dout;
        Date ci = help.din;
        String totalprice=Integer.toString(help.days*price);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        
        /////////// insert into bill :
        try {
            PreparedStatement d=help.getConnected().prepareStatement("insert into bill (Check_in,Check_out,Rec_ID,Cust_ID,Cust_Name,Room_Number,Total_Payment) values (?,?,?,?,?,?,?)");
            d.setString(1, s.format(ci));
            d.setString(2, s.format(co));
            d.setString(3, help.Rec_ID);
            d.setString(4, help.Cust_ID);
            d.setString(5, help.Cust_Name);
            d.setString(6, help.roomNum.toString());
            d.setString(7, totalprice);
            d.executeUpdate();
            
            d=help.getConnected().prepareStatement("select * from bill where Check_in=? and Check_out =? and total_payment=? ");
            d.setString(1, s.format(ci));
            d.setString(2, s.format(co));
            d.setString(3, totalprice);
            ResultSet rst=d.executeQuery();
            rst.next();
            help.bill_ID=rst.getString(1);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        chkin.setText(chkin.getText()+"  "+s.format(ci));
        chkout.setText(chkout.getText()+"  "+s.format(co));
        Name.setText(Name.getText()+"  "+help.Cust_Name);
        id.setText(id.getText()+"  "+help.Cust_ID);
        RNum.setText(RNum.getText()+"  "+help.roomNum);
        BillN.setText(BillN.getText()+"  "+ help.bill_ID);
        rec_id.setText(rec_id.getText()+"  "+help.Rec_ID);
        Price.setText(Price.getText()+"  "+totalprice+"  $");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BillN;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel RNum;
    private javax.swing.JLabel chkin;
    private javax.swing.JLabel chkout;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rec_id;
    // End of variables declaration//GEN-END:variables
}
