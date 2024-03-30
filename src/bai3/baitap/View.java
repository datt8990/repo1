package bai3.baitap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    private Repository repository = new Repository();
    private List<Model> list = new ArrayList<>();
    private File file;

    public View() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();

    }

    public void init() {
        this.list = repository.fakeData();
        file = new File("PRF.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
            }
        }
        fillTable(list);
    }

    public void fillTable(List<Model> list) {
        defaultTableModel = (DefaultTableModel) tblProfile.getModel();
        defaultTableModel.setRowCount(0);
        for (Model model : list) {
            defaultTableModel.addRow(model.toRowTable());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        txtThunhap = new javax.swing.JTextField();
        cboQueQuan = new javax.swing.JComboBox<>();
        rdoA = new javax.swing.JRadioButton();
        rdoO = new javax.swing.JRadioButton();
        rdoB = new javax.swing.JRadioButton();
        rdoAB = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfile = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Profile");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Thu Nhập");

        jLabel4.setText("Nhóm Máu");

        jLabel5.setText("Quê Quán");

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        cboQueQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Nội", "Ninh Bình", "Nam Định", "Thái Nguyên" }));

        buttonGroup1.add(rdoA);
        rdoA.setText("A");

        buttonGroup1.add(rdoO);
        rdoO.setSelected(true);
        rdoO.setText("O");

        buttonGroup1.add(rdoB);
        rdoB.setText("B");

        buttonGroup1.add(rdoAB);
        rdoAB.setText("AB");

        tblProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Thu Nhập", "Nhóm Máu", "Quê Quán"
            }
        ));
        tblProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfileMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfile);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtThunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoAB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnReset)
                    .addComponent(btnAdd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(txtThunhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdoA)
                    .addComponent(rdoB)
                    .addComponent(rdoAB)
                    .addComponent(rdoO)
                    .addComponent(btnReset))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfileMouseClicked
        int row = tblProfile.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tblProfileMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblProfile.getSelectedRow();
        JOptionPane.showMessageDialog(this, repository.delete(row));
        fillTable(list);
        reset();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Model model : list) {
                oos.writeObject(model);
            }
            fos.close();
            oos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        JOptionPane.showMessageDialog(this, repository.add(getFormData()));
        fillTable(list);
        reset();
    }//GEN-LAST:event_btnAddActionPerformed

    public Model getFormData() {
        String hoTen = txtHoTen.getText();
        int thuNhap = Integer.valueOf(txtThunhap.getText());
        String queQuan = (String) cboQueQuan.getSelectedItem();
        String nhomMau = "";
        if (rdoA.isSelected()) {
            nhomMau = "A";
        } else if (rdoB.isSelected()) {
            nhomMau = "B";
        } else if (rdoAB.isSelected()) {
            nhomMau = "AB";
        } else {
            nhomMau = "O";
        }
        return new Model(hoTen, thuNhap, nhomMau, queQuan);

    }

    public void reset() {
        txtHoTen.setText("");
        txtThunhap.setText("");
        cboQueQuan.setSelectedIndex(0);
        buttonGroup1.clearSelection();
    }

    public void fillData(int index) {
        Model model = list.get(index);
        txtHoTen.setText(model.getHoTen());
        txtThunhap.setText(String.valueOf(model.getThuNhap()));
        if (model.getNhomMau().equals("A")) {
            rdoA.setSelected(true);
        } else if (model.getNhomMau().equals("B")) {
            rdoB.setSelected(true);
        } else if (model.getNhomMau().equals("AB")) {
            rdoAB.setSelected(true);
        } else {
            rdoO.setSelected(true);
        }
        cboQueQuan.setSelectedItem(model.getQueQuan());
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboQueQuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoA;
    private javax.swing.JRadioButton rdoAB;
    private javax.swing.JRadioButton rdoB;
    private javax.swing.JRadioButton rdoO;
    private javax.swing.JTable tblProfile;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtThunhap;
    // End of variables declaration//GEN-END:variables
}
