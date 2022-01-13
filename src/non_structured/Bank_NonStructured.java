package non_structured;

import java.util.Scanner;

public class Bank_NonStructured {
    public static void main(String[] args) {
        // data
        // khai bao 2 bien
        int account_number = 12345;
        int account_balance = 0;
        // data Employee

        // data Customer

        // hành động thao tác lên java
        Scanner input = new Scanner(System.in);

        // gửi tiền
        System.out.print("Nhap so tien can gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount;

        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        // rút tiền
        System.out.print("Nhap vào so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        input.close();
    }
}
