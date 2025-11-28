package Bai2;

import java.util.ArrayList;

public class TestHinhHoc {
    public static void main(String[] args) {
        ArrayList<Hinh> ds = new ArrayList<>();

        ds.add(new HinhTron(5.0));
        ds.add(new HinhChuNhat(4.0, 6.0));
        ds.add(new HinhVuong(7.0));

        double tongDienTich = 0;

        System.out.println("========== DANH SÁCH CÁC HÌNH ==========");

        for (Hinh h : ds) {
            h.xuatThongTin();
            tongDienTich += h.tinhDienTich();
        }
        System.out.println( "Tổng diện tích của tất cả các hình trong danh sách: " +  tongDienTich);
    }
}
