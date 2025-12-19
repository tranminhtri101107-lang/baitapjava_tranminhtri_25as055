package QuanLyNhanSu;

import java.util.List;
import java.util.Scanner;

public class NhanSuView {
    private Scanner scanner = new Scanner(System.in);

    // Hiển thị Menu
    public int hienThiMenu() {
        System.out.println("\n--- QUẢN LÝ NHÂN SỰ CÔNG TY TECH MASTER ---");
        System.out.println("1. Thêm nhân viên");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm kiếm");
        System.out.println("4. Cập nhật lương");
        System.out.println("5. Xóa nhân viên");
        System.out.println("6. Bảng lương & Công việc");
        System.out.println("7. Thoát");
        System.out.print("Chọn chức năng: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Trả về -1 nếu nhập sai
        }
    }

    // Các hàm nhập liệu cơ bản
    public String nhapString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public double nhapDouble(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }

    public int nhapInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên!");
            }
        }
    }

    // Hiển thị danh sách nhân viên (Thay thế cho hàm inThongTin cũ)
    public void hienThiDanhSach(List<NhanVien> list) {
        System.out.println("\n--- DANH SÁCH NHÂN VIÊN ---");
        if (list.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (NhanVien nv : list) {
            inChiTietMotNhanVien(nv); // Hàm phụ trợ bên dưới
        }
    }

    // Hàm in chi tiết từng loại nhân viên (Logic hiển thị dồn về đây)
    private void inChiTietMotNhanVien(NhanVien nv) {
        String info = String.format("[%s] %s - Thực lĩnh: %,.0f VNĐ",
                nv.getMaNV(), nv.getHoTen(), nv.tinhLuong());

        if (nv instanceof LapTrinhVien) {
            info += " (LTV) - OT: " + ((LapTrinhVien) nv).getSoGioOT();
        } else if (nv instanceof KiemThuVien) {
            info += " (KTV) - Lỗi: " + ((KiemThuVien) nv).getSoLoiPhatHien();
        } else if (nv instanceof TruongDuAn) {
            info += " (TDA) - KN: " + ((TruongDuAn) nv).getSoNamKinhNghiem();
        }
        System.out.println(info);
    }

    // Hiển thị thông báo
    public void thongBao(String msg) {
        System.out.println(">> " + msg);
    }

    public void baoLoi(String msg) {
        System.out.println(">> LỖI: " + msg);
    }
}
