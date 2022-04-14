package oop.buoi09.animal;

public class Cow extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Cow sound ...");
    }

    @Override
    protected void eat() {
        System.out.println("Cow eating ...");
    }

}
