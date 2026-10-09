
public class inspimoCoofe extends javax.swing.JFrame {
    public double hesap=0;

    public inspimoCoofe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        lblIcecekler = new javax.swing.JLabel();
        chcSu = new javax.swing.JCheckBox();
        chcCay = new javax.swing.JCheckBox();
        chcKahve = new javax.swing.JCheckBox();
        lblPastalar = new javax.swing.JLabel();
        chcMozaik = new javax.swing.JCheckBox();
        chcProtifol = new javax.swing.JCheckBox();
        chcTrilice = new javax.swing.JCheckBox();
        chcCheesCake = new javax.swing.JCheckBox();
        btnSiparisVer = new javax.swing.JButton();
        btnSiparisOzeti = new javax.swing.JButton();
        lblHesap = new javax.swing.JLabel();
        lblAtistirmalik = new javax.swing.JLabel();
        chcTost = new javax.swing.JCheckBox();
        chcHamburger = new javax.swing.JCheckBox();
        chcPatso = new javax.swing.JCheckBox();
        lblDiger = new javax.swing.JLabel();
        chcCerezTabagi = new javax.swing.JCheckBox();
        chcDinleti = new javax.swing.JCheckBox();
        chcMisir = new javax.swing.JCheckBox();
        chcNargile = new javax.swing.JCheckBox();

