/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sharayu
 */
public class Alogin extends javax.swing.JFrame {

    /**
     * Creates new form Alogin
     */
    public Alogin() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b_adminlogin = new javax.swing.JButton();
        txt_adminpass = new javax.swing.JPasswordField();
        txt_adminid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Admin Log In Page");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 301, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Id ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 105, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 105, 42));

        b_adminlogin.setBackground(new java.awt.Color(0, 0, 0));
        b_adminlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_adminlogin.setForeground(new java.awt.Color(255, 255, 255));
        b_adminlogin.setText("Log In ");
        b_adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_adminloginActionPerformed(evt);
            }
        });
        getContentPane().add(b_adminlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 268, 120, 40));

        txt_adminpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminpassActionPerformed(evt);
            }
        });
        getContentPane().add(txt_adminpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, 30));
        getContentPane().add(txt_adminid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 160, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air_image/adm.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 650, 450));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_adminloginActionPerformed
        String id=txt_adminid.getText();
        String pass=txt_adminpass.getText();

        if(id.isEmpty() && pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Log in credential is Empty");
        }

        else{
            Connection con=null;
            PreparedStatement pst=null;
            ResultSet rst=null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","dbms1414");

                //    query for insert data into table

                pst=con.prepareStatement("  Select id,password from admin where id=? and password=?");

                pst.setString(1,id);
                pst.setString(2,pass);

                rst= pst.executeQuery();
                if (rst.next())
                {
                    // new home().setVisible(true);
                    //this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "access granted");
                    new Ahome().setVisible(true);
                    this.setVisible(false);
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "access denied");
                }

                //new home().setVisible(true);
                //this.setVisible(false);

                // new reginfo().setVisible(true);

                // this.setVisible(false);
            }catch(Exception e){ System.out.println(e);}

        }

    }//GEN-LAST:event_b_adminloginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Welcome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_adminpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adminpassActionPerformed

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
            java.util.logging.Logger.getLogger(Alogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_adminlogin;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_adminid;
    private javax.swing.JPasswordField txt_adminpass;
    // End of variables declaration//GEN-END:variables
}