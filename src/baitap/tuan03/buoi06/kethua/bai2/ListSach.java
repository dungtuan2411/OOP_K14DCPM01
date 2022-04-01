package baitap.tuan03.buoi06.kethua.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSach {
    private List<Sach> bookList;
    private double sumSGK = 0, sumSTK = 0;

    public ListSach() {
        bookList = new ArrayList<>();
    }

    public void themSach(Scanner scanner, int loaiSach) {
        if (loaiSach == 1) {
            Sach sgk = new SachGiaoKhoa();
            sgk.nhap(scanner);
            bookList.add(sgk);
        } else {
            Sach stk = new SachThamKhao();
            stk.nhap(scanner);
            bookList.add(stk);
        }
    }

    public void xuat() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    }

    public void tinhTongThanhTien() {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i) instanceof SachGiaoKhoa) {
                sumSGK += bookList.get(i).tinhThanhTien();
            } else {
                sumSTK += bookList.get(i).tinhThanhTien();
            }
        }

        System.out.println("--------------Tong thanh tien---------------");
        System.out.println("| Sach giao khoa: " + sumSGK + "|");
        System.out.println("| Sach tham khao: " + sumSTK + "|");
        System.out.println("--------------------------------------------");
    }

    public double tinhTrungBinhCongDonGiaSTK() {
        double tongDonGia = 0.0;
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i) instanceof SachThamKhao) {
                tongDonGia += bookList.get(i).getDonGia();
                count++;
            } else {
                continue;
            }
        }
        return tongDonGia / count;
    }

    public void xuatDanhSachCuaNXBX() {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getNhaXuatBan().equalsIgnoreCase("X"))
                System.out.println(bookList.get(i));
            else
                continue;
        }
    }
}
