package baitap.tuan03.buoi05.atm;

public class Account {
    // attribute
    private int pin; // mã pin
    private double account_balance; // số dư

    // getter setter
    public double getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public void setPin(int pin) {
        /**
         * Mã pin không được là số âm
         * và phải từ 4 - 6 kí tự
         */
        if (pin < 0) {
            System.out.println("Invalid Pin!");
        } else if (String.valueOf(pin).length() < 4 ||
                String.valueOf(pin).length() > 6) {
            System.out.println("Invalid Pin! Pin must be 4 - 6 digits!");
        } else {
            this.pin = pin;
        }
    }

    public int getPin() {
        return pin;
    }

    // constructor
    public Account(int pin, double account_balance) {
        this.setPin(pin);
        this.setAccount_balance(account_balance);
    }

    public boolean checkPin(int pin) {
        /**
         * Kiểm tra mã pin người dùng nhập, nhập sai sẽ không
         * được thực hiện giao dịch
         */
        if (this.pin != pin) {
            return false;
        }
        return true;
    }

    private void deductAccountBalance(double tienMuonRut) {
        // thực hiện trừ tiền khi rút tiền
        if (this.account_balance < tienMuonRut) {
            System.out.println("Tai khoan khong du de thuc hien giao dich!");
        } else {
            // trừ tiền trong tài khoản
            System.out.println("Giao dich thanh cong!");
            this.account_balance -= tienMuonRut;
        }
    }

    // interface
    public void withdraw(double tienMuonRut) {
        // rút tiền
        this.deductAccountBalance(tienMuonRut);
        // show thông tin tài khoản
        this.show();
    }

    public void show() {
        // show
        System.err.println("Thong tin tai khoan");
        System.out.println("So du tai khoan: " + getAccount_balance());
    }
}
