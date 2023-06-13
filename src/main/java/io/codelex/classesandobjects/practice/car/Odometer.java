package io.codelex.classesandobjects.practice.car;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;

    Odometer(FuelGauge fuelGauge) {
        mileage = 0;
        this.fuelGauge = fuelGauge;
    }

    int getMileage() {
        return mileage;
    }

    void incrementMileage() {
        if (mileage < 999999) {
            mileage++;
        } else {
            mileage = 0;
        }

        if (mileage % 7 == 0) {
            fuelGauge.decrementFuel();
        }
    }
}
