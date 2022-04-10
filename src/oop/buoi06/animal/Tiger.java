package oop.buoi06.animal;

public class Tiger extends Feline {
    // constructor
    public Tiger(int x, int y) {
        super(x, y);
    }

    // method
    @Override
    protected void makeNoise() {
        System.out.println("make Tiger noise ...");
    }

    @Override
    protected void eat() {
        System.out.println("Tiger eat meat, cat, dog");
    }
}
