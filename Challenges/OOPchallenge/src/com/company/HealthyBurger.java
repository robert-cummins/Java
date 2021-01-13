package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1;
    private double healthyExtra1Price;

    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Brown Rye", meat, price);
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1 != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1 + " for an extra " + this.healthyExtra1);
        }

        if(this.healthyExtra2 != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2 + " for an extra " + this.healthyExtra2);
        }

        return hamburgerPrice;
    }

}
