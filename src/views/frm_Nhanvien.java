/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;


/**
 *
 * @author hungh
 */
public class frm_Nhanvien extends javax.swing.JPanel {

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGradiente1 = new swing.PanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        txtten = new swing.MyTextField();
        jLabel2 = new javax.swing.JLabel();
        txttendem = new swing.MyTextField();
        jLabel3 = new javax.swing.JLabel();
        txtho = new swing.MyTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsdt = new swing.MyTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTaikhoan = new swing.MyTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtemail = new swing.MyTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        rd_nu = new javax.swing.JRadioButton();
        rd_nam = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        chk_tt = new javax.swing.JCheckBox();
        lblTongnv = new javax.swing.JLabel();
        btnthem = new swing.MyButton();
        btncapnhat = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        searchtxt = new swing.SearchText();
        lbl_search = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbochucvu = new javax.swing.JComboBox<>();
        datengaysinh = new com.toedter.calendar.JDateChooser();
        btnlmmoi = new swing.MyButton();
        txtPass = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setBackground(new java.awt.Color(242, 242, 242));
        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(242, 242, 242));
        panelGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Tên");
        panelGradiente1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 220, 20));
        panelGradiente1.add(txtten, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Tên đệm");
        panelGradiente1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 220, 20));
        panelGradiente1.add(txttendem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Họ");
        panelGradiente1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 20));
        panelGradiente1.add(txtho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày sinh");
        panelGradiente1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 220, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("SĐT");
        panelGradiente1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 220, 20));
        panelGradiente1.add(txtsdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 220, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tài Khoản");
        panelGradiente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 220, 20));
        panelGradiente1.add(txtTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 220, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mật khẩu");
        panelGradiente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 220, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Giới tính");
        panelGradiente1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, 20));
        panelGradiente1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 220, 40));

        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblnhanvien.setGridColor(new java.awt.Color(255, 255, 255));
        tblnhanvien.setRowHeight(25);
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnhanvien);

        panelGradiente1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 990, 250));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Trạng thái");
        panelGradiente1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 60, 20));

        buttonGroup1.add(rd_nu);
        rd_nu.setText("Nữ");
        panelGradiente1.add(rd_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        buttonGroup1.add(rd_nam);
        rd_nam.setSelected(true);
        rd_nam.setText("Nam");
        panelGradiente1.add(rd_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Email");
        panelGradiente1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 220, 20));

        chk_tt.setText("Làm việc");
        panelGradiente1.add(chk_tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        lblTongnv.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblTongnv.setForeground(new java.awt.Color(255, 0, 0));
        lblTongnv.setText("Tổng nhân viên :");
        panelGradiente1.add(lblTongnv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, -1));

        btnthem.setBackground(new java.awt.Color(125, 224, 237));
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnthem.setText("Thêm");
        btnthem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });
        panelGradiente1.add(btnthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 120, 40));

        btncapnhat.setBackground(new java.awt.Color(125, 224, 237));
        btncapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        btncapnhat.setText("Cập nhật");
        btncapnhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });
        panelGradiente1.add(btncapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 120, 40));

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        searchtxt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchtxtCaretUpdate(evt);
            }
        });
        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        panelBorder2.add(searchtxt);
        searchtxt.setBounds(10, 0, 240, 40);

        lbl_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        lbl_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_searchMouseClicked(evt);
            }
        });
        panelBorder2.add(lbl_search);
        lbl_search.setBounds(260, 0, 40, 40);

        panelGradiente1.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Chức vụ");
        panelGradiente1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 220, 20));

        cbochucvu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        cbochucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochucvuActionPerformed(evt);
            }
        });
        panelGradiente1.add(cbochucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 220, 40));

        datengaysinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        datengaysinh.setDateFormatString("yyyy-MM-dd");
        panelGradiente1.add(datengaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 220, 40));

        btnlmmoi.setBackground(new java.awt.Color(125, 224, 237));
        btnlmmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnlmmoi.setText("Làm Mới");
        btnlmmoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlmmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmmoiActionPerformed(evt);
            }
        });
        panelGradiente1.add(btnlmmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 120, 40));

        txtPass.setText("jPasswordField1");
        panelGradiente1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       
    }//GEN-LAST:event_btnthemActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked

      

    }//GEN-LAST:event_tblnhanvienMouseClicked

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
   
    }//GEN-LAST:event_btncapnhatActionPerformed

    private void btnlmmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmmoiActionPerformed
   
  
    }//GEN-LAST:event_btnlmmoiActionPerformed

    private void lbl_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_searchMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_lbl_searchMouseClicked

    private void searchtxtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchtxtCaretUpdate
      
    }//GEN-LAST:event_searchtxtCaretUpdate

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtxtActionPerformed

    private void cbochucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbochucvuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btncapnhat;
    private swing.MyButton btnlmmoi;
    private swing.MyButton btnthem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbochucvu;
    private javax.swing.JCheckBox chk_tt;
    private com.toedter.calendar.JDateChooser datengaysinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTongnv;
    private javax.swing.JLabel lbl_search;
    private swing.PanelBorder panelBorder2;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private swing.SearchText searchtxt;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JPasswordField txtPass;
    private swing.MyTextField txtTaikhoan;
    private swing.MyTextField txtemail;
    private swing.MyTextField txtho;
    private swing.MyTextField txtsdt;
    private swing.MyTextField txtten;
    private swing.MyTextField txttendem;
    // End of variables declaration//GEN-END:variables
}
