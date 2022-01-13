package oop;

public class AccountTestDrive {
    public static void main(String[] args) {
        // biến tham chiếu đối tượng
        Account account = new Account();

        account.show();

        account.deposit();
        account.show();

        account.withdraw();
        account.show();
    }
}
