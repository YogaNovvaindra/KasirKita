/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import kasir.*;
import login.Config;

/**
 *
 * @author yogan
 */
public class edit_barang extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public edit_barang() {
        initComponents();
        combobox();
        comboboxsup();
        load_table();
        kosong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaAdmin1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        harga_jual = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kd_bar = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        satuan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        harga_beli = new javax.swing.JTextField();
        sup = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KasirKita ~ Edit Barang");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(36, 36, 36));
        jLabel17.setText("Rp.");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(448, 220, 22, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back_40px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1190, 60, 50, 50);

        namaAdmin1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        namaAdmin1.setForeground(new java.awt.Color(36, 36, 36));
        jPanel2.add(namaAdmin1);
        namaAdmin1.setBounds(70, 60, 160, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(36, 36, 36));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/user_25px.png"))); // NOI18N
        jLabel10.setText("ID Supplier");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(720, 220, 140, 30);

        harga_jual.setBackground(new java.awt.Color(236, 236, 236));
        harga_jual.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        harga_jual.setForeground(new java.awt.Color(36, 36, 36));
        harga_jual.setBorder(null);
        harga_jual.setOpaque(false);
        harga_jual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                harga_jualKeyReleased(evt);
            }
        });
        jPanel2.add(harga_jual);
        harga_jual.setBounds(470, 220, 200, 30);

        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 400, 60, 50);

        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(40, 180, 60, 50);

        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel20);
        jLabel20.setBounds(40, 250, 60, 50);

        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(40, 330, 60, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Logout_40px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(220, 50, 40, 60);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 36, 36));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/tag_25px.png"))); // NOI18N
        jLabel11.setText("ID Barang");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(290, 140, 150, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 36, 36));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/product_25px.png"))); // NOI18N
        jLabel12.setText("Nama Barang");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 180, 150, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 36, 36));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/price_25px.png"))); // NOI18N
        jLabel13.setText("Harga Jual");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(290, 220, 150, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 36, 36));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/price_25px.png"))); // NOI18N
        jLabel14.setText("Harga Beli");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(720, 140, 130, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 36, 36));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/scale_25px.png"))); // NOI18N
        jLabel15.setText("Satuan");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(940, 180, 90, 30);

        kd_bar.setBackground(new java.awt.Color(236, 236, 236));
        kd_bar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        kd_bar.setForeground(new java.awt.Color(36, 36, 36));
        kd_bar.setBorder(null);
        kd_bar.setOpaque(false);
        jPanel2.add(kd_bar);
        kd_bar.setBounds(450, 140, 230, 30);

        nama.setBackground(new java.awt.Color(236, 236, 236));
        nama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nama.setForeground(new java.awt.Color(36, 36, 36));
        nama.setBorder(null);
        nama.setOpaque(false);
        jPanel2.add(nama);
        nama.setBounds(450, 180, 230, 30);

        jumlah.setBackground(new java.awt.Color(236, 236, 236));
        jumlah.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jumlah.setForeground(new java.awt.Color(36, 36, 36));
        jumlah.setBorder(null);
        jumlah.setOpaque(false);
        jPanel2.add(jumlah);
        jumlah.setBounds(860, 180, 60, 30);

        satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        satuan.setForeground(new java.awt.Color(36, 36, 36));
        satuan.setBorder(null);
        satuan.setOpaque(false);
        jPanel2.add(satuan);
        satuan.setBounds(1030, 176, 70, 30);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(290, 300, 930, 350);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 36, 36));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/search_25px.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1190, 260, 30, 30);

        txtcari.setBackground(new java.awt.Color(236, 236, 236));
        txtcari.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtcari.setForeground(new java.awt.Color(36, 36, 36));
        txtcari.setBorder(null);
        txtcari.setOpaque(false);
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        jPanel2.add(txtcari);
        txtcari.setBounds(940, 260, 250, 30);

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_math_25px.png"))); // NOI18N
        btn_tambah.setBorder(null);
        btn_tambah.setBorderPainted(false);
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.setOpaque(false);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tambah);
        btn_tambah.setBounds(1110, 140, 50, 50);

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/edit_25px.png"))); // NOI18N
        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.setOpaque(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit);
        btn_edit.setBounds(1110, 200, 50, 50);

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/clear_symbol_25px.png"))); // NOI18N
        btn_clear.setBorder(null);
        btn_clear.setBorderPainted(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.setOpaque(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear);
        btn_clear.setBounds(1170, 140, 50, 50);

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/trash_25px.png"))); // NOI18N
        btn_delete.setBorder(null);
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.setOpaque(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete);
        btn_delete.setBounds(1170, 200, 50, 50);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(36, 36, 36));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/add_shopping_cart_25px.png"))); // NOI18N
        jLabel16.setText("Jumlah");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(720, 180, 130, 30);

        harga_beli.setBackground(new java.awt.Color(236, 236, 236));
        harga_beli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        harga_beli.setForeground(new java.awt.Color(36, 36, 36));
        harga_beli.setBorder(null);
        harga_beli.setOpaque(false);
        harga_beli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                harga_beliKeyReleased(evt);
            }
        });
        jPanel2.add(harga_beli);
        harga_beli.setBounds(890, 140, 200, 30);

        sup.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sup.setForeground(new java.awt.Color(36, 36, 36));
        sup.setBorder(null);
        sup.setOpaque(false);
        jPanel2.add(sup);
        sup.setBounds(860, 216, 240, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(36, 36, 36));
        jLabel22.setText("Rp.");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(860, 140, 30, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/edit_barang_admin.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        admin.menu_admin namaAdmin = new admin.menu_admin();
        namaAdmin.nama_admin.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin Keluar?", " Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new login.login().setVisible(true);
        } else if (response == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        admin.edit_user namaAdmin = new admin.edit_user();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        admin.edit_supplier namaAdmin = new admin.edit_supplier();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        admin.riwayat_admin namaAdmin = new admin.riwayat_admin();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        if (kd_bar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan Kode Barang terlebih dahulu");
        } else {
        try {
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.Statement stm=conn.createStatement();
            
            String e = harga_jual.getText().replaceAll(",","");
            Double f = Double.parseDouble(e);
         
            String b = harga_beli.getText().replaceAll("," , "");
            Double c = Double.parseDouble(b);
            
            String sql = "INSERT INTO barang VALUES ('"+kd_bar.getText()+"','"+nama.getText()+"','"
            +jumlah.getText()+"','"+satuan.getSelectedItem()+"','"+
            f+"','"+c+"','"+
            sup.getSelectedItem()+"')";
            
            
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            
            
            JOptionPane.showMessageDialog(null, "Data barang "+kd_bar.getText()+" berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if (kd_bar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pilih dahulu barang yang ingin diubah");
        } else {
 try {
            String e = harga_jual.getText().replaceAll(",","");
            Double f = Double.parseDouble(e);
         
            String b = harga_beli.getText().replaceAll("," , "");
            Double c = Double.parseDouble(b);
            
            String sql ="UPDATE barang "
            + "SET nama_barang = '"+nama.getText()+"', jumlah = '"
            +jumlah.getText()+"', id_satuan = '"
            +satuan.getSelectedItem()+"', harga_jual = '"+f+
            "', harga_beli = '"+c+"', id_sup = '"+sup.getSelectedItem()
            +"' WHERE barang.id_barang = '"+kd_bar.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data barang "+kd_bar.getText()+" berhasil diubahn");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data gagal " +e.getMessage());
        }
        load_table();
        kosong();
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if (kd_bar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pilih dahulu data yang ingin dihapus");
        } else {
        try {
            String sql ="DELETE FROM barang where id_barang='"+kd_bar.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data barang "+kd_bar.getText()+" berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 1).toString();
        kd_bar.setText(id);
        kd_bar.disable();
        if (jTable1.getValueAt(baris, 2)==null) {
            nama.setText("");
        } else {
            nama.setText(jTable1.getValueAt(baris, 2).toString());
        }
        if (jTable1.getValueAt(baris, 3)==null) {
            jumlah.setText("");
        } else {
            jumlah.setText(jTable1.getValueAt(baris, 3).toString());
        }
         if (jTable1.getValueAt(baris, 5)==null) {
            harga_jual.setText("");
        } else {
            harga_jual.setText(jTable1.getValueAt(baris, 5).toString().replace("Rp.", "").replaceAll("\\.", ","));
        }
        if (jTable1.getValueAt(baris, 6)==null) {
            harga_beli.setText("");
        } else {
            harga_beli.setText(jTable1.getValueAt(baris, 6).toString().replace("Rp.", "").replaceAll("\\.", ","));
        }
        if (jTable1.getValueAt(baris, 4)==null) {
            satuan.setSelectedItem(this);
        }
        if (jTable1.getValueAt(baris, 4)==null) {
            satuan.setSelectedItem(this);
        } else {
            satuan.setSelectedItem(jTable1.getValueAt(baris, 4).toString());
        }
        if (jTable1.getValueAt(baris, 7)==null) {
            sup.setSelectedItem("");
        } else {
            sup.setSelectedItem(jTable1.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcariKeyPressed

    private void harga_jualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harga_jualKeyReleased
        // TODO add your handling code here:        
        String sbyr = harga_jual.getText().replaceAll("\\,","");
        double dbyr = Double.parseDouble(sbyr);
        DecimalFormat df = new DecimalFormat("#,###,###");
        if(dbyr>999){
        harga_jual.setText(df.format(dbyr));
        }
    }//GEN-LAST:event_harga_jualKeyReleased

    private void harga_beliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harga_beliKeyReleased
        // TODO add your handling code here:
        String sbyr = harga_beli.getText().replaceAll("\\,","");
        double dbyr = Double.parseDouble(sbyr);
        DecimalFormat df = new DecimalFormat("#,###,###");
        if(dbyr>999){
        harga_beli.setText(df.format(dbyr));
        }
    }//GEN-LAST:event_harga_beliKeyReleased

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
                        DefaultTableModel model = new DefaultTableModel();
    
        model.addColumn("No");
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("ID Supplier");

    
    try {
        int no=1;
        String sql = "SELECT * from barang join supplier on barang.id_sup = supplier.id_supplier where nama_barang like '%" + txtcari.getText() + "%'"  ;
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4),
                this.formatRupiah((int) res.getDouble(5)).replace(",00", ""),
                this.formatRupiah((int) res.getDouble(6)).replace(",00", ""),
                res.getString(7),res.getString(8)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
    }//GEN-LAST:event_txtcariKeyReleased
private void combobox() {
    String sql = "select * from satuan";
    try {
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while (res.next()) {
        satuan.addItem(res.getString("id_satuan"));
    }
    } catch (Exception e) {
}
}
    private void comboboxsup() {
    String sql = "select * from supplier";
    try {
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while (res.next()) {
        sup.addItem(res.getString("id_supplier"));
    }
    } catch (Exception e) {
}
}
    
    private void tablestyle() {
        JTableHeader style = jTable1.getTableHeader();
        jTable1.setRowHeight(25);
        TableColumn col=jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(40);
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(100);
        TableColumn col2=jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(200);
        TableColumn col3=jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(74);
        TableColumn col4=jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(50);
        TableColumn col5=jTable1.getColumnModel().getColumn(5);
        col5.setPreferredWidth(150);
        TableColumn col6=jTable1.getColumnModel().getColumn(6);
        col6.setPreferredWidth(150);
        TableColumn col7=jTable1.getColumnModel().getColumn(7);
        col7.setPreferredWidth(150);
    }
    private void load_table() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("No");
    model.addColumn("Kode Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Jumlah");
    model.addColumn("Satuan");
    model.addColumn("Harga Jual");
    model.addColumn("Harga Beli");
    model.addColumn("ID Supplier");
    
    try {
        int no=1;
        String sql = "select * from barang join supplier on barang.id_sup = supplier.id_supplier";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
         model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4),
                this.formatRupiah((int) res.getDouble(5)).replace(",00", ""),
                this.formatRupiah((int) res.getDouble(6)).replace(",00", ""),
                res.getString(7),res.getString(8)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
}
    private void kosong(){
    kd_bar.enable();
    kd_bar.setText(null);
    nama.setText(null);
    harga_jual.setText(null);
    harga_beli.setText(null);
    jumlah.setText(null);
    satuan.setSelectedItem(null);
    sup.setSelectedItem(null);
    txtcari.setText(null);
}
        private String formatRupiah(int value){
    DecimalFormat formater = (DecimalFormat) DecimalFormat.getCurrencyInstance();
      DecimalFormatSymbols simbol = formater.getDecimalFormatSymbols();
      
      simbol.setCurrencySymbol("Rp. ");
      simbol.setMonetaryDecimalSeparator(',');// belakang sendiri pada format rupiah
      simbol.setGroupingSeparator('.');
      formater.setDecimalFormatSymbols(simbol);
      return formater.format(value);
  }
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
            java.util.logging.Logger.getLogger(edit_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField harga_beli;
    private javax.swing.JTextField harga_jual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kd_bar;
    private javax.swing.JTextField nama;
    public javax.swing.JLabel namaAdmin1;
    private javax.swing.JComboBox<String> satuan;
    private javax.swing.JComboBox<String> sup;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
