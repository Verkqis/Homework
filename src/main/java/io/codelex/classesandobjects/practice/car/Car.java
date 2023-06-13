package io.codelex.classesandobjects.practice.car;


public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

    Car(double startOdo) {
        this.startKilometers = startOdo;
        this.endKilometers = startOdo;
        this.liters = 0.0;
    }


    void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters += liters;
    }

    double calculateConsumption() {
        return (liters / (endKilometers - startKilometers)) * 100;
    }

    boolean gasHog() {
        return calculateConsumption() > 15.0;
    }

    boolean economyCar() {
        return calculateConsumption() < 5.0;
    }
}
