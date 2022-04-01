package baitap.tuan03.buoi06.kethua.bai2;

import java.util.Date;
import java.util.Scanner;

public class SachThamKhao extends Sach {
    // attribute
    private double thue;

    // getter setter
    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    // constructor
    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    // method
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Thue: ");
        this.thue = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%20.2f", this.thue);
    }

    @Override
    double tinhThanhTien() {
        return this.getSoLuong() * this.getDonGia() + this.getThue();
    }
}
