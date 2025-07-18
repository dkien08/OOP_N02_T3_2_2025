package quanli;
import java.util.ArrayList;
import java.util.List;
import doituong.Phong;

public class QuanLyPhong {
    private List<Phong> danhSachPhong = new ArrayList<>();

   

    // Phương thức thêm phòng
    public boolean themPhong(String soPhong, String loaiPhong, String trangThai, double giaPhong, int tang) {
        // Kiểm tra soPhong có bị trùng không
        for (Phong p : danhSachPhong) {
            if (p.getSoPhong().equals(soPhong)) {
                return false; // Trả về false nếu số phòng đã tồn tại
            }
        }

        // Kiểm tra loại phòng hợp lệ (giả sử chỉ có "Đơn", "Đôi", "VIP")
        if (!loaiPhong.equals("Đơn") && !loaiPhong.equals("Đôi") && !loaiPhong.equals("VIP")) {
            return false; // Trả về false nếu loại phòng không hợp lệ
        }

        // Kiểm tra trạng thái hợp lệ (giả sử chỉ có "Trống", "Đã đặt", "Đang sử dụng")
        if (!trangThai.equals("Trống") && !trangThai.equals("Đã đặt") && !trangThai.equals("Đang sử dụng")) {
            return false; // Trả về false nếu trạng thái không hợp lệ
        }

        // Kiểm tra giá phòng phải lớn hơn 0
        if (giaPhong <= 0) {
            return false; // Trả về false nếu giá phòng không hợp lệ
        }

        // Kiểm tra tầng phải là số dương
        if (tang <= 0) {
            return false; // Trả về false nếu tầng không hợp lệ
        }

        // Tạo và thêm phòng mới
        Phong phong = new Phong(soPhong, loaiPhong, trangThai, giaPhong, tang);
        danhSachPhong.add(phong);
        return true; // Trả về true nếu thêm thành công
    }

    // Phương thức xóa phòng
    public boolean xoaPhong(String soPhong) {
        for (Phong p : danhSachPhong) {
            if (p.getSoPhong().equals(soPhong)) {
                danhSachPhong.remove(p);
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy phòng
    }

    // Phương thức xem danh sách phòng
    public List<Phong> xemPhong() {
        return new ArrayList<>(danhSachPhong); // Trả về bản sao của danh sách
    }

    // Phương thức sửa thông tin phòng
    public boolean suaPhong(String soPhong, String loaiPhong, String trangThai, double giaPhong, int tang) {
        for (Phong p : danhSachPhong) {
            if (p.getSoPhong().equals(soPhong)) {
                // Kiểm tra loại phòng hợp lệ
                if (!loaiPhong.equals("Đơn") && !loaiPhong.equals("Đôi") && !loaiPhong.equals("VIP")) {
                    return false; // Trả về false nếu loại phòng không hợp lệ
                }

                // Kiểm tra trạng thái hợp lệ
                if (!trangThai.equals("Trống") && !trangThai.equals("Đã đặt") && !trangThai.equals("Đang sử dụng")) {
                    return false; // Trả về false nếu trạng thái không hợp lệ
                }

                // Kiểm tra giá phòng phải lớn hơn 0
                if (giaPhong <= 0) {
                    return false; // Trả về false nếu giá phòng không hợp lệ
                }

                // Kiểm tra tầng phải là số dương
                if (tang <= 0) {
                    return false; // Trả về false nếu tầng không hợp lệ
                }

                // Cập nhật thông tin
                p.setLoaiPhong(loaiPhong);
                p.setTrangThai(trangThai);
                p.setGiaPhong(giaPhong);
                p.setTang(tang);
                return true; // Trả về true nếu sửa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy phòng
    }
}