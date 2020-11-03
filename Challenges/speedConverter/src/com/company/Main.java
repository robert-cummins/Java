package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(-2);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid number");
        } else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h " + "= " + mph + "mi/h");
        }
    }
}
