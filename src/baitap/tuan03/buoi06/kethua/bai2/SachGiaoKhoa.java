package baitap.tuan03.buoi06.kethua.bai2;

import java.util.Date;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    // attribute
    private String tinhTrang;

    // getter setter
    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    // constructor
    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    // method
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Tinh trang: ");
        String tinhTrang = scanner.nextLine();
        this.setTinhTrang(tinhTrang);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%10s", this.tinhTrang);
    }

    @Override
    double tinhThanhTien() {
        double thanhTien;
        if (this.getTinhTrang().equalsIgnoreCase("moi")) {
            thanhTien = this.getSoLuong() * this.getDonGia();
        }
        else {
            thanhTien = this.getSoLuong() * this.getDonGia() * 0.5;
        }
        return thanhTien;
    }
}
