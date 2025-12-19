package QuanLyNhanSu;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;

    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        setLuongCoBan(luongCoBan); // Sử dụng setter để validate ngay khi khởi tạo
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    // Validate luongCoBan >= 0
    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan >= 0) {
            this.luongCoBan = luongCoBan;
        } else {
            // Thay vì in ra, ta ném ngoại lệ để Controller bắt
            throw new IllegalArgumentException("Lương cơ bản không được âm!");
        }
    }

    // Abstract methods
    public abstract double tinhLuong();
    public abstract void lamViec();
}
