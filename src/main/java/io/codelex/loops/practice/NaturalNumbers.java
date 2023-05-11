package io.codelex.loops.practice;

public class NaturalNumbers {

    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i = 1; i <= 10; ++i) {
            sum = sum + i;
        }

        System.out.println("The first 10 natural numbers are: " + sum);

    }

}
