package com.meddows;

public class Main {

    public static void main(String[] args) {
         int newScore = calculateScore("R4Z0R", 500 );
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have parameters
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate the the first parameter is >=0
        // You should validate the 2nd parameter inches is >=0 <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate this its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then  here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number data types is probably a good idea
        // 1 inch = 2.54 cm and one foot = 12 inches
        // use the link I gave to confirm you are curating correctly.
        // Calling another overloaded method just required you to use the
        // right number of parameters.


        // 7ft = 213.36cm
        // 5"  = 12.7cm

        double centimerts = calcFeetAndInchesToCentimeters(7, 5);
        if (centimerts < 0.0){
            System.out.println("Invalid feet or inches parameters");
        }

        centimerts = calcFeetAndInchesToCentimeters(157);
        if (centimerts < 0.0){
            System.out.println("Invalid feet or inches parameters");
        }
    }

    public static double calcFeetAndInchesToCentimeters (double valFeet, double valInches){
        if ((valFeet <0) || (valInches <0) || (valInches >12)){
            return -1;
        }
        double centimeters = (valFeet * 12) * 2.54;
        centimeters += valInches * 2.54;
        System.out.println(valFeet + " feet, " + valInches + " inches = " + centimeters + " cm" );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double valInches){
        if (valInches <0 ) {
            return -1;
        }
        double feet = (int) valInches / 12;
        double remainingInches = (int) valInches % 12;
        System.out.println(valInches + " inches is equal to " + feet + " feet and " + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
}
