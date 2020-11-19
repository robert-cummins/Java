package com.company;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(){
        this("unknown", "unknown");
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }


    public void changeVelocity(int speedChange){
        this.currentVelocity += speedChange;
        System.out.println("Your Vehicles current speed is " + currentVelocity);
    }

    public void changeDirection(int headingChange){
        this.currentDirection += headingChange;
        System.out.println("Your Vehicles current heading is " + currentDirection);
    }
}
