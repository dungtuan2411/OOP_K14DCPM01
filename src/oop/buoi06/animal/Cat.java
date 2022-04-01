package oop.buoi06.animal;

public class Cat extends Feline {
    @Override
    protected void makeNoise() {
        System.out.println("make Cat noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating mouse");
    }
}
