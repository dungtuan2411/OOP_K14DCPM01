package oop.buoi06.animal;

public class Dog extends Canine {
    // cài đè hành vi
    @Override
    protected void makeNoise() {
        System.out.println("Making gau gau");
    }

    @Override
    protected void eat() {
        System.out.println("Eating bone ...");
    }

    // bổ sung method riêng biệt của Dog
    public void protectHouse() {
        System.out.println("Protecting ...");
    }

    void chaseCat() {
        System.out.println("Chasing cat ...");
    }
}
