/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataset.dataPesan;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class framePesan extends javax.swing.JFrame {
    dataPesan pesan;

    /**
     * Creates new form framePesan
     */
    public framePesan() {
        initComponents();
        this.setLocationRelativeTo(null);
        pesan = new dataPesan();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNoPes = new javax.swing.JTextField();
        txtTgl = new javax.swing.JTextField();
        txtTglIn = new javax.swing.JTextField();
        txtTglOut = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        txtNmChas = new javax.swing.JTextField();
        txtToBay = new javax.swing.JTextField();
        txtDP = new javax.swing.JTextField();
        txtSisaBayar = new javax.swing.JTextField();
        txtIndex = new javax.swing.JTextField();
        btnSimpanDataPesan = new javax.swing.JButton();
        btnTampilDataPesan = new javax.swing.JButton();
        btnPesanToDetail_Pesan = new javax.swing.JButton();
        btnPesanToInchas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No Pesan");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Tanggal Check-in");

        jLabel4.setText("Tanggal Check-out");

        jLabel5.setText("Lama");

        jLabel6.setText("Nama Chas");

        jLabel7.setText("Total Bayar");

        jLabel8.setText("Down-Payment");

        jLabel9.setText("Sisa Bayar");

        txtTglOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglOutActionPerformed(evt);
            }
        });

        txtDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDPActionPerformed(evt);
            }
        });

        txtSisaBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSisaBayarActionPerformed(evt);
            }
        });

        txtIndex.setText("0");

        btnSimpanDataPesan.setText("Simpan Data Pesan");
        btnSimpanDataPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDataPesanActionPerformed(evt);
            }
        });

        btnTampilDataPesan.setText("Tampilkan Data");
        btnTampilDataPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilDataPesanActionPerformed(evt);
            }
        });

        btnPesanToDetail_Pesan.setText("Detail Pesan");
        btnPesanToDetail_Pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanToDetail_PesanActionPerformed(evt);
            }
        });

        btnPesanToInchas.setText("InChas");
        btnPesanToInchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanToInchasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpanDataPesan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTglOut, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTglIn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNmChas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtToBay, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNoPes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSisaBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnTampilDataPesan)
                                                .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnPesanToInchas)
                                            .addComponent(btnPesanToDetail_Pesan))))))
                        .addGap(45, 45, 45))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDP, txtLama, txtNmChas, txtNoPes, txtSisaBayar, txtTgl, txtTglIn, txtTglOut, txtToBay});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPesanToDetail_Pesan, btnPesanToInchas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesanToDetail_Pesan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesanToInchas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTglIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTglOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNmChas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtToBay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSisaBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanDataPesan)
                    .addComponent(btnTampilDataPesan))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTglOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglOutActionPerformed

    private void btnSimpanDataPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDataPesanActionPerformed
        // TODO add your handling code here:
        pesan.insertNoPesan(txtNoPes.getText());
        pesan.insertTgl(txtTgl.getText());
        pesan.insertTglIn(txtTglIn.getText());
        pesan.insertTglOut(txtTglOut.getText());
        pesan.insertLama(Integer.valueOf(txtLama.getText()));
        pesan.insertNmChas(txtNmChas.getText());
        pesan.insertToBay(Double.valueOf(txtToBay.getText()));
        pesan.insertDP(Double.valueOf(txtDP.getText()));
        pesan.insertSisaBayar(Double.valueOf(txtSisaBayar.getText()));
        
        JOptionPane.showMessageDialog(this, "Data Pesan Berhasil Disimpan");
    }//GEN-LAST:event_btnSimpanDataPesanActionPerformed

    private void btnTampilDataPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilDataPesanActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(txtIndex.getText());
        
        String isiDataPesan = "No Pesan : "+pesan.getRecordNoPesan().get(i)+
                              "\nTanggal : "+pesan.getRecordTgl().get(i)+
                              "\nTanggal Check-In : "+pesan.getRecordTglIn().get(i)+
                              "\nTanggal Check-Out : "+pesan.getRecordTglOut().get(i)+
                              "\nLama : "+pesan.getRecordLama().get(i)+
                              "\nNama Chas : "+pesan.getRecordNmChas().get(i)+
                              "\nTotal Bayar : "+pesan.getRecordToBay().get(i)+
                              "\nDown-payment : "+pesan.getRecordDP().get(i)+
                              "\nSisa Bayar : "+pesan.getRecordSisaBayar().get(i);
        
        JOptionPane.showMessageDialog(this, isiDataPesan);        
    }//GEN-LAST:event_btnTampilDataPesanActionPerformed

    private void txtSisaBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSisaBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSisaBayarActionPerformed

    private void txtDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDPActionPerformed

    private void btnPesanToDetail_PesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanToDetail_PesanActionPerformed
        // TODO add your handling code here:
        new frameDetail_Pesan().setVisible(true);
    }//GEN-LAST:event_btnPesanToDetail_PesanActionPerformed

    private void btnPesanToInchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanToInchasActionPerformed
        // TODO add your handling code here:
        new frameDetail_Pesan().setVisible(true);
    }//GEN-LAST:event_btnPesanToInchasActionPerformed

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
            java.util.logging.Logger.getLogger(framePesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePesan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesanToDetail_Pesan;
    private javax.swing.JButton btnPesanToInchas;
    private javax.swing.JButton btnSimpanDataPesan;
    private javax.swing.JButton btnTampilDataPesan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDP;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtNmChas;
    private javax.swing.JTextField txtNoPes;
    private javax.swing.JTextField txtSisaBayar;
    private javax.swing.JTextField txtTgl;
    private javax.swing.JTextField txtTglIn;
    private javax.swing.JTextField txtTglOut;
    private javax.swing.JTextField txtToBay;
    // End of variables declaration//GEN-END:variables
}
