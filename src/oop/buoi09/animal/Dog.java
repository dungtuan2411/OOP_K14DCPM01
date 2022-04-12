package oop.buoi09.animal;

/*
*  created date: Feb 24, 2022
*  author: cgm
*/

public class Dog extends Canine implements Pet, InterfaceName {
    // implementation - Concrete class
    
    // cai de hanh vi
    @Override
    public void makeNoise() {
        System.out.println("Making gau gau ...");
    }

    @Override
    protected void eat() {
        System.out.println("Eating pone ...");
    }

    // bo sung them hanh vi
    public void protectHouse() {
        System.out.println("Protecting ...");
    }

    public void chaseCat() {
        System.out.println("Chasing cat ...");
    }

    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void setName(String name) {
        
    }

    @Override
    public String getName() {
        return null;
    }

}
