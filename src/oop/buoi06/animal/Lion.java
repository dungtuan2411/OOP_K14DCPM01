package oop.buoi06.animal;

public class Lion extends Feline {
    // state
    
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
