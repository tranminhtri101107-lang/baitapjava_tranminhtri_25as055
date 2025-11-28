package Bai2;

public class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron(double banKinh) {
        super("Hinh tron");
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
}
