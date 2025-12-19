//package MVC;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//public class SwingController {
//    private MainFrame view;
//    private ArrayList<NhanVien> danhSachNV;
//
//    public SwingController(MainFrame view) {
//        this.view = view;
//        this.danhSachNV = new ArrayList<>();
//
//        // Gán sự kiện cho các nút
//        view.addBtnThemListener(new ThemNhanVienListener());
//        view.addBtnXoaListener(new XoaNhanVienListener());
//    }
//
//    public void showWindow() {
//        view.setVisible(true);
//    }
//
//    // --- LỚP NỘI BỘ XỬ LÝ SỰ KIỆN THÊM ---
//    class ThemNhanVienListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                // 1. Lấy dữ liệu từ View
//                String ma = view.getMa();
//                String ten = view.getTen();
//                double luong = Double.parseDouble(view.getLuong());
//                double thuocTinhRieng = Double.parseDouble(view.getThuocTinhRieng());
//                int loai = view.getLoaiNhanVien();
//
//                LapTrinhVien nvMoi = null;
//                String chucVu = "";
//
//                // 2. Logic tạo đối tượng Model (Giống bài cũ)
//                switch (loai) {
//                    case 0: // Lập trình viên
//                        nvMoi = new LapTrinhVien(ma, ten, luong, (int)thuocTinhRieng);
//                        chucVu = "Lập Trình Viên";
//                        break;
//                    case 1: // Kiểm thử viên
//                        nvMoi = new KiemThuVien(ma, ten, luong, (int)thuocTinhRieng);
//                        chucVu = "Kiểm Thử Viên";
//                        break;
//                    case 2: // Trưởng dự án
//                        nvMoi = new TruongDuAn(ma, ten, luong, (int)thuocTinhRieng);
//                        chucVu = "Trưởng Dự Án";
//                        break;
//                }
//
//                // 3. Thêm vào danh sách quản lý
//                danhSachNV.add(nvMoi);
//
//                // 4. Cập nhật lên Bảng (View)
//                // Lưu ý: Gọi nvMoi.tinhLuong() để lấy lương thực lĩnh chính xác
//                Object[] row = {ma, ten, chucVu, luong, thuocTinhRieng, nvMoi.tinhLuong()};
//                view.themDongVaoBang(row);
//
//                view.hienThiThongBao("Thêm thành công!");
//                view.xoaTrangForm();
//
//            } catch (NumberFormatException ex) {
//                view.hienThiThongBao("Lỗi: Vui lòng nhập số hợp lệ cho Lương và Thuộc tính riêng!");
//            } catch (IllegalArgumentException ex) {
//                view.hienThiThongBao("Lỗi Logic: " + ex.getMessage());
//            } catch (Exception ex) {
//                view.hienThiThongBao("Lỗi: " + ex.toString());
//            }
//        }
//    }
//
//    // --- LỚP NỘI BỘ XỬ LÝ SỰ KIỆN XÓA ---
//    class XoaNhanVienListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int selectedRow = view.getDongDuocChon();
//            if (selectedRow == -1) {
//                view.hienThiThongBao("Vui lòng chọn một dòng để xóa!");
//                return;
//            }
//
//            // Lấy Mã NV từ dòng đang chọn để xóa trong List
//            String maNV = view.getMaTaiDong(selectedRow);
//
//            // Xóa trong Model (List)
//            danhSachNV.removeIf(nv -> nv.getMaNV().equals(maNV));
//
//            // Xóa trên View (Table)
//            view.xoaDongTai(selectedRow);
//            view.hienThiThongBao("Đã xóa nhân viên mã: " + maNV);
//        }
//    }
//}
