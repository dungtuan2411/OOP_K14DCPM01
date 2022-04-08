package baitap.tuan03.buoi06.baitapcd;

import java.util.Arrays;
import java.util.Scanner;

public class CDList {
    // attributes
    CD[] listCD;
    int index = 0;

    // constructor
    public CDList(int slpt) {
        this.listCD = new CD[slpt];
    }

    // method
    // kiểm tra danh sách có phần tử không
    public boolean containNull() {
        boolean containNull = true;
        for (int i = 0; i < listCD.length; i++) {
            if (listCD[i] != null) {
                containNull = false;
                break;
            }
        }
        return containNull;
    }

    // thêm cd
    void nhap(Scanner scanner) {
        // kiểm tra mảng còn thêm được nữa không
        boolean inBounds = this.index >= 0 && this.index < this.listCD.length;
        if (!inBounds) {
            System.out.println("Danh sach day! Khong the nhap them!");
            return;
        } else {
            for (int i = 0; i < listCD.length; i++) {
                System.out.printf("======Nhap CD thu %d======\n", i + 1);
                int count = 0;
                System.out.print("Nhap ma CD: ");
                int maCD = scanner.nextInt();
                // check mã CD có bị trùng không
                while (listCD[count] != null) {
                    if (listCD[count].getMaCD() != maCD) {
                        count++;
                        continue;
                    } else {
                        System.out.println("Ma CD da ton tai!");
                        System.out.print("Nhap lai ma CD: ");
                        maCD = scanner.nextInt();
                        count = 0;
                    }
                }
                scanner.nextLine();

                System.out.print("Tua CD: ");
                String tuaCD = scanner.nextLine();

                System.out.print("Ca sy: ");
                String caSy = scanner.nextLine();

                System.out.print("So bai hat: ");
                int soBaiHat = scanner.nextInt();

                System.out.print("Gia thanh: ");
                double giaThanh = scanner.nextDouble();

                listCD[index] = new CD(maCD, tuaCD, caSy, soBaiHat, giaThanh);
                this.index++;
            }
        }
    }

    // tính tổng giá thành
    private double tinhTongGiaThanhImplementation() {
        double tong = 0;
        int listCDLength = listCD.length;

        for (int i = 0; i < listCDLength; i++) {
            tong += listCD[i].getGiaThanh();
        }

        return tong;
    }

    public double tinhTongGiaThanh() {
        if (!containNull()) {
            double tong = tinhTongGiaThanhImplementation();
            return tong;
        } else {
            System.out.println("Danh sach rong! Vui long nhap!");
            return 0;
        }
    }

    // sắp xếp danh sách theo giá thành giảm
    public void quickSort(CD[] listCD) {
        if (!containNull()) {
            quickSort(listCD, 0, listCD.length - 1);
        } else {
            System.out.println("Danh sach rong! Vui long nhap!");
        }
    }

    private void quickSort(CD[] listCD, int startIndex, int endIndex) {
        // base case
        if (startIndex >= endIndex) {
            return;
        }

        int pivotIndex = partition(listCD, startIndex, endIndex);

        quickSort(listCD, startIndex, pivotIndex - 1);
        quickSort(listCD, pivotIndex + 1, endIndex);
    }

    private int partition(CD[] listCD, int startIndex, int endIndex) {
        // set pivot là end
        CD pivot = listCD[endIndex];
        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++) {
            if (listCD[j].getGiaThanh() > pivot.getGiaThanh()) {
                i++;
                swap(listCD, i, j);
            }
        }
        i++;
        swap(listCD, i, endIndex);
        return i;
    }

    private void swap(CD[] lisCd, int index1, int index2) {
        CD temp = lisCd[index1];
        lisCd[index1] = lisCd[index2];
        lisCd[index2] = temp;
    }

    // sắp xếp danh sách tăng dần theo tựa CD
    public void sapXepTheoTua() {
        if (!containNull()) {
            Arrays.sort(listCD);
        } else {
            System.out.println("Danh sach rong! Vui long nhap!");
        }
    }

    // xuất danh sách
    public void xuat() {
        if (!containNull()) {
            for (int i = 0; i < listCD.length; i++) {
                System.out.println(listCD[i].toString());
            }
        } else {
            System.out.println("Danh sach rong! Vui long nhap!");
        }
    }

}
