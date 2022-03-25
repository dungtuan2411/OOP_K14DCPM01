package kiemtragiuaky;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {
    // attribute
    private String loaiNha;
    private String diaChi;

    // get set
    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // constructor
    public GiaoDichNha() {
    }

    public GiaoDichNha(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiNha,
            String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    // method
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhap loai nha: ");
        String loaiNha = scanner.nextLine();
        setLoaiNha(loaiNha);

        System.out.print("Nhap dia chi: ");
        String diaChi = scanner.nextLine();
        setDiaChi(diaChi);
    }

    @Override
    public double thanhTien() {
        double tien;
        if (this.loaiNha.equalsIgnoreCase("Cao cap")) {
            tien = this.getDienTich() * this.getDonGia();
        } else {
            tien = this.getDienTich() * this.getDonGia() * 0.9;
        }
        return tien;
    }

    @Override
    public String toString() {
        return super.toString() + " GiaoDichNha [diaChi=" + diaChi + ", loaiNha=" + loaiNha + "]";
    }
}
