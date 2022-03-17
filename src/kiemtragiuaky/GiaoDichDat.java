package kiemtragiuaky;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDichNhaDat {
    Scanner scanner = new Scanner(System.in);
    // attribute
    private String loaiDat;

    // get set
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    // constructor
    public GiaoDichDat() {
        super();
        this.loaiDat = "";
    }

    // method
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhap loai dat: ");
        String loaiDat = scanner.nextLine();
        this.setLoaiDat(loaiDat);
    }

    @Override
    public String toString() {
        return super.toString() + ", loaiDat= " + loaiDat + "]";
    }

    @Override
    protected double thanhTien() {
        if (loaiDat.equals("B") || loaiDat.equals("C")) {
            return super.thanhTien();
        }
        return super.thanhTien() * 1.5;
    }
}
