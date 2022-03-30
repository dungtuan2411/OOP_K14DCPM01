package baitap.tuan03.buoi06.bai7;

import java.util.Scanner;

public class SinhVienList {
    SinhVien[] listSV;

    // constructor
    SinhVienList(int slpt) {
        listSV = new SinhVien[slpt];
    }

    // method
    public void nhap(Scanner scanner) {
        int mssv, phone;
        String name, address;
        for (int i = 0; i < listSV.length; i++) {
            System.out.printf("\nNhap sinh vien thu %d: \n", i + 1);
            System.out.println("=============================");
            System.out.print("Nhap ma sinh vien: ");
            mssv = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nhap ho ten sinh vien: ");
            name = scanner.nextLine();

            System.out.print("Nhap dia chi sinh vien: ");
            address = scanner.nextLine();

            System.out.print("Nhap sdt sinh vien: ");
            phone = scanner.nextInt();

            listSV[i] = new SinhVien(mssv, name, address, phone);
        }
    }

    public void xuat() {
        quickSort(listSV);
        for (SinhVien sinhVien : listSV) {
            System.out.println(sinhVien);
        }
    }

    // sắp xếp
    private void quickSort(SinhVien[] listSV) {
        quickSort(listSV, 0, listSV.length - 1);
    }

    private void quickSort(SinhVien[] listSV, int startIndex, int endIndex) {
        // base case
        if (startIndex >= endIndex) {
            return;
        }
        // pivot sau khi phân mảnh sẽ chia mảng làm 2 nửa
        int pivotIndex = partition(listSV, startIndex, endIndex);

        quickSort(listSV, startIndex, pivotIndex - 1); // nửa bên trái
        quickSort(listSV, pivotIndex + 1, endIndex); // nửa bên phải
    }

    private int partition(SinhVien[] listSV, int startIndex, int endIndex) {
        // pivot là biến để so sánh
        SinhVien pivot = listSV[endIndex];

        int i = startIndex - 1; // i sẽ bắt đầu từ -1 để luôn nằm trước j

        for (int j = startIndex; j < endIndex; j++) {
            // i chỉ tăng khi element < pivot
            // khi element < pivot, nhích i lên 1 và swap i với j
            if (listSV[j].getMaSinhVien() < pivot.getMaSinhVien()) {
                i++;
                // tiến hành hoán đổi i và j
                swap(listSV, i, j);
            }
        }
        /**
         * sau khi kết thúc vòng lặp, từ vị trí (i + 1) trở đi sẽ > pivot
         * và từ i trở về sẽ < pivot
         * vậy cần swap arr[i + 1] với arr[end] do endIndex đang là index của pivot
         */
        i++;
        swap(listSV, i, endIndex);
        // trả về index i+1 chính là vị trí mới của pivot
        return i;
    }

    private void swap(SinhVien[] listSV, int index1, int index2) {
        SinhVien temp = listSV[index1];
        listSV[index1] = listSV[index2];
        listSV[index2] = temp;
    }
}
