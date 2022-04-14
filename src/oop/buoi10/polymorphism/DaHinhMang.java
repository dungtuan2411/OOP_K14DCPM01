package oop.buoi10.polymorphism;

import oop.buoi09.animal.Animal;
import oop.buoi09.animal.Cat;
import oop.buoi09.animal.Dog;
import oop.buoi09.animal.Pet;

public class DaHinhMang {
    public static void main(String[] args) {
        /**
         * Tạo 1 danh sách vừa có thể quản lý Dog lẫn Cat, và
         * có thể là các con vật khác
         * trong tương lai
         */
        /**
         * Do Animal chính là class cha, những class con phải
         * thực thi hợp đồng của nó, nên remote của nó có thể
         * tham chiếu đến các object của lớp con.
         */
        Animal[] dsAnimal = new Animal[4];

        Dog dog = new Dog();
        Dog dog2 = new Dog();

        Cat cat = new Cat();
        Cat cat2 = new Cat();
        // Thêm các đối tượng khác nhau(con) vào cùng mảng(cha)
        dsAnimal[0] = dog;
        dsAnimal[1] = dog2;
        dsAnimal[2] = cat;
        dsAnimal[3] = cat2;
        // duyệt
        for (Animal animal : dsAnimal) {
            if (animal instanceof Cat) {
                // Kiểm tra trong danh sách này nếu animal này là đối
                // tượng của lớp Cat() mới in ra
                animal.makeNoise(); // gửi cùng 1 thông điệp đến 2 Dog và 2 Cat
            }
        }
        /**
         * makeNoise của lớp cha không có thân(Abstract method),
         * nhưng trong trường hợp
         * này các madeNoise sẽ là các method đã cài đè của Dog và Cat
         * kết quả của đa hình
         */

        /** Interface cũng hỗ trợ đa hình */
        Pet[] dsPet = new Pet[2];

        for (Pet pet : dsPet) {
            // gửi message - dùng tham chiếu lớp cha gọi method lớp con
            pet.beFriendly();
            pet.play();
        }
    }
}
