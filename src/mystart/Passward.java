/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystart;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author The Prince
 */
public class Passward extends javax.swing.JFrame {

    /**
     * Creates new form Passward
     */
    public Passward() {
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

        lbl = new javax.swing.JLabel();
        txt = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enter Password");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.setSelected(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.setSelected(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    firstfrm f = new firstfrm();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbl.setIcon(help.setScalImage(lbl.getWidth(), lbl.getHeight(), "pass.png"));
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        f.setVisible(true);
        help.setIcon(f);
    }//GEN-LAST:event_jButton2ActionPerformed
    public int x = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Password ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            /////////////////// getting passwords form database
            String s = null;
            String arr[] = new String[5];
            PreparedStatement d, dd;
            try {
                d = help.getConnected().prepareStatement("select * from manager");
                ResultSet r = d.executeQuery();
                r.next();
                s = r.getString(6);
                
                ////////////////////
                dd = help.getConnected().prepareStatement("select * from receptionist");
                ResultSet rr = dd.executeQuery();
                int x = 0;
                while (rr.next()) {
                    arr[x] = rr.getString(8);
                    x++;
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            ////////////////// check password validation
            if (txt.getText().equals(s)) {
                this.dispose();
                Manager m = new Manager();
                m.setVisible(true);
                help.setIcon(m);
                x++;
            } else if (txt.getText().equals(arr[0]) || txt.getText().equals(arr[1]) || txt.getText().equals(arr[2])
                    || txt.getText().equals(arr[3]) || txt.getText().equals(arr[4])) {
                this.dispose();
                Rooms r = new Rooms();
                r.setVisible(true);
                help.setIcon(r);
                x++;
                
                /////////////// take id :
                String st = txt.getText();
                PreparedStatement p;
                try {
                    p = help.getConnected().prepareStatement("select * from receptionist where pass=?");
                    p.setString(1, st);
                    ResultSet rs = p.executeQuery();
                    rs.next();
                    help.Rec_ID = rs.getString(1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Passward.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
                txt.setText("");
                txt.requestFocus();
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (x == 0) {
            f.setVisible(true);
        }
        help.setIcon(f);
    }//GEN-LAST:event_formWindowClosed

    private void txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please Enter Password ", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                /////////////////// getting passwords form database
                String s = null;
                String arr[] = new String[5];
                PreparedStatement d, dd;
                try {
                    d = help.getConnected().prepareStatement("select * from manager");
                    ResultSet r = d.executeQuery();
                    r.next();
                    s = r.getString(6);
                    ////////////////////
                    dd = help.getConnected().prepareStatement("select * from receptionist");
                    ResultSet rr = dd.executeQuery();
                    int x = 0;
                    while (rr.next()) {
                        arr[x] = rr.getString(8);
                        x++;
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

                ////////////////// check password validation
                if (txt.getText().equals(s)) {
                    this.dispose();
                    Manager m = new Manager();
                    m.setVisible(true);
                    help.setIcon(m);
                    x++;
                } else if (txt.getText().equals(arr[0]) || txt.getText().equals(arr[1]) || txt.getText().equals(arr[2])
                        || txt.getText().equals(arr[3]) || txt.getText().equals(arr[4])) {
                    this.dispose();
                    Rooms r = new Rooms();
                    r.setVisible(true);
                    help.setIcon(r);
                    x++;
                    
                    /////////////// take id :
                    String st = txt.getText();
                    PreparedStatement p;
                    try {
                        p = help.getConnected().prepareStatement("select * from receptionist where pass=?");
                        p.setString(1, st);
                        ResultSet rs = p.executeQuery();
                        rs.next();
                        help.Rec_ID = rs.getString(1);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Passward.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong Password", "Error", JOptionPane.ERROR_MESSAGE);
                    txt.setText("");
                    txt.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_txtKeyPressed

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
            java.util.logging.Logger.getLogger(Passward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passward().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl;
    private javax.swing.JPasswordField txt;
    // End of variables declaration//GEN-END:variables
}
