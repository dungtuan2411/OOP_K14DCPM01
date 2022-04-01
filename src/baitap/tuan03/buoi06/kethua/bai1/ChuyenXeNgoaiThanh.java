package baitap.tuan03.buoi06.kethua.bai1;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    // attribute
    private String noiDen;
    private int soNgayDi;

    // getter setter
    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    // constructor
    public ChuyenXeNgoaiThanh() {
    }

    public ChuyenXeNgoaiThanh(String maSoChuyenXe, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
            int soNgayDi) {
        super(maSoChuyenXe, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    // method
    @Override
    void nhap(Scanner scanner) {
        super.nhap(scanner);
        scanner.nextLine();
        System.out.print("Nhap noi den: ");
        this.noiDen = scanner.nextLine();

        System.out.print("Nhap so ngay di: ");
        this.soNgayDi = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "ChuyenXeNgoaiThanh " + super.toString() + " [noiDen=" + noiDen + ", soNgayDi=" + soNgayDi + "]";
    }
}
