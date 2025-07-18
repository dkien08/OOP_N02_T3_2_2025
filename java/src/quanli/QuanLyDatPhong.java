package quanli;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import doituong.DatPhong;

public class QuanLyDatPhong {
    private List<DatPhong> danhSachDatPhong;

    public QuanLyDatPhong() {
        this.danhSachDatPhong = new ArrayList<>();
    }

    public boolean createDatPhong(DatPhong datPhong) {
        if (getDatPhongById(datPhong.getIdDatPhong()).isPresent()) {
            System.out.println("Lỗi: ID đặt phòng " + datPhong.getIdDatPhong() + " đã tồn tại.");
            return false;
        }
        danhSachDatPhong.add(datPhong);
        System.out.println("Đã thêm đặt phòng: " + datPhong.getIdDatPhong());
        return true;
    }

    public List<DatPhong> getAllDatPhong() {
        return new ArrayList<>(danhSachDatPhong);
    }

    public Optional<DatPhong> getDatPhongById(String idDatPhong) {
        return danhSachDatPhong.stream()
                               .filter(dp -> dp.getIdDatPhong().equals(idDatPhong))
                               .findFirst();
    }

    public boolean updateDatPhong(DatPhong updatedDatPhong) {
        for (int i = 0; i < danhSachDatPhong.size(); i++) {
            if (danhSachDatPhong.get(i).getIdDatPhong().equals(updatedDatPhong.getIdDatPhong())) {
                danhSachDatPhong.set(i, updatedDatPhong);
                System.out.println("Đã cập nhật đặt phòng: " + updatedDatPhong.getIdDatPhong());
                return true;
            }
        }
        System.out.println("Lỗi: Không tìm thấy đặt phòng với ID " + updatedDatPhong.getIdDatPhong() + " để cập nhật.");
        return false;
    }

    public boolean deleteDatPhong(String idDatPhong) {
        boolean removed = danhSachDatPhong.removeIf(dp -> dp.getIdDatPhong().equals(idDatPhong));
        if (removed) {
            System.out.println("Đã xóa đặt phòng: " + idDatPhong);
        } else {
            System.out.println("Lỗi: Không tìm thấy đặt phòng với ID " + idDatPhong + " để xóa.");
        }
        return removed;
    }
}