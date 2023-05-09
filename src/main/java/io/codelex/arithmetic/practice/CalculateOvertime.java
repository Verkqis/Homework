package io.codelex.arithmetic.practice;


public class CalculateOvertime {

    public static void main(String[] args) {


        System.out.println(basePayHoursWorked(8.2, 47));
//        System.out.println(basePayHoursWorked(7.50, 35));
//        System.out.println(basePayHoursWorked(10.00, 73));
    }

    public static double basePayHoursWorked(double basePay, double hoursWorked) {

        double overTime = 0;
        double rate = basePay + overTime;
        double hoursPerWeek = hoursWorked;

        if (rate < 8.00) {
            throw new RuntimeException();
        } else if (hoursPerWeek >= 60) {
            throw new RuntimeException();
        } else if (hoursPerWeek > 40) {
            rate = hoursPerWeek * rate;
            overTime = (1.5 * rate) * (hoursPerWeek - 40);
        }
        return overTime;

    }


}
