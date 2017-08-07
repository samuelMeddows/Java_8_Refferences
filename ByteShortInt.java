package com.meddows;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int     myMinValue = -2_147_483_648;
        int     myMaxValue = 2_147_483_647;
        int     myTotalIntValue = (myMinValue/2);
        System.out.println("myIntTotal = " + myTotalIntValue);

        // short has a width of 16
        short   myMaxShortValue = 32767;
        short   myMinShortValue = -32768;
        short   myToralShortValue = (short) (myMinShortValue/2);
        System.out.println("myShortTotal = " + myToralShortValue);

        // byte has a width of 8
        byte    myMaxByteValue = 127;
        byte    myMinByteValue = -128;
        byte    myTotalByteValue = (byte) (myMinByteValue/2);
        System.out.println("myByteTotal = " + myTotalByteValue);

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        //Challenge
        // 1. Create a byte variable and set it to any valid number.
        byte    myByte = 24;
        // 2. Create a short variable and set it to any valid short number.
        short   myShort = 31126;
        // 3. Create an int variable and set it to any valid int number.
        int     myInt = 22458;
        // 4. Create a variable of type long and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int
        long myTotal = (5000L + (10L * (myByte + myShort + myInt)));
        System.out.println("myTotal = " + myTotal);
    }
}
