package oop.buoi05;

public class IntSquare {
    private double squareValue; // implementation

    // interface method
    public double getSquare(int value) {
        // tính bình phương (không abstraction)
        // Implemetation bị đưa vào trong Interface

        // this.squareValue = value * value; // toán tử nhân

        // Gọi đến Implemetation
        this.calculateSquare(value);
        return this.squareValue;
    }

    // implementation method
    private void calculateSquare(int value) {
        // Implemetation tách biệt hoàn toàn với Interface
        
        // tính bình phương (không abstraction)
        // this.squareValue = value * value; // toán tử nhân
        this.squareValue = Math.pow(value, 2); // MATH
    }
}
