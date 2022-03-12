package oop.buoi02;

public class Student {
    // attribute
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    // constructor: method đặc biệt
    public Student(/** this */
    ) {
        // code xử lý
        // tất cả object được tạo bởi constructor này đều bị trùng những state bên dưới
        // this.name = "Tuan";
        // this.tuoi = 20;
        // this.gioiTinh = false;
        // this.khoa = "CNTT";
        // this.diemTB = 4.5;
    }

    public Student(float tuoi, String name) {
        // 2 dòng 25, 26 bị trùng lặp với 36, 37
        this.tuoi = tuoi;
        this.name = name;
    }

    /**
     * Từ khóa this đại diện cho chính reference chiếu đến đối tượng Student này
     * Giá trị của this tương ứng với giá trị của reference(remote)
     */
    Student(/** this, */
    boolean gioiTinh, float tuoi, String name, String khoa, double diemTB) {
        /**
         * Gọi lại hàm tạo Student 2 tham số ở trên bằng từ khóa this
         * Phải để ở dòng đầu tiên nếu không sẽ báo lỗi
         */
        this(tuoi, name);
        this.gioiTinh = gioiTinh;
        this.khoa = khoa;
        this.diemTB = diemTB;
    }

    // method
    void hoc(/** this */
    ) {
        System.out.println("Hoc");
    }

    void thi(/** this */
    ) {
        this.diemTB = 2.0;
        System.out.println("Thi");
    }

    void dangKyMonHoc(/** this */
    ) {
        System.out.println("Dang ky mon hoc");
    }
}
