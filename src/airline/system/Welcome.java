/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.system;

/**
 *
 * @author sharayu
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
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

        ul = new javax.swing.JButton();
        al = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ul.setBackground(new java.awt.Color(102, 102, 102));
        ul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ul.setForeground(new java.awt.Color(255, 255, 255));
        ul.setText("USER LOGIN");
        ul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulActionPerformed(evt);
            }
        });
        getContentPane().add(ul, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 255, -1, 41));

        al.setBackground(new java.awt.Color(102, 102, 102));
        al.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        al.setForeground(new java.awt.Color(255, 255, 255));
        al.setText("ADMIN LOGIN");
        al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alActionPerformed(evt);
            }
        });
        getContentPane().add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 255, -1, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air_image/wc.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulActionPerformed
new Login().setVisible(true);
this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_ulActionPerformed

    private void alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alActionPerformed
new Alogin().setVisible(true);
this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_alActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton al;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ul;
    // End of variables declaration//GEN-END:variables
}
