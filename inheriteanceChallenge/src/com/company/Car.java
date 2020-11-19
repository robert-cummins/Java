package com.company;

public class Car extends Vehicle {

    private String make;
    private int currentGear;

    public Car(){
        this("Unknown");
    }

    public Car(String make){
        super("Car", "Unknown" );
        this.make = make;
        this.currentGear = 0;
    }

    public String getMake() {
        return make;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void changeGear(int gear){
        if(gear >= 0 && gear <= 6){
            currentGear = gear;
            System.out.println("you have moved to gear " + currentGear);
        } else {
            System.out.println("You have selected an invalid gear");
        }

    }

}
