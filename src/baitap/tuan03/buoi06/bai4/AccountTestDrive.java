package baitap.tuan03.buoi06.bai4;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account a = new Account(23698, "Chicken", 50000);
        Account b = new Account(67842, "Pork");

        a.napTien(15000);
        System.out.println("Tien trong tai khoan a: " + a.getTienTrongTaiKhoan());
        
        a.rutTien(20000, 5000);
        System.out.println("Tien trong tai khoan a: " + a.getTienTrongTaiKhoan());
        
        a.daoHan();
        System.out.println("Tien trong tai khoan a: " + a.getTienTrongTaiKhoan());
        
        a.chuyenTien(b, 32000);
        System.out.println("Tien trong tai khoan a: " + a.getTienTrongTaiKhoan());
        System.out.println("Tien trong tai khoan b: " + b.getTienTrongTaiKhoan());

        System.out.println(a);
        System.out.println(b);
    }
}
