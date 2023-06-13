package io.codelex.classesandobjects.practice.car;


import java.util.Scanner;

public class LitersPerKilometer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers;
        double endKilometers;
        double liters;

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());
        System.out.println("Gas Hog? " + car.gasHog());
        System.out.println("Economy Car? " + car.economyCar());
    }
}