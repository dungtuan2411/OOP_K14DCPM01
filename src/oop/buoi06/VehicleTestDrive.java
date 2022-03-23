package oop.buoi06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> listCar = new ArrayList<>();
        menu(listCar, scanner);

        // Vehicle xe1 = new Vehicle("Nguyen Thu Loan", "Future Neo", 100, 35000000);
        // System.out.println(xe1);

        // Vehicle xe2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
        // System.out.println(xe2);

        // Vehicle xe3 = new Vehicle("Nguyen Minh Triet", "Landscape", 1500,
        // 1000000000);
        // System.out.println(xe3);
    }

    static void nhap(List<Vehicle> list, Scanner scanner) {
        char confirm = 'Y';
        do {
            if (Character.toUpperCase(confirm) == 'Y') {
                System.out.print("Ten chu xe: ");
                String tenChuXe = scanner.nextLine();

                System.out.print("Loai xe: ");
                String loaiXe = scanner.nextLine();

                System.out.print("Dung tich: ");
                int dungTich = scanner.nextInt();

                System.out.print("Tri gia: ");
                double triGia = scanner.nextDouble();

                list.add(new Vehicle(tenChuXe, loaiXe, dungTich, triGia));
            } else
                System.out.println("Sai cu phap! Chon y hoac n");

            System.out.print("Ban muon nhap them (Y/N)? ");
            confirm = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(confirm) != 'N');
    }

    static void xuat(List<Vehicle> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!!!");
        } else {
            System.out.printf("%n %-20s %15s %15s %20s %20s %n", "Ten chu xe",
                    "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
            System.out.println(
                    "=============================================" +
                            "=================================================");
            for (Vehicle vehicle : list) {
                System.out.println(vehicle);
            }
        }
    }

    static void menu(List<Vehicle> vehicles, Scanner scanner) {
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat tien thue");
            System.out.println("3. Thoat");
            System.out.print("Ban chon: ");
            choice = scanner.nextInt();
    
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    nhap(vehicles, scanner);
                    break;
                }
                case 2: {
                    xuat(vehicles);
                    break;
                }
                case 3: {
                    System.out.println("Thoat!");
                    break;
                }
                default:
                    break;
            }
            
        } while (choice != 3);
    }
}
