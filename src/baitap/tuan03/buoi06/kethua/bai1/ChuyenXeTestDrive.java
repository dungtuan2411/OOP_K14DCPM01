package baitap.tuan03.buoi06.kethua.bai1;

import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ban muon nhap bao nhieu chuyen xe: ");
        int slcx = scanner.nextInt();
        ListChuyenXe listChuyenXe = new ListChuyenXe(slcx);

        menu(listChuyenXe, scanner);
    }

    static void menu(ListChuyenXe listChuyenXe, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n1. Nhap xe noi thanh");
            System.out.println("2. Nhap xe ngoai thanh");
            System.out.println("3. Xuat");
            System.out.println("0. Ket thuc");
            System.out.print("Ban chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    listChuyenXe.nhapChuyenXe(1, scanner);
                    break;
                }
                case 2: {
                    scanner.nextLine();
                    listChuyenXe.nhapChuyenXe(2, scanner);
                    break;
                }
                case 3: {
                    listChuyenXe.xuatChuyenXe();
                    break;
                }
                case 0: {
                    System.out.println("Ket thuc!");
                    break;
                }
                default:
                    break;
            }
        } while (choice != 0);
    }
}
