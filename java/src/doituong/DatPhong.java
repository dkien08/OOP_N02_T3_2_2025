package doituong;
import java.time.LocalDate;
public class DatPhong {
    private String idDatPhong;
    private String soPhong;
    private String idKhachHang;
    private LocalDate ngayNhan;
    private LocalDate ngayTra;
    private String trangThai;
    private double chiPhi;
    private String trangThaiThanhToan;

    public DatPhong(String idDatPhong, String soPhong, String idKhachHang, LocalDate ngayNhan, LocalDate ngayTra,
                     String trangThai, double chiPhi, String trangThaiThanhToan) {
        this.idDatPhong = idDatPhong;
        this.soPhong = soPhong;
        this.idKhachHang = idKhachHang;
        this.ngayNhan = ngayNhan;
        this.ngayTra = ngayTra;
        this.trangThai = trangThai;
        this.chiPhi = chiPhi;
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public String getIdDatPhong() {
        return idDatPhong;
    }

    public void setIdDatPhong(String idDatPhong) {
        this.idDatPhong = idDatPhong;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public LocalDate getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(LocalDate ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public String getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(String trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    @Override
    public String toString() {
        return "DatPhong{" +
               "idDatPhong='" + idDatPhong + '\'' +
               ", soPhong='" + soPhong + '\'' +
               ", idKhachHang='" + idKhachHang + '\'' +
               ", ngayNhan=" + ngayNhan +
               ", ngayTra=" + ngayTra +
               ", trangThai='" + trangThai + '\'' +
               ", chiPhi=" + chiPhi +
               ", trangThaiThanhToan='" + trangThaiThanhToan + '\'' +
               '}';
    }
}