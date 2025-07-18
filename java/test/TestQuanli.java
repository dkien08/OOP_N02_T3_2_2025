import doituong.Phong;
import quanli.QuanLyPhong;
public class TestQuanli {
    public static void testquanliphong() {
        // Tạo đối tượng quản lý phòng
        QuanLyPhong quanLyPhong = new QuanLyPhong();

        // Thêm phòng mới
        Phong phong1 = new Phong("101", "Deluxe", "Available", 150.0, 1);
        Phong phong2 = new Phong("102", "Standard", "Booked", 100.0, 1);
        quanLyPhong.themPhong(phong1);
        quanLyPhong.themPhong(phong2);

        // Hiển thị danh sách phòng
        System.out.println("Danh sách phòng:");
        for (Phong phong : quanLyPhong.getDanhSachPhong()) {
            System.out.println(phong);
        }

        // Cập nhật trạng thái phòng
        phong1.setTrangThai("Booked");
        quanLyPhong.capNhatPhong(phong1);

        // Hiển thị lại danh sách phòng sau khi cập nhật
        System.out.println("\nDanh sách phòng sau khi cập nhật:");
        for (Phong phong : quanLyPhong.getDanhSachPhong()) {
            System.out.println(phong);
        }
    }   
}
