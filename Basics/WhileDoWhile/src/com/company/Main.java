package com.company;

public class Main {

    public static void main(String[] args) {
	    int count =1;
	    while(count !=6){
            System.out.println("Count is " + count);
            count++;
        }

	    count = 1;

	    do {
            System.out.println("Count value was " + count);
            count ++;
        } while(count !=6);

	    int number = 4;
	    int finishNumber = 20;
	    int evenCount = 0;

	    while (number <= finishNumber){
	        number ++;
	        if(!isEvenNumber(number)){
	            evenCount ++;
                System.out.println("Even number count is " + evenCount);
	            continue;
            }

	        if(evenCount == 5){
	            break;
            }

            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
