package io.codelex.classesandobjects.practice;

public class Odometer {

    private double odometer = 0;

    public double Odometer(double odometer) {
        this.odometer = odometer;
        odometer += odometer;
        System.out.println("Car curren mileage is: " + odometer);
        return odometer;
    }


}
