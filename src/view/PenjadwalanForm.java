/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import config.DatabaseConnection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class PenjadwalanForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PenjadwalanForm.class.getName());

    /**
     * Creates new form PenjadwalanForm
     */
    public PenjadwalanForm() {
        initComponents();
        isiComboKelas();
        isiComboPelajaran();
        isiComboGuru();
        tampilDataJadwal();
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
        lblKelas = new javax.swing.JLabel();
        cbKelas = new javax.swing.JComboBox<>();
        lblKelas1 = new javax.swing.JLabel();
        cbGuru = new javax.swing.JComboBox<>();
        lblHari = new javax.swing.JLabel();
        cbHari = new javax.swing.JComboBox<>();
        lblJamMulai = new javax.swing.JLabel();
        txtJamMulai = new javax.swing.JTextField();
        lblJamSelesai = new javax.swing.JLabel();
        txtJamSelesai = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableJadwal = new javax.swing.JTable();
        lblKelas2 = new javax.swing.JLabel();
        cbPelajaran = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Penjadwalan Pelajaran");

        lblKelas.setText("Kelas");

        lblKelas1.setText("Guru");

        lblHari.setText("Hari");

        cbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "senin", "selasa", "rabu", "kamis", "jumat" }));

        lblJamMulai.setText("Jam Mulai");

        lblJamSelesai.setText("Jam Selesai");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tableJadwal.setModel(new javax.swing.table.DefaultTableModel(
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
        tableJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableJadwal);

        lblKelas2.setText("Pelajaran");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKelas1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbGuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKelas2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJamSelesai)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJamSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHari, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblJamMulai))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJamMulai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblKelas)
                        .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHari)
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKelas1)
                    .addComponent(cbGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJamMulai)
                    .addComponent(txtJamMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblJamSelesai)
                        .addComponent(lblKelas2)
                        .addComponent(cbPelajaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtJamSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int idTerpilih = -1;
    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO jadwal (id_kelas, id_pelajaran, id_guru, hari, jam_mulai, jam_selesai) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);

        // Ambil id kelas
        pst.setInt(1, getIdKelas(cbKelas.getSelectedItem().toString()));

        // Ambil id pelajaran
        pst.setInt(2, getIdPelajaran(cbPelajaran.getSelectedItem().toString()));

        // Ambil id guru
        pst.setInt(3, getIdGuru(cbGuru.getSelectedItem().toString()));

