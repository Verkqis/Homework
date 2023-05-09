package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your weight - height data in kg/cm! ");
        System.out.println("So we can calculate your body mass index! ");
        System.out.println("Example my weigh is 90 kg, and my height is 189 cm. ");
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in cm: ");
        double height = input.nextDouble();
        double metersToCm = height / 100;
        double bodyMassIndex = weight / (metersToCm * 2);
        System.out.println("Your BMI value is " + bodyMassIndex);
        if (bodyMassIndex > 25) {
            System.out.println("Your BMI value is greater than 25, you may consider go for walks more! ");
        } else if (bodyMassIndex < 18.5) {
            System.out.println("Your BMI value is less than 18.5, lucky you, you can eat what ever you want! ");
        } else {
            System.out.println("Your BMI value is optimal, keep doing what ever you do! ");
        }
    }
}
