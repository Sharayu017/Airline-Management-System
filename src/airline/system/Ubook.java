/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.system;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sharayu
 */
public class Ubook extends javax.swing.JFrame {

    /**
     * Creates new form Ubook
     */
    public Ubook() {
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
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        emtx = new javax.swing.JTextField();
        frm = new javax.swing.JComboBox();
        to = new javax.swing.JComboBox();
        don = new com.toedter.calendar.JDateChooser();
        tm = new javax.swing.JComboBox();
        cls = new javax.swing.JComboBox();
        l5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(650,450);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setText("BOOK NOW!!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 361, 60));

        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setText("Email    :");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 29));

        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setText("Point of Departure    :");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 31));

        l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3.setText("Destination    :");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 31));

        l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l4.setText("Date     :");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 60, 32));

        l6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l6.setText("Seat Type     :");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 100, 32));
        getContentPane().add(emtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 211, 34));

        frm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pune ", "Mumbai ", "Goa ", "Delhi ", "Bangalore ", "Hyderabad ", "Chandigarh", "Chennai", "Jaipur", "Ahmeadabad", "Kolkata", "Kochin", "Visakhapatnam" }));
        getContentPane().add(frm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 211, 31));

        to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pune ", "Mumbai ", "Goa ", "Delhi ", "Bangalore ", "Hyderabad ", "Chandigarh", "Chennai", "Jaipur", "Ahmeadabad", "Kolkata", "Kochin", "Visakhapatnam" }));
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 211, 31));
        getContentPane().add(don, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 211, 32));

        tm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "12 AM", "1 AM", "2 AM", "3 AM", "4 AM", "5 AM", "6 AM", "7 AM", "8 AM", "9 AM", "10 AM", "11 AM", "12 PM", "1 PM", "2 PM", "3 PM", "4 PM", "5 PM", "6 PM", "7 PM", "8 PM", "9 PM", "10 PM", "11 PM" }));
        getContentPane().add(tm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 211, 32));

        cls.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economical", "Business" }));
        getContentPane().add(cls, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 211, 32));

        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l5.setText("Time     :");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 32));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 88, 36));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount to pay(in Rs) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        a.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 349, 211, 30));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 370, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 45, 80, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air_image/book.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 610, 410));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           String email=emtx.getText(); 
      String value=frm.getSelectedItem().toString();
      String value1=to.getSelectedItem().toString();
    //date
      Date date= new Date(don.getDate().getTime());
      DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
      String strDate=dateFormat.format(don.getDate());
      
      String time=tm.getSelectedItem().toString();
      String value3=cls.getSelectedItem().toString();
       int a1=Integer.parseInt(a.getText());

     if(email.isEmpty() || value.isEmpty() || value1.isEmpty() || value3.isEmpty() || time.isEmpty() || strDate.isEmpty() ){
      JOptionPane.showMessageDialog(null, "some fields are Empty can not book flight");
      }
     
      else
     {
      
      Connection con=null;
        PreparedStatement pst=null;
                try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arilinedb","root","SQL@2020");
                 pst=con.prepareStatement(" insert into bookings (email,fromp,top,dof, Timing,class,amount )values(?,?,?,?,?,?,?)");
                pst.setString(1, email);
                pst.setString(2, value);
                pst.setString(3, value1);
                pst.setDate(4,date);
                pst.setString(5, time);
                pst.setString(6,value3);
                                pst.setInt(7,a1);

               
               
                int j= pst.executeUpdate();
          if(j>0)
          {
              JOptionPane.showMessageDialog(null,"booking successfully");
          }
          else{
            JOptionPane.showMessageDialog(null,"booking not successfully");
          }
                new Uhome().setVisible(true);
       this.setVisible(false);  
                }
                
                
                
                catch(Exception e){ System.out.println(e);} 
     }         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             
      String value=frm.getSelectedItem().toString();
      String value1=to.getSelectedItem().toString();
    //date
      String value3=cls.getSelectedItem().toString();
     
      Connection con=null;
        PreparedStatement pst=null;
      

                try{  
                Class.forName("com.mysql.jdbc.Driver");  
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/arilinedb","root","SQL@2020");
                  pst=con.prepareStatement("Select amount from amounts where fromp=? and top=? and class=?");
                pst.setString(1, value);
                pst.setString(2, value1);
                pst.setString(3,value3);
                                         ResultSet r= pst.executeQuery();

                if(r.next())
                {
                   
                  a.setText(r.getString("amount"));
                }
                else{
                JOptionPane.showMessageDialog(this,"Flight Unavaliable");
                }
                
                
            
                }
                

                
                catch(Exception e){ System.out.println(e);}// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Uhome().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ubook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JComboBox cls;
    private com.toedter.calendar.JDateChooser don;
    private javax.swing.JTextField emtx;
    private javax.swing.JComboBox frm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JComboBox tm;
    private javax.swing.JComboBox to;
    // End of variables declaration//GEN-END:variables
}
