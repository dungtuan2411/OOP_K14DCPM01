package oop.buoi06.animal;

public class Hippo extends Animal {
    @Override
    protected void makeNoise() {
        System.out.println("make Hippo noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo eat grass, vegetables, meat,...");
    }
}
