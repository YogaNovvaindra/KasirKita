/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import login.Config;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author yogan
 */
public class riwayat extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public riwayat() {
        initComponents();
        load_table();
        load_table1();
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
        jLabel8 = new javax.swing.JLabel();
        namakasir = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        transjml = new javax.swing.JLabel();
        uangjml = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        datedari = new com.toedter.calendar.JDateChooser();
        datesampai = new com.toedter.calendar.JDateChooser();
        Tampilkan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        no_trans = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back_40px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1190, 60, 50, 50);

        namakasir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        namakasir.setForeground(new java.awt.Color(36, 36, 36));
        jPanel2.add(namakasir);
        namakasir.setBounds(70, 60, 140, 50);

        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
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
        jLabel9.setBounds(220, 60, 40, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 36, 36));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/search_25px.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(780, 140, 30, 30);

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
        txtcari.setBounds(530, 140, 250, 30);

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
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(300, 180, 520, 370);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setOpaque(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(840, 180, 370, 220);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(105, 108, 110));
        jLabel14.setText("Detail Transaksi");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(920, 140, 200, 30);

        btn_delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(36, 36, 36));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/trash_25px.png"))); // NOI18N
        btn_delete.setBorder(null);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.setOpaque(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete);
        btn_delete.setBounds(300, 140, 60, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setText("Total Pendapatan");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(900, 550, 200, 26);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(72, 72, 72));
        jLabel2.setText("Total Transaksi");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(900, 420, 180, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/checkout_75px.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1090, 460, 70, 60);

        transjml.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        transjml.setForeground(new java.awt.Color(72, 72, 72));
        transjml.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        transjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                transjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        transjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transjmlMouseClicked(evt);
            }
        });
        jPanel2.add(transjml);
        transjml.setBounds(900, 460, 100, 60);

        uangjml.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uangjml.setForeground(new java.awt.Color(72, 72, 72));
        uangjml.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        uangjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                uangjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        uangjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uangjmlMouseClicked(evt);
            }
        });
        jPanel2.add(uangjml);
        uangjml.setBounds(900, 600, 200, 50);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 75)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 146, 51));
        jLabel10.setText("$");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1110, 570, 60, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/transaksibg.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(850, 360, 360, 233);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/lababg.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(850, 490, 360, 233);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(72, 72, 72));
        jLabel16.setText("Hingga");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(300, 620, 70, 30);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(72, 72, 72));
        jLabel15.setText("Dari");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(300, 560, 70, 30);

        datedari.setBackground(new java.awt.Color(255, 255, 255));
        datedari.setForeground(new java.awt.Color(72, 72, 72));
        datedari.setDateFormatString("yyyy-MM-dd");
        datedari.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        datedari.setOpaque(false);
        jPanel2.add(datedari);
        datedari.setBounds(370, 560, 150, 30);
        datedari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        datesampai.setBackground(new java.awt.Color(255, 255, 255));
        datesampai.setForeground(new java.awt.Color(72, 72, 72));
        datesampai.setDateFormatString("yyyy-MM-dd");
        datesampai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        datesampai.setOpaque(false);
        jPanel2.add(datesampai);
        datesampai.setBounds(370, 620, 150, 30);
        datesampai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Tampilkan.setBackground(new java.awt.Color(255, 255, 255));
        Tampilkan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tampilkan.setForeground(new java.awt.Color(36, 36, 36));
        Tampilkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/choose_25px.png"))); // NOI18N
        Tampilkan.setBorder(null);
        Tampilkan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tampilkan.setOpaque(false);
        Tampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampilkanActionPerformed(evt);
            }
        });
        jPanel2.add(Tampilkan);
        Tampilkan.setBounds(540, 560, 80, 40);

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(36, 36, 36));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/reset_25px.png"))); // NOI18N
        reset.setBorder(null);
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setOpaque(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(540, 610, 80, 40);

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/print_75px.png"))); // NOI18N
        print.setBorder(null);
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.setOpaque(false);
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel2.add(print);
        print.setBounds(710, 560, 110, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/riwayat.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);
        jPanel2.add(no_trans);
        no_trans.setBounds(900, 150, 130, 20);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        kasir.menu_kasir nama= new kasir.menu_kasir();
        nama.nama_kasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
//        this.setVisible(false);
        new login.logout().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        kasir.transaksi nama= new transaksi();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        kasir.edit_barang nama= new kasir.edit_barang();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        kasir.Statistik nama= new kasir.Statistik();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 1).toString();
        no_trans.setText(id);
        load_table1();
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtcariKeyPressed

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
                DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("No. Transaksi");
    model.addColumn("Tanggal");
    model.addColumn("Jam");
    model.addColumn("Total Bayar");
    model.addColumn("Kasir");
    model.addColumn("Pelanggan");

    
    try {
        int no=1;
        String sql = "SELECT * from tranksaksi where id_tranksaksi like '%" + txtcari.getText() + "%'"  ;
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3), this.formatRupiah(res.getInt(4)).replace(",00", ""),
                res.getString(5),res.getString(6)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
    }//GEN-LAST:event_txtcariKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if (no_trans.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pilih dahulu data yang ingin dihapus");
        } else {
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin Menghapus Riwayat tersebut?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            
        try {
            String sql ="delete from tranksaksi where id_tranksaksi ='"+no_trans.getText()+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Riwayat berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        tablestyle();
        load_table1();
        tablestyle1();
        } else if (response == JOptionPane.NO_OPTION) {
            
        }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void uangjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_uangjmlAncestorAdded
        // TODO add your handling code here:
        uang();
    }//GEN-LAST:event_uangjmlAncestorAdded

    private void uangjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uangjmlMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_uangjmlMouseClicked

    private void transjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_transjmlAncestorAdded
        // TODO add your handling code here:
        trans();
    }//GEN-LAST:event_transjmlAncestorAdded

    private void transjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transjmlMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_transjmlMouseClicked

    private void TampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampilkanActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(datedari.getDate());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = sdf1.format(datesampai.getDate());
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("No");
        model.addColumn("No. Transaksi");
        model.addColumn("Tanggal");
        model.addColumn("Jam");
        model.addColumn("Total Bayar");
        model.addColumn("Kasir");
        model.addColumn("Pelanggan");

        try {
            int no=1;
            String sql = "SELECT * from tranksaksi where tanggal_tranksaksi between '"
            +date1+"' and '"+date2+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow (new Object[] {no++,res.getString(1),
                    res.getString(2),res.getString(3),this.formatRupiah(res.getInt(4)).replace(",00", ""),
                    res.getString(7),res.getString(8)
                });
            }
            jTable1.setModel(model);
        } catch (Exception e) {

        }
        try {
            String sql = "SELECT count(id_tranksaksi) as total from tranksaksi where tanggal_tranksaksi between '"
            +date1+"' and '"+date2+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            transjml.setText(rs.getString("total"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        try {
            String sql = "SELECT sum(total_bayar) as total from tranksaksi where tanggal_tranksaksi between '"
            +date1+"' and '"+date2+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            uangjml.setText(this.formatRupiah((int) rs.getDouble("total")).replace(",00", ""));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tablestyle();
        print.setVisible(true);
    }//GEN-LAST:event_TampilkanActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        load_table();
        tablestyle();
        trans();
        uang();
        datedari.setDate(null);
        datesampai.setDate(null);
        print.setVisible(false);
    }//GEN-LAST:event_resetActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = sdf.format(datedari.getDate());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = sdf1.format(datesampai.getDate());
        try {
            java.sql.Connection conn=(Connection)Config.configDB();
            //            String namafile = "src/kasir/riwayatreport.jrxml";
            InputStream report = getClass().getResourceAsStream("/kasir/riwayatreport.jasper");
            HashMap param = new HashMap();
            param.put("dari",date1);
            param.put("sampai",date2);
            param.put("pendapatan",uangjml.getText().replace("Rp.", "IDR"));
            param.put("total",transjml.getText());
            //                    File file = new File(namafile);
            //                    JasperDesign jd = JRXmlLoader.load(namafile);
            //                    JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(report,param,conn);
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed
    private void tablestyle() {
        JTableHeader style = jTable1.getTableHeader();
        jTable1.setRowHeight(25);
        TableColumn col=jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(50);
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(150);
        TableColumn col2=jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(150);
        TableColumn col3=jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(100);
        TableColumn col4=jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(150);
        TableColumn col5=jTable1.getColumnModel().getColumn(5);
        col5.setPreferredWidth(150);
        TableColumn col6=jTable1.getColumnModel().getColumn(6);
        col6.setPreferredWidth(150);
    }
    private void tablestyle1() {
        JTableHeader style = jTable2.getTableHeader();
        jTable2.setRowHeight(25);
        TableColumn col=jTable2.getColumnModel().getColumn(0);
        col.setPreferredWidth(5);
        TableColumn col1=jTable2.getColumnModel().getColumn(1);
        col1.setPreferredWidth(100);
        TableColumn col2=jTable2.getColumnModel().getColumn(2);
        col2.setPreferredWidth(50);
        TableColumn col3=jTable2.getColumnModel().getColumn(3);
        col3.setPreferredWidth(100);
    }
    private void load_table() {
    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("No. Transaksi");
    model.addColumn("Tanggal");
    model.addColumn("Jam");
    model.addColumn("Total Bayar");
    model.addColumn("Kasir");
    model.addColumn("Pelanggan");

    
    try {
        int no=1;
        String sql = "SELECT * from tranksaksi;";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3), this.formatRupiah(res.getInt(4)).replace(",00", ""),
                res.getString(7),res.getString(8)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
    print.setVisible(false);
}
private void load_table1() {
    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("Nama Barang");
    model.addColumn("Jumlah");
    model.addColumn("Total Harga");


    
    try {
        int no=1;
        String sql = "SELECT barang.nama_barang, detail_tranksaksi.qty, detail_tranksaksi.harga_total "
                + "from ((detail_tranksaksi inner join tranksaksi on detail_tranksaksi.id_tranksaksi=tranksaksi.id_tranksaksi) "
                +"inner join barang on detail_tranksaksi.id_barang=barang.id_barang)"
                + "where detail_tranksaksi.id_tranksaksi='"+no_trans.getText()+"' ;";
//        String sql = "SELECT * from detail_tranksaksi;";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2), this.formatRupiah(res.getInt(3)).replace(",00", "")
            });
        }
        jTable2.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle1();
}
    private void trans() {
        try {
            String sql = "SELECT count(id_tranksaksi) as total from tranksaksi ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            transjml.setText(rs.getString("total"));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void uang() {
        try {
            String sql = "SELECT sum(total_bayar) as total from tranksaksi ";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            uangjml.setText(this.formatRupiah((int) rs.getDouble("total")).replace(",00", ""));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(riwayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new riwayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tampilkan;
    private javax.swing.JButton btn_delete;
    private com.toedter.calendar.JDateChooser datedari;
    private com.toedter.calendar.JDateChooser datesampai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public javax.swing.JLabel namakasir;
    private javax.swing.JTextField no_trans;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JLabel transjml;
    private javax.swing.JTextField txtcari;
    private javax.swing.JLabel uangjml;
    // End of variables declaration//GEN-END:variables
}
