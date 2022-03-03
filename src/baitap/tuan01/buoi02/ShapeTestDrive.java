package baitap.tuan01.buoi02;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square("sound.aif");
        square.playSound();
        square.rotate();

        Circle circle = new Circle("sound.aif");
        circle.playSound();
        circle.rotate();

        Triangle triangle = new Triangle("sound.aif");
        triangle.playSound();
        triangle.rotate();
    }
}
