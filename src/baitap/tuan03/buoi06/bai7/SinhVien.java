package baitap.tuan03.buoi06.bai7;

import java.util.Scanner;

public class SinhVien {
    // attribute
    private int maSinhVien;
    private String hoTen;
    private String diaChi;
    private int soDienThoai;

    // getter setter
    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai, Scanner scanner) {
        int length = String.valueOf(soDienThoai).length();

        while (length < 7 || length > 7) {
            System.out.println("Khong hop le!!");
            System.out.print("Nhap lai sdt: ");
            soDienThoai = scanner.nextInt();
            length = String.valueOf(soDienThoai).length();
        }
        this.soDienThoai = soDienThoai;
    }

    // constructor
    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String hoTen, String diaChi, int soDienThoai) {
        Scanner scanner = new Scanner(System.in);
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.setSoDienThoai(soDienThoai, scanner);
    }

    @Override
    public String toString() {
        return "SinhVien [diaChi=" + diaChi + ", hoTen=" + hoTen + ", maSinhVien=" + maSinhVien + ", soDienThoai="
                + soDienThoai + "]";
    }

    
}
