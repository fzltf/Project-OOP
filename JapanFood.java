
package com.mycompany.quiz_uts_17210642_172a03;
import javax.swing.*;
/**
 *
 * @author Fauza
 */
public class JapanFood extends javax.swing.JFrame {

    /**
     * Creates new form JapanFood
     */
    public JapanFood() {
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbscs = new javax.swing.JCheckBox();
        cbctr = new javax.swing.JCheckBox();
        cbshm = new javax.swing.JCheckBox();
        cbtsr = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jmlscs = new javax.swing.JTextField();
        jmlctr = new javax.swing.JTextField();
        jmlshm = new javax.swing.JTextField();
        jmltsr = new javax.swing.JTextField();
        hrgscs = new javax.swing.JLabel();
        hrgctr = new javax.swing.JLabel();
        hrgshm = new javax.swing.JLabel();
        hrgtsr = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jmlprs = new javax.swing.JLabel();
        jmlbyr = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setText("JAPANESE FOOD");

        jLabel2.setFont(new java.awt.Font("DialogInput", 2, 14)); // NOI18N
        jLabel2.setText("P I C K Y O U R F A V O U R I T E !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("MAKANAN");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("HARGA");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("JUMLAH");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("TOTAL HARGA");

        cbscs.setBackground(java.awt.SystemColor.control);
        cbscs.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cbscs.setText("Spicy Crunchy Salmon");
        cbscs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbscsActionPerformed(evt);
            }
        });

        cbctr.setBackground(java.awt.SystemColor.control);
        cbctr.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cbctr.setText("Chicken Teriyaki Ramen");
        cbctr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbctrActionPerformed(evt);
            }
        });

        cbshm.setBackground(java.awt.SystemColor.control);
        cbshm.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cbshm.setText("Sashimi");
        cbshm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbshmActionPerformed(evt);
            }
        });

        cbtsr.setBackground(java.awt.SystemColor.control);
        cbtsr.setFont(new java.awt.Font("Dubai", 3, 12)); // NOI18N
        cbtsr.setText("Tempura Shrimp Ramen");
        cbtsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtsrActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Rp.35000,-");

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Rp.45000,-");

        jLabel9.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Rp.50000,-");

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Rp.45000,-");

        jmlscs.setEditable(false);
        jmlscs.setBackground(java.awt.SystemColor.control);
        jmlscs.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmlctr.setEditable(false);
        jmlctr.setBackground(java.awt.SystemColor.control);
        jmlctr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmlshm.setEditable(false);
        jmlshm.setBackground(java.awt.SystemColor.control);
        jmlshm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jmltsr.setEditable(false);
        jmltsr.setBackground(java.awt.SystemColor.control);
        jmltsr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jmltsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmltsrActionPerformed(evt);
            }
        });

        hrgscs.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hrgscs.setForeground(new java.awt.Color(204, 204, 204));
        hrgscs.setText("Rp.0,-");

        hrgctr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hrgctr.setForeground(new java.awt.Color(204, 204, 204));
        hrgctr.setText("Rp.0,-");

        hrgshm.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hrgshm.setForeground(new java.awt.Color(204, 204, 204));
        hrgshm.setText("Rp.0,-");

        hrgtsr.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hrgtsr.setForeground(new java.awt.Color(204, 204, 204));
        hrgtsr.setText("Rp.0,-");

        jLabel11.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("TOTAL BAYAR  :  ");

        jmlprs.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jmlprs.setForeground(new java.awt.Color(204, 204, 204));
        jmlprs.setText("0 PORSI");

        jmlbyr.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        jmlbyr.setForeground(new java.awt.Color(204, 204, 204));
        jmlbyr.setText("Rp.0,-");

        hitung.setBackground(java.awt.SystemColor.activeCaptionBorder);
        hitung.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        hitung.setForeground(new java.awt.Color(255, 102, 51));
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        reset.setBackground(java.awt.SystemColor.activeCaptionBorder);
        reset.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 102, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        close.setBackground(java.awt.SystemColor.activeCaptionBorder);
        close.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        close.setForeground(new java.awt.Color(255, 102, 51));
        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbshm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbctr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbscs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbtsr, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jmltsr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(jmlshm, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmlctr, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jmlscs, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hrgctr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgscs, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgshm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrgtsr, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jmlprs, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jmlbyr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbscs)
                    .addComponent(jLabel7)
                    .addComponent(jmlscs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrgscs))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbctr)
                    .addComponent(jLabel8)
                    .addComponent(jmlctr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrgctr))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbshm)
                    .addComponent(jLabel9)
                    .addComponent(jmlshm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrgshm))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbtsr)
                    .addComponent(jLabel10)
                    .addComponent(jmltsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hrgtsr))
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmlprs)
                    .addComponent(jmlbyr)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung)
                    .addComponent(close))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("DialogInput", 2, 14)); // NOI18N
        jLabel12.setText("S I N C E 2 K 2 2.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmltsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmltsrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmltsrActionPerformed

    private void cbscsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbscsActionPerformed
        // TODO add your handling code here:
         if(cbscs.isSelected()==true){
            jmlscs.setEditable(true);
            jmlscs.setEnabled(true);
            jmlscs.requestFocus();
        }else{
            jmlscs.setEditable(false);
            jmlscs.setText(" ");
            hrgscs.setText("Rp.0,-");
        }
    }//GEN-LAST:event_cbscsActionPerformed

    private void cbctrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbctrActionPerformed
        // TODO add your handling code here:
        if(cbctr.isSelected()==true){
            jmlctr.setEditable(true);
            jmlctr.setEnabled(true);
            jmlctr.requestFocus();
        }else{
            jmlctr.setEditable(false);
            jmlctr.setText(" ");
            hrgctr.setText("Rp.0,-");
        }
    }//GEN-LAST:event_cbctrActionPerformed

    private void cbshmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbshmActionPerformed
        // TODO add your handling code here:
          if(cbshm.isSelected()==true){
            jmlshm.setEditable(true);
            jmlshm.setEnabled(true);
            jmlshm.requestFocus();
        }else{
            jmlshm.setEditable(false);
            jmlshm.setText(" ");
            hrgshm.setText("Rp.0,-");
        }
    }//GEN-LAST:event_cbshmActionPerformed

    private void cbtsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtsrActionPerformed
        // TODO add your handling code here:
        if(cbtsr.isSelected()==true){
            jmltsr.setEditable(true);
            jmltsr.setEnabled(true);
            jmltsr.requestFocus();
        }else{
            jmltsr.setEditable(false);
            jmltsr.setText(" ");
            hrgtsr.setText("Rp.0,-");
        }
    }//GEN-LAST:event_cbtsrActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
         hitung.setEnabled(false);
        cbscs.setEnabled(false);
        cbctr.setEnabled(false);
        cbshm.setEnabled(false);
        cbtsr.setEnabled(false);
        jmlscs.setEnabled(false);
        jmlctr.setEnabled(false);
        jmlshm.setEnabled(false);
        jmltsr.setEnabled(false);
      int txtjmlscs = 0,
          txtjmlctr = 0,
          txtjmlshm = 0,
          txtjmltsr = 0,
          hargascs  = 0,
          hargactr  = 0,
          hargashm  = 0,
          hargatsr  = 0,
    thrgscs,thrgctr,thrgshm,thrgtsr,tjlh,tbyr;
    if(cbscs.isSelected()==false&&cbctr.isSelected()==false&&cbshm.isSelected()==false&&cbtsr.isSelected()==false){
    JOptionPane.showMessageDialog(null,"Makanan Belum Dipesan","WARNING",JOptionPane.WARNING_MESSAGE);
    } else {
    if(cbscs.isSelected()==true){
    if(jmlscs.getText().length()==0){
        pesan_kosong();
        jmlscs.requestFocus();
    }
    else if(jmlscs.getText().matches("[1-9]")){
    txtjmlscs = Integer.parseInt(jmlscs.getText());
    hargascs  = 35000;
    thrgscs   = txtjmlscs * hargascs;
    hrgscs.setText("Rp. "+thrgscs+",-");
    }
   else{
   pesan_karakter();
   jmlscs.requestFocus();
   }
    }
    }
   if(cbctr.isSelected()==true){
   if(jmlctr.getText().length()==0){
      pesan_kosong();
      jmlctr.requestFocus();
   }
   else if(jmlctr.getText().matches("[1-9]")){
   txtjmlctr  = Integer.parseInt(jmlctr.getText());
   hargactr   = 45000;
   thrgctr    = txtjmlctr * hargactr;
   hrgctr.setText("Rp. "+thrgctr+",-");
   }
   else{
   pesan_karakter();
   jmlctr.requestFocus();
   }
   }
   if(cbshm.isSelected()==true){
   if(jmlshm.getText().length()==0){
      pesan_kosong();
      jmlshm.requestFocus();
   }
   else if(jmlshm.getText().matches("[1-9]")){
   txtjmlshm  = Integer.parseInt(jmlshm.getText());
   hargashm   = 50000;
   thrgshm    = txtjmlshm * hargashm;
   hrgshm.setText("Rp. "+thrgshm+",-");
   }
    else{
   pesan_karakter();
   jmlshm.requestFocus();
   }
   }
   if(cbtsr.isSelected()==true){
   if(jmltsr.getText().length()==0){
      pesan_kosong();
      jmltsr.requestFocus();
   }
   else if(jmltsr.getText().matches("[1-9]")){
   txtjmltsr  = Integer.parseInt(jmltsr.getText());
   hargatsr   = 45000;
   thrgtsr    = txtjmltsr * hargatsr;
   hrgtsr.setText("Rp. "+thrgtsr+",-");
   }
    else{
   pesan_karakter();
   jmltsr.requestFocus();
   }
   }
   tjlh = txtjmlscs+txtjmlctr+txtjmlshm+txtjmltsr;
   tbyr = (txtjmlscs*hargascs) + (txtjmlctr*hargactr) + (txtjmlshm*hargashm) + (txtjmltsr*hargatsr);
   jmlprs.setText(""+tjlh+"porsi");
   jmlbyr.setText("Rp. "+tbyr+",-");
    }//GEN-LAST:event_hitungActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        jmlscs.setEditable(false);
        jmlctr.setEditable(false);
        jmlshm.setEditable(false);
        jmltsr.setEditable(false);
        cbscs.setSelected(false);
        cbctr.setSelected(false);
        cbshm.setSelected(false);
        cbtsr.setSelected(false);
        jmlscs.setText("");
        jmlctr.setText("");
        jmlshm.setText("");
        jmltsr.setText("");
        hrgscs.setText("Rp.0,-");
        hrgctr.setText("Rp.0,-");
        hrgshm.setText("Rp.0,-");
        hrgtsr.setText("Rp.0,-");
        jmlprs.setText("0 Porsi");
        jmlbyr.setText("Rp.0,-");
        hitung.setEnabled(true);
        reset.setEnabled(true);
        cbscs.setEnabled(true);
        cbctr.setEnabled(true);
        cbshm.setEnabled(true);
        cbtsr.setEnabled(true);
    }//GEN-LAST:event_resetActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        int a;
        a=JOptionPane.showConfirmDialog(null,"Yakin mau keluar??","Konfirm",JOptionPane.YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION)
            dispose();
        else
            return;
        
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(JapanFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JapanFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JapanFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JapanFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JapanFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbctr;
    private javax.swing.JCheckBox cbscs;
    private javax.swing.JCheckBox cbshm;
    private javax.swing.JCheckBox cbtsr;
    private javax.swing.JButton close;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel hrgctr;
    private javax.swing.JLabel hrgscs;
    private javax.swing.JLabel hrgshm;
    private javax.swing.JLabel hrgtsr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jmlbyr;
    private javax.swing.JTextField jmlctr;
    private javax.swing.JLabel jmlprs;
    private javax.swing.JTextField jmlscs;
    private javax.swing.JTextField jmlshm;
    private javax.swing.JTextField jmltsr;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

    private void pesan_kosong (){
        JOptionPane.showMessageDialog(null,"Jumlah Makanan Belum Dimasukan","WARNING",JOptionPane.WARNING_MESSAGE);
    } 

    private void pesan_karakter() {
        JOptionPane.showMessageDialog(null,"Jumlah Pesanan Harus Angka","WARNING",JOptionPane.WARNING_MESSAGE);
    }
}
