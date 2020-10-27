package com.company;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(101);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && (inches >= 0 && inches <= 12)){
            double feetToInches  = feet * 12;
            double totalInches = feetToInches + inches;
            double centimeters = totalInches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
            return centimeters;
        }
        System.out.println("Invalid numbers added");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        return -1;
    }
}



