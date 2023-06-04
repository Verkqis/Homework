package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {

    public static int checkNumber(int number) {

        int sum = 0;
        int mod = 0;

        while (number > 0) {
            mod = number % 10;
            sum = sum + (mod * mod);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter positive number: ");
        int input = in.nextInt();
        int result = input;

        while (result != 1 && result != 4) {
            result = checkNumber(result);
        }
        if (result == 1) {
            System.out.println("It is happy number: ");
        } else {
            System.out.println("It is not happy number: ");
        }


    }


}
