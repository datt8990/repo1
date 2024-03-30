package mvcThuCung;

public class Model {

    private Long id;

    private String ma;

    private String ten;

    private double canNang;

    private double chieuCao;

    private boolean gioiTinh;

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Model(String ma, String ten, double canNang, double chieuCao, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.gioiTinh = gioiTinh;
    }

    public Model(Long id, String ma, String ten, double canNang, double chieuCao, boolean gioiTinh) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.gioiTinh = gioiTinh;
    }

    public Model() {
    }

    public Object[] toRowTable() {
        return new Object[]{id, ma, ten, canNang, chieuCao, gioiTinh ? "Đực" : "Cái"};
    }
}
