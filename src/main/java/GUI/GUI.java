/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Code.PermutasiIteratif;
import Code.PermutasiRekursif;
import java.math.BigInteger;
/**
 *
 * @author Dewanta Rahma Satria
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_topbar = new javax.swing.JPanel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_MInimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Unsur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_Elemen = new javax.swing.JTextField();
        jButton_Iteratif = new javax.swing.JButton();
        jButton_Rekursif = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextOutput = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RunningTime = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(100, 204, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Aplikasi Perhitungan Permutasi");

        jPanel_topbar.setBackground(new java.awt.Color(200, 200, 200));

        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Close.setText("X");
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel_MInimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_MInimize.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_MInimize.setText("-");
        jLabel_MInimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MInimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_topbarLayout = new javax.swing.GroupLayout(jPanel_topbar);
        jPanel_topbar.setLayout(jPanel_topbarLayout);
        jPanel_topbarLayout.setHorizontalGroup(
            jPanel_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_topbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_MInimize, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_topbarLayout.setVerticalGroup(
            jPanel_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel_MInimize, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Masukkan Jumlah Unsur");

        jTextField_Unsur.setBackground(new java.awt.Color(221, 221, 221));
        jTextField_Unsur.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jTextField_Unsur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UnsurActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 30, 30));
        jLabel5.setText("Masukkan Jumlah Elemen");

        jTextField_Elemen.setBackground(new java.awt.Color(221, 221, 221));

        jButton_Iteratif.setText("Iteratif");
        jButton_Iteratif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IteratifActionPerformed(evt);
            }
        });

        jButton_Rekursif.setText("Rekursif");
        jButton_Rekursif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RekursifMouseClicked(evt);
            }
        });
        jButton_Rekursif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RekursifActionPerformed(evt);
            }
        });

        jTextOutput.setBackground(new java.awt.Color(221, 221, 221));
        jTextOutput.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jTextOutput);

        jLabel6.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 30, 30));
        jLabel6.setText("Hasil");

        RunningTime.setBackground(new java.awt.Color(100, 204, 255));
        RunningTime.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        RunningTime.setForeground(new java.awt.Color(30, 30, 30));
        jScrollPane2.setViewportView(RunningTime);

        jLabel1.setFont(new java.awt.Font("Gilroy-SemiBold", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Running Time:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton_Iteratif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Rekursif)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Unsur)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_Elemen, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Unsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Elemen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Iteratif)
                    .addComponent(jButton_Rekursif))
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 15, 433, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_UnsurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UnsurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UnsurActionPerformed

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jLabel_MInimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MInimizeMouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_jLabel_MInimizeMouseClicked

    private void jButton_IteratifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IteratifActionPerformed
        // TODO add your handling code here:
        long startIteratif = System.nanoTime();
        BigInteger result = PermutasiIteratif.permutasi(Integer.parseInt(jTextField_Unsur.getText()), Integer.parseInt(jTextField_Elemen.getText()));
        long endIteratif = System.nanoTime();
        String value = result.toString();
        jTextOutput.setText(value);
        long resultRt = endIteratif - startIteratif;
        String rt = String.valueOf(resultRt);
        RunningTime.setText(rt+" nanosecond");
    }//GEN-LAST:event_jButton_IteratifActionPerformed

    private void jButton_RekursifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RekursifMouseClicked
        
    }//GEN-LAST:event_jButton_RekursifMouseClicked

    private void jButton_RekursifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RekursifActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        long startRekursif = System.nanoTime();
        BigInteger result = PermutasiRekursif.permutasi(Integer.parseInt(jTextField_Unsur.getText()), Integer.parseInt(jTextField_Elemen.getText()));
        long endRekursif = System.nanoTime();
        String value = result.toString();
        jTextOutput.setText(value);
        long resultRt = endRekursif - startRekursif;
        String rt = String.valueOf(resultRt);
        RunningTime.setText(rt + " nanosecond");
    }//GEN-LAST:event_jButton_RekursifActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane RunningTime;
    private javax.swing.JButton jButton_Iteratif;
    private javax.swing.JButton jButton_Rekursif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_MInimize;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_topbar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_Elemen;
    private javax.swing.JTextField jTextField_Unsur;
    private javax.swing.JTextPane jTextOutput;
    // End of variables declaration//GEN-END:variables
}
