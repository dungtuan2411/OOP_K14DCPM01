package non_structured;

import java.util.Scanner;

public class Bank_NonStructured {
    public static void main(String[] args) {
        // data
        // khai bao 2 bien
        int account_number = 12345; // Số tk
        int account_balance = 0; // Số dư
        // data Employee

        // data Customer

        // hành động thao tác lên java
        Scanner input = new Scanner(System.in);

        // gửi tiền: deposit
        System.out.print("Nhap vao so tien gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount; // thao tác lên data

        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        // rút tiền: withraw
        System.out.print("Nhap vào so tien can rut: ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        // rút tiền: withraw lần 2
        System.out.print("Nhap vào so tien can rut: ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        // rút tiền: withraw lần 3
        System.out.print("Nhap vào so tien can rut: ");
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Balance: " + account_balance);

        // Employee: thao tác lên data của Employee

        // Customer: thao tác lên data của Customer

        input.close();
    }
}
