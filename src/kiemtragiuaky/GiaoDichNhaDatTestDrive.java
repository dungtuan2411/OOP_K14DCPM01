package kiemtragiuaky;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class GiaoDichNhaDatTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        menu(danhSachGiaoDich, scanner);
    }

    static void menu(DanhSachGiaoDich danhSachGiaoDich, Scanner scanner) {
        int choice;
        do {
            System.out.println("\n1: Nhap danh sach");
            System.out.println("2: Xuat danh sach");
            System.out.println("3. Tong so luong tung loai");
            System.out.println("4. Trung binh thanh tien giao dich dat");
            System.out.println("5. Xuat giao dich cua thang 9/2013");
            System.out.println("0. Ket thuc !!");
            System.out.print("Ban chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    char xacNhan = 'y';
                    int gdChoice;
                    do {
                        if (Character.toUpperCase(xacNhan) == 'Y') {
                            System.out.println("1: Giao dich dat");
                            System.out.println("2: Giao dich nha");
                            System.out.print("Ban chon: ");
                            gdChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (gdChoice) {
                                case 1: {
                                    GiaoDichDat gdDat = new GiaoDichDat();
                                    gdDat.nhap(scanner);
                                    danhSachGiaoDich.add(gdDat);
                                    break;
                                }

                                case 2: {
                                    GiaoDichNha gdNha = new GiaoDichNha();
                                    gdNha.nhap(scanner);
                                    danhSachGiaoDich.add(gdNha);
                                    break;
                                }
                                default:
                                    break;
                            }
                        } else
                            System.out.println("Sai cu phap! Chon y hoặc n");

                        System.out.print("Nhap them (Y/N)? ");
                        xacNhan = scanner.next().charAt(0);
                        scanner.nextLine();
                    } while (Character.toUpperCase(xacNhan) != 'N');
                    break;
                }
                case 2: {
                    danhSachGiaoDich.inDanhSach();
                    break;
                }
                case 3: {
                    danhSachGiaoDich.tinhTongSLTungLoai();
                    break;
                }
                case 4: {
                    if (danhSachGiaoDich.tinhTongTBGDDat() != 0) {
                        System.out.println("Trung binh thanh tien giao dich dat: " + danhSachGiaoDich.tinhTongTBGDDat());
                        break;
                    }
                    break;
                }
                case 5: {
                    List<GiaoDichNhaDat> listGDByDate = danhSachGiaoDich.xuatGiaoDichTheoDate();
                    if (listGDByDate == null) {
                        break;
                    }
                    else if(listGDByDate.isEmpty() && listGDByDate != null) {
                        System.out.println("Khong co giao dich cua thang 9/2013 !");
                        break;
                    }
                    else {
                        for (GiaoDichNhaDat giaoDichNhaDat : listGDByDate) {
                            System.out.println(giaoDichNhaDat);
                        }
                        break;
                    }
                }
                case 0:
                    System.out.println("Ket thuc !!!");
                    break;
                default:
                    break;
            }
        } while (choice != 0);

    }
}
