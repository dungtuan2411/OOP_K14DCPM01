package oop.buoi06.animal;

public class Animal {
    // attribute
    private String picture, food;
    private int hunger; // mức độ đói bụng 1,2,3

    // setter getter
    public String getPicture() {
        return picture;
    }

    public String getFood() {
        return food;
    }

    public int getHunger() {
        return hunger;
    }

    // method
    protected void makeNoise() {
        System.out.println("make noise ...");
    }

    protected void eat() {
        System.out.println("Eating ...");
    }

    protected void sleep() {
        System.out.println("Sleeping ...");
    }

    protected void roam() {
        // đi lang thang
        System.out.println("Roaming ...");
    }
}
