package oop;

public class Customer {
    // thuộc tính
    static String cusName;// ten khach
    static String address;// dia chi

    // phương thức
    String getCusInfo(){
        cusName = "nguyen van c";
        address = "ca mau";
        
        System.out.println(cusName);
        System.out.println(address);
        return cusName + address;
    }
}
