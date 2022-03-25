package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDichNhaDat {
    // attribute
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    // get set
    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    // constructor
    public GiaoDichNhaDat() {
    }

    public GiaoDichNhaDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.setMaGiaoDich(maGiaoDich);
        this.setNgayGiaoDich(ngayGiaoDich);
        this.setDonGia(donGia);
        this.setDienTich(dienTich);
    }

    // method
    protected void nhap(Scanner scanner) {
        System.out.print("Nhap ma giao dich: ");
        String maGiaoDich = scanner.nextLine();
        this.setMaGiaoDich(maGiaoDich);

        System.out.print("Nhap ngay giao dich: ");
        String ngayGiaoDich = scanner.nextLine();
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.setNgayGiaoDich(ngayVietNam.parse(ngayGiaoDich));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        this.setDonGia(donGia);

        System.out.print("Nhap dien tich: ");
        double dienTich = scanner.nextDouble();
        this.setDienTich(dienTich);
        scanner.nextLine();
    };

    public abstract double thanhTien();

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return "GiaoDichNhaDat [dienTich=" + dienTich + ", donGia=" + donGia + ", maGiaoDich=" + maGiaoDich
                + ", ngayGiaoDich=" + simpleDateFormat.format(ngayGiaoDich);
    }

}
