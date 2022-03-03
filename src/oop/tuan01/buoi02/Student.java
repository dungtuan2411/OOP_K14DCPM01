package oop.tuan01.buoi02;

public class Student {
    // attribute
    boolean gioiTinh;
    float tuoi;
    String name;
    String khoa;
    double diemTB;

    // constructor
    Student() {
    }

    Student(boolean gt, float t, String n, String kh, double dTB) {
        gioiTinh = gt;
        tuoi = t;
        name = n;
        khoa = kh;
        diemTB = dTB;
    }

    // method
    void hoc() {
        System.out.println("Học");
    }

    void thi() {
        System.out.println("Thi");
    }

    void dangKyMonHoc() {
        System.out.println("Đăng ký môn học");
    }
}
