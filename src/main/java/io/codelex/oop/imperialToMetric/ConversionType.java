package io.codelex.oop.imperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS,
    YARDS_TO_METERS,
    CENTIMETERS_TO_INCHES,
    INCHES_TO_CENTIMETERS,
    KILOMETERS_TO_MILES,
    MILES_TO_KILOMETERS;


    public static double MeasurementConverter(String conversionType, int distance) {
        double result = 0;
        if (conversionType.equals(YARDS_TO_METERS.toString())) {
            result = distance * 0.9144;
            System.out.println(distance + " yards, is: " + result + " meters. ");
        } else if (conversionType.equals(METERS_TO_YARDS.toString())) {
            result = distance * 1.093613;
            System.out.println(distance + " meters, is: " + result + " yards. ");
        } else if (conversionType.equals(CENTIMETERS_TO_INCHES.toString())) {
            result = distance * 2.54;
            System.out.println(distance + " inches, is: " + result + " centimeters. ");
        } else if (conversionType.equals(INCHES_TO_CENTIMETERS.toString())) {
            result = distance / 2.54;
            System.out.println(distance + " centimeters, is: " + result + " inches. ");
        } else if (conversionType.equals(KILOMETERS_TO_MILES.toString())) {
            result = distance * 0.621371;
            System.out.println(distance + " kilometers, is: " + result + " miles. ");
        } else if (conversionType.equals(MILES_TO_KILOMETERS.toString())) {
            result = distance * 1.609344;
            System.out.println(distance + " miles, is: " + result + " kilometers. ");
        }
        return result;
    }

    public static void main(String[] args) {


        ConversionType.MeasurementConverter("METERS_TO_YARDS", 500);
        ConversionType.MeasurementConverter("YARDS_TO_METERS", 500);
        ConversionType.MeasurementConverter("CENTIMETERS_TO_INCHES", 500);
        ConversionType.MeasurementConverter("INCHES_TO_CENTIMETERS", 500);
        ConversionType.MeasurementConverter("KILOMETERS_TO_MILES", 500);
        ConversionType.MeasurementConverter("MILES_TO_KILOMETERS", 500);

    }


}
