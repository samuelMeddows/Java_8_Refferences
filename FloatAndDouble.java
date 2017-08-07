package com.meddows;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int      myIntValue = 5 /2;
	    // width of float = 32 (4 bytes)
	    float    myFloatValue = 5f / 3f;   // 7 digits of prescision
        // width of a double = 64 (8 bytes)
	    double   myDoubleValue = 5d / 3d; // 16 digits of prescision

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable top store the number of ponds
        // 2. Calculate the number kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms

        double dblPounds = 200d;
        double dblKilograms = (dblPounds * 0.45359237d);
        System.out.println("Total Kilograms = " + dblKilograms);

        double pi = 3_00_000.1415927d;
    }
}
