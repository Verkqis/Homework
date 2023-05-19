package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final int NUMBERED_SURVEYED = 12467;
    final double PURCHASED_ENERGY_DRINKS = 0.14;
    final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {

        final int NUMBERED_SURVEYED = 12467;
        double energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED);
        double preferCitrus = calculatePreferCitris((int) energyDrinkers);

        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");


    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed = (numberSurveyed * 14) / 100;
    }


    public static double calculatePreferCitris(int numberSurveyed) {
        return numberSurveyed = (numberSurveyed * 64) / 100;
    }
}
