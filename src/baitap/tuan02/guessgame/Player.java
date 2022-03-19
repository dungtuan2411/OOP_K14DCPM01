package baitap.tuan02.guessgame;

public class Player {
    // attribute
    // giá trị mà player này đoán
    private int number; // implementation

    // getter
    public int getNumber() {
        return number;
    }

    // method
    void guess() {
        // phương thức thực hiện việc đoán
        this.number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + this.number);
    }
}
