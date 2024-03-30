package bai3.baitap;

public class Model {

     private String hoTen;

    private int thuNhap;

    private String nhomMau;

    private String queQuan;

    public Model(String hoTen, int thuNhap, String nhomMau, String queQuan) {
        this.hoTen = hoTen;
        this.thuNhap = thuNhap;
        this.nhomMau = nhomMau;
        this.queQuan = queQuan;
    }

    public Model() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(int thuNhap) {
        this.thuNhap = thuNhap;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

 

    public Object[] toRowTable() {
        return new Object[]{hoTen, thuNhap, nhomMau, queQuan
        };
    }
}
