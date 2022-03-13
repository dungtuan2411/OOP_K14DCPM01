package baitap.tuan01.buoi02;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Square square = new Square("springSquareMusic.aif");
        square.playSound();
        square.rotate();

        Circle circle = new Circle("summerCircleMusic.aif");
        circle.playSound();
        circle.rotate();

        Triangle triangle = new Triangle("fallTriangleMusic.aif");
        triangle.playSound();
        triangle.rotate();

        Amoeba amoeba = new Amoeba("winterAmoebaMusic.hif");
        amoeba.playSound();
        amoeba.rotate();

        Amoeba amoeba2 = new Amoeba("amoeba.hif", 5.5, 10);
        amoeba2.rotate();
    }
}
