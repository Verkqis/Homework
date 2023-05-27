package io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {

        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            if (d < 0 || root < 0) {
                System.out.println("Result will be imaginary number.");
                throw new NonPositiveNumberException();
            }
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Error: number format exception! ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: array index out of bounds exception! ");
        }
    }

    static double getInput(String s) {
        double d = 0;
        try {
            d = Double.parseDouble(s);
        } catch (NonPositiveNumberException e) {
            System.out.println("Error: number is less then 0! ");
        }
        return d;
    }

    public static class NonPositiveNumberException extends IllegalArgumentException {
    }

}
