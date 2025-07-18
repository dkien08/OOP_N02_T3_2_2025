 package doituong;
 public class Phong {
        private String soPhong;
        private String loaiPhong;
        private String trangThai;
        private double giaPhong;
        private int tang;

        public Phong(String soPhong, String loaiPhong, String trangThai, double giaPhong, int tang) {
            this.soPhong = soPhong;
            this.loaiPhong = loaiPhong;
            this.trangThai = trangThai;
            this.giaPhong = giaPhong;
            this.tang = tang;
        }

        // Getter và Setter
        public String getSoPhong() { return soPhong; }
        public void setSoPhong(String soPhong) { this.soPhong = soPhong; }
        public String getLoaiPhong() { return loaiPhong; }
        public void setLoaiPhong(String loaiPhong) { this.loaiPhong = loaiPhong; }
        public String getTrangThai() { return trangThai; }
        public void setTrangThai(String trangThai) { this.trangThai = trangThai; }
        public double getGiaPhong() { return giaPhong; }
        public void setGiaPhong(double giaPhong) { this.giaPhong = giaPhong; }
        public int getTang() { return tang; }
        public void setTang(int tang) { this.tang = tang; }

        @Override
        public String toString() {
            return "Phong{" +
                   "soPhong='" + soPhong + '\'' +
                   ", loaiPhong='" + loaiPhong + '\'' +
                   ", trangThai='" + trangThai + '\'' +
                   ", giaPhong=" + giaPhong +
                   ", tang=" + tang +
                   '}';
        }
    }