package baitap.tuan03.buoi05.atm;

import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);
    // attribute
    Account a1;

    // method
    void thucHienGiaoDich() {
        a1 = new Account(2596, 6500000);
        System.out.print("Nhap ma pin: ");
        int pin = scanner.nextInt();

        boolean isPinCorrect = a1.checkPin(pin);

        while (!isPinCorrect) {
            System.out.println("Incorect Pin!");
            System.out.print("Nhap lai: ");
            pin = scanner.nextInt();
            isPinCorrect = a1.checkPin(pin);
        }

        System.out.print("Nhap so tien muon rut: ");
        double tienMuonRut = scanner.nextDouble();

        a1.withdraw(tienMuonRut);

    }
}