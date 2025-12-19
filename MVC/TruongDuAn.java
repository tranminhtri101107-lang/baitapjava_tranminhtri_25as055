package MVC;

import QuanLyNhanSu.NhanVien;

public class TruongDuAn extends NhanVien {
    private double soNamKinhNghiem;

    public TruongDuAn(String maNV, String hoTen, double luongCoBan, int soNamKinhNghiem) {
        super(maNV, hoTen, (int) luongCoBan);
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    public double getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public void setSoNamKinhNghiem(int soNamKinhNghiem) {
        this.soNamKinhNghiem = soNamKinhNghiem;
    }

    @Override
    public void lamViec() {
        System.out.println("Công việc: Quản lý tiến độ team");
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soNamKinhNghiem * 1000000;
    }
}

