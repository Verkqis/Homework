package io.codelex.loops.practice;

public class AsciiFigure {

    public static void main(String[] args) {

        int size = 5;


        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size - i) * 2; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= (i - 1) * 4; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (size - i) * 2; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
