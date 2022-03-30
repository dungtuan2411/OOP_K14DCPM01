package baitap.tuan03.buoi06.bai6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    // attribute
    private String maHang;
    private String tenHang;
    private double donGia;
    private Date nsx;
    private Date hsd;

    // getter setter
    public String getMaHang() {
        return maHang;
    }

    private void setMaHang(String maHang) {
        // Không được sửa và maHang phải có giá trị
        if (!maHang.isEmpty()) {
            this.maHang = maHang;
        } else {
            System.out.println("Ma hang khong duoc rong!");
            this.maHang = "0000";
        }
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        // tenHang không được rỗng
        if (tenHang.isEmpty()) {
            System.out.println("Ten hang khong duoc rong");
            this.maHang = "XXXXXX";
        } else
            this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        // donGia > 0
        if (donGia <= 0)
            System.out.println("Invalid!");
        else
            this.donGia = donGia;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        if (nsx == null) {
            System.out.println("Ngay san xuat khong duoc rong");
            this.nsx = new Date();
        } else
            this.nsx = nsx;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        // han su dung phai sau ngay san xuat
        if (hsd != null) {
            if (hsd.after(this.nsx)) {
                this.hsd = hsd;
            } else {
                System.out.println("Han su dung sau ngay san xuat !!!");
                this.hsd = new Date(); // gan ngay hien tai
            }
        } else {
            System.out.println("Han su dung khong duoc rong !!");
            this.hsd = new Date(); // gan ngay hien tai
        }
    }

    // constructor
    public HangThucPham(String maHang) {
        this.setMaHang(maHang);
    }

    public HangThucPham(String maHang, String tenHang, double donGia, Date nsx, Date hsd) {
        this(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNsx(nsx);
        this.setHsd(hsd);
    }

    // method
    // kiem tra het han
    public boolean kiemTraHanSuDung() {
        boolean isHetHan = false; // con han
        if (this.hsd.before(new Date())) {
            isHetHan = true;
        }
        return isHetHan;
    }

    @Override
    public String toString() {
        // dd/MM/yyyy: 10/03/2022
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        // set đơn vị tiền
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVietNam = NumberFormat.getCurrencyInstance(localeVN);

        return "HangThucPham [donGia=" + tienVietNam.format(donGia) +
                ", hsd=" + ngayVietNam.format(hsd) +
                ", maHang=" + maHang + ", nsx=" + ngayVietNam.format(nsx) +
                ", tenHang=" + tenHang + "]";
    }

}
