package io.codelex.classesandobjects.practice.car;

public class CarSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(fuelGauge);

        for (int i = 0; i < 50; i++) {
            fuelGauge.incrementFuel();
        }

        while (fuelGauge.getFuel() > 0) {
            System.out.println("Mileage: " + odometer.getMileage() + " km");
            System.out.println("Fuel: " + fuelGauge.getFuel() + " liters");
            System.out.println();

            odometer.incrementMileage();
        }
    }
}
