package io.codelex.arrays.practice;

public class Exercise3 {

    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int average = sum / 2;

        System.out.println("Average value of the array elements is : " + average);
    }
}
