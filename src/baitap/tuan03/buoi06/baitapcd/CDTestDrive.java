package baitap.tuan03.buoi06.baitapcd;

import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Ban muon nhap bao nhieu CD: ");
        // int slpt = scanner.nextInt();

        // CDList danhSachCD = new CDList(slpt);
        CDList danhSachCD = new CDList(4);
        danhSachCD.listCD[0] = new CD(26, "Hong Lau Mong", "MC Ill", 14, 113000);
        danhSachCD.listCD[1] = new CD(8, "Khu tao song", "Wowy", 25, 50000);
        danhSachCD.listCD[2] = new CD(11, "An xa", "Bray", 60, 98000);
        danhSachCD.listCD[3] = new CD(32, "Chicken", "Chipu", 2, 3500);
        menu(danhSachCD, scanner);
    }

    public static void menu(CDList cdList, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Them CD vao danh sach");
            System.out.println("2. So luong CD trong danh sach");
            System.out.println("3. Tong gia thanh cac CD");
            System.out.println("4. Sap xep giam dan theo gia thanh");
            System.out.println("5. Sap xep tang dan theo tua CD");
            System.out.println("6. Xuat danh sach");
            System.out.println("0. Ket thuc!");
            System.out.print("Ban chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    cdList.nhap(scanner);
                    break;
                }
                case 2: {
                    if (!cdList.containNull()) {
                        System.out.println("Tong so luong cd: " + cdList.listCD.length);
                        break;
                    } else {
                        System.out.println("Danh sach rong! Vui long nhap!");
                        break;
                    }
                }
                case 3: {
                    if (!cdList.containNull()) {
                        System.out.println("Tong gia thanh " + cdList.tinhTongGiaThanh());
                        break;
                    } else {
                        System.out.println("Danh sach rong! Vui long nhap!");
                        break;
                    }
                }
                case 4: {
                    cdList.quickSort(cdList.listCD);
                    break;
                }
                case 5: {
                    cdList.sapXepTheoTua();
                    break;
                }
                case 6: {
                    cdList.xuat();
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
