package bai3;

public class Model_Sach {

    private String maSach;

    private String tenSach;

    private int nam;

    private int phanLoai;

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(int phanLoai) {
        this.phanLoai = phanLoai;
    }

    public Model_Sach(String maSach, String tenSach, int nam, int phanLoai) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nam = nam;
        this.phanLoai = phanLoai;
    }

    public Model_Sach() {
    }

    public Object[] toRowTable() {
        return new Object[]{maSach, tenSach, nam, phanLoai == 0 ? "Cơ Sở" : "Chuyên Nghành"};
    }

}
