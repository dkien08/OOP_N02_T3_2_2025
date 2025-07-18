package quanli;
import java.util.ArrayList;
import java.util.List;

public class QuanLyKhachHang {
    private List<KhachHang> danhSachKhachHang = new ArrayList<>();

    // Lớp KhachHang
    public static class KhachHang {
        private String idKhachHang;
        private String tenKhachHang;
        private String email;
        private String sdt;

        public KhachHang(String idKhachHang, String tenKhachHang, String email, String sdt) {
            this.idKhachHang = idKhachHang;
            this.tenKhachHang = tenKhachHang;
            this.email = email;
            this.sdt = sdt;
        }

        // Getter và Setter
        public String getIdKhachHang() { return idKhachHang; }
        public void setIdKhachHang(String idKhachHang) { this.idKhachHang = idKhachHang; }
        public String getTenKhachHang() { return tenKhachHang; }
        public void setTenKhachHang(String tenKhachHang) { this.tenKhachHang = tenKhachHang; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getSdt() { return sdt; }
        public void setSdt(String sdt) { this.sdt = sdt; }

        @Override
        public String toString() {
            return "KhachHang{" +
                   "idKhachHang='" + idKhachHang + '\'' +
                   ", tenKhachHang='" + tenKhachHang + '\'' +
                   ", email='" + email + '\'' +
                   ", sdt='" + sdt + '\'' +
                   '}';
        }
    }

    // Phương thức thêm khách hàng
    public boolean themKhachHang(String idKhachHang, String tenKhachHang, String email, String sdt) {
        // Kiểm tra idKhachHang có bị trùng không
        for (KhachHang kh : danhSachKhachHang) {
            if (kh.getIdKhachHang().equals(idKhachHang)) {
                return false; // Trả về false nếu ID đã tồn tại
            }
        }

        // Kiểm tra định dạng email cơ bản
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            return false; // Trả về false nếu email không hợp lệ
        }

        // Kiểm tra số điện thoại (giả sử là 10 số, chỉ chứa số)
        if (!sdt.matches("\\d{10}")) {
            return false; // Trả về false nếu số điện thoại không hợp lệ
        }

        // Tạo và thêm khách hàng mới
        KhachHang khachHang = new KhachHang(idKhachHang, tenKhachHang, email, sdt);
        danhSachKhachHang.add(khachHang);
        return true; // Trả về true nếu thêm thành công
    }

    // Phương thức xóa khách hàng
    public boolean xoaKhachHang(String idKhachHang) {
        for (KhachHang kh : danhSachKhachHang) {
            if (kh.getIdKhachHang().equals(idKhachHang)) {
                danhSachKhachHang.remove(kh);
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy khách hàng
    }

    // Phương thức xem danh sách khách hàng
    public List<KhachHang> xemKhachHang() {
        return new ArrayList<>(danhSachKhachHang); // Trả về bản sao của danh sách
    }

    // Phương thức sửa thông tin khách hàng
    public boolean suaKhachHang(String idKhachHang, String tenKhachHang, String email, String sdt) {
        for (KhachHang kh : danhSachKhachHang) {
            if (kh.getIdKhachHang().equals(idKhachHang)) {
                // Kiểm tra định dạng email cơ bản
                if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                    return false; // Trả về false nếu email không hợp lệ
                }

                // Kiểm tra số điện thoại (giả sử là 10 số, chỉ chứa số)
                if (!sdt.matches("\\d{10}")) {
                    return false; // Trả về false nếu số điện thoại không hợp lệ
                }

                // Cập nhật thông tin
                kh.setTenKhachHang(tenKhachHang);
                kh.setEmail(email);
                kh.setSdt(sdt);
                return true; // Trả về true nếu sửa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy khách hàng
    }
}