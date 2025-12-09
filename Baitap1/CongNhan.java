package Baitap1;

public class CongNhan extends CanBo {
    private int capBac;

    public CongNhan(String hoTen, int tuoi, String gioiTinh, int diaChi, int capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        if (capBac <= 10 && capBac >= 1) {
            this.capBac = capBac;
        }
    }
    @Override
    public String toString() {
         return "CongNhan{" +
                "Cấp bậc =" + capBac +
                ", Họ Tên: '" + getHoTen() + '\'' +
                ", Tuổi: " + getTuoi() +
                ", Giới tính: '" + getGioiTinh() + '\'' +
                ", Địa chỉ: '" + getDiaChi() + '\'' +
                '}';
    }
}
