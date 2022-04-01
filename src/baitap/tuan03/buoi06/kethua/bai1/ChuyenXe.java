package baitap.tuan03.buoi06.kethua.bai1;

import java.util.Scanner;

public class ChuyenXe {
    // attribute
    protected String maSoChuyenXe, hoTenTaiXe, soXe;
    protected double doanhThu;

    // constructor
    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyenXe = maSoChuyenXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    // getter setter
    protected String getMaSoChuyenXe() {
        return maSoChuyenXe;
    }

    protected void setMaSoChuyenXe(String maSoChuyenXe) {
        this.maSoChuyenXe = maSoChuyenXe;
    }

    protected String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    protected void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    protected String getSoXe() {
        return soXe;
    }

    protected void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    protected double getDoanhThu() {
        return doanhThu;
    }

    protected void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    // toString
    @Override
    public String toString() {
        return "ChuyenXe [doanhThu=" + doanhThu + ", hoTenTaiXe=" + hoTenTaiXe + ", maSoChuyenXe=" + maSoChuyenXe
                + ", soXe=" + soXe + "]";
    }

    // method
    void nhap(Scanner scanner) {
        System.err.print("Nhap ma so chuyen xe: ");
        this.maSoChuyenXe = scanner.nextLine();

        System.out.print("Nhap ho ten tai xe: ");
        this.hoTenTaiXe = scanner.nextLine();

        System.out.print("Nhap so xe: ");
        this.soXe = scanner.nextLine();

        System.out.print("Nhap doanh thu: ");
        this.doanhThu = scanner.nextDouble();
    }
}
