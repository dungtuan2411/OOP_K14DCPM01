package oop.buoi09.animal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // bị lỗi do Animal là abstract class

        // Canine canine = new Canine();

        Animal animal = new Cow();
        animal.eat();

        Cow cow = new Cow();
        cow.eat();

        // không code với lớp concrete - implementation
    }
}
