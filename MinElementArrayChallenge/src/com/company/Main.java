package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many elements should be used for Int Array?:  ");
        int num = scanner.nextInt();
        int[] intArr = readIntegers(num);
        int minNum = findMin(intArr);
        System.out.println("The lowest number in the array is " + minNum);
    }

    public static int[] readIntegers(int num){
        int[] intArray = new int[num];

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Enter an integer: ");
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static int findMin(int[] arr){
        int lowestNum = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < lowestNum){
                lowestNum = arr[i];
            }
        }

        return lowestNum;
    }
}
