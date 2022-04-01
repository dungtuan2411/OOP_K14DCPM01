package baitap.tuan03.buoi06.kethua.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Sach {
    // getter setter
    protected String maSach;
    protected Date ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    // getter setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    // constructor
    public Sach() {
    }

    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    // method
    public void nhap(Scanner scanner) {
        System.out.print("Ma sach: ");
        this.maSach = scanner.nextLine();

        System.out.print("Ngay nhap: ");
        String date = scanner.nextLine();
        try {
            this.ngayNhap = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Don gia: ");
        this.donGia = scanner.nextDouble();

        System.out.print("So luong: ");
        this.soLuong = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nha xuat ban: ");
        this.nhaXuatBan = scanner.nextLine();
    }

    abstract double tinhThanhTien();

    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("%s %20s %15.2f %15d %20s", maSach,
                ngayVietNam.format(ngayNhap), donGia, soLuong, nhaXuatBan);
    }

}
