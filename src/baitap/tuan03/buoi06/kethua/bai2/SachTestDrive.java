package baitap.tuan03.buoi06.kethua.bai2;

import java.util.Scanner;

public class SachTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListSach listBook = new ListSach();

        menu(scanner, listBook);    
    }

    public static void menu(Scanner scanner, ListSach listBook) {
        int choice;
        do {
            System.out.println("\n1. Nhap sach");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tong thanh tien tung loai sach");
            System.out.println("4. Trung binh cong don gia sach tham khao");
            System.out.println("5. Danh sach sach cua NXB X");
            System.out.println("0. Ket thuc!");
            System.out.print("Ban chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    char confirm = 'Y';
                    do {
                        if (Character.toUpperCase(confirm) == 'Y') {
                            System.out.println("1. Sach giao khoa");
                            System.out.println("2. Sach tham khao");
                            System.out.print("Ban chon: ");
                            int loai = scanner.nextInt();
                            scanner.nextLine();
                            
                            listBook.themSach(scanner, loai);
                        } else
                            System.out.println("Sai cu phap! Chon y hoac n");

                        System.out.print("Nhap them (Y/N)? ");
                        confirm = scanner.next().charAt(0);
                        scanner.nextLine();
                    } while (Character.toUpperCase(confirm) != 'N');
                    break;
                }
                case 2: {
                    listBook.xuat();
                    break;
                }
                case 3: {
                    listBook.tinhTongThanhTien();
                    break;
                }
                case 4: {
                    System.out.println(
                            "Trung binh cong don gia sach tham khao: " + listBook.tinhTrungBinhCongDonGiaSTK());
                    break;
                }
                case 5: {
                    listBook.xuatDanhSachCuaNXBX();
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
