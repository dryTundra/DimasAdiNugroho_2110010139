/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import dataset.dataInchas;

/**
 *
 * @author Asus
 */
import dataset.dataInchas;
import javax.swing.JOptionPane;

public class frameInchas extends javax.swing.JFrame {
    dataInchas inchas;

    /**
     * Creates new form frameInchas
     */
    public frameInchas() {
        initComponents();
        this.setLocationRelativeTo(null);
        inchas = new dataInchas();
        
        txtHargaChas.setEditable(false);
        txtTotalChas.setEditable(false);
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
        txtNoPes = new javax.swing.JTextField();
        txtHargaChas = new javax.swing.JTextField();
        txtPax = new javax.swing.JTextField();
        txtTotalChas = new javax.swing.JTextField();
        txtIndex = new javax.swing.JTextField();
        btnSimpanDataInchas = new javax.swing.JButton();
        btnTampilDataInchas = new javax.swing.JButton();
        cmbNmChas = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnHitungTotalChas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("No Pesan");

        jLabel2.setText("Nama Chas");

        jLabel3.setText("Harga Chas");

        jLabel4.setText("Pax");

        jLabel5.setText("Total Chas");

        txtIndex.setText("0");

        btnSimpanDataInchas.setText("Simpan Data Inchas");
        btnSimpanDataInchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanDataInchasActionPerformed(evt);
            }
        });

        btnTampilDataInchas.setText("Tampilkan Data");
        btnTampilDataInchas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilDataInchasActionPerformed(evt);
            }
        });

        cmbNmChas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tambah Kasur", "Tambah Bantal", "Tambah Handuk" }));
        cmbNmChas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNmChasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DATA INCHAS");

        btnHitungTotalChas.setText("Hitung");
        btnHitungTotalChas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungTotalChasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpanDataInchas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalChas, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtHargaChas, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtPax, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtNoPes, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(cmbNmChas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTampilDataInchas)
                            .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnHitungTotalChas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtHargaChas, txtNoPes, txtPax, txtTotalChas});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoPes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbNmChas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHargaChas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalChas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitungTotalChas))
                .addGap(18, 18, 18)
                .addComponent(txtIndex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanDataInchas)
                    .addComponent(btnTampilDataInchas))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanDataInchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanDataInchasActionPerformed
        // TODO add your handling code here:
        inchas.insertNoPes(txtNoPes.getText());
        inchas.insertNmChas(cmbNmChas.getSelectedItem().toString());
        inchas.insertHargaChas(Double.valueOf(txtHargaChas.getText()));
        inchas.insertPax(Integer.valueOf(txtPax.getText()));
        inchas.insertTotalChas(Double.valueOf(txtTotalChas.getText()));
        
        JOptionPane.showMessageDialog(this, "Data Inchas Berhasil Disimpan");
        
        txtNoPes.setText("");
        cmbNmChas.setSelectedIndex(0);
        txtHargaChas.setText("");
        txtPax.setText("");
        txtTotalChas.setText("");
    }//GEN-LAST:event_btnSimpanDataInchasActionPerformed

    private void btnTampilDataInchasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilDataInchasActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(txtIndex.getText());
        
        String isiDataInchas = "No Pesan : "+inchas.getRecordNoPes().get(i)+
                               "\nNama Chas : "+inchas.getRecordNmChas().get(i)+
                               "\nHarga Chas : "+inchas.getRecordHargaChas().get(i)+
                               "\nPax : "+inchas.getRecordPax().get(i)+
                               "\nTotal Chas : "+inchas.getRecordTotalChas().get(i);
        
        JOptionPane.showMessageDialog(this, isiDataInchas);
                
    }//GEN-LAST:event_btnTampilDataInchasActionPerformed

    private void cmbNmChasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNmChasActionPerformed
        // TODO add your handling code here:
        
        String PilihNamaChas = (String) cmbNmChas.getSelectedItem();
        
        if (PilihNamaChas.equals("Tambah Kasur")){
            txtHargaChas.setText("200000");
        } else if (PilihNamaChas.equals("Tambah Bantal")){
            txtHargaChas.setText("100000");
        } else if (PilihNamaChas.equals("Tambah Handuk")){
            txtHargaChas.setText("70000");
        }
    }//GEN-LAST:event_cmbNmChasActionPerformed

    private void btnHitungTotalChasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungTotalChasActionPerformed
        // TODO add your handling code here:
        double hargachas, pax, totalchas;
        
        hargachas = Double.valueOf(txtHargaChas.getText());
        pax = Double.valueOf(txtPax.getText());
        
        totalchas = hargachas * pax;
        
        txtTotalChas.setText(String.valueOf(totalchas));
    }//GEN-LAST:event_btnHitungTotalChasActionPerformed

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
            java.util.logging.Logger.getLogger(frameInchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameInchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameInchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameInchas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameInchas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitungTotalChas;
    private javax.swing.JButton btnSimpanDataInchas;
    private javax.swing.JButton btnTampilDataInchas;
    private javax.swing.JComboBox<String> cmbNmChas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtHargaChas;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtNoPes;
    private javax.swing.JTextField txtPax;
    private javax.swing.JTextField txtTotalChas;
    // End of variables declaration//GEN-END:variables
}
