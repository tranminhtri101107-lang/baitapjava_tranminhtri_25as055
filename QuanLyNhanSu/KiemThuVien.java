package QuanLyNhanSu;

public class KiemThuVien extends NhanVien {
    private int soLoiPhatHien;

    public KiemThuVien(String maNV, String hoTen, double luongCoBan, int soLoiPhatHien) {
        super(maNV, hoTen, luongCoBan);
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    @Override
    public void lamViec() {
        System.out.println("Công việc: Kiểm tra phần mềm");
    }

    @Override
    public double tinhLuong() {
        return getLuongCoBan() + soLoiPhatHien * 50000;
    }
}
