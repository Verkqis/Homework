package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int number = 1 + (int)(100 * Math.random());
            System.out.println("I'm thinking of a number between 1-100.  Try to guess it!");
            int enterNumber = input.nextInt();
            if (enterNumber == number) {
                System.out.println("You guessed it!  What are the odds?!?");
            } else if (enterNumber < number) {
                System.out.println("Sorry, you are too high.  I was thinking of:" + number);
            } else {
                System.out.println("Sorry, you are too low.  I was thinking of:" + number);
                break;
            }
        }


    }

}
