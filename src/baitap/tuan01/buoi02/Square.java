package baitap.tuan01.buoi02;

public class Square {
    // attribute
    private String soundFile;

    // constructor
    public Square(String soundFile) {
        this.soundFile = soundFile;
    }

    // method
    public void rotate() {
        System.out.println("Square rotating 360 ...");
        // khi xoay sẽ phát nhạc
        this.playSound();
    }

    public void playSound() {
        System.out.println("Play file " + this.soundFile + " music");
    }
}
