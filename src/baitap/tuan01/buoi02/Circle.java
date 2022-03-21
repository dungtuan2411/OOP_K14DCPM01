package baitap.tuan01.buoi02;

public class Circle {
    // attribute: mỗi hình có soundFile riêng
    private String soundFile;

    // constructor: khởi tạo giá trị soundFile
    public Circle(String soundFile) {
        this.soundFile = soundFile;
    }

    // method
    public void rotate() {
        System.out.println("Circle rotating 360 ...");
        // khi xoay sẽ phát nhạc
        this.playSound();
    }

    public void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }
}
