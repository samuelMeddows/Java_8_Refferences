package com.meddows;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 2000);
        System.out.println("Your final score was " + highScore);


        // Create a method called displayHighScorePosition
        // it should show a players name as a parameter and a 2nd parameter as a position in the high score table
        // you should display the players name along with a message like "managed to get into position " and the
        // position they got and a further message " on the high score table"
        //
        // Create a second method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50


        displayHighScorePosition("R4Z0R", calculateHighScorePosition(1000));
        displayHighScorePosition("Sharko_00", calculateHighScorePosition(900));
        displayHighScorePosition("NoScopeSlayer", calculateHighScorePosition(400));
        displayHighScorePosition("RadMadChad44", calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // void means don't return anything
        // int means return data with type of int

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int ladderPosition){

        System.out.println(playerName + "! You are ranked " + ladderPosition + " on the score board!");
    }

    public static int calculateHighScorePosition (int score){

        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
