package com.company;

public class VW extends Car {

    private String color;
    private String model;
    private boolean locked;

    public VW() {
        this("unknown", "Unknown");
    }

    public VW(String color, String model) {
        super("VW");
        this.color = color;
        this.model = model;
        this.locked = true;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public void lockUnlockDoor(){
        if(this.locked == true){
            this.locked = false;
            System.out.println("The car is open");
        } else {
            this.locked = true;
            System.out.println("The car is locked");
        }

    }

}
