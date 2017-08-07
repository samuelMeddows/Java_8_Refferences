package com.meddows;

public class Main {

    public static void main(String[] args) {
        // addition
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        // subtraction
        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        // multiplication
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        // division
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        // remainder
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        // increment
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result ++;

        // decrement
        System.out.println("Result is now " + result);
        result --;
        System.out.println("Result is now " + result);

        // shorthand operators
        result +=2;
        System.out.println("Result is now " + result);
        result *=10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);
        result %=2;
        System.out.println("Result is now " + result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        // if isCar == True return true else return false
        isCar = true;
        boolean wasCar = isCar ? true : false;
            if (wasCar)
                System.out.println("wasCar is true");


        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 devided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit"
        //    if the remaining total (#4) is equal to 20 or less

        double firstValue = 20d;
        double secondValue = 80d;
        double totalValue = 25d * (firstValue + secondValue);
        double remainderValue = totalValue % 40d;
        if (remainderValue >= 20)
            System.out.println("Total was over the limit");

        System.out.println(remainderValue);




    }
}
