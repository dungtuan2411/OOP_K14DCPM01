package baitap.tuan03.buoi06.kethua.bai1;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    // attribute
    private int soTuyen, soKM;

    // getter setter
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKM() {
        return soKM;
    }

    public void setSoKM(int soKM) {
        this.soKM = soKM;
    }

    // constructor
    public ChuyenXeNoiThanh() {
    }

    public ChuyenXeNoiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe,
            double doanhThu, int soTuyen, int soKM) {
        super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    // method
    @Override
    public void nhap(Scanner scanner) {
        super.nhap(scanner);
        System.out.print("Nhap so tuyen: ");
        this.soTuyen = scanner.nextInt();

        System.out.print("Nhap so KM: ");
        this.soKM = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNoiThanh " + super.toString() + " [soKM=" + soKM + ", soTuyen=" + soTuyen + "]";
    }

}
