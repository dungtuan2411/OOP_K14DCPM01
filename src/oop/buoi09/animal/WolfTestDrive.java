package oop.buoi09.animal;

public class WolfTestDrive {
    public static void main(String[] args) {
        Wolf aWolf = new Wolf();
        aWolf.eat();

        Canine canine = new Wolf();
        canine.makeNoise();

        Animal animal = new Wolf();
        animal.eat();
    }
}
