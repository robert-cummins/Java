package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(342));
    }

    public static int sumDigits(int num){
        int total = 0;
        if(num < 10){
            return -1;
        }
        while (true){
            if(num < 10) {
                total += num;
                break;
            }
            int lastNum = num % 10;
            total += lastNum;
            num /= 10;
        }
        return total;
    }
}
