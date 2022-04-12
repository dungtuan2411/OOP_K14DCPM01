package oop.buoi09.animal;

public class Wolf extends Canine {
    @Override
    protected void makeNoise() {
        System.out.println("Wolf sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("Wolf eating ...");
    }
}
