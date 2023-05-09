package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Type amount of seconds you want to convert to days and years, and press Enter!");
            System.out.println("Type exit and press Enter if you want exit!");
            String seconds = input.nextLine();
            if (seconds.equals("exit")) {
                break;
            } else {
                double oneDay = Double.parseDouble(seconds) / 86400;
                double oneYear = Double.parseDouble(seconds) / 31536000;
                System.out.printf("Amount of seconds you typed is %3.3f days and %2.3f years!", oneDay, oneYear);
            }
        }

    }

}
