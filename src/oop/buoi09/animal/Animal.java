package oop.buoi09.animal;

public abstract class Animal {
    // attribute
    private String picture, food;
    private int hunger; // mức độ đói bụng 1,2,3
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method - behavior - interface - encapsulation
    public abstract void makeNoise(); // hợp đồng mà tất cả lớp con phải thực thi

    protected abstract void eat(); // hợp đồng mà tất cả lớp con phải thực thi

    protected void sleep() {
        System.out.println("Sleeping ...");
    }

    protected void roam() {
        // đi lang thang
        System.out.println("Roaming ...");
    }
}
