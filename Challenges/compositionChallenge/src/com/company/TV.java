package com.company;

public class TV {
    private Dimensions dimensions;
    private String model;
    private String make;

    public TV(Dimensions dimensions, String model, String make) {
        this.dimensions = dimensions;
        this.model = model;
        this.make = make;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public void powerOn(){
        System.out.println("The tv has been powered on");
    }
}
