package MVC;

import QuanLyNhanSu.NhanVien;

public class LapTrinhVien extends NhanVien {
    private double soGioOT;

    public LapTrinhVien(String maNV, String hoTen, double luongCoBan, double soGioOT) {
        super(maNV, hoTen, luongCoBan);
        this.soGioOT = soGioOT;
    }

    public double getSoGioOT() {
        return soGioOT;
    }

    public void setSoGioOT(int soGioOT) {
        this.soGioOT = soGioOT;
    }

    @Override
    public void lamViec() {
        System.out.println("Công việc: Viết code và fix bug");
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soGioOT * 200000;
    }
}
