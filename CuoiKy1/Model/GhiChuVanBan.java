package CuoiKy1.Model;

public class GhiChuVanBan extends GhiChu {
    private String noiDung;

    public GhiChuVanBan(String tieuDe, String noiDung) {
        super(tieuDe);
        this.noiDung = noiDung;
    }

    public String layNoiDung() { return noiDung; }
    public void datNoiDung(String noiDung) { this.noiDung = noiDung; }

    @Override
    public String layNoiDungChuoi() {
        return noiDung;
    }
}
