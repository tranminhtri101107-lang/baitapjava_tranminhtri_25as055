package Baitap1;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String hoTen, int tuoi, String gioiTinh, int diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public String toString() {
        return "Kỹ sư { " + ", Họ Tên: '" + getHoTen() + '\'' +
                ", Tuổi: " + getTuoi() +
                ", Giới tính: '" + getGioiTinh() + '\'' +
                ", Địa chỉ: '" + getDiaChi() + '\'' +
                ", Ngành đào tạo: '" + nganhDaoTao + '\'' +
                '}';
    }
}
