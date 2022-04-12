package oop.buoi09;

public class Circle extends Shape {
    // attribute
    private int radius;

    Circle(int _x, int _y, int _r) {
        // Phải gọi đến constructor dev tạo của shape
        super(_x, _y);
        this.radius = _r;
    }

    // cài đè 2 phương thức abstract của lớp cha
    @Override
    public void draw() {
        System.out.println("Draw circle at " + x + "," + y);
    }

    @Override
    public void erase() {
        System.out.println("Erase circle at " + x + "," + y);
    }

    @Override
    public void moveTo(int _x, int _y) {
        super.moveTo(_x, _y);
        System.out.println("Radius: " + radius);
    }

}
