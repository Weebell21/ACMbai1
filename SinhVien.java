public class SinhVien{
    private double score;
    String hoten;
    public int age;
    protected int mssv;
    

    public SinhVien(int mssv, String hoten, int age, double score) {
        this.mssv = mssv;
        this.hoten = hoten;
        this.age = age;
        this.score = score;
    }


    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }


    public int getMssv(){
        return mssv;
    }
    public void setMssv(int mssv){
        this.mssv = mssv;
    }    
 

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }    

    public double getScore(){
        return age;
    }
    public void setScore(double score){
        this.score = score;
    }    

    public void inThongTinSinhVien() {
        System.out.println("Thong Tin Sinh Vien: " + mssv + ", Họ tên: " + hoten + ", Tuổi: " + age + ", Điểm: " + score);
    }

    void inThongTinSinhVienDefault() {
        System.out.println("Default Method - MSSV: " + mssv + ", Họ tên: " + hoten + ", Tuổi: " + age + ", Điểm: " + this.diemSinhVien());
    }
    private double tinhDiemSinhVien() {
        return this.score * 10;
    }
    public double diemSinhVien() {
        if (this.age > 18) {
            return tinhDiemSinhVien();
        } else {
            return this.score + 2;
        }
    }
    
    protected void inMSSVHoTen() {
        System.out.println("MSSV: " + mssv);
    }

    public void inThongTinSinhVien2() {
        inMSSVHoTen();
        System.out.println("Ten:" + hoten);
        System.out.println("Tuoi: " + age);
        System.out.println("Diem: " + this.diemSinhVien());

    }
}