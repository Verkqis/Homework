package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Type number that you want check if it odd or even! ");
            System.out.println("Type exit and press Enter if you want exit!");
            String exit = input.nextLine();
            if (exit.equals("exit")) {
                System.out.println("bye!");
                break;
            } else {
                int numberInput = Integer.parseInt(exit);
                if (numberInput % 2 == 0) {
                    System.out.println("Even Number");
                } else {
                    System.out.println("Odd Number");
                }

            }
        }

    }

}
