package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = generateArray(7);
        printArray(arr);
        int[] sortedArr = sortArray(arr);
        printArray(sortedArr);
    }

    public static int[] generateArray(int num){
        int[] intArray = new int[num];

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Please enter an integer \r");
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
