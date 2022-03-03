package oop.tuan01.buoi02;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student tuanStudent = new Student(true, 18, "nguyen minh tuan", "CNTT", 1.5);
        tuanStudent.hoc();

        Student ducStudent = new Student(true, 18, "le viet duc", "CNTT", 2.0);
        ducStudent.thi();
        
        Student student_3 = new Student(false, 19, "banh thi c", "CNTT", 3.4);
        student_3.dangKyMonHoc();
    }
}
