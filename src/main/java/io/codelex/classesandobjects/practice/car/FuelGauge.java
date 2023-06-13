package io.codelex.classesandobjects.practice.car;

public class FuelGauge {
    private int fuel;

    FuelGauge() {
        fuel = 0;
    }

    int getFuel() {
        return fuel;
    }

    void incrementFuel() {
        if (fuel < 70) {
            fuel++;
        }
    }

    void decrementFuel() {
        if (fuel > 0) {
            fuel--;
        }
    }

}
