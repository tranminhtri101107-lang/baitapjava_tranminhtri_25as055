package Bai1;

public class SinhVien extends Person {
    private String maSV;
    private double diemTB;

    public SinhVien(String diaChi, String hoTen, int namSinh, String maSV, double diemTB) {
        super(diaChi, hoTen, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public String getLoai() {
        return "Sing vien";
    }
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Mã SV: " + maSV);
        System.out.println("điểm TB: " + diemTB);
    }
}
