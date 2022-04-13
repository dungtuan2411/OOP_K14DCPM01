package oop.buoi09.animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // bị lỗi do Animal là abstract class

        // Canine canine = new Canine();

        Animal animal = new Cow();
        animal.eat();

        Cow cow = new Cow();
        cow.eat();

        // remote là kiểu interface chiếu đến object của class implements nó
        Pet pet = new Cat();
        pet.beFriendly();

        // không code với lớp concrete - implementation
    }
}
