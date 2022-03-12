package oop.buoi03;

public class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        // state tác động, thay đổi behavior
        if (size > 14)
            System.out.println("Ruff! Ruff!");
        else
            System.out.println("Yip! Yip!");
    }

    void setBigger() {
        // behavior thay đổi state
        size += 5;
    }

    void run() {
        System.out.println("Running ...");
        this.bark();
    }
}
