public class Main2 {
    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan("chillong", "123");
        System.out.println(tk.dangNhap()); 

        TaiKhoan tk2 = new TaiKhoan("chillong", "456");
        System.out.println(tk2.dangNhap()); 
        TaiKhoan intk = new TaiKhoan("chilong","123");
        intk.inThongTinTaiKhoan();
    }
}
