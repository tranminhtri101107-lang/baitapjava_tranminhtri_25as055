package CuoiKy1.Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KhoDuLieu {
    private ObservableList<GhiChu> danhSachGhiChu;

    public KhoDuLieu() {
        danhSachGhiChu = FXCollections.observableArrayList();
    }

    public ObservableList<GhiChu> layDanhSach() {
        return danhSachGhiChu;
    }

    public void themGhiChu(GhiChu ghiChu) {
        danhSachGhiChu.add(ghiChu);
    }

    public void xoaGhiChu(GhiChu ghiChu) {
        danhSachGhiChu.remove(ghiChu);
    }
}
