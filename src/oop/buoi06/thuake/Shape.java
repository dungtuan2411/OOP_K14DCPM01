package oop.buoi06.thuake;

// Base class
public class Shape {
    // attribute: mỗi hình có soundFile riêng
    private String soundFile; // Xuân - Hạ - Thu - Đông

    // setter getter
    public void setSoundFile(String soundFile) {
        this.soundFile = soundFile;
    }

    public String getSoundFile() {
        return soundFile;
    }

    // constructor: khởi tạo giá trị soundFile
    public Shape() {
    }

    public Shape(String soundFile) {
        this.soundFile = soundFile;
    }

    // method
    /** Default */
    void rotate() {
        System.out.println("Rotating 360 ...");
        // khi xoay sẽ phát nhạc
        // this.playSound();
    }

    public void playSound() {
        System.out.println("Play file .aif " + this.soundFile + " music");
    }
}
