package com.meddows;

public class Main {

    public static void main(String[] args) {

        // Expression : myVariable = 50
        // Statement  : int myVariable = 50;

        int myVariable = 50;

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        // multiline statement
        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");
    }
}
