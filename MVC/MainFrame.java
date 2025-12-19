package MVC;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    // Các thành phần giao diện cần public hoặc có getter để Controller truy cập
    private JTextField txtMa, txtTen, txtLuong, txtThuocTinhRieng;
    private JComboBox<String> cbLoai;
    private JButton btnThem, btnXoa;
    private JTable table;
    private DefaultTableModel tableModel;
    private JLabel lblThuocTinhRieng; // Label này sẽ đổi nội dung tùy theo loại NV

    public MainFrame() {
        setTitle("Quản Lý Nhân Sự - MVC Swing");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Panel Nhập liệu (Phía trên)
        JPanel panelInput = new JPanel(new GridLayout(5, 2, 10, 10));
        panelInput.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Loại nhân viên
        panelInput.add(new JLabel("Loại Nhân Viên:"));
        cbLoai = new JComboBox<>(new String[]{"Lập Trình Viên", "Kiểm Thử Viên", "Trưởng Dự Án"});
        panelInput.add(cbLoai);

        panelInput.add(new JLabel("Mã NV:"));
        txtMa = new JTextField();
        panelInput.add(txtMa);

        panelInput.add(new JLabel("Họ Tên:"));
        txtTen = new JTextField();
        panelInput.add(txtTen);

        panelInput.add(new JLabel("Lương Cơ Bản:"));
        txtLuong = new JTextField();
        panelInput.add(txtLuong);

        // Thuộc tính riêng (OT / Lỗi / Kinh nghiệm)
        lblThuocTinhRieng = new JLabel("Số giờ OT:"); // Mặc định là LTV
        panelInput.add(lblThuocTinhRieng);
        txtThuocTinhRieng = new JTextField();
        panelInput.add(txtThuocTinhRieng);

        add(panelInput, BorderLayout.NORTH);

        // 2. Panel Nút bấm (Ở giữa)
        JPanel panelButtons = new JPanel();
        btnThem = new JButton("Thêm Nhân Viên");
        btnXoa = new JButton("Xóa Nhân Viên");
        panelButtons.add(btnThem);
        panelButtons.add(btnXoa);
        add(panelButtons, BorderLayout.CENTER);

        // 3. Bảng Danh sách (Phía dưới)
        String[] columns = {"Mã NV", "Họ Tên", "Chức Vụ", "Lương CB", "Thông tin riêng", "Thực Lĩnh"};
        tableModel = new DefaultTableModel(columns, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.SOUTH);

        // Sự kiện đổi label khi chọn ComboBox (Xử lý giao diện đơn giản ngay tại View)
        cbLoai.addActionListener(e -> updateLabel());
    }

    // Hàm cập nhật nhãn khi chọn loại nhân viên khác
    private void updateLabel() {
        int index = cbLoai.getSelectedIndex();
        if (index == 0) lblThuocTinhRieng.setText("Số giờ OT:");
        else if (index == 1) lblThuocTinhRieng.setText("Số lỗi phát hiện:");
        else lblThuocTinhRieng.setText("Số năm kinh nghiệm:");
    }

    // --- Các hàm Getter để Controller lấy dữ liệu ---
    public String getMa() {
        return txtMa.getText();
    }
    public String getTen() {
        return txtTen.getText();
    }
    public String getLuong() {
        return txtLuong.getText();
    }
    public String getThuocTinhRieng() {
        return txtThuocTinhRieng.getText();
    }
    public int getLoaiNhanVien() {
        return cbLoai.getSelectedIndex();
    } // 0: LTV, 1: KTV, 2: TDA

    // Hàm để Controller gán sự kiện cho nút
    public void addBtnThemListener(ActionListener log) {
        btnThem.addActionListener(log);
    }
    public void addBtnXoaListener(ActionListener log) {
        btnXoa.addActionListener(log);
    }

    // Hàm thao tác với bảng
    public void themDongVaoBang(Object[] row) {
        tableModel.addRow(row);
    }
    public int getDongDuocChon() {
        return table.getSelectedRow();
    }
    public void xoaDongTai(int index) {
        tableModel.removeRow(index);
    }
    public String getMaTaiDong(int row) {
        return tableModel.getValueAt(row, 0).toString();
    }

    public void hienThiThongBao(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void xoaTrangForm() {
        txtMa.setText(""); txtTen.setText(""); txtLuong.setText(""); txtThuocTinhRieng.setText("");
    }
}
