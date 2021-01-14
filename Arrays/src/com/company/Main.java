package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialise without adding elements to the array. (requires number of elements to be defined)
	    int[] myIntArray = new int[10];
	    myIntArray[5] = 50;

	    double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[5]);

        //Initialise Array whilst defining all the elements
        int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray2[3]);


        //Fill up Array with a for loop
        int[] myIntArray3 = new int[10];

        for (int i = 0; i < myIntArray3.length; i++){
            myIntArray3[i] = i + 1;
        }

        System.out.println(myIntArray3[3]);

        printArray(myIntArray3);

        //Example using console input
        int[] myIntegers = getIntegers(5);

        for(int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static  int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
