package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String numerator = "";
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.next();
                if (numerator.matches("[qQ]")) {
                    System.out.println("You exited program! ");
                    break;
                }
                int num = Integer.parseInt(numerator);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + num / divisor);
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Invalid input! ");
                break;
            } catch (ArithmeticException e) {
                System.out.println("Error : you cant divide with zero! ");
                break;
            }

        }
    }
}
