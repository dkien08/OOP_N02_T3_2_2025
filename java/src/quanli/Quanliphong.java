package quanli;
import java.util.ArrayList;
import java.util.Scanner;



public class Quanliphong{
    ArrayList<Room> ds = new ArrayList<>();
    public ArrayList<Room> listRooms() {
        return ds;
    }
    public void taoPhongBanDau() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nhập số lượng phòng muốn thêm: ");
    int soPhong = sc.nextInt();
    sc.nextLine(); // đọc bỏ dòng new line

    for (int i = 0; i < soPhong; i++) {
        System.out.println("\nNhập thông tin phòng thứ " + (i + 1) + ":");

        System.out.print("Số phòng: ");
        String sophong = sc.nextLine();

        System.out.print("Loại phòng: ");
        String loaiphong = sc.nextLine();

        System.out.print("Giá phòng: ");
        int giaphong = sc.nextInt();
        sc.nextLine(); // đọc bỏ dòng new line

        Room room = new Room(sophong, loaiphong, false, giaphong);
        ds.add(room);
    }

    System.out.println("\nĐã tạo " + soPhong + " phòng!");
}

    public void datphong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phòng muốn đặt: ");
        String sophong = sc.nextLine();

        boolean found = false;
        for (Room room : ds) {
            if (room.Sophong.equals(sophong)) {
                found = true;
                if (room.Trangthai) {
                    System.out.println("Phòng đã được thuê rồi!");
                } else {
                    room.Trangthai = true;
                    System.out.println("Đã đặt phòng thành công!");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy phòng này!");
        }
    }
   public ArrayList<Room> traphong() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số phòng muốn trả: ");
    String sophong = sc.nextLine();

    boolean found = false; // Cờ để kiểm tra có tìm thấy phòng không

    for (int i = 0; i < ds.size(); i++) {
        Room room = ds.get(i);
        if (room.Sophong.equals(sophong)) {
            found = true;

            if (!room.Trangthai) {
                System.out.println("Lỗi: Phòng chưa được thuê — không thể trả phòng.");
                return listRooms();
            }

            ds.remove(i);
            System.out.println("Đã xoá phòng số: " + sophong);
            return listRooms();
        }
    }

    if (!found) {
        System.out.println("Phòng số " + sophong + " không tồn tại trong danh sách.");
    }

    return listRooms();
}

    public void showRooms() {
        for (Room room : ds) {
            System.out.println("Số phòng: " + room.Sophong + ", Loại phòng: " + room.Loaiphong + 
                               ", Trạng thái: " + (room.Trangthai ? "Đã thuê" : "Trống") + ", Giá phòng: " + room.Giaphong);
        }
    }
    public void searchRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phòng cần tìm: ");
        String sophong = sc.nextLine();
        boolean found = false;
        for (Room room : ds) {
            if (room.Sophong.equals(sophong)) {
                System.out.println("Số phòng: " + room.Sophong + ", Loại phòng: " + room.Loaiphong + 
                                   ", Trạng thái: " + room.Trangthai + ", Giá phòng: " + room.Giaphong);
                found = true;
                break;
            }
        }            
    }
}    