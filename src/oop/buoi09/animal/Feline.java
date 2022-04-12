package oop.buoi09.animal;

public abstract class Feline extends Animal {
    // Họ mèo

    public Feline() {
    }

    public Feline(int x, int y) {
    }

    @Override
    protected void roam() {
        System.out.println("Roaming mot minh ...");
    }
}
