package kiemtragiuaky;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
    // attribute
    private char loaiDat;

    // get set
    public void setLoaiDat(char loaiDat) {
        this.loaiDat = loaiDat;
    }

    public char getLoaiDat() {
        return loaiDat;
    }

    // constructor
    public GiaoDichDat() {
    }

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    // method
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhap loai dat: ");
        char loaiDat = scanner.next().charAt(0);
        this.setLoaiDat(loaiDat);
    }

    @Override
    public String toString() {
        return super.toString() + " GiaoDichDat [loaiDat=" + loaiDat + "]";
    }

    @Override
    public double thanhTien() {
        double tien;
        if (this.loaiDat == 'B' || this.loaiDat == 'C') {
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() * this.getDonGia() * 1.5;
        }
        return tien;
    }
}
