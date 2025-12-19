package QuanLyNhanSu;

import java.util.List;
import java.util.ArrayList;

public class NhanSuController {
    private List<NhanVien> danhSachNV = new ArrayList<>();
    private NhanSuView view = new NhanSuView();

    // Hàm chạy chính của chương trình
    public void run() {
        while (true) {
            int chon = view.hienThiMenu(); // Gọi View để hiện Menu
            switch (chon) {
                case 1: themNhanVien(); break;
                case 2: view.hienThiDanhSach(danhSachNV); break; // Đẩy dữ liệu sang View
                case 3: timKiem(); break;
                case 4: capNhatLuong(); break;
                case 5: xoaNhanVien(); break;
                case 6: bangLuongChiTiet(); break;
                case 7: view.thongBao("Kết thúc chương trình."); return;
                default: view.baoLoi("Chức năng không hợp lệ!");
            }
        }
    }

    private void themNhanVien() {
        int loai = view.nhapInt("Chọn chức vụ (1. LTV / 2. KTV / 3. TDA): ");
        String ma = view.nhapString("Nhập mã NV: ");
        String ten = view.nhapString("Nhập họ tên: ");
        double luong = view.nhapDouble("Nhập lương CB: ");

        try {
            NhanVien nvMoi = null;
            switch (loai) {
                case 1:
                    int ot = view.nhapInt("Số giờ OT: ");
                    nvMoi = new LapTrinhVien(ma, ten, luong, ot);
                    break;
                case 2:
                    int loi = view.nhapInt("Số lỗi tìm được: ");
                    nvMoi = new KiemThuVien(ma, ten, luong, loi);
                    break;
                case 3:
                    int kn = view.nhapInt("Số năm kinh nghiệm: ");
                    nvMoi = new TruongDuAn(ma, ten, luong, kn);
                    break;
                default:
                    view.baoLoi("Loại nhân viên không đúng!");
                    return;
            }
            // Thêm vào Model
            danhSachNV.add(nvMoi);
            view.thongBao("Thêm thành công!");

        } catch (IllegalArgumentException e) {
            // Bắt lỗi từ Model ném ra (ví dụ lương âm)
            view.baoLoi(e.getMessage());
        }
    }

    private void timKiem() {
        String kw = view.nhapString("Nhập Mã hoặc Tên cần tìm: ").toLowerCase();
        List<NhanVien> ketQua = new ArrayList<>();

        // Logic tìm kiếm
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaNV().toLowerCase().contains(kw) || nv.getHoTen().toLowerCase().contains(kw)) {
                ketQua.add(nv);
            }
        }
        // Gọi View hiển thị kết quả
        view.hienThiDanhSach(ketQua);
    }

    private void capNhatLuong() {
        String ma = view.nhapString("Nhập Mã NV cần sửa lương: ");
        NhanVien nvFound = null;

        // Tìm logic
        for (NhanVien nv : danhSachNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                nvFound = nv;
                break;
            }
        }

        if (nvFound != null) {
            double luongMoi = view.nhapDouble("Nhập lương mới: ");
            try {
                nvFound.setLuongCoBan(luongMoi); // Gọi Model update
                view.thongBao("Cập nhật thành công!");
            } catch (IllegalArgumentException e) {
                view.baoLoi(e.getMessage()); // View hiện lỗi nếu lương âm
            }
        } else {
            view.baoLoi("Không tìm thấy nhân viên!");
        }
    }

    private void xoaNhanVien() {
        String ma = view.nhapString("Nhập Mã NV cần xóa: ");
        boolean removed = danhSachNV.removeIf(nv -> nv.getMaNV().equalsIgnoreCase(ma));
        if (removed) view.thongBao("Đã xóa thành công!");
        else view.baoLoi("Không tìm thấy mã này.");
    }

    private void bangLuongChiTiet() {
        // Chức năng 6: Bạn có thể xử lý logic tính toán ở đây rồi đẩy chuỗi String sang View
        // Hoặc đơn giản là dùng View hiển thị danh sách (View sẽ gọi .tinhLuong() để in)
        view.hienThiDanhSach(danhSachNV);
        // Bạn có thể mở rộng View để có hàm `hienThiBangLuong(list)` riêng cho đẹp
    }
}
