import doituong.Phong;
import quanli.QuanLyPhong;
public class TestQuanli {
    public static void testquanliphong() {
        // Tạo đối tượng quản lý phòng
        QuanLyPhong quanLyPhong = new QuanLyPhong();

        // Thêm phòng mới
       
        quanLyPhong.themPhong("101", "Single", "Trong", 150.0, 1);
        quanLyPhong.themPhong("102", "Single", "Trong", 100.0, 1);
        quanLyPhong.themPhong("203", "Single", "Dang su dung", 200.0, 2);
        quanLyPhong.themPhong("304", "VIP", "Da dat", 300.0, 3);

        // Xem danh sách phòng
        quanLyPhong.hienThiDanhSachPhong();
        // Sửa thông tin phòng
       quanLyPhong.suaPhong("101", "Double","Trong", 100, 1);
       
        // Xem lại danh sách phòng sau khi sửa
        quanLyPhong.hienThiDanhSachPhong();

        // Xóa phòng
        quanLyPhong.xoaPhong("102");

        // Xem lại danh sách phòng sau khi xóa
        quanLyPhong.hienThiDanhSachPhong();
        
    }
}