        jCheckBox4.setText("jCheckBox4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("İnspimo Coofeye Hos Geldiniz");

        lblIcecekler.setText("İçecekler");

        chcSu.setText("Su ( 5 Tl )");
        chcSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcSuActionPerformed(evt);
            }
        });

        chcCay.setText("Çay ( 5 Tl )");
        chcCay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcCayActionPerformed(evt);
            }
        });

        chcKahve.setText("Kahve ( 25 Tl )");
        chcKahve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcKahveActionPerformed(evt);
            }
        });

        lblPastalar.setText("Pastalar");

        chcMozaik.setText("Mozaik( 50 Tl )");
        chcMozaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcMozaikActionPerformed(evt);
            }
        });

        chcProtifol.setText("Protifol ( 50 Tl )");
        chcProtifol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcProtifolActionPerformed(evt);
            }
        });

        chcTrilice.setText("Triliçe ( 50 Tl )");
        chcTrilice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcTriliceActionPerformed(evt);
            }
        });

        chcCheesCake.setText("CheeseCake ( 50 Tl )");
        chcCheesCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcCheesCakeActionPerformed(evt);
            }
        });

        btnSiparisVer.setText("Sipariş Ver");
        btnSiparisVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisVerActionPerformed(evt);
            }
        });

        btnSiparisOzeti.setText("Sipariş Ozeti :");
        btnSiparisOzeti.setContentAreaFilled(false);

        lblHesap.setText("0 TL");

        lblAtistirmalik.setText("Atıştırmalık");

        chcTost.setText("Tost ( 50 Tl )");
        chcTost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcTostActionPerformed(evt);
            }
        });

        chcHamburger.setText("Hmburger ( 60 Tl )");
        chcHamburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcHamburgerActionPerformed(evt);
            }
        });

        chcPatso.setText("Patso ( 70 Tl )");
        chcPatso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcPatsoActionPerformed(evt);
            }
        });

        lblDiger.setText("Diğer");

        chcCerezTabagi.setText("Çerez Tabağı ( 100 Tl )");
        chcCerezTabagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcCerezTabagiActionPerformed(evt);
            }
        });

        chcDinleti.setText("Dinleti ( 100 Tl )");
        chcDinleti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcDinletiActionPerformed(evt);
            }
        });

        chcMisir.setText("Mısır ( 150 Tl )");
        chcMisir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcMisirActionPerformed(evt);
            }
        });

        chcNargile.setText("Nargile ( 150 Tl )");
        chcNargile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chcNargileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSiparisVer)
                                .addGap(29, 29, 29)
                                .addComponent(btnSiparisOzeti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIcecekler, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(lblAtistirmalik, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPastalar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chcSu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcCay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcKahve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(chcMozaik, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcProtifol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcTrilice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcCheesCake, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDiger, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chcCerezTabagi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(chcDinleti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcMisir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcNargile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chcTost, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chcPatso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chcHamburger, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(128, 128, 128))))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIcecekler)
                    .addComponent(lblAtistirmalik))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcSu)
                    .addComponent(chcTost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcCay)
                    .addComponent(chcHamburger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcKahve)
                    .addComponent(chcPatso))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPastalar)
                    .addComponent(lblDiger))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcMozaik)
                    .addComponent(chcCerezTabagi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcProtifol)
                    .addComponent(chcDinleti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcTrilice)
                    .addComponent(chcMisir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chcCheesCake)
                    .addComponent(chcNargile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiparisVer)
                    .addComponent(btnSiparisOzeti)
                    .addComponent(lblHesap, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiparisVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisVerActionPerformed
        // TODO add your handling code here:
        double hesap=0;
        if (chcSu.isSelected()){
            hesap+=5;
        }if (chcCay.isSelected()){
            hesap+=5;
        }if (chcKahve.isSelected()){
            hesap+=25;
        }if (chcMozaik.isSelected()){
            hesap+=50;
        }if (chcProtifol.isSelected()){
            hesap+=50;
        }if (chcTrilice.isSelected()){
            hesap+=50;
        }if (chcCheesCake.isSelected()){
            hesap+=50;
        }if (chcTost.isSelected()){
            hesap+=50;
        }if (chcHamburger.isSelected()){
            hesap+=60;
        }if (chcPatso.isSelected()){
            hesap+=70;
        }if (chcCerezTabagi.isSelected()){
            hesap+=100;
        }if (chcDinleti.isSelected()){
            hesap+=100;
        }if (chcMisir.isSelected()){
            hesap+=150;
        }if (chcNargile.isSelected()){
            hesap+=150;
        }
        lblHesap.setText(hesap + "TL");
        
    }//GEN-LAST:event_btnSiparisVerActionPerformed

    private void chcSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcSuActionPerformed
        // TODO add your handling code here:
        if (chcSu.isSelected()){
            hesap+=5;
        }else{
            hesap-=5;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcSuActionPerformed

    private void chcCayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcCayActionPerformed
        // TODO add your handling code here:
        if (chcCay.isSelected()){
            hesap+=5;
        }else{
            hesap-=5;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcCayActionPerformed

    private void chcKahveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcKahveActionPerformed
        // TODO add your handling code here:
        if (chcKahve.isSelected()){
            hesap+=25;
        }else{
            hesap-=25;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcKahveActionPerformed

    private void chcMozaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcMozaikActionPerformed
        // TODO add your handling code here:
        if (chcMozaik.isSelected()){
            hesap+=50;
        }else{
            hesap-=50;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcMozaikActionPerformed

    private void chcProtifolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcProtifolActionPerformed
        // TODO add your handling code here:
        if (chcProtifol.isSelected()){
            hesap+=50;
        }else{
            hesap-=50;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcProtifolActionPerformed

    private void chcTriliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcTriliceActionPerformed
        // TODO add your handling code here:
        if (chcTrilice.isSelected()){
            hesap+=50;
        }else{
            hesap-=50;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcTriliceActionPerformed

    private void chcCheesCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcCheesCakeActionPerformed
        // TODO add your handling code here:
        if (chcCheesCake.isSelected()){
            hesap+=50;
        }else{
            hesap-=50;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcCheesCakeActionPerformed

    private void chcTostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcTostActionPerformed
        // TODO add your handling code here:
        if (chcTost.isSelected()){
            hesap+=50;
        }else{
            hesap-=50;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcTostActionPerformed

    private void chcHamburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcHamburgerActionPerformed
        // TODO add your handling code here:
        if (chcHamburger.isSelected()){
            hesap+=60;
        }else{
            hesap-=60;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcHamburgerActionPerformed

    private void chcPatsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcPatsoActionPerformed
        // TODO add your handling code here:
        if (chcPatso.isSelected()){
            hesap+=70;
        }else{
            hesap-=70;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcPatsoActionPerformed

    private void chcCerezTabagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcCerezTabagiActionPerformed
        // TODO add your handling code here:
        if (chcCerezTabagi.isSelected()){
            hesap+=100;
        }else{
            hesap-=100;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcCerezTabagiActionPerformed

    private void chcDinletiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcDinletiActionPerformed
        // TODO add your handling code here:
        if (chcDinleti.isSelected()){
            hesap+=100;
        }else{
            hesap-=100;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcDinletiActionPerformed

    private void chcMisirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcMisirActionPerformed
        // TODO add your handling code here:
        if (chcMisir.isSelected()){
            hesap+=150;
        }else{
            hesap-=150;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcMisirActionPerformed

    private void chcNargileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chcNargileActionPerformed
        // TODO add your handling code here:
        if (chcNargile.isSelected()){
            hesap+=150;
        }else{
            hesap-=150;
        }
        lblHesap.setText(hesap + "TL");
    }//GEN-LAST:event_chcNargileActionPerformed

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
            java.util.logging.Logger.getLogger(inspimoCoofe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inspimoCoofe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inspimoCoofe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inspimoCoofe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inspimoCoofe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiparisOzeti;
    private javax.swing.JButton btnSiparisVer;
    private javax.swing.JCheckBox chcCay;
    private javax.swing.JCheckBox chcCerezTabagi;
    private javax.swing.JCheckBox chcCheesCake;
    private javax.swing.JCheckBox chcDinleti;
    private javax.swing.JCheckBox chcHamburger;
    private javax.swing.JCheckBox chcKahve;
    private javax.swing.JCheckBox chcMisir;
    private javax.swing.JCheckBox chcMozaik;
    private javax.swing.JCheckBox chcNargile;
    private javax.swing.JCheckBox chcPatso;
    private javax.swing.JCheckBox chcProtifol;
    private javax.swing.JCheckBox chcSu;
    private javax.swing.JCheckBox chcTost;
    private javax.swing.JCheckBox chcTrilice;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAtistirmalik;
    private javax.swing.JLabel lblDiger;
    private javax.swing.JLabel lblHesap;
    private javax.swing.JLabel lblIcecekler;
    private javax.swing.JLabel lblPastalar;
    // End of variables declaration//GEN-END:variables
}
