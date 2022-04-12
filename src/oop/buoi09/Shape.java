package oop.buoi09;

public abstract class Shape {
    // attribute
    protected int x, y;

    // constructor
    Shape(int _x, int _y) {
        x = _x;
        y = _y;
    }

    // method
    abstract public void draw();

    abstract public void erase();

    public void moveTo(int _x, int _y) {
        erase();
        x = _x;
        y = _y;
        draw();
    }
}
