package Baitap1;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, int diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    @Override
    public String toString() {
        return "Nhân viên {" + ", Họ Tên: '" + getHoTen() + '\'' +
                ", Tuổi: " + getTuoi() +
                ", Giới tính: '" + getGioiTinh() + '\'' +
                ", Địa chỉ: '" + getDiaChi() + '\'' +
                ", Công việc: " + congViec + '}';
    }
}
