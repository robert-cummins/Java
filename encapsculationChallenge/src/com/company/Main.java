package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer myPrinter = new Printer(100, 0, true);
	    myPrinter.printPage(60);
	    myPrinter.printPage(20);
	    myPrinter.printPage(20);
	    myPrinter.fillUpToner(120);
	    myPrinter.fillUpToner(100);
    }
}
