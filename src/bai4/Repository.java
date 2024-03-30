package bai4;

import Bai4.Model;
import java.util.List;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Repository {

    private List<Model> list = new ArrayList<>();

    public List<Model> getDataFormDB() {

        String query = "select Ten,SoThich,NgaySinh,GioiTinh,SoThang from Test";

        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Model m = new Model();
                m.setHoTen(rs.getString("Ten"));
                m.setSoThich(rs.getString("SoThich"));
                m.setNgaySinh(rs.getString("NgaySinh"));
                m.setGioiTinh(rs.getInt("GioiTinh"));
                m.setSoThangYeu(rs.getInt("SoThang"));
                list.add(m);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void add(Model model) {

        String query = "insert into Test(Ten,SoThich,NgaySinh,GioiTinh,SoThang) values(?,?,?,?,?)";

        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, model.getHoTen());
            ps.setString(2, model.getSoThich());
            ps.setString(3, model.getNgaySinh());
            ps.setInt(4, model.getGioiTinh());
            ps.setInt(5, model.getSoThangYeu());
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Thêm thất bại");

        }

    }

    public void update(Model model, String hoTen) {
        String query = "update Test set SoThich = ?, NgaySinh = ?, GioiTinh = ?, SoThang = ?  where Ten = ?  ";

        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, model.getSoThich());
            ps.setString(2, model.getNgaySinh());
            ps.setInt(3, model.getGioiTinh());
            ps.setInt(4, model.getSoThangYeu());
            ps.setString(5, hoTen);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sửa thất bại");
        }
    }

    public void remove(String hoTen) {
        String query = "delete from Test where Ten = ?";
        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, hoTen);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Xóa thất bại");

        }

    }

    public boolean hoTenCheck(String hoTen) {
        String query = "SELECT Ten FROM Test WHERE Ten = ?";

        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, hoTen);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
