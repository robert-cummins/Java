package com.company;

public class Table {
    private Dimensions dimensions;
    private String material;
    private String color;

    public Table(Dimensions dimensions, String material, String color) {
        this.dimensions = dimensions;
        this.material = material;
        this.color = color;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
