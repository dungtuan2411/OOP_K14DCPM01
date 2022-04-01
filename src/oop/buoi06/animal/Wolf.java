package oop.buoi06.animal;

public class Wolf extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("make Wolf noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf eat meat");
    }
}
