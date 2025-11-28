package Bai2;

public abstract class Hinh implements IHinhHoc {
    private String tenHinh;

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String gettenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public void xuatThongTin() {
        System.out.println("Hinh: " + tenHinh
                + " | Chu vi = " + tinhChuVi()
                + " | Dien tich = " + tinhDienTich());
    }
}
