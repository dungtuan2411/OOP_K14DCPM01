package oop.buoi06.thuake;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setSoundFile("circle.aif"); // kế thừa
        circle.rotate();
        circle.playSound();

        Triangle triangle = new Triangle();
        triangle.setSoundFile("triangle.aif");
        triangle.rotate();
        triangle.playSound();

        Square square = new Square();
        square.setSoundFile("square.aif");
        square.rotate();
        square.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.setxPoint(5);
        amoeba.setyPoint(10);
        amoeba.setSoundFile("amoeba.hif");
        amoeba.rotate();
        amoeba.playSound();
    }
}
