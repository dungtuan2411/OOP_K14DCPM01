package oop.buoi09.animal;

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
    public void makeNoise() {
        // code mới dành cho sư tử
        System.out.println("making Lion noise");
    }

    @Override
    public void eat() {
        System.out.println("Lion eating meat");
    }
}
