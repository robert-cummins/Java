package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double pounds = 25;
        double poundsToKilos = pounds * 0.45359237;
        System.out.println(poundsToKilos);

    }
}
