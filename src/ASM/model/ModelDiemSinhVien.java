package ASM.model;

public class ModelDiemSinhVien {

    private String maSV;

    private String hoTen;

    private double diemTA;

    private double diemTinHoc;

    private double diemGDTC;

    private double diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(double diemTA) {
        this.diemTA = diemTA;
    }

    public double getDiemTinHoc() {
        return diemTinHoc;
    }

    public void setDiemTinHoc(double diemTinHoc) {
        this.diemTinHoc = diemTinHoc;
    }

    public double getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(double diemGDTC) {
        this.diemGDTC = diemGDTC;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public ModelDiemSinhVien(String maSV, String hoTen, double diemTA, double diemTinHoc, double diemGDTC, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTA = diemTA;
        this.diemTinHoc = diemTinHoc;
        this.diemGDTC = diemGDTC;
        this.diemTB = diemTB;
    }

    public ModelDiemSinhVien() {
    }

    public Object[] toRowTable() {
        return new Object[]{maSV, hoTen, diemTA, diemTinHoc, diemGDTC, diemTB};
    }

}
