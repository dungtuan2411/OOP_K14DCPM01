package oop.tuan01.buoi01;

public class Customer {
    // thuộc tính
    String cusName;// ten khach
    String address;// dia chi

    // phương thức
    String getCusInfo(){
        cusName = "nguyen van c";
        address = "ca mau";
        
        System.out.println(cusName);
        System.out.println(address);
        return cusName + address;
    }
}
