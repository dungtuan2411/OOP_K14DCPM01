package baitap.tuan01.buoi02;

public class Triangle {
    // attribute
    private String soundFile;

    // constructor
    public Triangle(String soundFile) {
        this.soundFile = soundFile;
    }

    // method
    public void rotate() {
        System.out.println("Triangle rotating 360 ...");
        // khi xoay sẽ phát nhạc
        this.playSound();
    }

    public void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }
}
