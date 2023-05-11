package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");

        long n = in.nextLong();

        
        if (n < 0) {
            System.out.println("Number is negative ");
        } else if (n >= 0 && n < 10) {
            int digits = 1;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 10 && n < 99) {
            int digits = 2;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 100 && n < 999) {
            int digits = 3;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 1000 && n < 9999) {
            int digits = 4;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 10000 && n < 99999) {
            int digits = 5;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 100000 && n < 999999) {
            int digits = 6;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 1000000 && n < 9999999) {
            int digits = 7;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 10000000 && n < 99999999) {
            int digits = 8;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 100000000 && n < 999999999) {
            int digits = 9;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 1000000000 && n < 9999999999L) {
            int digits = 10;
            System.out.println("Number of digits in the number: " + digits);
        } else if (n >= 10000000000L) {
            System.out.println("Number is greater or equals 10,000,000,000!");
        } else {
            System.out.println("The number is not a long");
        }

    }
}