//        pst.setString(4, txtHari.getText());
        pst.setString(4, cbHari.getSelectedItem().toString());
        pst.setString(5, txtJamMulai.getText());
        pst.setString(6, txtJamSelesai.getText());

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data jadwal berhasil ditambahkan");
        tampilDataJadwal();
        resetForm();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal tambah data jadwal: " + e.getMessage());
    }
    }//GEN-LAST:event_btnTambahActionPerformed
    
    
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "UPDATE jadwal SET id_kelas=?, id_pelajaran=?, id_guru=?, hari=?, jam_mulai=?, jam_selesai=? WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setInt(1, getIdKelas(cbKelas.getSelectedItem().toString()));
        pst.setInt(2, getIdPelajaran(cbPelajaran.getSelectedItem().toString()));
        pst.setInt(3, getIdGuru(cbGuru.getSelectedItem().toString()));
        pst.setString(4, cbHari.getText());
        pst.setString(5, txtJamMulai.getText());
        pst.setString(6, txtJamSelesai.getText());

        pst.setInt(7, idTerpilih); // Pastikan idTerpilih di-set saat klik tabel

        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data jadwal berhasil diupdate");
        tampilDataJadwal();
        resetForm();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal update data jadwal: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "DELETE FROM jadwal WHERE id=?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, idTerpilih);

        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data jadwal berhasil dihapus");
        tampilDataJadwal();
        resetForm();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Gagal hapus data jadwal: " + e.getMessage());
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
         resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tableJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableJadwalMouseClicked

        int row = tableJadwal.getSelectedRow();
        idTerpilih = Integer.parseInt(tableJadwal.getValueAt(row, 0).toString());
        cbKelas.setSelectedItem(tableJadwal.getValueAt(row, 1).toString());
        cbPelajaran.setSelectedItem(tableJadwal.getValueAt(row, 2).toString());
        cbGuru.setSelectedItem(tableJadwal.getValueAt(row, 3).toString());
        cbHari.setSelectedItem(tableJadwal.getValueAt(row, 4).toString());
        txtJamMulai.setText(tableJadwal.getValueAt(row, 5).toString());
        txtJamSelesai.setText(tableJadwal.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tableJadwalMouseClicked
    
    private void resetForm() {
    cbKelas.setSelectedIndex(0);
    cbPelajaran.setSelectedIndex(0);
    cbGuru.setSelectedIndex(0);
    cbHari.getSelectedItem().toString();
    txtJamMulai.setText("");
    txtJamSelesai.setText("");
    idTerpilih = -1; // Reset id
}
    
    // Helper methods untuk ambil ID dari nama
private int getIdKelas(String nama) throws SQLException {
    Connection conn = DatabaseConnection.getConnection();
    PreparedStatement pst = conn.prepareStatement("SELECT id FROM kelas WHERE nama_kelas=?");
    pst.setString(1, nama);
    ResultSet rs = pst.executeQuery();
    return rs.next() ? rs.getInt("id") : 0;
}

private int getIdPelajaran(String nama) throws SQLException {
    Connection conn = DatabaseConnection.getConnection();
    PreparedStatement pst = conn.prepareStatement("SELECT id FROM pelajaran WHERE nama_pelajaran=?");
    pst.setString(1, nama);
    ResultSet rs = pst.executeQuery();
    return rs.next() ? rs.getInt("id") : 0;
}

private int getIdGuru(String nama) throws SQLException {
    Connection conn = DatabaseConnection.getConnection();
    PreparedStatement pst = conn.prepareStatement("SELECT id FROM guru WHERE nama_guru=?");
    pst.setString(1, nama);
    ResultSet rs = pst.executeQuery();
    return rs.next() ? rs.getInt("id") : 0;
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PenjadwalanForm().setVisible(true));
    }

    private void isiComboKelas() {
    try {
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT nama_kelas FROM kelas");
        while (rs.next()) {
            cbKelas.addItem(rs.getString("nama_kelas"));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal load kelas: " + e.getMessage());
    }
}

private void isiComboPelajaran() {
    try {
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT nama_pelajaran FROM pelajaran");
        while (rs.next()) {
            cbPelajaran.addItem(rs.getString("nama_pelajaran"));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal load pelajaran: " + e.getMessage());
    }
}

private void isiComboGuru() {
    try {
        Connection conn = DatabaseConnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT nama_guru FROM guru");
        while (rs.next()) {
            cbGuru.addItem(rs.getString("nama_guru"));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal load guru: " + e.getMessage());
    }
}

private void tampilDataJadwal() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Kelas");
    model.addColumn("Pelajaran");
    model.addColumn("Guru");
    model.addColumn("Hari");
    model.addColumn("Jam Mulai");
    model.addColumn("Jam Selesai");

    try {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT jadwal.id, kelas.nama_kelas, pelajaran.nama_pelajaran, guru.nama_guru, jadwal.hari, jadwal.jam_mulai, jadwal.jam_selesai " +
                     "FROM jadwal " +
                     "JOIN kelas ON jadwal.id_kelas = kelas.id " +
                     "JOIN pelajaran ON jadwal.id_pelajaran = pelajaran.id " +
                     "JOIN guru ON jadwal.id_guru = guru.id";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nama_kelas"),
                rs.getString("nama_pelajaran"),
                rs.getString("nama_guru"),
                rs.getString("hari"),
                rs.getString("jam_mulai"),
                rs.getString("jam_selesai")
            });
        }

        tableJadwal.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Gagal tampil jadwal: " + e.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbGuru;
    private javax.swing.JComboBox<String> cbHari;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<String> cbPelajaran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHari;
    private javax.swing.JLabel lblJamMulai;
    private javax.swing.JLabel lblJamSelesai;
    private javax.swing.JLabel lblKelas;
    private javax.swing.JLabel lblKelas1;
    private javax.swing.JLabel lblKelas2;
    private javax.swing.JTable tableJadwal;
    private javax.swing.JTextField txtJamMulai;
    private javax.swing.JTextField txtJamSelesai;
    // End of variables declaration//GEN-END:variables
}
