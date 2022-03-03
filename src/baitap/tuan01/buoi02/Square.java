package baitap.tuan01.buoi02;

public class Square {
    // attribute
    String soundFile;

    // constructor
    public Square(String soundFile) {
        this.soundFile = soundFile;
    }

    // method
    void rotate() {
        System.out.println("Rotating 360 ...");
        // khi xoay sẽ phát nhạc
        this.playSound();
    }

    void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }
}
