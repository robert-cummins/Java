package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    count10Numbers();
    }

    public static void count10Numbers(){
        int i = 1;
        int total = 0;
        Scanner numberScanner = new Scanner(System.in);
        while(i < 11){
            System.out.println("Please enter number " + i + "-- ");
            boolean hasNextInt = numberScanner.hasNextInt();
            if(hasNextInt){
                int num = numberScanner.nextInt();
                total += num;
                i++;
            }
            else {
                System.out.println("Invalid number entered");
            }

            numberScanner.nextLine();

        }

        System.out.println("The total is " + total);
        numberScanner.close();
    }
}
