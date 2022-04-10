package oop.buoi07.suabaithuake;

public class Amoeba extends Shape {
    // attribute
    private double xPoint, yPoint; // tọa độ điểm, biến riêng của Amoeba

    // getter setter
    public void setxPoint(double xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(double yPoint) {
        this.yPoint = yPoint;
    }

    // constructor
    public Amoeba() {
        super();
    }

    public Amoeba(String soundFile, double xPoint, double yPoint) {
        super(soundFile);
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    // method
    /**
     * @Override cho biết method này cài đè của base class
     *           không có cũng không sao
     *           chỉ đóng vai trò thông báo đây là override
     */
    @Override
    public void rotate() {
        // method rotate đặc thù của Amoeba
        System.out.println("Rotating 360 at xPoint : " + this.xPoint + " yPoint: " + this.yPoint);
    }

    @Override
    public void playSound() {
        // method playSound đặc thù của Amoeba
        System.out.println("Play file .hif " + this.getSoundFile() + " music");
    }
}
