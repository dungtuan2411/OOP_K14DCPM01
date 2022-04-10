package oop.buoi06.animal;

public class Feline extends Animal {
    // Họ mèo

    public Feline() {
    }

    public Feline(int x, int y) {

    }

    @Override
    protected void roam() {
        System.out.println("Roaming alone");
    }
}
