package Bai1;

public class GiangVien extends Person{
    private String maGV;
    private double luongThang;

    public GiangVien(String diaChi, String hoTen, int namSinh, String maGV, double luongThang) {
        super(diaChi, hoTen, namSinh);
        this.maGV = maGV;
        this.luongThang = luongThang;
    }

    @Override
    public String getLoai() {
        return "Giang Vien";
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Mã GV: " + maGV);
        System.out.println("Lương tháng: " + luongThang);
    }
}
