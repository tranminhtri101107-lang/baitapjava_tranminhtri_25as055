package Bai1;

public abstract class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Person(String diaChi, String hoTen, int namSinh) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public abstract String getLoai();

    public void inThongTin() {
        System.out.println("Loại: " + getLoai());
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Năm sinh: " + namSinh);
    }
}
