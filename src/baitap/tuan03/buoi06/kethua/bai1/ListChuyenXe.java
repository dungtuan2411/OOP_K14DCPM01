package baitap.tuan03.buoi06.kethua.bai1;

import java.util.Scanner;

public class ListChuyenXe {
    private ChuyenXe[] listChuyenXe;
    private int count, slcx;
    private double sum1 = 0, sum2 = 0;

    public ListChuyenXe(int slcx) {
        this.slcx = slcx;
        listChuyenXe = new ChuyenXe[this.slcx];
    }

    public void nhapChuyenXe(int c, Scanner scanner) {
        if (count > slcx) {
            System.out.println("Danh sach day! Khong the nhap them!");
            return;
        } else {
            if (c == 1) {
                listChuyenXe[count] = new ChuyenXeNoiThanh();
                listChuyenXe[count].nhap(scanner);
                sum1 += listChuyenXe[count].getDoanhThu();
            } else {
                listChuyenXe[count] = new ChuyenXeNgoaiThanh();
                listChuyenXe[count].nhap(scanner);
                sum2 += listChuyenXe[count].getDoanhThu();
            }
            count++;
        }
    }

    public void xuatChuyenXe() {
        for (int i = 0; i < count; i++) {
            System.out.println("\n----------/----------/----------");
            System.out.println(listChuyenXe[i].toString());
        }
        System.out.println("--------------Doanh thu---------------");
        System.out.println("| Chuyen xe noi thanh: " + sum1 + "|");
        System.out.println("| Chuyen xe ngoai thanh: " + sum2 + "|");
        System.out.println("--------------------------------------");
    }
}
