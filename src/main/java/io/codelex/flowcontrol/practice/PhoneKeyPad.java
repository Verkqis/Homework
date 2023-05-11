package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String numbers = input.nextLine();

        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < numbers.length(); i++) {
            char c = numbers.charAt(i);
            if (c == '2') {
                letters.append("ABC");
            } else if (c == '3') {
                letters.append("DEF");
            } else if (c == '4') {
                letters.append("GHI");
            } else if (c == '5') {
                letters.append("JKL");
            } else if (c == '6') {
                letters.append("MNO");
            } else if (c == '7') {
                letters.append("PQRS");
            } else if (c == '8') {
                letters.append("TUV");
            } else if (c == '9') {
                letters.append("WXYZ");
            }
        }

        System.out.println(letters);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String numbers2 = input2.nextLine();

        StringBuilder letters2 = new StringBuilder();

        for (int i = 0; i < numbers2.length(); i++) {
            char c2 = numbers2.charAt(i);
            switch (c2) {
                case '2' -> letters2.append("ABC");
                case '3' -> letters2.append("DEF");
                case '4' -> letters2.append("GHI");
                case '5' -> letters2.append("JKL");
                case '6' -> letters2.append("MNO");
                case '7' -> letters2.append("PQRS");
                case '8' -> letters2.append("TUV");
                case '9' -> letters2.append("WXYZ");
                default -> {
                }
            }
        }

        System.out.println(letters2);

    }
}
