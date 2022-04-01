package oop.buoi06.baitap;

import java.util.Scanner;

public class SinhVienTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(113, "nguyen van a", 7, 8);

        SinhVien sv2 = new SinhVien(114, "le van b", 6, 5.5f);

        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap ma sinh vien: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        sv3.setHoTen(scanner.nextLine());

        System.out.print("Nhap diem ly thuyet: ");
        sv3.setDiemLT(scanner.nextFloat());

        System.out.print("Nhap diem thuc hanh: ");
        sv3.setDiemTH(scanner.nextFloat());

        System.out.printf("\n%5s %25s %25s %20s %20s%n",
                "Ma sinh vien", "Ho ten",
                "Diem ly thuyet", "Diem thuc hanh",
                "Diem trung binh");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);

        scanner.close();
    }
}
