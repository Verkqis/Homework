package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SingleDigitNumSum {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 9 and press enter, three times! ");
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String num3 = sc.nextLine();
        System.out.println("Enter number from 1 to 9 and press enter, three times! ");
        String num4 = sc.nextLine();
        String num5 = sc.nextLine();
        String num6 = sc.nextLine();
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3) + Integer.parseInt(num4) + Integer.parseInt(num5) + Integer.parseInt(num6);
        System.out.println("Your result is = " + sum);


    }




}
