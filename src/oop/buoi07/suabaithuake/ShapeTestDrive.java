package oop.buoi07.suabaithuake;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Amoeba amoeba = new Amoeba("amoeba.hif", 5.5, 5.5);
        amoeba.rotate();
        amoeba.playSound();
    }
}
