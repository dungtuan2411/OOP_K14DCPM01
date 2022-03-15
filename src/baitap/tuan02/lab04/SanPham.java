package baitap.tuan02.lab04;

import java.util.Scanner;

public class SanPham {
    // attribute
    private String tenSp;
    private double donGia;
    private double giamGia;

    // get set
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getTenSp() {
        return this.tenSp;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return this.donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public double getGiamGia() {
        return this.giamGia;
    }

    Scanner scanner = new Scanner(System.in);

    // constructor
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        // Hàm tạo ngầm định không giảm giá
        this(tenSp, donGia, 0);
    }

    // method
    private double getThueNhapKhau() {
        // thuế nhập khẩu = 10% đơn giá
        return this.donGia * 10 / 100;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + this.tenSp);
        System.out.println("Don gia: " + this.donGia);
        System.out.println("Giam gia: " + this.giamGia);
        System.out.println("Thue nhap khau: " + this.getThueNhapKhau());
        System.out.println("===============");
    }

    void nhap() {
        System.out.print("Nhap ten san pham: ");
        this.tenSp = scanner.nextLine();

        System.out.print("Nhap don gia: ");
        this.donGia = scanner.nextDouble();

        System.out.print("Nhap gia tien giam: ");
        this.giamGia = scanner.nextDouble();
    }
}
