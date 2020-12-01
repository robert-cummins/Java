package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPages;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void fillUpToner(int tonerAmount){
        if(tonerAmount + this.tonerLevel > 100 ){
            System.out.println("Too much toner. Add less");
        }
        else {
            this.tonerLevel += tonerAmount;
            System.out.println("You have added toner. The current amount of toner is : " + this.tonerLevel);
        }
    }

    public void printPage(int numOfPages){
        System.out.println("You have printed " + numOfPages + " pages");
        this.numberOfPagesPrinted += numOfPages;
        System.out.println("This printer has printed " + this.numberOfPagesPrinted + " pages in total");
        this.tonerLevel -= numOfPages;
        reduceTonerDueToPrinting();


    }

    private void reduceTonerDueToPrinting(){
        if(this.tonerLevel <= 0){
            System.out.println("Toner empty, please replace");
        }

        if(this.tonerLevel <= 20 && this.tonerLevel > 0){
            System.out.println("Toner level is low");
        }

        System.out.println("Current toner level is: " + this.tonerLevel);
    }
}
