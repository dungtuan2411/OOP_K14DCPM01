package oop.buoi06.animal;

public class LionTestDrive {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        lion.makeNoise();
        lion.roam();

        Wolf w = new Wolf();
        w.eat();
        w.sleep();
        w.makeNoise();
        w.roam();
    }
}
