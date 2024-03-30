package mvcThuCung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Model> list = new ArrayList<>();

    public List<Model> getDataFormDB() {
        String sql = "select id,mathucung,tenthucung,chieucao,cannang,gioitinh from thucung";
        try ( Connection conn = DBConnect.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Model m = new Model();
                m.setId(rs.getLong("id"));
                m.setMa(rs.getString("mathucung"));
                m.setTen(rs.getString("tenthucung"));
                m.setChieuCao(rs.getDouble("chieucao"));
                m.setCanNang(rs.getDouble("cannang"));
                m.setGioiTinh(rs.getBoolean("gioitinh"));
                list.add(m);

            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
