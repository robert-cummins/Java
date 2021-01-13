package com.company;


public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("White", "Beef", 3.50);
	    hamburger.addHamburgerAddition1("Tomato", 1.30);
        hamburger.addHamburgerAddition2("Cheese", 2.00);
        hamburger.addHamburgerAddition3("Lettuce", 0.30);
        hamburger.addHamburgerAddition4("Mayo", 1.00);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("chicken", 4.99);
        healthyBurger.addHamburgerAddition1("egg", 2.59);
        healthyBurger.addHealthAddition1("Lentils", 3.10);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxBurger deluxBurger = new DeluxBurger();
        deluxBurger.addHamburgerAddition3("cheese", 3.50);
        deluxBurger.itemizeHamburger();

    }
}
