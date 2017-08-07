package com.meddows;

public class Main {

    public static void main(String[] args) {
	    char myChar = '\u00A9'; // copyright symbol
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode for the symbol.
        // 3. Display it on screen
        // NOTE: https://unicode-table.com/en/

        char registeredSymbol = '\u00AE'; // registered symbol
        System.out.println("Unicode output was: " + registeredSymbol);
    }
}
