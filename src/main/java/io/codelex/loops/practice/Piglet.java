package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {

        int number = 1 + (int) (6 * Math.random());
        int number2 = 1 + (int) (6 * Math.random());
        int number3 = 1 + (int) (6 * Math.random());


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet! ");
        System.out.println("You rolled a " + number + "!");
        if (number == 1) {
            System.out.println("You rolled 1! Game is 0ver! ");
            System.exit(0);
        }
        System.out.print("If you want roll again press Enter ");
        String firstAnswer = input.nextLine();

        System.out.println("You rolled a " + number2 + "!");
        if (number2 == 1) {
            System.out.println("You rolled 1! Game is 0ver! ");
            System.exit(0);
        }
        System.out.print("If you want roll again press Enter ");
        String secondAnswer = input.nextLine();

        System.out.println("You rolled a " + number3 + "!");
        if (number3 == 1) {
            System.out.println("You rolled 1! Game is 0ver! ");
            System.exit(0);
        } else {
            int points = number + number2 + number3;
            System.out.println("You got " + points + " points.");
        }


    }
}
