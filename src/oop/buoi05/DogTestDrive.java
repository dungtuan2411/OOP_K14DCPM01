package oop.buoi05;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dog.size = -1; // lỗi dữ liệu không hợp lệ
        // System.out.println("Dog size: " + dog.size);

        dog.setSize(5);
        System.out.println(dog.getSize());

        // dữ liệu vận truy cập được do còn là interface
        dog.name = "ZZZ"; 
    }
}
