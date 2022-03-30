package baitap.tuan03.buoi06.bai7;

// import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        SinhVienList listSV = new SinhVienList(4);
        // listSV.nhap(scanner);
        listSV.listSV[0] = new SinhVien(114, "Huy", "Quan 7", 1234567);
        listSV.listSV[1] = new SinhVien(113, "Dung", "Quan 1", 7412583);
        listSV.listSV[2] = new SinhVien(116, "Phuc", "Quan 8", 9514568);
        listSV.listSV[3] = new SinhVien(115, "Long", "Quan 5", 7639820);
        listSV.xuat();
    }
}
