package oop.buoi06.baitap;

public class HinhChuNhatTestDrive {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuDai(10);
        hinhChuNhat.setChieuRong(5);

        // toString sẽ tự động được sử dụng
        System.out.println(hinhChuNhat);
    }

}
