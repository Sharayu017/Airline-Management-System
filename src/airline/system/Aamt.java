/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sharayu
 */
public class Aamt extends javax.swing.JFrame {

    /**
     * Creates new form Abooking
     */
    public Aamt() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        d = new javax.swing.JComboBox();
        s = new javax.swing.JComboBox();
        setb = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        p = new javax.swing.JTextField();
        c = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Destination :");
        jLabel1.setAlignmentX(10.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Point of Departure :");
        jLabel2.setAlignmentX(10.0F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, 37));

        d.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pune ", "Mumbai ", "Goa ", "Delhi ", "Bangalore ", "Hyderabad ", "Chandigarh", "Chennai", "Jaipur", "Ahmeadabad", "Kolkata", "Kochin", "Visakhapatnam" }));
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 98, 30));

        s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pune ", "Mumbai ", "Goa ", "Delhi ", "Bangalore ", "Hyderabad ", "Chandigarh", "Chennai", "Jaipur", "Ahmeadabad", "Kolkata", "Kochin", "Visakhapatnam" }));
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 86, 98, 30));

        setb.setBackground(new java.awt.Color(0, 0, 0));
        setb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        setb.setForeground(new java.awt.Color(255, 255, 255));
        setb.setText("Set");
        setb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setbActionPerformed(evt);
            }
        });
        getContentPane().add(setb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 35));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Amount :");
        jLabel4.setAlignmentX(10.0F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, 31));
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 98, 31));

        c.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Business", "Economical" }));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 98, 32));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seat type :");
        jLabel5.setAlignmentX(10.0F);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 80, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 44, -1, 35));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air_image/adm.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -6, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setbActionPerformed
String s1= (String) s.getSelectedItem();
       String d1= (String) d.getSelectedItem();

PreparedStatement stmt = null;
int p1=Integer.parseInt(p.getText());

String c1=(String)c.getSelectedItem();
try{
          try {   
              Class.forName("com.mysql.jdbc.Driver");
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
          }
 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/arilinedb","root","SQL@2020");
 stmt =con.prepareStatement("insert into amounts values(?,?,?,?)");
 
 stmt.setString(1,s1);
 stmt.setString(2,d1);
  stmt.setString(3,c1);
 stmt.setInt(4,p1);
 
int i=stmt.executeUpdate();
 JOptionPane.showMessageDialog(this,"RECORD ADDED SUCCESSFULLY");
}
 catch(SQLException e){ 
     System.out.println(e);
 }









// TODO add your handling code here:
    }//GEN-LAST:event_setbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Ahome().setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

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
            java.util.logging.Logger.getLogger(Aamt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aamt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aamt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aamt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aamt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c;
    private javax.swing.JComboBox d;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField p;
    private javax.swing.JComboBox s;
    private javax.swing.JButton setb;
    // End of variables declaration//GEN-END:variables
}
