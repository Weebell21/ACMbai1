public class Main {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(1, "Quy manh", 18, 10);
        sinhVien1.diemSinhVien();
        sinhVien1.inThongTinSinhVien();
        sinhVien1.inThongTinSinhVien2();
        SinhVien sinhVien2 = new SinhVien(002, "ChiLong", 16, 10);
        sinhVien2.diemSinhVien();
        sinhVien2.inThongTinSinhVien();
        sinhVien2.inThongTinSinhVien2();
        sinhVien2.inMSSVHoTen();
        // sinhVien2.tinhDiemSinhVien();
        sinhVien2.inThongTinSinhVienDefault();
    }
}
