package CuoiKy1.Main;

import CuoiKy1.Controller.BoDieuKhien;
import CuoiKy1.View.GiaoDienGhiChu;
import CuoiKy1.Model.KhoDuLieu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UngDungGhiChu extends Application {
    @Override
    public void start(Stage sanKhauChinh) {
        KhoDuLieu khoDuLieu = new KhoDuLieu();
        GiaoDienGhiChu giaoDien = new GiaoDienGhiChu();
        new BoDieuKhien(khoDuLieu, giaoDien);

        Scene canhVat = new Scene(giaoDien.layGiaoDien(), 800, 500);
        sanKhauChinh.setTitle("Ứng dụng ghi chú - Ghi Chú OOP");
        sanKhauChinh.setScene(canhVat);
        sanKhauChinh.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
