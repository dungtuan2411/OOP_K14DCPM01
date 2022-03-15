package baitap.tuan02.lab04;

import java.util.ArrayList;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        // sản phẩm có giảm giá
        SanPham sp1 = new SanPham("dau an", 15000, 2500);
        // sp1.nhap();
        sp1.xuat();

        SanPham sp2 = new SanPham("thit bo", 28000);
        // sp2.nhap();
        sp2.xuat();
        // tạo danh sách sản phẩm
        ArrayList<SanPham> listSP = new ArrayList<>();
        // tạo n sản phẩm đưa vào ds
        listSP.add(new SanPham("thit ga", 26500, 5000));
        listSP.add(new SanPham("xang", 30000));
        listSP.add(new SanPham("bia", 32000, 2000));
        listSP.add(new SanPham("bcs", 69000));
        // duyệt và xuất thông tin
        for (SanPham sanPham : listSP) {
            sanPham.xuat();
        }
    }
}
