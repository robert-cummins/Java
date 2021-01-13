package com.company;

public class Hamburger {
    private double price;
    private String breadType;
    private String meat;

    private String addition1;
    private double addition1Price;

    private String addition2;
    private double addition2Price;

    private String addition3;
    private double addition3Price;

    private String addition4;
    private double addition4Price;

    public Hamburger(String breadType, String meat, double price) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1 = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2 = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3 = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4 = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println("Hamburger " + " on a " + this.breadType + " roll " + "price is " + this.price);

        if(this.addition1 != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1Price);
        }

        if(this.addition2 != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2Price);
        }

        if(this.addition3 != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3Price);
        }

        if(this.addition4 != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

}
