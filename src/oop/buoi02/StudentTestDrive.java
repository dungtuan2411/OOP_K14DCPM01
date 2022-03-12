package oop.buoi02;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student tuanStudent = new Student();
        tuanStudent.hoc();

        Student ducStudent = new Student();
        ducStudent.thi();

        Student xyzStudent = new Student();
        xyzStudent.dangKyMonHoc();

        Student minhStudent = new Student(false, 20, "Minh", "CNTT", 5.0);
        System.out.println(minhStudent.name);

        Student lamStudent = new Student(true, 19, "Lam", "CNTT", 6.0);
        System.out.println(lamStudent.name);
    }
}
