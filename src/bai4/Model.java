package Bai4;

public class Model {

    private String hoTen;

    private String soThich;

    private String ngaySinh;

    private int gioiTinh;

    private int soThangYeu;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoThangYeu() {
        return soThangYeu;
    }

    public void setSoThangYeu(int soThangYeu) {
        this.soThangYeu = soThangYeu;
    }

    public Model(String hoTen, String soThich, String ngaySinh, int gioiTinh, int soThangYeu) {
        this.hoTen = hoTen;
        this.soThich = soThich;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soThangYeu = soThangYeu;
    }

    public Model() {
    }

    public Object[] toRowData() {
        return new Object[]{hoTen, soThich, ngaySinh, gioiTinh == 0 ? "Nam" : "Nữ", soThangYeu};
    }

}
