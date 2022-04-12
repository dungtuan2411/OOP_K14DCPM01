package oop.buoi09.robot;

import oop.buoi09.animal.Pet;

public class RobotDog extends Robot implements Pet {
    // Robot dog không nằm trong cây gia phả Animal, nhưng nó vẫn được xem là Pet
    @Override
    protected void fly() {
        System.out.println("fly by dog");
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }

}
