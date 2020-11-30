package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions tvDimensions = new Dimensions(20, 50);
        Dimensions tableDimensions = new Dimensions(80, 150);
        Dimensions doorDimensions = new Dimensions(90, 180);

        Table oakTable = new Table(tableDimensions, "oak", "brown");
        TV sonyTV = new TV(tvDimensions, "Bravia", "Sony");
        Door myDoor = new Door(doorDimensions, "white");

        Room myRoom = new Room(myDoor, sonyTV, oakTable);

        myRoom.getDoor().openDoor();
        myRoom.turnOnTV();
    }
}
