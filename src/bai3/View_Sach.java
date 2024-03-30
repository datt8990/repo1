package bai3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class View_Sach extends javax.swing.JFrame {

    private DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    private List<Model_Sach> listS = new ArrayList<>();
    private Repositories repositories = new Repositories();
    private DefaultTableModel defaultTableModel = new DefaultTableModel();

    public View_Sach() {
        initComponents();
        init();
    }

    public void init() {
        this.setLocationRelativeTo(null);
        this.listS = repositories.fakeData();
        this.defaultTableModel = (DefaultTableModel) tblDanhSach.getModel();
        fillCBC();
        fillTable(listS);
        fillData(listS.size()-1);
    }

    public void fillTable(List<Model_Sach> list) {
        defaultTableModel.setRowCount(0);
        for (Model_Sach model_Sach : list) {
            defaultTableModel.addRow(model_Sach.toRowTable());
        }
    }

    public void fillCBC() {
        defaultComboBoxModel = (DefaultComboBoxModel) cboNamXB.getModel();
        for (int i = 1990; i <= 2040; i++) {
            defaultComboBoxModel.addElement(i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        cboNamXB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rdoCoSo = new javax.swing.JRadioButton();
        rdoChuyenNghanh = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã Sách");

        jLabel2.setText("Tên Sách");

        jLabel3.setText("Năm XB");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        cboNamXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamXBActionPerformed(evt);
            }
        });

        jLabel4.setText("Phân Loại");

        buttonGroup1.add(rdoCoSo);
        rdoCoSo.setSelected(true);
        rdoCoSo.setText("Cơ Sở");

        buttonGroup1.add(rdoChuyenNghanh);
        rdoChuyenNghanh.setText("Chuyên Nghành");
        rdoChuyenNghanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuyenNghanhActionPerformed(evt);
            }
        });

        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Năm XB", "Phân Loại"
            }
        ));
        tblDanhSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSach);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Quản Lý Sách");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboNamXB, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoChuyenNghanh)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoCoSo)
                    .addComponent(rdoChuyenNghanh))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed

    }//GEN-LAST:event_txtTenActionPerformed

    private void cboNamXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamXBActionPerformed

    }//GEN-LAST:event_cboNamXBActionPerformed

    private void rdoChuyenNghanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuyenNghanhActionPerformed

    }//GEN-LAST:event_rdoChuyenNghanhActionPerformed

    private void tblDanhSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMouseClicked
        int row = tblDanhSach.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblDanhSachMouseClicked

    public void fillData(int index) {
        Model_Sach model_Sach = listS.get(index);
        txtMa.setText(model_Sach.getMaSach());
        txtTen.setText(model_Sach.getTenSach());
        cboNamXB.setSelectedItem(model_Sach.getNam());

        if (model_Sach.getPhanLoai() == 0) {
            rdoCoSo.setSelected(true);
        } else {
            rdoChuyenNghanh.setSelected(true);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Sach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboNamXB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoChuyenNghanh;
    private javax.swing.JRadioButton rdoCoSo;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
