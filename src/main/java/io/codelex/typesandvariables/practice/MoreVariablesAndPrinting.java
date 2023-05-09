package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.text.DecimalFormat;

//
//Clean up the code
//        Change all the variables so there isn't the my in front.
//        Convert the inches and pounds to centimeters and kilos.
//        1 inch = 2.54 cm
//        1 pound = 0.453592 kg
//        Keep two digits after decimal separator.
public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age, height , weight;

        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        weight = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";
        DecimalFormat df = new DecimalFormat("0.00");
        double heightInCm = height * 2.54;
        double weightInKg = weight * 0.453592;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + heightInCm + " centimeters tall.");
        System.out.println("He's " + df.format(weightInKg) + " kilogram heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + heightInCm + ", and " + df.format(weightInKg)
                + " I get " + df.format(age + heightInCm + weightInKg) + ".");
    }
}