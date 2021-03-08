package model;

public class Phongtro {
    private int id;
    private String maphongtro;
    private String ten;
    private String sdt;
    private String ngayThue;
    private String thanhtoan;
    private String ghichu;

    public Phongtro() {
    }

    public Phongtro(int id,String maphongtro, String ten, String sdt, String ngayThue, String thanhtoan, String ghichu) {
        this.id = id;
        this.maphongtro = maphongtro;
        this.ten = ten;
        this.sdt = sdt;
        this.ngayThue = ngayThue;
        this.thanhtoan = thanhtoan;
        this.ghichu = ghichu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaphongtro() {
        return maphongtro;
    }

    public void setMaphongtro(String maphongtro) {
        this.maphongtro = maphongtro;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(String thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
}
