/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminYönetimi;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class updateAdmin extends javax.swing.JFrame {

    /**
     * Creates new form updateAdmin
     */
    public updateAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PAROLA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        temizle = new javax.swing.JButton();
        güncelle = new javax.swing.JButton();
        eskiparola = new javax.swing.JTextField();
        yeniparola = new javax.swing.JTextField();
        PAROLA1 = new javax.swing.JLabel();
        Adminİsim = new javax.swing.JTextField();
        gerituşu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Güncelle");

        PAROLA.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PAROLA.setForeground(new java.awt.Color(255, 255, 255));
        PAROLA.setText("ESKİ PAROLA");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADMİN İSİM");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        temizle.setBackground(new java.awt.Color(255, 255, 255));
        temizle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        temizle.setForeground(new java.awt.Color(102, 0, 51));
        temizle.setText("Temizle");
        temizle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        güncelle.setBackground(new java.awt.Color(255, 255, 255));
        güncelle.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        güncelle.setForeground(new java.awt.Color(102, 0, 51));
        güncelle.setText("Güncelle");
        güncelle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                güncelleActionPerformed(evt);
            }
        });

        eskiparola.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        eskiparola.setForeground(new java.awt.Color(102, 0, 51));

        yeniparola.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        yeniparola.setForeground(new java.awt.Color(102, 0, 51));

        PAROLA1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        PAROLA1.setForeground(new java.awt.Color(255, 255, 255));
        PAROLA1.setText("YENİ PAROLA");

        Adminİsim.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Adminİsim.setForeground(new java.awt.Color(102, 0, 51));

        gerituşu.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        gerituşu.setForeground(new java.awt.Color(255, 255, 255));
        gerituşu.setText("<");
        gerituşu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerituşu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerituşuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gerituşu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170)
                .addComponent(jLabel9)
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAROLA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PAROLA1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eskiparola, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeniparola, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Adminİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(güncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gerituşu)
                            .addComponent(jLabel9))))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Adminİsim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eskiparola, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAROLA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeniparola, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PAROLA1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(güncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        // TODO add your handling code here:
        Adminİsim.setText("");
        eskiparola.setText("");

    }//GEN-LAST:event_temizleActionPerformed

    private void güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_güncelleActionPerformed
        // TODO add your handling code here:
        adminişlemler işlemler=new adminişlemler();
        if((Adminİsim.getText().isEmpty())||(eskiparola.getText().isEmpty())||(yeniparola.getText().isEmpty())){

            JOptionPane.showMessageDialog(this,"Kayıt İşlemi Başarısız...");

        }else{
            String ad=Adminİsim.getText();
            String eski_parola=eskiparola.getText();
            String yeni_parola=yeniparola.getText();
            boolean girisbasarili = işlemler.girisYap(ad,eski_parola);
            int parolauzunluğu=yeni_parola.length();

            if (girisbasarili) {
                if(eski_parola==yeni_parola){
                    JOptionPane.showMessageDialog(this,"Eski Parola ve Yeni Parola Aynı Olamaz...");
                }else if(parolauzunluğu==0){
                    JOptionPane.showMessageDialog(this,"Yeni Parola Bölümünü Lütfen Doldurunuz");

                }

                işlemler.adminGuncelle(ad, yeni_parola);
                JOptionPane.showMessageDialog(this, "Admin Başarıyla Güncellendi...");
                Adminİsim.setText("");
                eskiparola.setText("");
                yeniparola.setText("");

            }
            else {
                JOptionPane.showMessageDialog(this,"Giriş Başarısız...Lütfen tekrar deneyin.");

            }

        }
    }//GEN-LAST:event_güncelleActionPerformed

    private void gerituşuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerituşuMouseClicked
        // TODO add your handling code here:
        new adminEkranı().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_gerituşuMouseClicked

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
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Adminİsim;
    private javax.swing.JLabel PAROLA;
    private javax.swing.JLabel PAROLA1;
    private javax.swing.JTextField eskiparola;
    private javax.swing.JLabel gerituşu;
    private javax.swing.JButton güncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton temizle;
    private javax.swing.JTextField yeniparola;
    // End of variables declaration//GEN-END:variables
}
