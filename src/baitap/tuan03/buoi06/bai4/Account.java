package baitap.tuan03.buoi06.bai4;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    // attribute
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double tienTrongTaiKhoan;

    private static final double LAI_SUAT = 0.035;
    private Account b;

    // constructor
    public Account() {
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double tienTrongTaiKhoan) {
        this.setSoTaiKhoan(soTaiKhoan);
        this.setTenTaiKhoan(tenTaiKhoan);
        this.setTienTrongTaiKhoan(tienTrongTaiKhoan);
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this(soTaiKhoan, tenTaiKhoan, 50);
    }

    // getter setter
    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getTienTrongTaiKhoan() {
        return tienTrongTaiKhoan;
    }

    public void setTienTrongTaiKhoan(double tienTrongTaiKhoan) {
        this.tienTrongTaiKhoan = tienTrongTaiKhoan;
    }

    // method
    public void napTien(double soTienNap) {
        if (soTienNap <= 0) {
            System.out.println("Khong hop le!");
        } else {
            this.tienTrongTaiKhoan += soTienNap;
        }
    }

    public void rutTien(double tienMuonRut, double phiRutTien) {
        if (tienMuonRut > this.tienTrongTaiKhoan) {
            System.out.println("Khong hop le!");
        } else {
            this.tienTrongTaiKhoan -= (tienMuonRut + phiRutTien);
        }
    }

    public void daoHan() {
        if (this.tienTrongTaiKhoan <= 0) {
            System.out.println("Khong hop le!");
        } else {
            this.tienTrongTaiKhoan = this.tienTrongTaiKhoan + this.tienTrongTaiKhoan * LAI_SUAT;
        }
    }

    public void chuyenTien(Account b, double tienMuonChuyen) {
        /**
         * hàm nhận vào 1 tham số là reference của account khác
         * và số tiền muốn chuyển.
         * Nếu hợp lệ thì trừ tiền trong tài khoản hiện tại
         * và cộng tiền vào tài khoản b bằng với số tiền muốn chuyển
         */
        this.b = b;
        if (this.tienTrongTaiKhoan < tienMuonChuyen) {
            System.out.println("Khong hop le!");
        } else {
            this.tienTrongTaiKhoan -= tienMuonChuyen;
            this.b.tienTrongTaiKhoan += tienMuonChuyen;
        }
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");

        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);

        return "Account [soTaiKhoan=" + soTaiKhoan + ", tenTaiKhoan=" + tenTaiKhoan + ", tienTrongTaiKhoan="
                + tienVietNam.format(tienTrongTaiKhoan) + "]";
    }

}
