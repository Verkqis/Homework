package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Desired sum: ");
        int sum = input.nextInt();

        int dice1;
        int dice2;
        int rollSum;

        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            rollSum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + rollSum);
        } while (rollSum != sum);

    }
}