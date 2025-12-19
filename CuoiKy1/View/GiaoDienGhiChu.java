package CuoiKy1.View;

import CuoiKy1.Model.GhiChu;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GiaoDienGhiChu {
    private BorderPane khungChinh;
    private ListView<GhiChu> danhSachHienThi;
    private TextField oNhapTieuDe;
    private TextArea oNhapNoiDung;
    private Button nutThem, nutLuu, nutXoa, nutThoat;

    public GiaoDienGhiChu() {
        khungChinh = new BorderPane();
        khungChinh.setPadding(new Insets(10));
        khoiTaoGiaoDien();
    }

    private void khoiTaoGiaoDien() {
        danhSachHienThi = new ListView<>();
        danhSachHienThi.setPrefWidth(250);
        VBox vungTrai = new VBox(5, new Label("Danh sách ghi chú:"), danhSachHienThi);

        oNhapTieuDe = new TextField();
        oNhapTieuDe.setPromptText("Nhập tiêu đề tại đây...");

        oNhapNoiDung = new TextArea();
        oNhapNoiDung.setPromptText("Nhập nội dung ghi chú...");
        oNhapNoiDung.setWrapText(true);

        nutThem = new Button("Tạo Mới");
        nutLuu = new Button("Lưu Ghi Chú");
        nutXoa = new Button("Xóa");
        nutThoat = new Button("Thoát");

        nutLuu.setStyle("-fx-base: #4CAF50; -fx-font-weight: bold;");
        nutXoa.setStyle("-fx-base: #f44336;");
        nutLuu.setStyle("-fx-base: #4CAF50; -fx-font-weight: bold;");
        nutXoa.setStyle("-fx-base: #f44336;");
        // Màu xám đậm cho nút thoát
        nutThoat.setStyle("-fx-base: #555555; -fx-text-fill: white;");

        HBox hopNutBam = new HBox(10, nutThem, nutLuu, nutXoa, nutThoat);
        VBox vungPhai = new VBox(10, new Label("Chi tiết nội dung:"), oNhapTieuDe, oNhapNoiDung, hopNutBam);

        khungChinh.setLeft(vungTrai);
        khungChinh.setCenter(vungPhai);
        BorderPane.setMargin(vungPhai, new Insets(0, 0, 0, 15));


    }

    public Parent layGiaoDien() {
        return khungChinh;
    }
    public ListView<GhiChu> layDanhSachHienThi() {
        return danhSachHienThi;
    }
    public TextField layONhapTieuDe() {
        return oNhapTieuDe;
    }
    public TextArea layONhapNoiDung() {
        return oNhapNoiDung;
    }
    public Button layNutThem() {
        return nutThem;
    }
    public Button layNutLuu() {
        return nutLuu;
    }
    public Button layNutXoa() {
        return nutXoa;
    }
    public Button layNutThoat() {
        return nutThoat;
    }

    public void xoaTrangForm() {
        oNhapTieuDe.clear();
        oNhapNoiDung.clear();
    }
}
