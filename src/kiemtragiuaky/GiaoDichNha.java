package kiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDichNhaDat {
    Scanner scanner = new Scanner(System.in);
    // attribute
    private String loaiNha;

    // get set
    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    // method
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhap loai nha: ");
        String loaiNha = scanner.nextLine();
        this.setLoaiNha(loaiNha);
    }

    @Override
    public String toString() {
        return super.toString() + ", loaiNha=" + loaiNha + "]";
    }

    @Override
    protected double thanhTien() {
        if (loaiNha.equalsIgnoreCase("Cao cap")) {
            return super.thanhTien();
        }
        return super.thanhTien() * 90 / 100;
    }
}
