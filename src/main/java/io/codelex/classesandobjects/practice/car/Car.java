package io.codelex.classesandobjects.practice;


class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;

    public Car(double startOdo, double endingOdo, double liters) {
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return (liters / (endKilometers - startKilometers)) * 100.0;
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }

    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }
}

