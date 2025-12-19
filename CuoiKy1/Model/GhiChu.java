package CuoiKy1.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class GhiChu {
    private String tieuDe;
    private LocalDateTime ngayTao;

    public GhiChu(String tieuDe) {
        this.tieuDe = tieuDe;
        this.ngayTao = LocalDateTime.now();
    }

    public String layTieuDe() { return tieuDe; }
    public void datTieuDe(String tieuDe) { this.tieuDe = tieuDe; }

    public abstract String layNoiDungChuoi();

    @Override
    public String toString() {
        DateTimeFormatter dinhDangVN = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return tieuDe + " (" + ngayTao.format(dinhDangVN) + ")";
    }
}
