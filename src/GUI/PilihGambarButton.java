/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author USER
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenampilGambardenganButton
     */
    public PilihGambarButton() {
        initComponents();
    }
    
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                PilihGambarButton fullFrame = new PilihGambarButton();
                GraphicsDevice device = 
                        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                fullFrame.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        glassfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgresqlBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonPanel.setBackground(new java.awt.Color(51, 255, 255));

        glassfishBT.setText("Glassfish");
        glassfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishBTActionPerformed(evt);
            }
        });
        buttonPanel.add(glassfishBT);

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });
        buttonPanel.add(javaeeBT);

        postgresqlBT.setText("PostgreSQL");
        postgresqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlBTActionPerformed(evt);
            }
        });
        buttonPanel.add(postgresqlBT);

        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setBackground(new java.awt.Color(255, 255, 255));
        imagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/glassfish-logo.jpg"))); // NOI18N
        imagePanel.add(jLabel1, "0");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/javaee.jpg"))); // NOI18N
        imagePanel.add(jLabel2, "1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/PostgreSQL.md.jpg"))); // NOI18N
        imagePanel.add(jLabel3, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void glassfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "0");
    }//GEN-LAST:event_glassfishBTActionPerformed

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void postgresqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "2");
    }//GEN-LAST:event_postgresqlBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton glassfishBT;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JButton postgresqlBT;
    // End of variables declaration//GEN-END:variables
}
