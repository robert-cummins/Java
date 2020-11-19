package com.company;

public class Main {

    public static void main(String[] args) {
        VW golf = new VW("Golf" , "black");
        VW unKnown = new VW();
        unKnown.setModel("Polo");
        System.out.println(unKnown.getModel());
        System.out.println(golf.getModel());
        System.out.println(golf.getMake());

        golf.lockUnlockDoor();
        golf.changeGear(3);
        golf.changeVelocity(100);
        golf.changeDirection(210);
    }
}
