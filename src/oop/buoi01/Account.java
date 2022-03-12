package oop.buoi01;

import java.util.Scanner;

public class Account {
    // data
    int account_number = 12345;
    int account_balance = 0;
    Scanner input = new Scanner(System.in);
    // hành động thao tác lên java
    void deposit() {
        // gửi tiền
        System.out.print("Nhap so tien can gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount;
    }

    void show() {
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);
    }

    void withdraw() {
        // rút tiền
        System.out.print("Nhap vào so tien can rut: ");
        int withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
    }
}
