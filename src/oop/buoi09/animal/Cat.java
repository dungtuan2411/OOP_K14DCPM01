package oop.buoi09.animal;

public class Cat extends Feline implements Pet {

    @Override
    public void makeNoise() {
        System.out.println("Cat sound...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating mouse");
    }

    @Override
    public void beFriendly() {
    }

    @Override
    public void play() {
    }
}
