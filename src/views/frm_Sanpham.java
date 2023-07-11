/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;


public class frm_Sanpham extends javax.swing.JPanel {

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        panelBorder1 = new swing.PanelBorder();
        txt_ma = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_ten = new swing.MyTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_soluongton = new swing.MyTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_gianhap = new swing.MyTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_giaban = new swing.MyTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_mota = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        cbo_nsx = new javax.swing.JComboBox<>();
        cbo_mausac = new javax.swing.JComboBox<>();
        cbo_danhmuc = new javax.swing.JComboBox<>();
        cbo_size = new javax.swing.JComboBox<>();
        cbo_chatlieu = new javax.swing.JComboBox<>();
        btn_capnhat = new swing.MyButton();
        btn_lammoi = new swing.MyButton();
        btn_xoa = new swing.MyButton();
        btn_them = new swing.MyButton();
        cbo_thuonghieu1 = new javax.swing.JComboBox<>();
        myButton1 = new swing.MyButton();
        panelBorder2 = new swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sp = new javax.swing.JTable();
        panelBorder3 = new swing.PanelBorder();
        searchText = new swing.SearchText();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        hideshow = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1010, 640));

        panelGradiente1.setColorPrimario(new java.awt.Color(204, 255, 255));
        panelGradiente1.setColorSecundario(new java.awt.Color(242, 242, 242));

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));
        panelBorder1.setToolTipText("");
        panelBorder1.add(txt_ma);
        txt_ma.setBounds(30, 30, 210, 40);

        jLabel1.setText("Mã sản phẩm");
        panelBorder1.add(jLabel1);
        jLabel1.setBounds(30, 10, 210, 20);
        panelBorder1.add(txt_ten);
        txt_ten.setBounds(30, 100, 210, 40);

        jLabel2.setText("Tên sản phẩm");
        panelBorder1.add(jLabel2);
        jLabel2.setBounds(30, 80, 210, 20);

        jLabel3.setText("Nhà sản xuất");
        panelBorder1.add(jLabel3);
        jLabel3.setBounds(30, 150, 210, 20);

        jLabel4.setText("Màu sắc");
        panelBorder1.add(jLabel4);
        jLabel4.setBounds(30, 220, 210, 20);

        jLabel5.setText("Danh mục");
        panelBorder1.add(jLabel5);
        jLabel5.setBounds(280, 10, 210, 20);

        jLabel6.setText("Size");
        panelBorder1.add(jLabel6);
        jLabel6.setBounds(280, 80, 210, 20);

        jLabel7.setText("Chất liệu");
        panelBorder1.add(jLabel7);
        jLabel7.setBounds(280, 150, 210, 20);

        jLabel8.setText("Thương hiệu");
        panelBorder1.add(jLabel8);
        jLabel8.setBounds(280, 220, 210, 20);
        panelBorder1.add(txt_soluongton);
        txt_soluongton.setBounds(510, 30, 210, 40);

        jLabel10.setText("Số lượng tồn");
        panelBorder1.add(jLabel10);
        jLabel10.setBounds(510, 10, 210, 20);
        panelBorder1.add(txt_gianhap);
        txt_gianhap.setBounds(510, 100, 210, 40);

        jLabel11.setText("Giá nhập");
        panelBorder1.add(jLabel11);
        jLabel11.setBounds(510, 80, 210, 20);
        panelBorder1.add(txt_giaban);
        txt_giaban.setBounds(510, 170, 210, 40);

        jLabel12.setText("Mô tả");
        panelBorder1.add(jLabel12);
        jLabel12.setBounds(510, 210, 220, 20);

        txt_mota.setColumns(20);
        txt_mota.setRows(2);
        txt_mota.setTabSize(0);
        txt_mota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jScrollPane4.setViewportView(txt_mota);

        panelBorder1.add(jScrollPane4);
        jScrollPane4.setBounds(510, 230, 220, 70);

        jLabel13.setText("Giá bán");
        panelBorder1.add(jLabel13);
        jLabel13.setBounds(510, 150, 210, 20);

        cbo_nsx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_nsx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_nsx);
        cbo_nsx.setBounds(30, 170, 210, 40);

        cbo_mausac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_mausac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_mausac);
        cbo_mausac.setBounds(30, 240, 210, 40);

        cbo_danhmuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_danhmuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_danhmuc);
        cbo_danhmuc.setBounds(280, 30, 210, 40);

        cbo_size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_size.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_size);
        cbo_size.setBounds(280, 100, 210, 40);

        cbo_chatlieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_chatlieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_chatlieu);
        cbo_chatlieu.setBounds(280, 170, 210, 40);

        btn_capnhat.setBackground(new java.awt.Color(125, 224, 237));
        btn_capnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        btn_capnhat.setText("Cập nhật");
        btn_capnhat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_capnhat);
        btn_capnhat.setBounds(810, 120, 140, 40);

        btn_lammoi.setBackground(new java.awt.Color(125, 224, 237));
        btn_lammoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btn_lammoi.setText("Làm mới");
        btn_lammoi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lammoiActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_lammoi);
        btn_lammoi.setBounds(810, 20, 140, 40);

        btn_xoa.setBackground(new java.awt.Color(125, 224, 237));
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        btn_xoa.setText("In QRcode");
        btn_xoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_xoa);
        btn_xoa.setBounds(810, 170, 140, 40);

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
        btn_them.setBounds(810, 70, 140, 40);

        cbo_thuonghieu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_thuonghieu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        panelBorder1.add(cbo_thuonghieu1);
        cbo_thuonghieu1.setBounds(280, 240, 210, 40);

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        panelBorder1.add(myButton1);
        myButton1.setBounds(760, 20, 40, 40);

        panelGradiente1.add(panelBorder1);
        panelBorder1.setBounds(8, 0, 990, 320);

        panelBorder2.setBackground(new java.awt.Color(242, 242, 242));

        tbl_sp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_sp.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_sp.setRowHeight(25);
        tbl_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_spMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sp);

        panelBorder2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 60, 990, 240);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });
        panelBorder3.add(searchText);
        searchText.setBounds(10, 0, 250, 40);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_24px.png"))); // NOI18N
        panelBorder3.add(jLabel14);
        jLabel14.setBounds(270, 0, 24, 40);

        panelBorder2.add(panelBorder3);
        panelBorder3.setBounds(660, 10, 310, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new-page.png"))); // NOI18N
        jLabel15.setText("Thêm thuộc tính");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        panelBorder2.add(jLabel15);
        jLabel15.setBounds(260, 10, 180, 40);

        hideshow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hideshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hide.png"))); // NOI18N
        hideshow.setText("  Hiện sản phẩm hết");
        hideshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideshowMouseClicked(evt);
            }
        });
        panelBorder2.add(hideshow);
        hideshow.setBounds(40, 10, 180, 40);

        panelGradiente1.add(panelBorder2);
        panelBorder2.setBounds(10, 329, 990, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lammoiActionPerformed
 
    }//GEN-LAST:event_btn_lammoiActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
       
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
     

    }//GEN-LAST:event_btn_capnhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
     
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void tbl_spMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_spMouseClicked

    }//GEN-LAST:event_tbl_spMouseClicked

    private void hideshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideshowMouseClicked
     


    }//GEN-LAST:event_hideshowMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
     

    }//GEN-LAST:event_jLabel15MouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
    

    }//GEN-LAST:event_searchTextKeyReleased

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
       

    }//GEN-LAST:event_myButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.MyButton btn_capnhat;
    private swing.MyButton btn_lammoi;
    private swing.MyButton btn_them;
    private swing.MyButton btn_xoa;
    private javax.swing.JComboBox<String> cbo_chatlieu;
    private javax.swing.JComboBox<String> cbo_danhmuc;
    private javax.swing.JComboBox<String> cbo_mausac;
    private javax.swing.JComboBox<String> cbo_nsx;
    private javax.swing.JComboBox<String> cbo_size;
    private javax.swing.JComboBox<String> cbo_thuonghieu1;
    private javax.swing.JLabel hideshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private swing.MyButton myButton1;
    private swing.PanelBorder panelBorder1;
    private swing.PanelBorder panelBorder2;
    private swing.PanelBorder panelBorder3;
    private swing.PanelGradiente panelGradiente1;
    private swing.SearchText searchText;
    private javax.swing.JTable tbl_sp;
    private swing.MyTextField txt_giaban;
    private swing.MyTextField txt_gianhap;
    private swing.MyTextField txt_ma;
    private javax.swing.JTextArea txt_mota;
    private swing.MyTextField txt_soluongton;
    private swing.MyTextField txt_ten;
    // End of variables declaration//GEN-END:variables

    
}
