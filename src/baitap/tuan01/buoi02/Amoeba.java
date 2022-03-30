package baitap.tuan01.buoi02;

public class Amoeba {
    // attribute
    // khác với các hình khác do amoeba không có hình dạng cố định
    /**
     * Sẽ xoay theo tọa độ điểm trục hoành Ox (nằm ngang)
     * và trục tung Oy (thẳng đứng) .
     */
    private String soundFile;
    private double xPoint, yPoint; // tọa độ điểm

    // getter setter
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public double getxPoint() {
        return xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    // constructor
    public Amoeba(String soundFile) {
        this.soundFile = soundFile;
    }

    public Amoeba(String soundFile, double xPoint, double yPoint) {
        this(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    // method
    // xoay 360
    public void rotate() {
        System.out.println("Rotating 360 at xPoint : " + this.xPoint + " yPoint: " + this.yPoint);
        this.playSound();
    }

    public void playSound() {
        // Code xử lý cho file .hif
        System.out.println("Play file " + this.soundFile + " music");
    }
}
