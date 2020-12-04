package BaithiModule2.Model;

public class SoTKCoThoiHan extends SoTKNganHan {
    private String kyHan;

    public SoTKCoThoiHan() {
    }


    public SoTKCoThoiHan(String maSoSo, String maKhachHang, String ngayMoSo, String thoiGianGui, String soTienGui, String laiSuat, String kyHan) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianGui, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }
    @Override
    public String showInfo() {
        return this.getMaSoSo()+
                this.getMaKhachHang()+
                this.getNgayMoSo()+
                this.getThoiGianGui()+
                this.getKyHan()+
                this.getSoTienGui()+
                this.getLaiSuat();
    }
}
