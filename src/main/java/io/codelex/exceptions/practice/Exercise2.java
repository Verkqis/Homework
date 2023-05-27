package io.codelex.exceptions.practice;

public class Exercise2 {
    
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Error: you cant divide with zero! ");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC(0);
        } catch (ArithmeticException e) {
            System.out.println("Error: you cant divide with zero! ");
        }
    }

    public static void methodC(int par) throws ArithmeticException {
        try {
            int par2 = 0;
            int result = par2 / par;
        } catch (ArithmeticException e) {
            System.out.println("Error: you cant divide with zero! ");
        }
    }

    public static void main(String[] args) {

        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Error: you can divide by zero");
        }
    }
}
