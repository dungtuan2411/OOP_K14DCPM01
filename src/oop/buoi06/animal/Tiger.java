package oop.buoi06.animal;

public class Tiger extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("make Tiger noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Tiger eat meat");
    }
}
