package oop.buoi10.polymorphism;

import oop.buoi09.animal.Cat;
import oop.buoi09.animal.Dog;

public class KhongDaHinhMang {
    public static void main(String[] args) {
        // Danh sách các remote của Dog
        Dog[] dsDog = new Dog[2];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        dsDog[0] = dog;
        dsDog[1] = dog2;

        for (Dog d : dsDog) {
            d.makeNoise();
        }

        // Danh sách các remote của Cat
        Cat[] dsCat = new Cat[2];

        Cat cat = new Cat();
        Cat cat2 = new Cat();

        dsCat[0] = cat;
        dsCat[1] = cat2;

        for (Cat c : dsCat) {
            c.makeNoise();
        }

        /**
         * Nhược điểm: viết code không đa hình, luôn phải tạo mảng mới nếu cần quản lý
         * đối tượng mới
         */
    }
}
