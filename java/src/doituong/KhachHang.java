package doituong;
public class KhachHang {
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