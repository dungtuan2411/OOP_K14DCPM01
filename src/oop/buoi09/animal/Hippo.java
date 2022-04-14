package oop.buoi09.animal;

public class Hippo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Hippo sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("Hippo eating ...");
    }
}
