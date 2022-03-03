package structured;

import java.util.Scanner;

public class BankStructured {
    // toan cuc: global
    // data
    static int account_number = 12345;
    static int account_balance = 0;
    static Scanner input;
    // data Employee
    static String emName; // ten nhan vien
    static double salary; // luong
    // data Customer
    static String cusName; // ten khach
    static String address; // dia chi

    public static void main(String[] args) {
        // hành động thao tác lên java
        input = new Scanner(System.in);

        deposit(); // make function call
        show();

        withdraw();
        show();

        getEmName();
        getSalary();
        getCusInfo();
    }

    // Account method
    static void withdraw() {
        // rút tiền
        System.out.print("Nhap vào so tien can rut: ");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
    }

    static void deposit() {
        // gửi tiền
        System.out.print("Nhap so tien can gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount;
    }

    static void show() {
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);
    }

    // Enployee method
    static void getEmName() {
        emName = "";
        cusName = "ABC"; // ko duoc quyen dung cham den du lieu cua Cusomter
    }

    static void getSalary() {
        salary = 500;
    }

    // Customer method
    static String getCusInfo() { // Khach hang cusomter
        account_balance = 0; // VO TINH HAY CO Y THAO TAC LEN DU LIEU MA DANG LE FUNCTION NAY KHONG DUOC/NEN
                             // DUNG CHAM DEN CAI DATA DO
        return cusName + address;
    }
}
