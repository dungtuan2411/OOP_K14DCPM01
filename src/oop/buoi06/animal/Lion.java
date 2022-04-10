package oop.buoi06.animal;

public class Lion extends Feline {
    // state

    // constructor
    Lion() {
    }

    Lion(int x, int y) {
        super(x, y);
    }

    // method
    @Override
    protected void makeNoise() {
        // code mới dành cho sư tử
        System.out.println("making Lion noise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eating meat");
    }
}
