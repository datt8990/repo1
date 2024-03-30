package bai4;

import Bai4.Model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View_HocLai extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    private List<Model> list = new ArrayList<>();
    private Repository repository = new Repository();

    public View_HocLai() {
        initComponents();
        this.setLocationRelativeTo(null);

        for (int i = 1; i <= 100; i++) {
            cboThang.addItem(String.valueOf(i));
        }
        list = repository.getDataFormDB();
        fillTable(list);

    }

    public void fillTable(List<Model> list) {
        defaultTableModel = (DefaultTableModel) tblDanhSach.getModel();
        defaultTableModel.setRowCount(0);
        for (Model model : list) {
            defaultTableModel.addRow(model.toRowData());
        }
    }

    public void fillData(int index) {
        Model model = list.get(index);
        txtHoTen.setText(model.getHoTen());
        txaSoThich.setText(model.getSoThich());
        txtNgaySinh.setText(model.getNgaySinh());
        if (model.getGioiTinh() == 0) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        cboThang.setSelectedIndex(model.getSoThangYeu() - 1);

    }

    public Model getFormData() {
        String hoTen = txtHoTen.getText().trim();
        String soThich = txaSoThich.getText().trim();
        String ngaySinh = txtNgaySinh.getText().trim();
        int gioiTinh = 0;
        if (rdoNam.isSelected()) {
            gioiTinh = 0;
        } else {
            gioiTinh = 1;
        }
        int soThang = cboThang.getSelectedIndex();
        return new Model(hoTen, soThich, ngaySinh, gioiTinh, soThang);

    }

    public void resetForm() {
        txtHoTen.setText("");
        txaSoThich.setText("");
        txtNgaySinh.setText("");
        buttonGroup1.clearSelection();
        cboThang.setSelectedIndex(0);
    }

    public Boolean validation() {
        if (txtHoTen.getText().isEmpty() || txaSoThich.getText().isEmpty() || txtNgaySinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            return false;
        }
        // .*\\d.*
        if (txtHoTen.getText().matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Vui lòng không nhập số vào trường Họ và Tên");
            return false;
        }
        if (repository.hoTenCheck(txtHoTen.getText())) {
            JOptionPane.showMessageDialog(this, "Tên đã tồn tại");
            return false;
        }
        return true;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        txtHoTen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSoThich = new javax.swing.JTextArea();
        txtNgaySinh = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Họ Tên");

        jLabel2.setText("Sở Thích");

        jLabel3.setText("Ngày Sinh");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Số Tháng Yêu Đương");

        txaSoThich.setColumns(20);
        txaSoThich.setRows(5);
        jScrollPane1.setViewportView(txaSoThich);

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Sở Thích", "Ngày Sinh", "Giới Tính", "Số Tháng"
            }
        ));
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSach);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNgaySinh)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdoNam)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdoNu)
                                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnSua)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        int row = tblDanhSach.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblDanhSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (!validation()) {
            return;
        }
        repository.add(getFormData());
        list.clear();
        list = repository.getDataFormDB();
        fillTable(list);
        resetForm();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tblDanhSach.getSelectedRow();
        Model model = list.get(row);
        String hoTen = model.getHoTen();
        repository.remove(hoTen);
        list.clear();
        list = repository.getDataFormDB();
        fillTable(list);
        resetForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (!validation()) {
            return;
        }
        int row = tblDanhSach.getSelectedRow();
        Model model = list.get(row);
        String hoTen = model.getHoTen();
        repository.update(getFormData(), hoTen);
        list.clear();
        list = repository.getDataFormDB();
        fillTable(list);
        resetForm();
    }//GEN-LAST:event_btnSuaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_HocLai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextArea txaSoThich;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
