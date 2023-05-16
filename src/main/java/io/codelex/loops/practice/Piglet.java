package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {

    public static void main(String[] args) {

        int total = 0;
        boolean rollAgain = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet! ");
        System.out.println("If you want exit the game press any button and hit enter! ");
        System.out.println("If you want continue game type `yes` or `y` and hit enter! ");

        while (rollAgain) {
            int roll = rollDice();
            if (roll == 1) {
                System.out.println("You rolled a 1!");
                total = 0;
                rollAgain = false;
            } else {
                System.out.println("You rolled a " + roll + "!");
                total += roll;
                System.out.println("You have a " + total + " points !");
                System.out.println("Roll again? ");
                rollAgain = readBoolean(input);
            }
        }
    }

    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static boolean readBoolean(Scanner input) {
        String in = input.nextLine().toLowerCase();
        return in.equals("yes") || in.equals("y");
    }
}
