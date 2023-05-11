package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = input.nextLine();


        int words = firstWord.length() + secondWord.length();
        int length = 30 - words;

        if (words < 30) {
            System.out.print(firstWord);
            for (int i = 0; i < length; i++) {
                System.out.print(".");
            }
            System.out.print(secondWord);
        } else {
            System.out.println("Words you entered is to long! Maximum 30 characters!");
        }

    }
}

