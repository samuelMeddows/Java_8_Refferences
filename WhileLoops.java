package com.meddows;

public class Main {

    public static void main(String[] args) {
//        // while loop
//	    int count = 0;
//	    while (count !=6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        // while loop with different format
//        count = 1;
//	    while (true) {
//	        if (count == 6){
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }
//
//        // do loop
//        count =1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count !=6);
//
//
//        count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!= 6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count >100) {
//                break;
//            }
//
//        } while(count != 6);
//
//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber) {
//            if(!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }


        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int evenCount = 0;
        int newNumber = 5;
        int newFinishNumber = 20;

        while (newNumber <= newFinishNumber) {
            if (!isEvenNumber(newNumber)) {
                newNumber++;
                continue;
            }

            System.out.println("Even number " + newNumber);
            newNumber++;
            evenCount++;

            if (evenCount == 3) {
                System.out.println("Three even numbers recorded, ending loop!");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }


}
