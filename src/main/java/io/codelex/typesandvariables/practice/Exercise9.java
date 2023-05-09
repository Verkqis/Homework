package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input data, to calculate your speed. ");
        System.out.print("Distance in meters: ");
        double distance = input.nextDouble();
        System.out.print("Hours: ");
        double hours = input.nextDouble();
        System.out.print("Minutes: ");
        double minutes = input.nextDouble();
        System.out.print("Seconds: ");
        double seconds = input.nextDouble();


        double minToSec = minutes * 60;
        double hoursToSec = hours * 3600;
        double total = seconds + minToSec + hoursToSec;
        double secToHours = total / 3600;

        double result = distance / total;
        double metersToKm = distance / 1000;
        double metersToMiles = distance / 1609;

        double kmH = metersToKm / secToHours;
        double milesPerHour = metersToMiles / secToHours;


        System.out.println("Your speed in meters/second is: " + result);
        System.out.println("Your speed in km/h is: " + kmH);
        System.out.println("Your speed in miles/h is: " + milesPerHour);
    }
}
