package oop.buoi05;

public class Dog {
    // attribute
    // 1. implementation là private không được truy cập
    private int size;
    // 2. interface là default, public hoặc protected
    /* default */ String name;
    /* default */ String breed;

    // method
    // interface method truy cập đến implementation
    public void setSize(int size) {
        // ràng buộc size không được là số âm
        if (size > 0)
            // truy cập nội bộ trong class
            this.size = size;
        else
            System.out.println("Size invalid!");
    }

    public int getSize() {
        return this.size;
    }
}
