/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Ashutosh
 */
public class f2 extends javax.swing.JFrame 
{
    public f2() 
    {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(705, 425);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        pa1 = new javax.swing.JPasswordField();
        l5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new java.awt.CardLayout());

        p1.setLayout(null);

        l1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l1.setText("NAME");
        p1.add(l1);
        l1.setBounds(208, 90, 63, 22);
        p1.add(t1);
        t1.setBounds(303, 91, 181, 30);

        l2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l2.setText("E-MAIL");
        p1.add(l2);
        l2.setBounds(208, 133, 60, 17);
        p1.add(t2);
        t2.setBounds(303, 130, 181, 30);

        l3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l3.setText("USERNAME");
        p1.add(l3);
        l3.setBounds(208, 171, 77, 17);

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        p1.add(t3);
        t3.setBounds(303, 168, 181, 30);

        l4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l4.setText("PASSWORD");
        p1.add(l4);
        l4.setBounds(208, 209, 77, 17);

        l6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l6.setText("BRANCH");
        p1.add(l6);
        l6.setBounds(208, 277, 77, 17);

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science & Engineering", "Mechanical Engineering", "Electronics & Communication Engineering", "Electrical Engineering", "Civil Engineering" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        p1.add(cb1);
        cb1.setBounds(303, 274, 179, 30);

        b3.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        b3.setText("SIGN UP");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        p1.add(b3);
        b3.setBounds(174, 322, 140, 51);

        b4.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        b4.setText("LOGIN");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        p1.add(b4);
        b4.setBounds(388, 322, 125, 51);
        p1.add(pa1);
        pa1.setBounds(303, 206, 181, 30);

        l5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l5.setText("YEAR");
        p1.add(l5);
        l5.setBounds(208, 240, 50, 21);
        p1.add(t4);
        t4.setBounds(303, 240, 179, 30);

        jButton1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        p1.add(jButton1);
        jButton1.setBounds(20, 20, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se/white_background_dents_bumps_texture_69592_800x600.jpg"))); // NOI18N
        p1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 400);

        getContentPane().add(p1, "c1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        new f3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
            String s1 = t1.getText() ;
            String s2 = t2.getText() ;
            Emailvalidator emailValidator = new Emailvalidator();
            if(!emailValidator.validate(s2.trim())) 
            {
                JOptionPane.showMessageDialog(null,"You have enetered an invalid ID. Please Try Again !!");
            }
            String s3 = t3.getText() ;
            String s4 = new String(pa1.getPassword());
            String s5 = t4.getText() ;
            String s6 = (String) cb1.getSelectedItem() ; 
        try
        {    
            DBConnect.st.executeQuery("insert into login values('"+s1+"','"+s2+"','"+s3+"','"+s4+"',"+s5+",'"+s6+"')") ;        
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "Congratulations! You just became a part of SCAM.");
    }//GEN-LAST:event_b3ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NewJFrame1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f2().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JPanel p1;
    private javax.swing.JPasswordField pa1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}