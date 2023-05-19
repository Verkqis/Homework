package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercise6 {

    public static void main(String[] args) {

        Random randomNum = new Random();

        int[] randomNumbersArray = new int[10];
        int[] randomNumArr;

        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = randomNum.nextInt(1, 100);
        }

        randomNumArr = Arrays.copyOf(randomNumbersArray, randomNumbersArray.length);
        randomNumbersArray[9] = -7;

        System.out.println(Arrays.toString(randomNumbersArray));
        System.out.println(Arrays.toString(randomNumArr));
    }
}
