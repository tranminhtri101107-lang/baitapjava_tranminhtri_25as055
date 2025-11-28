package Bai1;

public class TestPerson {
    public static void main(String[] args) {
        Person[] ds = new Person[5];

        // Sinh viên 1
        ds[0] = new SinhVien("Nguyen Van A", "Ha Noi", 2003, "SV001", 8.5);
        // Sinh viên 2
        ds[1] = new SinhVien("Le Thi B", "Hai Phong", 2001, "SV002", 7.2);
        // Sinh viên 3
        ds[2] = new SinhVien("Tran Van C", "Da Nang", 2003, "SV003", 9.0);

        // Giảng viên 1
        ds[3] = new GiangVien("Thay Nguyen Van D", "TP HCM", 1980, "GV001", 7000000);
        // Giảng viên 2
        ds[4] = new GiangVien("Co Pham Thi E", "Can Tho", 1985, "GV002", 5000000);

        System.out.println("========== DANH SÁCH QUẢN LÝ ==========");

        for (Person p : ds) {
            if (p != null) {
                p.inThongTin();
            }
        }
    }
}