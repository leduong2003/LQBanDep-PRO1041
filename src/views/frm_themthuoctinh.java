/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package views;



public class frm_themthuoctinh extends javax.swing.JDialog {

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder3 = new swing.PanelBorder();
        rdoThuonghieu = new javax.swing.JRadioButton();
        rdoChatlieu = new javax.swing.JRadioButton();
        rdoNSX = new javax.swing.JRadioButton();
        rdoMausac = new javax.swing.JRadioButton();
        rdoSize = new javax.swing.JRadioButton();
        rdodanhmuc = new javax.swing.JRadioButton();
        panelBorder4 = new swing.PanelBorder();
        jTextField1 = new javax.swing.JTextField();
        btn_them = new swing.MyButton();
        btn_LamMoi = new swing.MyButton();
        Btn_capNhat = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelBorder5 = new swing.PanelBorder();
        searchText1 = new swing.SearchText();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm thuộc tính phụ");
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Nhập Tên");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(60, 60, 250, 30);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        rdoThuonghieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoThuonghieu);
        rdoThuonghieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoThuonghieu.setText("Thương hiệu");
        rdoThuonghieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoThuonghieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoThuonghieu);
        rdoThuonghieu.setBounds(270, 100, 110, 40);

        rdoChatlieu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoChatlieu);
        rdoChatlieu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoChatlieu.setText("Chất liệu");
        rdoChatlieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChatlieuActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoChatlieu);
        rdoChatlieu.setBounds(30, 30, 110, 40);

        rdoNSX.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNSX);
        rdoNSX.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNSX.setText("Nhà sản xuất");
        rdoNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNSXActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoNSX);
        rdoNSX.setBounds(150, 30, 110, 40);

        rdoMausac.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoMausac);
        rdoMausac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoMausac.setText("Màu sắc");
        rdoMausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMausacActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoMausac);
        rdoMausac.setBounds(270, 30, 110, 40);

        rdoSize.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoSize);
        rdoSize.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoSize.setText("Size");
        rdoSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSizeActionPerformed(evt);
            }
        });
        panelBorder3.add(rdoSize);
        rdoSize.setBounds(30, 100, 110, 40);

        rdodanhmuc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdodanhmuc);
        rdodanhmuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdodanhmuc.setText("Danh mục");
        rdodanhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdodanhmucActionPerformed(evt);
            }
        });
        panelBorder3.add(rdodanhmuc);
        rdodanhmuc.setBounds(150, 100, 110, 40);

        panelBorder1.add(panelBorder3);
        panelBorder3.setBounds(370, 20, 450, 170);

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        panelBorder4.add(jTextField1);
        jTextField1.setBounds(10, 0, 230, 50);

        panelBorder1.add(panelBorder4);
        panelBorder4.setBounds(60, 90, 250, 50);

        btn_them.setBackground(new java.awt.Color(125, 224, 237));
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_them);
        btn_them.setBounds(1010, 50, 120, 30);

        btn_LamMoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_LamMoi);
        btn_LamMoi.setBounds(860, 50, 120, 30);

        Btn_capNhat.setBackground(new java.awt.Color(125, 224, 237));
        Btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        Btn_capNhat.setText("Cập nhật");
        Btn_capNhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_capNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(Btn_capNhat);
        Btn_capNhat.setBounds(860, 130, 120, 30);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(10, 50, 1160, 230);

        panelBorder2.setBackground(new java.awt.Color(242, 242, 242));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 1160, 250);

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        searchText1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panelBorder5.add(searchText1);
        searchText1.setBounds(10, 0, 240, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder5.add(jLabel2);
        jLabel2.setBounds(264, 0, 40, 50);

        panelBorder2.add(panelBorder5);
        panelBorder5.setBounds(790, 10, 300, 50);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 300, 1160, 320);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panelGradiente1.add(jLabel3);
        jLabel3.setBounds(1140, 0, 40, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelGradiente1.add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
    
    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
      
    }//GEN-LAST:event_btn_themActionPerformed

    private void Btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_capNhatActionPerformed
   
    }//GEN-LAST:event_Btn_capNhatActionPerformed

    private void rdoChatlieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChatlieuActionPerformed
     
    }//GEN-LAST:event_rdoChatlieuActionPerformed

    private void rdoNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNSXActionPerformed
    
    }//GEN-LAST:event_rdoNSXActionPerformed

    private void rdoMausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMausacActionPerformed
   
    }//GEN-LAST:event_rdoMausacActionPerformed

    private void rdoSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSizeActionPerformed
   
    }//GEN-LAST:event_rdoSizeActionPerformed

    private void rdodanhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdodanhmucActionPerformed
    
    }//GEN-LAST:event_rdodanhmucActionPerformed

    private void rdoThuonghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoThuonghieuActionPerformed
      
    }//GEN-LAST:event_rdoThuonghieuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
    
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
      
    }//GEN-LAST:event_jPanel1MouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton Btn_capNhat;
    private swing.MyButton btn_LamMoi;
    private swing.MyButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelBorder panelBorder4;
    private swing.PanelBorder panelBorder5;
    private swing.PanelGradiente panelGradiente1;
    private javax.swing.JRadioButton rdoChatlieu;
    private javax.swing.JRadioButton rdoMausac;
    private javax.swing.JRadioButton rdoNSX;
    private javax.swing.JRadioButton rdoSize;
    private javax.swing.JRadioButton rdoThuonghieu;
    private javax.swing.JRadioButton rdodanhmuc;
    private swing.SearchText searchText1;
    // End of variables declaration//GEN-END:variables
  
}
