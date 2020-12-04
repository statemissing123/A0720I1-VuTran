package BaithiModule2.Model;

public class SoTKVoThoiHan extends SoTKNganHan  {

    public SoTKVoThoiHan() {
    }

    public SoTKVoThoiHan(String maSoSo, String maKhachHang, String ngayMoSo, String thoiGianGui, String soTienGui, String laiSuat) {
        super(maSoSo, maKhachHang, ngayMoSo, thoiGianGui, soTienGui, laiSuat);
    }

    @Override
    public String showInfo() {
        return this.getMaSoSo()+
                this.getMaKhachHang()+
                this.getNgayMoSo()+
                this.getThoiGianGui()+
                this.getSoTienGui()+
                this.getLaiSuat();
    }


}
