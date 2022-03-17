package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDichNhaDat {
    Scanner scanner = new Scanner(System.in);
    // attribute
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    // get set
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getDienTich() {
        return dienTich;
    }

    // constructor
    protected GiaoDichNhaDat() {
        this.setMaGiaoDich("");
        this.setNgayGiaoDich(new Date());
        this.setDonGia(0);
        this.setDienTich(0);
    }

    protected GiaoDichNhaDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.setMaGiaoDich(maGiaoDich);
        this.setNgayGiaoDich(ngayGiaoDich);
        this.setDonGia(donGia);
        this.setDienTich(dienTich);
    }

    // method
    protected void nhap() throws ParseException {
        System.out.print("Nhap ma giao dich: ");
        String maGiaoDich = scanner.nextLine();
        this.setMaGiaoDich(maGiaoDich);

        System.out.print("Nhap ngay giao dich: ");
        String ngayGiaoDich = scanner.nextLine();
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        this.setNgayGiaoDich(ngayVietNam.parse(ngayGiaoDich));

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();
        this.setDonGia(donGia);

        System.out.print("Nhap dien tich: ");
        double dienTich = scanner.nextDouble();
        this.setDienTich(dienTich);
    };

    @Override
    public String toString() {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Giao dich [maGiaoDic= " + maGiaoDich + ", ngaygiaodich: " + ngayVietNam.format(ngayGiaoDich) + ", donGia: " + donGia + ", dienTich: " + dienTich;
    }

    protected double thanhTien() {
        return this.dienTich * this.donGia;
    }
}
