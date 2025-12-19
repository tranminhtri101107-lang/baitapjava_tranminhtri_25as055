package CuoiKy1.Controller;

import CuoiKy1.View.GiaoDienGhiChu;
import CuoiKy1.Model.GhiChu;
import CuoiKy1.Model.GhiChuVanBan;
import CuoiKy1.Model.KhoDuLieu;
import javafx.scene.control.Alert;
import javafx.application.Platform; // cái này để tắt ứng dụng
import javafx.scene.control.ButtonType; // Import thêm để xử lý nút Yes/No
import java.util.Optional; // Import thêm

public class BoDieuKhien {
    private KhoDuLieu khoDuLieu;
    private GiaoDienGhiChu giaoDien;
    private GhiChu ghiChuDangChon = null;

    public BoDieuKhien(KhoDuLieu khoDuLieu, GiaoDienGhiChu giaoDien) {
        this.khoDuLieu = khoDuLieu;
        this.giaoDien = giaoDien;
        this.giaoDien.layDanhSachHienThi().setItems(khoDuLieu.layDanhSach());
        ganSuKien();
    }

    private void ganSuKien() {
        giaoDien.layDanhSachHienThi().getSelectionModel().selectedItemProperty().addListener((obs, cu, moi) -> {
            hienThiLenForm(moi);
        });

        giaoDien.layNutThem().setOnAction(e -> {
            ghiChuDangChon = null;
            giaoDien.layDanhSachHienThi().getSelectionModel().clearSelection();
            giaoDien.xoaTrangForm();
        });

        giaoDien.layNutLuu().setOnAction(e -> xuLyLuu());
        giaoDien.layNutXoa().setOnAction(e -> xuLyXoa());
        giaoDien.layNutThoat().setOnAction(e -> xuLyThoat());
    }

    private void hienThiLenForm(GhiChu ghiChu) {
        if (ghiChu != null) {
            ghiChuDangChon = ghiChu;
            giaoDien.layONhapTieuDe().setText(ghiChu.layTieuDe());
            giaoDien.layONhapNoiDung().setText(ghiChu.layNoiDungChuoi());
        }
    }

    private void xuLyLuu() {
        String tieuDe = giaoDien.layONhapTieuDe().getText();
        String noiDung = giaoDien.layONhapNoiDung().getText();

        if (tieuDe.isEmpty()) {
            hienThongBao("Lỗi", "Vui lòng nhập tiêu đề!");
            return;
        }

        if (ghiChuDangChon == null) {
            GhiChuVanBan ghiChuMoi = new GhiChuVanBan(tieuDe, noiDung);
            khoDuLieu.themGhiChu(ghiChuMoi);
        } else {
            ghiChuDangChon.datTieuDe(tieuDe);
            if (ghiChuDangChon instanceof GhiChuVanBan) {
                ((GhiChuVanBan) ghiChuDangChon).datNoiDung(noiDung);
            }
            giaoDien.layDanhSachHienThi().refresh();
        }
        giaoDien.xoaTrangForm();
        ghiChuDangChon = null;
    }

    private void xuLyXoa() {
        if (ghiChuDangChon != null) {
            khoDuLieu.xoaGhiChu(ghiChuDangChon);
            giaoDien.xoaTrangForm();
            ghiChuDangChon = null;
        } else {
            hienThongBao("Cảnh báo", "Chưa chọn ghi chú để xóa!");
        }
    }

    private void hienThongBao(String tieuDe, String noiDung) {
        Alert thongBao = new Alert(Alert.AlertType.INFORMATION);
        thongBao.setTitle(tieuDe);
        thongBao.setHeaderText(null);
        thongBao.setContentText(noiDung);
        thongBao.showAndWait();
    }

    private void xuLyThoat() {
        // Tạo hộp thoại xác nhận (Confirmation Dialog)
        Alert thongBao = new Alert(Alert.AlertType.CONFIRMATION);
        thongBao.setTitle("Xác nhận thoát");
        thongBao.setHeaderText(null);
        thongBao.setContentText("Bạn có chắc chắn muốn thoát ứng dụng không?");

        // Hiện hộp thoại và chờ người dùng bấm
        Optional<ButtonType> ketQua = thongBao.showAndWait();

        // Nếu người dùng bấm OK
        if (ketQua.isPresent() && ketQua.get() == ButtonType.OK) {
            Platform.exit(); // Lệnh chuẩn để tắt ứng dụng JavaFX
            System.exit(0);  // Đảm bảo tắt sạch sẽ cả máy ảo Java
        }
    }
}
