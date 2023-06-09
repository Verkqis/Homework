package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

public class CalculateArea {
    public static void main(String[] args) {
        int choice;

        do {
            choice = getMenu();
            if (choice == 1) {
                calculateCircleArea();
            } else if (choice == 2) {
                calculateRectangleArea();
            } else if (choice == 3) {
                calculateTriangleArea();
            } else if (choice == 4) {
                System.out.println("Thanks for calculating!");
            }
        } while (choice != 4);
    }

    public static int getMenu() {

        int userChoice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        userChoice = keyboard.nextInt();

        while (userChoice < 1 || userChoice > 4) {
            System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
            userChoice = keyboard.nextInt();
        }

        return userChoice;
    }

    public static void calculateCircleArea() {

        BigDecimal radius = ZERO;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the circle's radius? ");
        radius = keyboard.nextBigDecimal();

        System.out.println("The circle's area is " + Geometry.areaOfCircle(radius));
    }

    public static void calculateRectangleArea() {
        BigDecimal length = ZERO;
        BigDecimal width = ZERO;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length? ");
        length = keyboard.nextBigDecimal();

        System.out.print("Enter width? ");
        width = keyboard.nextBigDecimal();

        System.out.println("The rectangle's area is " + Geometry.areaOfRectangle(length, width));
    }

    public static void calculateTriangleArea() {
        BigDecimal base = ZERO;
        BigDecimal height = ZERO;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter length of the triangle's base? ");
        base = keyboard.nextBigDecimal();

        System.out.print("Enter triangle's height? ");
        height = keyboard.nextBigDecimal();

        System.out.println("The triangle's area is " + Geometry.areaOfTriangle(base, height));
    }
}
